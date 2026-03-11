package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "view_module", uniqueConstraints = @UniqueConstraint(columnNames = { "id_view", "id_module" }))
public class ViewModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_view_module")
    private Long idViewModule;

    @ManyToOne
    @JoinColumn(name = "id_view", nullable = false)
    private ViewApp view;

    @ManyToOne
    @JoinColumn(name = "id_module", nullable = false)
    private Module module;

    public Long getIdViewModule() {
        return idViewModule;
    }

    public void setIdViewModule(Long idViewModule) {
        this.idViewModule = idViewModule;
    }

    public ViewApp getView() {
        return view;
    }

    public void setView(ViewApp view) {
        this.view = view;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
