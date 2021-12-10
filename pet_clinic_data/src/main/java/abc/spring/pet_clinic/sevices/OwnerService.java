package abc.spring.pet_clinic.sevices;

import abc.spring.pet_clinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
