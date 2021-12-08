package com.spring.mypetclinic.springpetclinic.services;

import com.spring.mypetclinic.springpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
