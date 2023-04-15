package org.senai.exercicioSemana11.exerciciosemana11.service;

import org.senai.exercicioSemana11.exerciciosemana11.model.Perguntas;
import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;
import org.senai.exercicioSemana11.exerciciosemana11.repository.PerguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class PerguntasService {
    @Autowired
    private PerguntasRepository perguntasRepository;

    public List<Perguntas> buscarPerguntas() {
        return perguntasRepository.findAll();
    }

    public Optional<Perguntas> pegaPerguntaId(Integer id) {
        return perguntasRepository.findById(id);
    }

    public boolean cadastraPergunta(Perguntas pergunta) {
        perguntasRepository.save(pergunta);
        return true;
    }

    public List<Perguntas> buscarPerguntasQuiz(Integer quizId) {
        return perguntasRepository.findByQuiz(quizId);
    }

    public ResponseEntity<String> alteraPerguntaPorId(Integer id, Perguntas pergunta) {

        Perguntas perguntaAtualizada = perguntasRepository.getReferenceById(id);
        perguntaAtualizada.setTitulo(perguntaAtualizada.getTitulo());
        perguntaAtualizada.setTexto(pergunta.getTexto());
        perguntaAtualizada.setQuiz(pergunta.getQuiz());
        perguntasRepository.save(perguntaAtualizada);

        return ResponseEntity.ok("Pergunta atualizada com sucesso!");
    }

    public ResponseEntity<String> deletaPerguntaPorId(Integer id) {
        perguntasRepository.deleteById(id);
        return ResponseEntity.ok("Pergunta deletada com sucesso");
    }
}
