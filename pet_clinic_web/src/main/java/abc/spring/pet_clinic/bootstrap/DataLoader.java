package abc.spring.pet_clinic.bootstrap;

import abc.spring.pet_clinic.model.*;
import abc.spring.pet_clinic.sevices.OwnerService;
import abc.spring.pet_clinic.sevices.PetTypeService;
import abc.spring.pet_clinic.sevices.SpecialityService;
import abc.spring.pet_clinic.sevices.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) {
        loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setTypeName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setTypeName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");

        Speciality savedRadiology= specialityService.save(radiology);
        Speciality savedSurgery= specialityService.save(surgery);
        Speciality savedDentistry= specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Miamistreat");
        owner1.setCity("Miami");
        owner1.setPhone("1234567897");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setName("Rosco");
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glen");
        owner2.setAddress("124 NYStreat");
        owner2.setCity("NY");
        owner2.setPhone("9876543211");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setName("Catty");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners ....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessica");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets.......");
    }
}
