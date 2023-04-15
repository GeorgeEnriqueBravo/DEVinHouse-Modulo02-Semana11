package org.senai.exercicioSemana11.exerciciosemana11.repository;

import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
