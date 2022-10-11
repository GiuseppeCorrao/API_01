package develhope.API_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NameController {

    @GetMapping("/getname")
    public String getName(){
        return "Giuseppe";
    }
    @PostMapping("/getname")
    public StringBuilder getReverseName(){
        StringBuilder builder = new StringBuilder(getName());

       return  builder.reverse();
    }
}
