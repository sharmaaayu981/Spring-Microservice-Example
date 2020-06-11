package com.example.beerservice.cntroller;

import com.example.beerservice.model.Beer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class BeerController {

    @GetMapping("/beers")
    public Beer getBeers(){
        Beer beer=new Beer("abc",70);
        System.out.println(beer);
        return beer;
    }


}
