package com.sena.app.Service;

import com.sena.app.Entity.ActionApp;
import java.util.List;

public interface ActionAppService {

    List<ActionApp> findAll();

    ActionApp save(ActionApp action);

    ActionApp findById(Long id);

    void delete(Long id);
}
