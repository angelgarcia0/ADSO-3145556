package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "view_action", uniqueConstraints = @UniqueConstraint(columnNames = { "id_view", "id_action" }))
public class ViewAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_view_action")
    private Long idViewAction;

    @ManyToOne
    @JoinColumn(name = "id_view", nullable = false)
    private ViewApp view;

    @ManyToOne
    @JoinColumn(name = "id_action", nullable = false)
    private ActionApp action;

    public Long getIdViewAction() {
        return idViewAction;
    }

    public void setIdViewAction(Long idViewAction) {
        this.idViewAction = idViewAction;
    }

    public ViewApp getView() {
        return view;
    }

    public void setView(ViewApp view) {
        this.view = view;
    }

    public ActionApp getAction() {
        return action;
    }

    public void setAction(ActionApp action) {
        this.action = action;
    }
}
