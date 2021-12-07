package com.spring.mypetclinic.springpetclinic.services;

import com.spring.mypetclinic.springpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
