package com.senac.projeto2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "premio")
public class Premio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "premio_id", nullable = false, length = 11)
    private int id;
    @Column(name = "premio_descricao", nullable = false, length = 300)
    private String decricao;
    @Column(name = "premio_ordem_premiacao", nullable = false, length = 11)
    private int ordemPremiacao;
    @Column(name = "premio_categoria", nullable = false, length = 11)
    private int categoria;
    @Column(name = "premio_status", nullable = false, length = 11)
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public int getOrdemPremiacao() {
        return ordemPremiacao;
    }

    public void setOrdemPremiacao(int ordemPremiacao) {
        this.ordemPremiacao = ordemPremiacao;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}