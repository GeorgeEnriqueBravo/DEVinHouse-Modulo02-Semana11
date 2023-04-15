package org.senai.exercicioSemana11.exerciciosemana11.controller;

import org.senai.exercicioSemana11.exerciciosemana11.model.Perguntas;
import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;
import org.senai.exercicioSemana11.exerciciosemana11.model.Resposta;
import org.senai.exercicioSemana11.exerciciosemana11.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/resposta")
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @GetMapping("/listar")
    public List<Resposta> listarRespostas() {
        return respostaService.buscarRespostas();
    }

    @GetMapping("/busca/{id}")
    public Optional<Resposta> buscaRespostaId(@PathVariable Integer id) {
        return respostaService.pegaRespostaId(id);
    }

    @PostMapping("/cadastra")
    public boolean criaResposta(@RequestBody Resposta resposta) {
        return respostaService.cadastraResposta(resposta);
    }

    // Verficar com o professor se está correto
    @GetMapping("/pergunta")
    public List<Resposta> listarRespostaPorPergunta(@RequestParam Integer perguntaId) {
        return respostaService.buscarRespostaPorPergunta(perguntaId);
    }
    @PutMapping("/atualiza")
    public ResponseEntity<String> atualizaResposta(@RequestParam Integer id, @RequestBody @Validated Resposta resposta) {
        return respostaService.alteraRespostaPorId(id, resposta);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> apagarResposta(@PathVariable Integer id) {
        return respostaService.deletaRespostaPorId(id);
    }
}
