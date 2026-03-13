package com.crud_springboot.crud.controller;

import com.crud_springboot.crud.model.ProdutoModel;
import com.crud_springboot.crud.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> findAll(){
        List<ProdutoModel> requeste = produtoService.findAll();
        return ResponseEntity.ok().body(requeste);
    }

    @PostMapping
    public ResponseEntity <ProdutoModel> criarProduto(@RequestBody ProdutoModel produtoModel){
        return  ResponseEntity.status(204).body(produtoModel);
    }

    @PutMapping
    public ResponseEntity<ProdutoModel> atualizarProduto(@RequestBody ProdutoModel produtoModel) {
        return ResponseEntity.status(204).body(produtoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar (@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> buscarId(@PathVariable Long id){
        ProdutoModel produto = produtoService.buscarId(id);
        return ResponseEntity.ok(produto);
    }
}