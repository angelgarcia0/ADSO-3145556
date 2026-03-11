package com.sena.app.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventory")
    private Long idInventory;

    @OneToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Long getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(Long idInventory) {
        this.idInventory = idInventory;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}