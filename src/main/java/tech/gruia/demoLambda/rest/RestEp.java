package tech.gruia.demoLambda.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.gruia.demoLambda.oop.Phone;


@RestController
public class RestEp {

    @GetMapping("/oop/{inputParam}")
    public String hello(@PathVariable String inputParam) {



        return "";
    }

}