package com.grada.test;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController
{
    final PersonService personService;

    @Autowired
    public MainController(PersonService personService)
    {
        this.personService = personService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String GetPersons(Model model)
    {
        Iterable<Person> persons  = personService.persons();
        model.addAttribute("lists", persons);
        return "index";
    }

    @RequestMapping(value = "/add")
    public String AddPerson(Model model)
    {
        model.addAttribute("person", new Person());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String AddPerson(@ModelAttribute Person person)
    {
        personService.AddPerson(person);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String DeletePerson(Model model)
    {
        model.addAttribute("person", new Person());
        return "delete";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String DeletesPerson(@ModelAttribute Person person)
    {
        personService.DeletePerson(person);
        return "redirect:/";
    }


}
