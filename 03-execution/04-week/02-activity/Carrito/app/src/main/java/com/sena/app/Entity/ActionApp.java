package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "action_app")
public class ActionApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_action")
    private Long idAction;

    @Column(name = "action_name", nullable = false, length = 50)
    private String actionName;

    @Column(name = "description", length = 200)
    private String description;

    public Long getIdAction() {
        return idAction;
    }

    public void setIdAction(Long idAction) {
        this.idAction = idAction;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
