package com.crud_springboot.crud.service;

import com.crud_springboot.crud.model.ProdutoModel;
import com.crud_springboot.crud.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public ProdutoModel buscarId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Não encontrado"));
    }

    public ProdutoModel cadastrarProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produtoModel) {
        ProdutoModel produto = produtoRepository.findById(id).get();
        produto.setNome(produtoModel.getNome());
        produto.setPreco(produtoModel.getPreco());
        return produtoRepository.save(produto);
    }

}
