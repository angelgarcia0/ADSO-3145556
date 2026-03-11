package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_module", uniqueConstraints = @UniqueConstraint(columnNames = { "id_role", "id_module" }))
public class RoleModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role_module")
    private Long idRoleModule;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "id_module", nullable = false)
    private Module module;

    public Long getIdRoleModule() {
        return idRoleModule;
    }

    public void setIdRoleModule(Long idRoleModule) {
        this.idRoleModule = idRoleModule;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
