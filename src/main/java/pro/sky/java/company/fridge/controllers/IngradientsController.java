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
    public String getRecept(@RequestParam("ids") ArrayList<String> list){
              return service.find(list);
            }
    @PostMapping
    public ResponseEntity<Ingradient> createStudent(
            @RequestParam  ArrayList<String> list,
            @RequestParam  String str) {
        Ingradient createdIngradient = service.add(list,str);
        return ResponseEntity.ok(createdIngradient);
    }
}
