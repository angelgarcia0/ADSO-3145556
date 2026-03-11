package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
