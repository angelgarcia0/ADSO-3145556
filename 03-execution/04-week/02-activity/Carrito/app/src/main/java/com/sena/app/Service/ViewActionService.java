package com.sena.app.Service;

import com.sena.app.Entity.ViewAction;
import java.util.List;

public interface ViewActionService {

    List<ViewAction> findAll();

    ViewAction save(ViewAction viewAction);

    ViewAction findById(Long id);

    void delete(Long id);
}
