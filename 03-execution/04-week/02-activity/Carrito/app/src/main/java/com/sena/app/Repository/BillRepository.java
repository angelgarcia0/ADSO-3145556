package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}