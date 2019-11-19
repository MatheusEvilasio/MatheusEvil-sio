/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cairu.pibiblioteca.database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ALUNO TI
 */
@Entity
@Table (name = "cadastrolivro")
public class CadastroLivro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")        
    private Integer id;
    
    @Column(name = "nomedolivro",length = 30)
    private String nomedolivro;
    
    @Column(name = "edicao")
    private Integer edicao;
    
    @Column(name = "ano")
    private Integer ano;
   
    @Column(name = "autor",length = 30)
    private String autor;
    
    @Column(name = "observacao")
    private String observacao;
       
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public String getNomedolivro() {
        return nomedolivro;
    }

    public void setNomedolivro(String nomedolivro) {
        this.nomedolivro = nomedolivro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
   
    
    
    
}
