package com.grada.test;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;



@SpringBootApplication
@EnableNeo4jRepositories
public class TestApplication
{
    //private final static Logger log = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args)
    {
		SpringApplication.run(TestApplication.class, args);
	}

}
