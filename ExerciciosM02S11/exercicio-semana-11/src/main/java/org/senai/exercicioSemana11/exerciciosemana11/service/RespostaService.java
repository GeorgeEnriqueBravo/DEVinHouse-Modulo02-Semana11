package org.senai.exercicioSemana11.exerciciosemana11.service;

import org.senai.exercicioSemana11.exerciciosemana11.model.Resposta;
import org.senai.exercicioSemana11.exerciciosemana11.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {
    @Autowired
    private RespostaRepository respostaRepository;

    public List<Resposta> buscarRespostas() {
        return respostaRepository.findAll();
    }

    public Optional<Resposta> pegaRespostaId(Integer id) {
        return respostaRepository.findById(id);
    }

    public boolean cadastraResposta(Resposta resposta) {
        respostaRepository.save(resposta);
        return true;
    }

    public List<Resposta> buscarRespostaPorPergunta(Integer perguntaId) {
        return respostaRepository.findByPergunta(perguntaId);
    }

    public ResponseEntity<String> alteraRespostaPorId(Integer id, Resposta resposta) {

        Resposta respostaAtualizada = respostaRepository.getReferenceById(id);
        respostaAtualizada.setTexto(resposta.getTexto());
        respostaAtualizada.setPergunta(resposta.getPergunta());
        respostaRepository.save(respostaAtualizada);

        return ResponseEntity.ok("Resposta atualizada com sucesso!");
    }

    public ResponseEntity<String> deletaRespostaPorId(Integer id) {
        respostaRepository.deleteById(id);
        return ResponseEntity.ok("Resposta deletada com sucesso");
    }
}
