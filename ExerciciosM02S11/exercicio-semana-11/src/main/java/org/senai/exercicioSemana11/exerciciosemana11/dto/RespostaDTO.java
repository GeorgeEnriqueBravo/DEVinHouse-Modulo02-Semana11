package org.senai.exercicioSemana11.exerciciosemana11.dto;

import org.senai.exercicioSemana11.exerciciosemana11.model.Perguntas;

public class RespostaDTO {
    private String texto;
    private Perguntas pergunta;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Perguntas getPergunta() {
        return pergunta;
    }

    public void setPergunta(Perguntas pergunta) {
        this.pergunta = pergunta;
    }
}
