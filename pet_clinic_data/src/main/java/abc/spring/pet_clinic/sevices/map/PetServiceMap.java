package abc.spring.pet_clinic.sevices.map;

import abc.spring.pet_clinic.model.Pet;
import abc.spring.pet_clinic.model.Vet;
import abc.spring.pet_clinic.sevices.CrudService;
import abc.spring.pet_clinic.sevices.VetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }


}
