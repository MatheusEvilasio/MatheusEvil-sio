/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cairu.pibiblioteca.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ALUNO TI
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
                
            public static Session geSession(){
                Session session = threadLocal.get();
                    if(session==null){
                       session= sessionFactory.openSession();
                       threadLocal.set(session);
                        }
                       return session;
    }
   }
