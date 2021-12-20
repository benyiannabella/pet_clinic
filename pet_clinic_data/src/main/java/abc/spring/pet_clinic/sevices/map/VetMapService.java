package abc.spring.pet_clinic.sevices.map;

import abc.spring.pet_clinic.model.Speciality;
import abc.spring.pet_clinic.model.Vet;
import abc.spring.pet_clinic.sevices.SpecialityService;
import abc.spring.pet_clinic.sevices.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private  final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality ->{
                    if(speciality.getId() == null){
                        Speciality savedSpeciality = specialityService.save(speciality);
                        speciality.setId(savedSpeciality.getId());
                    }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }
}
