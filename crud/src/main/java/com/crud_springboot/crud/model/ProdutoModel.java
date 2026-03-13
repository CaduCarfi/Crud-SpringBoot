package com.crud_springboot.crud.model;

import com.crud_springboot.crud.enuns.ProdutoEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    Double preco;
    Integer quantidadeEmEstoque;
    private ProdutoEnum produtoEnum;

    public ProdutoModel() {
    }

    public ProdutoModel(Long id, String nome, Double preco, Integer quantidadeEmEstoque, ProdutoEnum produtoEnum) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.produtoEnum = produtoEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public ProdutoEnum getProdutoEnum() {
        return produtoEnum;
    }

    public void setProdutoEnum(ProdutoEnum produtoEnum) {
        this.produtoEnum = produtoEnum;
    }
}
