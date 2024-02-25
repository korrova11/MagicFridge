package pro.sky.java.company.fridge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.company.fridge.models.Ingradient;

import java.util.ArrayList;

@RestController
public class IngradientsController {
    @GetMapping("/add")
    public void addInBasket(@RequestParam("ids") ArrayList<Integer> list){
        Ingradient ingradient=new Ingradient(list);
    }
}
