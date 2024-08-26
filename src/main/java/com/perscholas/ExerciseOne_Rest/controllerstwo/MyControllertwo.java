package com.perscholas.ExerciseOne_Rest.controllerstwo;
@Controller
public class MyControllertwo{
    @GetMapping({ "login"})   // either type '/' or index
    public String showIndex()
    {
        return "index";
    }
}

