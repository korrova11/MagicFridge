package pro.sky.java.company.fridge.services;

import org.springframework.stereotype.Service;
import pro.sky.java.company.fridge.models.Recept;
import pro.sky.java.company.fridge.repositories.ReceptRepository;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class ReceptService {
    private final ReceptRepository repository;

    public ReceptService(ReceptRepository repository) {
        this.repository = repository;
    }

    public Recept add(ArrayList<String> list, String str) {
        Collections.sort(list);
        String joined = String.join("-",list);
        Recept recept = new Recept(list.hashCode(), joined, str);
        return repository.save(recept);

    }

    public String find(ArrayList<String> list) {
        Collections.sort(list);
        int id = list.hashCode();
        return repository.findById(id).get().getRecepts();
    }
}
