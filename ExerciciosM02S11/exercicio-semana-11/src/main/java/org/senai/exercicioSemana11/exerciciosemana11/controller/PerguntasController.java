package org.senai.exercicioSemana11.exerciciosemana11.controller;

import org.senai.exercicioSemana11.exerciciosemana11.model.Perguntas;
import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;
import org.senai.exercicioSemana11.exerciciosemana11.service.PerguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/perguntas")
public class PerguntasController {
    @Autowired
    private PerguntasService perguntasService;

    @GetMapping("/listar")
    public List<Perguntas> listarPerguntas() {
        return perguntasService.buscarPerguntas();
    }

    @GetMapping("/busca/{id}")
    public Optional<Perguntas> buscaPerguntaId(@PathVariable Integer id) {
        return perguntasService.pegaPerguntaId(id);
    }

    @PostMapping
    public boolean criaPergunta(@RequestBody Perguntas pergunta) {
        return perguntasService.cadastraPergunta(pergunta);
    }

    @GetMapping("/quiz")
    public List<Perguntas> listarPerguntasQuiz(@RequestParam Integer quizId) {
        return perguntasService.buscarPerguntasQuiz(quizId);
    }

    @PutMapping("/atualiza")
    public ResponseEntity<String> atualizaResposta(@RequestParam Integer id, @RequestBody @Validated Perguntas pergunta) {
        return perguntasService.alteraPerguntaPorId(id, pergunta);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> apagarPergunta(@PathVariable Integer id) {
        return perguntasService.deletaPerguntaPorId(id);
    }
}
