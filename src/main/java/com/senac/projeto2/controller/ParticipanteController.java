package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Participante;
import com.senac.projeto2.service.ParticipanteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/participante")
@Tag(name = "Participante", description = "API para gerenciamento dos participantes do sistema")
public class ParticipanteController {

    private final ParticipanteService participanteService;

    public ParticipanteController(ParticipanteService participanteService) {
        this.participanteService = participanteService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar participantes do sistema")
    public ResponseEntity<List<Participante>> listar() {
        return ResponseEntity.ok(participanteService.listarParticipantes());
    }

    @GetMapping("/listarPorIdParticipante/{idParticipante}")
    @Operation(summary = "Listar participantes do sistema pelo id do participante")
    public ResponseEntity<Participante> listarPorIdParticipante(@PathVariable("idParticipante") Integer idParticipante) {
        return ResponseEntity.ok(participanteService.listarParticipatesPorId(idParticipante));
    }

    @PostMapping("/criar")
    public String criar() {
        return "Partocipante criada com sucesso";
    }

    @PutMapping("/atualizar")
    @Operation(summary = "Atualizar participantes do sistema")
    public String atualizar() {
        return "Participante atualzada com sucesso";
    }

    @PutMapping("/atualizarPorIdParticipante/{idParticipante}")
    @Operation(summary = "Atualizar participantes do sistema pelo id do participante")
    public String atualizarPorIdParticipante(@PathVariable("idParticipante") Integer idParticipante) {
        return "Participante por id " + idParticipante + "atualzado com sucesso";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Apagar participantes do sistema")
    public String apagar() {
        return "Participantes apagado com sucesso";
    }

    @DeleteMapping("/apagarPorIdParticipante/{idParticipante}")
    @Operation(summary = "Apagar participantes do sistema pelo id da participantes")
    public String apagarPorIdParticipante(@PathVariable("idParticipante") Integer idParticipante) {
        return "Participante por id " + idParticipante + " apagado com sucesso";
    }
}
