package org.senai.exercicioSemana11.exerciciosemana11.model;

import javax.persistence.*;
@Entity
@Table(name = "resposta")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String texto;
    @OneToOne
//    @Column(name = "pergunta_id")
    private Perguntas pergunta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
