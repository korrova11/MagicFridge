package pro.sky.java.company.fridge.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.company.fridge.models.Ingredient;
import pro.sky.java.company.fridge.models.Recept;
import pro.sky.java.company.fridge.services.IngredientService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private final IngredientService service;

    public IngredientController(IngredientService service) {
        this.service = service;
    }
    @GetMapping("/{ingredientId}")
    public ResponseEntity<Ingredient> getIngredient(@PathVariable int ingredientId) {
        Ingredient ingredient = service.findIngredient(ingredientId);
        if (ingredient == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredient);

    }
    @GetMapping("/allIngredients")
    public ResponseEntity<List<Ingredient>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }


    @PostMapping
    public ResponseEntity<Ingredient> createRecept(
            @RequestParam Integer id,
            @RequestParam String str) {
        return ResponseEntity.ok(service.createIngredient(id, str));
    }

}
