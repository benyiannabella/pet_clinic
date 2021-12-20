package abc.spring.pet_clinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "petTypes")
public class PetType extends BaseEntity{

    @Column(name = "type_name")
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
