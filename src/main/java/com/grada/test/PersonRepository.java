package com.grada.test;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long>
{

    List<Person> findByName(String name);
    //Person findFirstByNameEquals(String name);
    //Person findByName(String name);
    //Person findFirstBy(String name);
}