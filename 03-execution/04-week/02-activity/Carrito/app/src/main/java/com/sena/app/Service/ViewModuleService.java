package com.sena.app.Service;

import com.sena.app.Entity.ViewModule;
import java.util.List;

public interface ViewModuleService {

    List<ViewModule> findAll();

    ViewModule save(ViewModule viewModule);

    ViewModule findById(Long id);

    void delete(Long id);
}
