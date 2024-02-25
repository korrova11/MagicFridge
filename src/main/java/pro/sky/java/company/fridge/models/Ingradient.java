package pro.sky.java.company.fridge.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ingradient {
    private int id;
    private String recepts = "";

    public Ingradient(List<Integer> list) {
        this.id = hashCodeIngradient(list);
    }

    public void setRecepts(String recepts) {
        this.recepts = recepts;
    }


    public void setId(int id) {
        this.id = id;
    }



    public int hashCodeIngradient(List<Integer> list){
        int size = list.size();
        int code=0;
        for (int i=0;i<size;i++){
            code= (int) (code + list.get(i)*(Math.pow(10,i)));
        };
        return code;
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
        return id == that.id && Objects.equals(recepts, that.recepts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recepts);
    }

    @Override
    public String toString() {
        return "Ingradient{" +
                "id=" + id +
                ", recepts='" + recepts + '\'' +
                '}';
    }
}
