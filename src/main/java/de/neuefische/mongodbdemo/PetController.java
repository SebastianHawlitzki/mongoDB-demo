package de.neuefische.mongodbdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
@RequiredArgsConstructor

public class PetController {
    private final PetService petService;


    @PostMapping
    public Pet create (@RequestBody Pet pet) {
        return petService.create(pet);
    }

    @GetMapping
    public List<Pet> getAll () {
        return petService.getAll();
    }

    @PutMapping("/{id}")
    public Pet update (@PathVariable String id, @RequestBody Pet pet) {
        pet.setId(id);
        return petService.update(pet);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable String id) {
            petService.delete(id);
    }

}
