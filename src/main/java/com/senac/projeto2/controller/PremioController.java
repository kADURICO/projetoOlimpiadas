package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Premio;
import com.senac.projeto2.service.PremioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/premio")
@Tag(name = "Premio", description = "API para gerenciamento dos prêmios do sistema")
public class PremioController {

    private final PremioService premioService;

    public PremioController(PremioService premioService) {
        this.premioService = premioService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar premios do sistema")
    public ResponseEntity<List<Premio>> listar() {
        return ResponseEntity.ok(premioService.listarPremios());
    }

    @GetMapping("/listarPorIdPremio/{idPremio}")
    @Operation(summary = "Listar remios do sistema pelo id do premio")
    public ResponseEntity<Premio> listarPorIdPremio(@PathVariable("idPremio") Integer idPremio) {
        return ResponseEntity.ok(premioService.listarPremiosPorId(idPremio));
    }

    @PostMapping("/criar")
    public String criar() {
        return "Premio criado com sucesso";
    }

    @PutMapping("/atualizar")
    @Operation(summary = "Atualizar premios do sistema")
    public String atualizar() {
        return "Premio atualzado com sucesso";
    }

    @PutMapping("/atualizarPorIdPremio/{idPremio}")
    @Operation(summary = "Atualizar premios do sistema pelo id do premio")
    public String atualizarPorIdPremio(@PathVariable("idPremio") Integer idPremio) {
        return "Premio por id " + idPremio + "atualzado com sucesso";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Apagar premios do sistema")
    public String apagar() {
        return "Premio apagado com sucesso";
    }

    @DeleteMapping("/apagarPorIdPremio/{idPremio}")
    @Operation(summary = "Apagar premios do sistema pelo id do premio")
    public String apagarPorIdPremio(@PathVariable("idPremio") Integer idPremio) {
        return "Premio por id " + idPremio + " apagado com sucesso";
    }
}
