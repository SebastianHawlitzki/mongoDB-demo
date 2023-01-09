package de.neuefische.mongodbdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;

    public Pet create (Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> getAll () {
        System.out.println("Mein Log: " + mongoUri);
        return petRepository.findAll();
    }

    public Pet update (Pet pet) {
        return petRepository.save(pet);
    }

    public void delete (String id) {
        petRepository.deleteById(id);
    }

    //
    @Value("${spring.data.mongodb.uri}")
    public String mongoUri;
}
