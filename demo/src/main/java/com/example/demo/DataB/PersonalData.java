package com.example.demo.DataB;

import com.example.demo.Model.Person;

import java.util.UUID;
//The id is randomly generated
//Create a class that will implement this interface
public interface PersonalData {
    int insertPersonal(UUID id, Person person);
    int insertPersonal(Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPersonal(id, person);
    }

}
