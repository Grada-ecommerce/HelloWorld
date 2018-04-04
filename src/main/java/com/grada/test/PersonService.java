package com.grada.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class PersonService
{
    @Autowired PersonRepository personRepository;

    public Iterable<Person> persons()
    {
        Iterable<Person> personList = personRepository.findAll();
        return personList;
    }

    public boolean DeletePerson(Person person)
    {
        if(person.name == null)
        {
            return false;
        }
        List<Person> personList = personRepository.findByName(person.getName());
        if(personList.size() > 0)
        {
            personRepository.delete(personList.get(0));
            return true;
        }
        return false;
    }

    public boolean AddPerson(Person person)
    {
        if(person.name == null)
        {
            return false;
        }
        personRepository.save(new Person(person.name));
        return true;
    }
}
