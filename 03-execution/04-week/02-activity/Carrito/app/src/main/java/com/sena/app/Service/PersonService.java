package com.sena.app.Service;

import com.sena.app.Entity.Person;
import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person save(Person person);

    Person findById(Long id);

    void delete(Long id);
}
