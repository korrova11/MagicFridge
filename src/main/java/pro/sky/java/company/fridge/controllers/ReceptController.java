package pro.sky.java.company.fridge.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.company.fridge.models.Recept;
import pro.sky.java.company.fridge.services.ReceptService;

import java.util.ArrayList;

@RestController
@RequestMapping("/recept")
public class ReceptController {
    private final ReceptService service;

    public ReceptController(ReceptService service) {

        this.service = service;
    }


    @GetMapping("/find")
    public ResponseEntity<String> getRecept(@RequestParam("ids") ArrayList<String> list) {
        return ResponseEntity.ok(service.find(list));
    }

    @PostMapping
    public ResponseEntity<Recept> createRecept(
            @RequestParam ArrayList<String> list,
            @RequestParam String str) {
        Recept createdRecept = service.add(list, str);
        return ResponseEntity.ok(createdRecept);
    }
}
