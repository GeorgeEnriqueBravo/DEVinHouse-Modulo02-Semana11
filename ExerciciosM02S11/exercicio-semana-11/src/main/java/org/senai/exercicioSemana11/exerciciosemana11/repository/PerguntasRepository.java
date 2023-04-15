package org.senai.exercicioSemana11.exerciciosemana11.repository;

import org.senai.exercicioSemana11.exerciciosemana11.model.Perguntas;
import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntasRepository extends JpaRepository<Perguntas, Integer> {

    @Query(value = "SELECT p FROM Perguntas p WHERE p.quiz.id = :quizId")
    public List<Perguntas> findByQuiz(Integer quizId);

}
