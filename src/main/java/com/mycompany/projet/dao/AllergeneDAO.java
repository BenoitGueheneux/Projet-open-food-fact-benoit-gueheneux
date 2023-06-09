/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.dao;

import com.mycompany.projet.ProjetUtils;
import com.mycompany.projet.model.Allergene;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Benlo
 */
public class AllergeneDAO {
    
    private EntityManager em = ProjetUtils.getInstance().getEntityManager();
    
    public void create(Allergene allergene) {
        em.getTransaction().begin();
        em.persist(allergene);
        em.getTransaction().commit();
    }

    public Allergene readById(long id) {
        return em.find(Allergene.class, id);
    }
    
    public List<Allergene> readByName(String nom) {
        TypedQuery<Allergene> typedQuery = em.createQuery("SELECT a FROM Allergene a WHERE a.nom=:nom", Allergene.class);
        typedQuery.setParameter("nom", nom);
        return typedQuery.getResultList();
    }


    public List<Allergene> readAll() {
        return em.createQuery("SELECT a FROM Allergene a", Allergene.class).getResultList();
    }
    
    
    
    public void update(Allergene allergene) {
        em.getTransaction().begin();
        em.merge(allergene);
        em.getTransaction().commit();
    }


    public void delete(Allergene allergene) {
        em.getTransaction().begin();
        em.remove(allergene);
        em.getTransaction().commit();
        }
    }


