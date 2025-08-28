package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Jogo;
import com.senac.projeto2.service.JogoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jogo")
@Tag(name = "Jogo", description = "API para gerenciamento dos jogos do sistema")
public class JogoController {

    private final JogoService jogoService;

    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar jogos do sistema")
    public ResponseEntity<List<Jogo>> listar() {
        return ResponseEntity.ok(jogoService.listarJogos());
    }

    @GetMapping("/listarPorIdJogo/{idJogo}")
    @Operation(summary = "Listar jogos do sistema pelo id da jogo")
    public ResponseEntity<Jogo> listarPorIdJogo(@PathVariable("idJogo") Integer idJogo) {
        return ResponseEntity.ok(jogoService.listarJogosPorId(idJogo));
    }

    @PostMapping("/criar")
    public String criar() {
        return "Jogo criado com sucesso";
    }

    @PutMapping("/atualizar")
    @Operation(summary = "Atualizar jogos do sistema")
    public String atualizar() {
        return "Jogo atualizado com sucesso";
    }

    @PutMapping("/atualizarPorIdJogo/{idJogo}")
    @Operation(summary = "Atualizar jogos do sistema pelo id do jogo")
    public String atualizarPorIdJogo(@PathVariable("idJogo") Integer idJogo) {
        return "Jogo por id " + idJogo + "atualzado com sucesso";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Apagar jogos do sistema")
    public String apagar() {
        return "Jogo apagado com sucesso";
    }

    @DeleteMapping("/apagarPorIdJogo/{idJogo}")
    @Operation(summary = "Apagar jogos do sistema pelo id do jogo")
    public String apagarPorIdJogo(@PathVariable("idJogo") Integer idJogo) {
        return "Jogo por id " + idJogo + " apagado com sucesso";
    }
}
