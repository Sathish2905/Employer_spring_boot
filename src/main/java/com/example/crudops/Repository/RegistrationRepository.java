package com.example.crudops.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.crudops.Model.Registration;
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
