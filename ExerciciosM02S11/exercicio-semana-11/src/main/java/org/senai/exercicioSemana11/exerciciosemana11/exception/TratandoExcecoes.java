package org.senai.exercicioSemana11.exerciciosemana11.exception;

import org.senai.exercicioSemana11.exerciciosemana11.dto.ErroValidacaoDTO;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class TratandoExcecoes {

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<Void> trataErro404() {
        return ResponseEntity.notFound().build(); // .build aqui é necessário porque notFound não retorna corpo
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> trataErro400() {
        return ResponseEntity.badRequest().body("Erro no tipo de requisição. Digite um valor válido");
    }


//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<List<FieldError>> trataErro400(MethodArgumentNotValidException ex) {
//        List<FieldError> erros = ex.getFieldErrors();
//        // .getFieldErrors() isso aqui é para visualizarmos os campos que deram erros
//
//        return ResponseEntity.badRequest().body(erros);
//    }
    // Esse método acima serve pra verificarmos os .getFieldErrors que existem


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErroValidacaoDTO>> trataParametrosInvalidos(MethodArgumentNotValidException exception) {
        List<FieldError> erros = exception.getFieldErrors();
        List<ErroValidacaoDTO> campos = new ArrayList<>();

        for (FieldError erro : erros) {
            campos.add(new ErroValidacaoDTO(erro));
        }

        return ResponseEntity.badRequest().body(campos);
    }
    // Esse método acima serve pra tratar qualquer erro que possua .getFildErrors
    // Basta alterarmos o Erro que está sendocapturado


//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<List<ErroValidacaoDTO>> trataErro400(MethodArgumentNotValidException ex) {
//        List<FieldError> erros = ex.getFieldErrors();
//        // .getFieldErrors() isso aqui é para visualizarmos os campos que deram erros
//
//        return ResponseEntity.badRequest().body(
//                erros.stream().map(ErroValidacaoDTO::new).collect(Collectors.toList()));
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<List<FieldError>> trataErro400(MethodArgumentNotValidException ex) {
//        List<FieldError> erros = ex.getFieldErrors();
//
//        return ResponseEntity.badRequest().body(erros);
//
//    }

}


// @@RestControllerAdvice acima da classe serve para determinarmos essa classe como tratadora de erros

// @ExceptionHandler serve para escolher o erro que queremos tratar