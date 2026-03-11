package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "view_app")
public class ViewApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_view")
    private Long idView;

    @Column(name = "view_name", nullable = false, length = 100)
    private String viewName;

    @Column(name = "route", length = 200)
    private String route;

    @Column(name = "status")
    private Boolean status;

    public Long getIdView() {
        return idView;
    }

    public void setIdView(Long idView) {
        this.idView = idView;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}