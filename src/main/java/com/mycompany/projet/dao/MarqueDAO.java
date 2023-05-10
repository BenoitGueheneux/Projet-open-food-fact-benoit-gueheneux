/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.dao;

import com.mycompany.projet.ProjetUtils;
import com.mycompany.projet.model.Marque;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Benlo
 */
public class MarqueDAO {
    
    private EntityManager em = ProjetUtils.getInstance().getEntityManager();
    
    public void create(Marque marque) {
        em.getTransaction().begin();
        em.persist(marque);
        em.getTransaction().commit();
    }

    public Marque readById(long id) {
        return em.find(Marque.class, id);
    }
    
    public List<Marque> readByName(String nom) {
        TypedQuery<Marque> typedQuery = em.createQuery("SELECT a FROM Marque a WHERE a.nom=:nom", Marque.class);
        typedQuery.setParameter("nom", nom);
        return typedQuery.getResultList();
    }


    public List<Marque> readAll() {
        return em.createQuery("SELECT a FROM Marque a", Marque.class).getResultList();
    }
    
    public void update(Marque marque) {
        em.getTransaction().begin();
        em.merge(marque);
        em.getTransaction().commit();
    }


    public void delete(Marque marque) {
        em.getTransaction().begin();
        em.remove(marque);
        em.getTransaction().commit();
        }
}


