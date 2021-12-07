package com.spring.mypetclinic.springpetclinic.services;

import com.spring.mypetclinic.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
