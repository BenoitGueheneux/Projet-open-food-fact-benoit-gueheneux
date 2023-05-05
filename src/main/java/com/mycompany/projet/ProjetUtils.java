/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Benlo
 */
public class ProjetUtils {
    private final static ProjetUtils INSTANCE = new ProjetUtils();
    
    private ProjetUtils(){}
    public static ProjetUtils getInstance(){
        return INSTANCE;
    }
    //JPA
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("ProjetPU");
    private final static EntityManager EM = EMF.createEntityManager();
    
    public EntityManager getEntityManager(){
    return EM;
        }
    //TODO methode de close EM
    
}
