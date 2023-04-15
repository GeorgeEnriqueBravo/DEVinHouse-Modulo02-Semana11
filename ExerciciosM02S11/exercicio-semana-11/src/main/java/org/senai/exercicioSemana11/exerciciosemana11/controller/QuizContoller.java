package org.senai.exercicioSemana11.exerciciosemana11.controller;

import org.senai.exercicioSemana11.exerciciosemana11.model.Perguntas;
import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;
import org.senai.exercicioSemana11.exerciciosemana11.model.Resposta;
import org.senai.exercicioSemana11.exerciciosemana11.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quiz")
public class QuizContoller {
    @Autowired
    private QuizService quizService;

    @GetMapping("/listar")
    public List<Quiz> listarQuizzes() {
        return quizService.buscarQuizzes();
    }

    @GetMapping("/busca/{id}")
    public Optional<Quiz> buscaQuizId(@PathVariable Integer id) {
        return quizService.pegaQuizId(id);
    }

    @PostMapping
    public ResponseEntity<String> criaQuiz(@RequestBody Quiz quiz) {
        return quizService.cadastraQuiz(quiz);
    }

    @PutMapping("/atualiza")
    public ResponseEntity<String> atualizaResposta(@RequestParam Integer id, @RequestBody @Validated Quiz quiz) {
        return quizService.alteraQuizPorId(id, quiz);
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> apagarQuiz(@PathVariable Integer id) {
        return quizService.deletaQuizPorId(id);
    }
}
