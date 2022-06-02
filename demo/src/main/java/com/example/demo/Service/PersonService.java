package com.example.demo.Service;

import com.example.demo.DataB.PersonalData;
import com.example.demo.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonalData personalData;

    @Autowired // auto wiring into this interface
    public PersonService(@Qualifier("FakeData") PersonalData personalData) {
        this.personalData = personalData;
    }

    public int addPerson(Person person) {
        return personalData.insertPersonal(person);
    }


}
