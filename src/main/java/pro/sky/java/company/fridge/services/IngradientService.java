package pro.sky.java.company.fridge.services;

import org.springframework.stereotype.Service;
import pro.sky.java.company.fridge.models.Ingradient;
import pro.sky.java.company.fridge.repositories.ReceptRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class IngradientService {
    private final ReceptRepository repository;

    public IngradientService(ReceptRepository repository) {
        this.repository = repository;
    }

    public Ingradient add(ArrayList<String> list, String str) {
        Collections.sort(list);
        Ingradient ingradient = new Ingradient(list.hashCode(),list,str);
        return repository.save(ingradient);

    }

    public String find(ArrayList<String> list) {
        Collections.sort(list);
        int id = list.hashCode();
        return repository.getReceptsById(id);
    }
}
