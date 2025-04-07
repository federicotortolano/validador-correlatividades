package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
public class Alumno {

    @Setter
    private String nombre;
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public boolean puedeCursar(List<Materia> materias){
        for (Materia materia : materias){
            if(!this.aproboCorrelativas(materia)) return false;
        }
        return true;
    }

    public boolean aproboCorrelativas(Materia materia) {
        return new HashSet<>(this.materiasAprobadas).containsAll(materia.getMateriasCorrelativas());
    }

    public void setMateriasAprobadas(Materia ... materias){
        this.materiasAprobadas.addAll(List.of(materias));
    }
}
