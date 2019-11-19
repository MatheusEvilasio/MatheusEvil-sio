/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cairu.pibiblioteca.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ALUNO TI
 */

public class GenericDao<T,Type extends Serializable> {
    
   private Class<T> persistenceClass; 
        public GenericDao(Class persistenceClass){ 
            this.persistenceClass=persistenceClass;    
        }
 //---------------------------------------------------------------------------       
       public T Salvar1(T entity){
         T retorno = null;
         org.hibernate.Session session = br.cairu.pibiblioteca.dao.HibernateUtil.geSession();
         Transaction tt = null;
            try {
             tt = session.beginTransaction();
             retorno= (T) session.merge(entity);
             session.flush();
             tt.commit();
         } catch (Exception e) {
             if(tt!=null){
                tt.rollback();
             }
             throw e;
         }
     
     return retorno;
     }   
 //---------------------------------------------------------------------------
      public List<T> listALL() {
        Session sessao = br.cairu.pibiblioteca.dao.HibernateUtil.geSession();
        Criteria criteria = sessao.createCriteria(persistenceClass);

        return criteria.list();
    } 
 //---------------------------------------------------------------------------
      public void delete(T t) {
        Session sessao = br.cairu.pibiblioteca.dao.HibernateUtil.geSession();
        try {
            sessao.beginTransaction();
            sessao.delete(t);
            sessao.getTransaction().commit();
            sessao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
 //--------------------------------------------------------------------------- 
     public T find(long id) {
        T retorno = null;
        try {
            Session sessao = br.cairu.pibiblioteca.dao.HibernateUtil.geSession();
            retorno = (T) sessao.get(persistenceClass, sessao);
        } catch (Exception e) {
             e.printStackTrace();
        }
        return retorno;
    }
 //---------------------------------------------------------------------------      
      public T editar(long id) {
        T retorno = null;
        try { 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}


