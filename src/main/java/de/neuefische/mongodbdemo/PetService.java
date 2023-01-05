package de.neuefische.mongodbdemo;

import lombok.RequiredArgsConstructor;
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
        return petRepository.findAll();
    }

    public Pet update (Pet pet) {
        return petRepository.save(pet);
    }

    public void delete (String id) {
        petRepository.deleteById(id);
    }
}
