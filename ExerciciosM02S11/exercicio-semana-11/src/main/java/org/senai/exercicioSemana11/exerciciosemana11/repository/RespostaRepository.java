package org.senai.exercicioSemana11.exerciciosemana11.repository;

import org.senai.exercicioSemana11.exerciciosemana11.model.Perguntas;
import org.senai.exercicioSemana11.exerciciosemana11.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Integer> {

    @Query(value = "SELECT r FROM Resposta r WHERE r.pergunta.id = :perguntaId")
    public List<Resposta> findByPergunta(Integer perguntaId);

}
