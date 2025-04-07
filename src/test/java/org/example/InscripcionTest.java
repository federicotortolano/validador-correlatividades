package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class InscripcionTest {

    private TestCase Assertions;

    @Test
    public void inscripcionAprobada(){

        Materia fisica1 = new Materia("Fisica I");
        Materia fisica2 = new Materia("Fisica II");
        Materia analisisMatematico1 = new Materia("Analisis Matematico I");
        Materia matematicaDiscreta = new Materia("Matematica Discreta");
        Alumno alumno = new Alumno("Federico Tortolano");
        Inscripcion inscripcion = new Inscripcion(alumno);

        fisica2.setMateriasCorrelativas(fisica1, analisisMatematico1);
        alumno.setMateriasAprobadas(fisica1, analisisMatematico1, matematicaDiscreta);
        inscripcion.setMateriasAInscribirse(fisica2);

        TestCase.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionRechazada(){
        Materia fisica1 = new Materia("Fisica I");
        Materia fisica2 = new Materia("Fisica II");
        Materia analisisMatematico1 = new Materia("Analisis Matematico I");
        Materia matematicaDiscreta = new Materia("Matematica Discreta");
        Alumno alumno = new Alumno("Federico Tortolano");
        Inscripcion inscripcion = new Inscripcion(alumno);

        fisica2.setMateriasCorrelativas(fisica1, analisisMatematico1);
        alumno.setMateriasAprobadas(analisisMatematico1, matematicaDiscreta);
        inscripcion.setMateriasAInscribirse(fisica2);

        TestCase.assertFalse(inscripcion.aprobada());
    }

}