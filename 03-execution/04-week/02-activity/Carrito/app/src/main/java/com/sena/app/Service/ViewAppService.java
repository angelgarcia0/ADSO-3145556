package com.sena.app.Service;

import com.sena.app.Entity.ViewApp;
import java.util.List;

public interface ViewAppService {

    List<ViewApp> findAll();

    ViewApp save(ViewApp view);

    ViewApp findById(Long id);

    void delete(Long id);
}