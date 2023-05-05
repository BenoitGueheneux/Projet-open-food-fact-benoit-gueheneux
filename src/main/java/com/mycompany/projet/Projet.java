/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Benlo
 */
public class Projet {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManager em = ProjetUtils.getInstance().getEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
        System.out.println("Bye World!");
    }
}
