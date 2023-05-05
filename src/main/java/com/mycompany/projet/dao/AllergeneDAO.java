/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.dao;

import com.mycompany.projet.ProjetUtils;
import com.mycompany.projet.model.Allergene;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author Benlo
 */
public class AllergeneDAO {
    
    public void create(Allergene allergene) {
        EntityManager em = ProjetUtils.getInstance().getEntityManager();
        em.getTransaction().begin();
        em.persist(allergene);
        em.getTransaction().commit();
        em.close();
    }

    public Allergene readById(long id) {
        EntityManager em = ProjetUtils.getInstance().getEntityManager();
        try {
            return em.find(Allergene.class, id);
        } finally {
            em.close();
        }
    }

    public List<Allergene> readAll() {
        EntityManager em = ProjetUtils.getInstance().getEntityManager();
        try {
            return em.createQuery("SELECT a FROM Allergene a", Allergene.class).getResultList();
        } finally {
            em.close();
        }
    }
 public void update(Allergene allergene) {
        EntityManager em = ProjetUtils.getInstance().getEntityManager();
        em.getTransaction().begin();
        em.merge(allergene);
        em.getTransaction().commit();
        em.close();
    }


    public void deleteById(Allergene allergene) {
        EntityManager em = ProjetUtils.getInstance().getEntityManager();
        em.getTransaction().begin();
        em.remove(allergene);
        em.getTransaction().commit();
        em.close();
        }
    }


