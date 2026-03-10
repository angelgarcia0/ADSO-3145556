
-- DATABASE: ShoppingCartSecurity

CREATE TABLE person (
    id_person        INT PRIMARY KEY IDENTITY(1,1),
    first_name       VARCHAR(100) NOT NULL,
    last_name        VARCHAR(100) NOT NULL,
    email            VARCHAR(150) UNIQUE NOT NULL,
    phone            VARCHAR(20),
    created_at       DATETIME DEFAULT GETDATE()
);


CREATE TABLE role (
    id_role     INT PRIMARY KEY IDENTITY(1,1),
    role_name   VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(200),
    status      BIT DEFAULT 1
);


CREATE TABLE [user] (
    id_user        INT PRIMARY KEY IDENTITY(1,1),
    id_person      INT NOT NULL,
    username       VARCHAR(50) NOT NULL UNIQUE,
    password_hash  VARCHAR(255) NOT NULL,
    status         BIT DEFAULT 1,
    created_at     DATETIME DEFAULT GETDATE(),

    CONSTRAINT fk_user_person
        FOREIGN KEY (id_person) REFERENCES person(id_person)
);


CREATE TABLE module (
    id_module     INT PRIMARY KEY IDENTITY(1,1),
    module_name   VARCHAR(100) NOT NULL,
    description   VARCHAR(200),
    status        BIT DEFAULT 1
);


CREATE TABLE view_app (
    id_view       INT PRIMARY KEY IDENTITY(1,1),
    view_name     VARCHAR(100) NOT NULL,
    route         VARCHAR(200),
    status        BIT DEFAULT 1
);


CREATE TABLE action_app (
    id_action     INT PRIMARY KEY IDENTITY(1,1),
    action_name   VARCHAR(50) NOT NULL,
    description   VARCHAR(200)
);


CREATE TABLE user_role (
    id_user_role INT PRIMARY KEY IDENTITY(1,1),
    id_user      INT NOT NULL,
    id_role      INT NOT NULL,

    CONSTRAINT fk_user_role_user
        FOREIGN KEY (id_user) REFERENCES [user](id_user),

    CONSTRAINT fk_user_role_role
        FOREIGN KEY (id_role) REFERENCES role(id_role),

    CONSTRAINT uq_user_role UNIQUE (id_user, id_role)
);


CREATE TABLE role_module (
    id_role_module INT PRIMARY KEY IDENTITY(1,1),
    id_role        INT NOT NULL,
    id_module      INT NOT NULL,

    CONSTRAINT fk_role_module_role
        FOREIGN KEY (id_role) REFERENCES role(id_role),

    CONSTRAINT fk_role_module_module
        FOREIGN KEY (id_module) REFERENCES module(id_module),

    CONSTRAINT uq_role_module UNIQUE (id_role, id_module)
);


CREATE TABLE view_module (
    id_view_module INT PRIMARY KEY IDENTITY(1,1),
    id_view        INT NOT NULL,
    id_module      INT NOT NULL,

    CONSTRAINT fk_view_module_view
        FOREIGN KEY (id_view) REFERENCES view_app(id_view),

    CONSTRAINT fk_view_module_module
        FOREIGN KEY (id_module) REFERENCES module(id_module),

    CONSTRAINT uq_view_module UNIQUE (id_view, id_module)
);


CREATE TABLE view_action (
    id_view_action INT PRIMARY KEY IDENTITY(1,1),
    id_view        INT NOT NULL,
    id_action      INT NOT NULL,

    CONSTRAINT fk_view_action_view
        FOREIGN KEY (id_view) REFERENCES view_app(id_view),

    CONSTRAINT fk_view_action_action
        FOREIGN KEY (id_action) REFERENCES action_app(id_action),

    CONSTRAINT uq_view_action UNIQUE (id_view, id_action)
);


CREATE TABLE category (
    id_category    INT PRIMARY KEY IDENTITY(1,1),
    category_name  VARCHAR(100) NOT NULL,
    description    VARCHAR(200),
    status         BIT DEFAULT 1
);


CREATE TABLE product (
    id_product     INT PRIMARY KEY IDENTITY(1,1),
    id_category    INT NOT NULL,
    product_name   VARCHAR(150) NOT NULL,
    description    VARCHAR(500),
    price          DECIMAL(10,2) NOT NULL,
    status         BIT DEFAULT 1,
    created_at     DATETIME DEFAULT GETDATE(),

    CONSTRAINT fk_product_category
        FOREIGN KEY (id_category) REFERENCES category(id_category)
);


CREATE TABLE inventory (
    id_inventory   INT PRIMARY KEY IDENTITY(1,1),
    id_product     INT NOT NULL,
    stock          INT NOT NULL DEFAULT 0,
    last_update    DATETIME DEFAULT GETDATE(),

    CONSTRAINT fk_inventory_product
        FOREIGN KEY (id_product) REFERENCES product(id_product),

    CONSTRAINT uq_inventory_product UNIQUE (id_product)
);


CREATE TABLE cart (
    id_cart      INT PRIMARY KEY IDENTITY(1,1),
    id_user      INT NOT NULL,
    status       VARCHAR(20) DEFAULT 'ACTIVE',
    created_at   DATETIME DEFAULT GETDATE(),

    CONSTRAINT fk_cart_user
        FOREIGN KEY (id_user) REFERENCES [user](id_user)
);


CREATE TABLE cart_detail (
    id_cart_detail INT PRIMARY KEY IDENTITY(1,1),
    id_cart        INT NOT NULL,
    id_product     INT NOT NULL,
    quantity       INT NOT NULL,
    unit_price     DECIMAL(10,2) NOT NULL,

    CONSTRAINT fk_cart_detail_cart
        FOREIGN KEY (id_cart) REFERENCES cart(id_cart)
        ON DELETE CASCADE,

    CONSTRAINT fk_cart_detail_product
        FOREIGN KEY (id_product) REFERENCES product(id_product),

    CONSTRAINT uq_cart_product UNIQUE (id_cart, id_product)
);


CREATE TABLE bill (
    id_bill      INT PRIMARY KEY IDENTITY(1,1),
    id_user      INT NOT NULL,
    total_amount DECIMAL(12,2) NOT NULL,
    bill_date    DATETIME DEFAULT GETDATE(),
    status       VARCHAR(20) DEFAULT 'PAID',

    CONSTRAINT fk_bill_user
        FOREIGN KEY (id_user) REFERENCES [user](id_user)
);


CREATE TABLE bill_detail (
    id_bill_detail INT PRIMARY KEY IDENTITY(1,1),
    id_bill        INT NOT NULL,
    id_product     INT NOT NULL,
    quantity       INT NOT NULL,
    unit_price     DECIMAL(10,2) NOT NULL,
    subtotal       DECIMAL(12,2) NOT NULL,

    CONSTRAINT fk_bill_detail_bill
        FOREIGN KEY (id_bill) REFERENCES bill(id_bill)
        ON DELETE CASCADE,

    CONSTRAINT fk_bill_detail_product
        FOREIGN KEY (id_product) REFERENCES product(id_product)
);