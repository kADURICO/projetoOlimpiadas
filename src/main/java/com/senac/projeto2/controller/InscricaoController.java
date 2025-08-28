package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Inscricao;
import com.senac.projeto2.service.InscricaoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inscricao")
@Tag(name = "Inscricao", description = "API para gerenciamento das inscrições do sistema")
public class InscricaoController {

    private final InscricaoService inscricaoService;

    public InscricaoController(InscricaoService inscricaoService) {
        this.inscricaoService = inscricaoService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar inscricoes do sistema")
    public ResponseEntity<List<Inscricao>> listar() {
        return ResponseEntity.ok(inscricaoService.listarInscricoes());
    }

    @GetMapping("/listarPorIdInscricao/{idInscricao}")
    @Operation(summary = "Listar inscricoes do sistema pelo id da inscricao")
    public ResponseEntity<Inscricao> listarPorIdInscricao(@PathVariable("idInscricao") Integer idInscricao) {
        return ResponseEntity.ok(inscricaoService.listarInscricoesPorId(idInscricao));
    }

    @PostMapping("/criar")
    public String criar() {
        return "Inscricao criada com sucesso";
    }

    @PutMapping("/atualizar")
    @Operation(summary = "Atualizar inscricoes do sistema")
    public String atualizar() {
        return "Inscricao atualizado com sucesso";
    }

    @PutMapping("/atualizarPorIdInscricao/{idInscricao}")
    @Operation(summary = "Atualizar inscricoes do sistema pelo id da inscricao")
    public String atualizarPorIdInscricao(@PathVariable("idInscricao") Integer idInscricao) {
        return "Inscricao por id " + idInscricao + "atualzado com sucesso";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Apagar inscricoes do sistema")
    public String apagar() {
        return "Inscricao apagado com sucesso";
    }

    @DeleteMapping("/apagarPorIdInscricao/{idInscricao}")
    @Operation(summary = "Apagar inscricoes do sistema pelo id da inscricao")
    public String apagarPorIdInscricao(@PathVariable("idInscricao") Integer idInscricao) {
        return "Inscricao por id " + idInscricao + " apagado com sucesso";
    }
}
