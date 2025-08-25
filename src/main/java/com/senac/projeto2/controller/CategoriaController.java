package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Categoria;
import com.senac.projeto2.service.CategoriaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categoria")
@Tag(name = "Categoria", description = "API para gerenciamento das categorias do sistema")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar categorias do sistema")
    public ResponseEntity<List<Categoria>> listar() {
        return ResponseEntity.ok(categoriaService.listarCategorias());
    }

    @GetMapping("/listarPorIdCategoria/{idCategoria}")
    @Operation(summary = "Listar categorias do sistema pelo id da categoria")
    public ResponseEntity<Categoria> listarPorIdCategoria(@PathVariable("idCategoria") Integer idCategoria) {
        return ResponseEntity.ok(categoriaService.listarCategoriasPorId(idCategoria));
    }

    @PostMapping("/criar")
    public String criar() {
        return "Categoria criada com sucesso";
    }

    @PutMapping("/atualizar")
    @Operation(summary = "Atualizar categorias do sistema")
    public String atualizar() {
        return "Categoria atualzada com sucesso";
    }

    @PutMapping("/atualizarPorIdCategoria/{idCategoria}")
    @Operation(summary = "Atualizar categorias do sistema pelo id da categoria")
    public String atualizarPorIdCategoria(@PathVariable("idCategoria") Integer idCategoria) {
        return "Categoria por id " + idCategoria + "atualzado com sucesso";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Apagar categorias do sistema")
    public String apagar() {
        return "Categoria apagado com sucesso";
    }

    @DeleteMapping("/apagarPorIdCategoria/{idCategoria}")
    @Operation(summary = "Apagar categorias do sistema pelo id da categoria")
    public String apagarPorIdCategoria(@PathVariable("idCategoria") Integer idCategoria) {
        return "Categoria por id " + idCategoria + " apagado com sucesso";
    }
}
