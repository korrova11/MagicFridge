package pro.sky.java.company.fridge.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.company.fridge.models.Ingradient;
import pro.sky.java.company.fridge.services.IngradientService;

import java.util.ArrayList;

@RestController
public class IngradientsController {
    private final IngradientService service;

    public IngradientsController(IngradientService service) {

        this.service = service;
    }

    @GetMapping("/find")
    public String addInBasket(@RequestParam("ids") ArrayList<Integer> list){
        Ingradient ingradient=new Ingradient(list);
        return service.find(ingradient.getId());
    }
    @PostMapping
    public ResponseEntity<Ingradient> createStudent(@RequestBody Ingradient ingradient) {
        Ingradient createdIngradient = service.add(ingradient);
        return ResponseEntity.ok(createdIngradient);
    }
}
