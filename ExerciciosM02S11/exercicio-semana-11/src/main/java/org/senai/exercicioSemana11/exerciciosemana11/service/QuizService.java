package org.senai.exercicioSemana11.exerciciosemana11.service;

import org.senai.exercicioSemana11.exerciciosemana11.model.Quiz;
import org.senai.exercicioSemana11.exerciciosemana11.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> buscarQuizzes() {
        return quizRepository.findAll();
    }

    public Optional<Quiz> pegaQuizId(Integer id) {
        return quizRepository.findById(id);
    }

//    public boolean cadastraQuiz(Quiz quiz) {
//        quizRepository.save(quiz);
//        return true;
//    }

//    public ResponseEntity<String> cadastraQuiz(Quiz quiz) {
//        quizRepository.save(quiz);
//        return ResponseEntity.accepted().body("Quiz enviado aceito e cadastrado com sucesso");
//    }

    public ResponseEntity<String> cadastraQuiz(Quiz quiz) {
        quizRepository.save(quiz);
        return ResponseEntity.created(URI.create("")).body("Quiz cadastrado com sucesso");
    }


    public ResponseEntity<String> alteraQuizPorId(Integer id, Quiz quiz) {

        Quiz quizAtualizada = quizRepository.getReferenceById(id);
        quizAtualizada.setNome(quiz.getNome());
        quizAtualizada.setDescricao(quiz.getDescricao());
        quizRepository.save(quizAtualizada);

        return ResponseEntity.ok("Quiz atualizado com sucesso!");
    }

    public ResponseEntity<String> deletaQuizPorId(Integer id) {
        quizRepository.deleteById(id);
        return ResponseEntity.ok("Quiz deletado com sucesso");
    }
}
