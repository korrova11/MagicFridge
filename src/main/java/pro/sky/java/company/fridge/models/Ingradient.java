package pro.sky.java.company.fridge.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Ingradient {
    @Id
    private int id;
    private ArrayList<String> list;
    private String recepts;
    public Ingradient() {
    }

    public Ingradient(int id, ArrayList<String> list, String recepts) {
        this.id = id;
        this.list = list;
        this.recepts = recepts;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
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
        Ingradient that = (Ingradient) o;
        return id == that.id && Objects.equals(list, that.list) && Objects.equals(recepts, that.recepts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, list, recepts);
    }
}
