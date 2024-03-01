package pro.sky.java.company.fridge.models;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Recept {
    @Id
    private int id;
    private String ingredients;
    private String recepts;
    public Recept() {
    }

    public Recept(int id, String list, String recepts) {
        this.id = id;
        this.ingredients = list;
        this.recepts = recepts;
    }

    public String getList() {
        return ingredients;
    }

    public void setList(String list) {
        this.ingredients = list;
    }

    public void setRecepts(String recepts) {
        this.recepts = recepts;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getRecepts() {
        return recepts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recept that = (Recept) o;
        return id == that.id && Objects.equals(ingredients, that.ingredients) && Objects.equals(recepts, that.recepts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingredients, recepts);
    }
}
