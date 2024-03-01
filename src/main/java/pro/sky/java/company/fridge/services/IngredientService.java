package pro.sky.java.company.fridge.services;

import org.springframework.stereotype.Service;
import pro.sky.java.company.fridge.models.Ingredient;
import pro.sky.java.company.fridge.repositories.IngredientRepository;

import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }
    public Ingredient createIngredient(int id, String name){
        Ingredient ingredient = new Ingredient(id,name);
        return repository.save(ingredient);

    }
    public Ingredient findIngredient(int id){
        return  repository.findById(id).get();
    }
    public List<Ingredient> findAll(){
        return  repository.findAll().stream().toList();
    }


}
