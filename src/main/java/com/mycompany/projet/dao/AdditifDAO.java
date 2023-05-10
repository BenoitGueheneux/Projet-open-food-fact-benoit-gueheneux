/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.dao;

import com.mycompany.projet.ProjetUtils;
import com.mycompany.projet.model.Additif;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Benlo
 */
public class AdditifDAO {
    
    private EntityManager em = ProjetUtils.getInstance().getEntityManager();
    
    public void create(Additif additif) {
        em.getTransaction().begin();
        em.persist(additif);
        em.getTransaction().commit();
    }

    public Additif readById(long id) {
        return em.find(Additif.class, id);
    }
    
    public List<Additif> readByName(String nom) {
        TypedQuery<Additif> typedQuery = em.createQuery("SELECT a FROM Additif a WHERE a.nom=:nom", Additif.class);
        typedQuery.setParameter("nom", nom);
        return typedQuery.getResultList();
    }


    public List<Additif> readAll() {
        return em.createQuery("SELECT a FROM Additif a", Additif.class).getResultList();
    }
    
    public void update(Additif additif) {
        em.getTransaction().begin();
        em.merge(additif);
        em.getTransaction().commit();
    }


    public void delete(Additif additif) {
        em.getTransaction().begin();
        em.remove(additif);
        em.getTransaction().commit();
        }
}


