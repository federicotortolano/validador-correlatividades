package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Materia {

    @Setter
    private String nombre;
    private final List<Materia> materiasCorrelativas = new ArrayList<>();

    public Materia(String nombre){
        this.nombre = nombre;
    }

    public void setMateriasCorrelativas(Materia ... materias){
        this.materiasCorrelativas.addAll(List.of(materias));
    }
}