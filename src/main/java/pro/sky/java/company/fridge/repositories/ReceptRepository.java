package pro.sky.java.company.fridge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.company.fridge.models.Ingradient;

import java.util.Collection;


public interface ReceptRepository extends JpaRepository<Ingradient, Integer> {
    String getReceptsById(int id);
}
