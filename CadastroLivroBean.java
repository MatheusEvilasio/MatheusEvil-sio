
package br.cairu.pibiblioteca.bean;

import br.cairu.pibiblioteca.database.CadastroLivro;
import br.cairu.pibiblioteca.dao.CadastroLivroDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author ALUNO TI
 */
@ManagedBean
@ViewScoped
public class CadastroLivroBean implements Serializable{
    
      private CadastroLivro cadastroLivro;
      private List<CadastroLivro> cadastroLivros;
            CadastroLivroDao cadastroLivroDao; 
            
      @PostConstruct
      public void init(){
          cadastroLivro = new CadastroLivro();
          cadastroLivros = new ArrayList<>();
          cadastroLivroDao= new CadastroLivroDao();
          cadastroLivros = cadastroLivroDao.listALL();
      }
      
      public void salvar(){
          
          System.out.println("teste");
          
          CadastroLivro cl = cadastroLivroDao.Salvar1(cadastroLivro);
            if(cl!=null){
              cadastroLivro=cl;
              cadastroLivros= cadastroLivroDao.listALL();
            }
      
      }
   //--------------------------------------------------------------------------- 
   public  void editar(Long id){
   cadastroLivro = cadastroLivroDao.find(id);

   }

   //---------------------------------------------------------------------------
//   public void excluir(Long id){ 
//       for(CadastroLivro cl:cadastroLivros){
//       if(cl.getId()==id){
//           cadastroLivro = cadastroLivroDao.delete(cl);
//       }
//       
//       }
//   }
   
   
   //--------------------------------------------------------------------------- 
   
    public CadastroLivro getCadastroLivro() {
        return cadastroLivro;
    }

    public void setCadastroLivro(CadastroLivro cadastroLivro) {
        this.cadastroLivro = cadastroLivro;
    }

    public List<CadastroLivro> getCadastroLivros() {
        return cadastroLivros;
    }

    public void setCadastroLivros(List<CadastroLivro> cadastroLivros) {
        this.cadastroLivros = cadastroLivros;
    }

    public CadastroLivroDao getCadastroLivroDao() {
        return cadastroLivroDao;
    }

    public void setCadastroLivroDao(CadastroLivroDao cadastroLivroDao) {
        this.cadastroLivroDao = cadastroLivroDao;
    }
  
     
}
