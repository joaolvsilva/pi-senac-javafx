/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jrneto
 */
public class jpaUtils {
    private static EntityManagerFactory ENTITYI_MANAGER_FACTORY = null;
    
    public EntityManager getEntityManager(){
        if(ENTITYI_MANAGER_FACTORY == null){
            ENTITYI_MANAGER_FACTORY = Persistence.createEntityManagerFactory("javaFrame-model-maven");
        }
        return ENTITYI_MANAGER_FACTORY.createEntityManager();
    }
}
