/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cairu.pibiblioteca.dao;


import java.io.Serializable;
import br.cairu.pibiblioteca.database.CadastroLivro;
/**
 *
 * @author ALUNO TI
 */
public class CadastroLivroDao extends GenericDao<CadastroLivro,Long>{
    public CadastroLivroDao(){
        super(CadastroLivro.class);
    }
    
}
