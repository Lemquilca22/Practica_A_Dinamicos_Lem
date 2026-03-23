package Ranking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;
    private List<String> opciones;

    public Pregunta(String enunciado, String respuestaCorrecta, String inc1, String inc2, String inc3) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        // Inicializamos la lista y metemos las 4 opciones (Esto me sugirio Gemini honestamente)
        this.opciones = new ArrayList<>();
        this.opciones.add(respuestaCorrecta);
        this.opciones.add(inc1);
        this.opciones.add(inc2);
        this.opciones.add(inc3);

        Collections.shuffle(this.opciones);//Sirve para combinar las opciones puestas.
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public boolean esCorrecta(int indiceSeleccionado) {
        return opciones.get(indiceSeleccionado - 1).equals(respuestaCorrecta);
    }
}