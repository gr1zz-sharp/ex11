package com.ex11.Controller;

import com.ex11.Model.Cat;
import com.ex11.Repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("api/v1/test")
    public String test(){
        catRepository.save(new Cat("test"));
        return "ok";
    }
}
