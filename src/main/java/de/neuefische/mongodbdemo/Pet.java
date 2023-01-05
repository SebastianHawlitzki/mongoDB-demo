package de.neuefische.mongodbdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pet {
    private String id;
    private String type;
    private String name;
    private String age;

}
