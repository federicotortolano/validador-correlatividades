package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Inscripcion {

    @Setter
    private Alumno alumnoSolicitante = null;
    private List<Materia> materiasAInscribirse = new ArrayList<>();

    public Inscripcion(Alumno alumno){
        this.alumnoSolicitante = alumno;
    }

    public boolean aprobada(){
        return alumnoSolicitante.puedeCursar(materiasAInscribirse);
    }

    public void setMateriasAInscribirse(Materia ... materias){
        this.materiasAInscribirse.addAll(List.of(materias));
    }
}
