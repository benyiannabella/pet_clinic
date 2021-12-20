package abc.spring.pet_clinic.repositories;

import abc.spring.pet_clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
