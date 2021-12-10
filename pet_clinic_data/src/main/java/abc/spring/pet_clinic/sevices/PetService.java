package abc.spring.pet_clinic.sevices;

import abc.spring.pet_clinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save (Pet pet);
    Set<Pet> findAll();
}
