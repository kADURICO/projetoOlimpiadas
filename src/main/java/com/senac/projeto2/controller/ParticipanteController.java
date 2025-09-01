package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Participante;
import com.senac.projeto2.service.ParticipanteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/participante")
@Tag(name="Participante", description="API para gerenciamento dos participantes do sistema")
public class ParticipanteController {
    private final ParticipanteService participanteService;

    public ParticipanteController(ParticipanteService participanteService) {
        this.participanteService = participanteService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar usuarios do sistema")
    public ResponseEntity<List<Participante>> listar(){
        return ResponseEntity.ok(participanteService.listarParticipantes());
    }

    @GetMapping("/listarPorIdParticipante/{idParticipante}")
    @Operation(summary = "Listar usuarios do sistema pelo id do usuário")
    public ResponseEntity<Participante> listarPorIdUsuario(@PathVariable("idParticipante") Integer idParticipante){
        Participante participante = participanteService.listarParticipantePorId(idParticipante);
        if (participante == null) {
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(participante);
        }
    }

}
