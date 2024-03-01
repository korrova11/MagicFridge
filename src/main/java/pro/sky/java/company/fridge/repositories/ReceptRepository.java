package pro.sky.java.company.fridge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.company.fridge.models.Recept;


public interface ReceptRepository extends JpaRepository<Recept, Integer> {

}
