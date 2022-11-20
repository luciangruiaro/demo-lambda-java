package tech.gruia.demoLambda.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

    @GetMapping("/hello/{inputParam}")
    public String hello(@PathVariable String inputParam) {
        return inputParam;
    }

}