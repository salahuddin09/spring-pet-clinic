package com.spring.mypetclinic.springpetclinic.services;

import com.spring.mypetclinic.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
