package pro.sky.java.company.fridge.services;

import org.springframework.stereotype.Service;
import pro.sky.java.company.fridge.models.Ingradient;
import pro.sky.java.company.fridge.repositories.ReceptRepository;

@Service
public class IngradientService {
    private final ReceptRepository repository;

    public IngradientService(ReceptRepository repository) {
        this.repository = repository;
    }

    public Ingradient add(Ingradient ingradient) {
        return repository.save(ingradient);

    }

    public String find(int id) {
        return repository.getReceptsById(id);
    }
}
