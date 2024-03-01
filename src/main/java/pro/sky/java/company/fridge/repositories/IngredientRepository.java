package pro.sky.java.company.fridge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.company.fridge.models.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
}
