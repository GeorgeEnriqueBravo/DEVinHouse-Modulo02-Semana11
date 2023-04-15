package org.senai.exercicioSemana11.exerciciosemana11.dto;

import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;

public class PerguntasDTO {
    private String titulo;
    private String texto;
    private Quiz quiz;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
