package com.example.demo.DataB;

import com.example.demo.Model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeData")
public class PersonalDataAccessService implements PersonalData{
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPersonal(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public int insertPersonal(Person person) {
        return 0;
    }
}
