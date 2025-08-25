package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Patrocinador;
import com.senac.projeto2.service.PatrocinadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patrocinador")
@Tag(name = "Patrocinador", description = "API para gerenciamento dos patrocinadores do sistema")
public class PatrocinadorController {

    private final PatrocinadorService patrocinadorService;

    public PatrocinadorController(PatrocinadorService patrocinadorService) {
        this.patrocinadorService = patrocinadorService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar patrocinadores do sistema")
    public ResponseEntity<List<Patrocinador>> listar() {
        return ResponseEntity.ok(patrocinadorService.listarPatrocinador());
    }

    @GetMapping("/listarPorIdPatrocinador/{idPatrocinador}")
    @Operation(summary = "Listar patrocinadores do sistema pelo id do patrocinador")
    public ResponseEntity<Patrocinador> listarPorIdPatrocinador(@PathVariable("idPatrocinador") Integer idPatrocinador) {
        return ResponseEntity.ok(patrocinadorService.listarPatrocinadorPorId(idPatrocinador));
    }

    @PostMapping("/criar")
    public String criar() {
        return "Patrocinador criado com sucesso";
    }

    @PutMapping("/atualizar")
    @Operation(summary = "Atualizar patrocinadores do sistema")
    public String atualizar() {
        return "Patrocinadores atualzados com sucesso";
    }

    @PutMapping("/atualizarPorIdPatrocinador/{idPatrocinador}")
    @Operation(summary = "Atualizar patrocinadores do sistema pelo id do patrocinadores")
    public String atualizarPorIdPatrocinador(@PathVariable("idPatrocinador") Integer idPatrocinador) {
        return "Patrocinador por id " + idPatrocinador + "atualzado com sucesso";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Apagar patrocinador do sistema")
    public String apagar() {
        return "Patrocinador apagado com sucesso";
    }

    @DeleteMapping("/apagarPorIdPatrocinador/{idPatrocinador}")
    @Operation(summary = "Apagar patrocinadores do sistema pelo id do patrocinador")
    public String apagarPorIdPatrocinador(@PathVariable("idPatrocinador") Integer idPatrocinador) {
        return "Patrocinador por id " + idPatrocinador + " apagado com sucesso";
    }
}
