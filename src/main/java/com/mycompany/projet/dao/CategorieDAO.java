/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.dao;

import com.mycompany.projet.ProjetUtils;
import com.mycompany.projet.model.Categorie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Benlo
 */
public class CategorieDAO {
    
    private EntityManager em = ProjetUtils.getInstance().getEntityManager();
    
    
    
    public void create(Categorie categorie) {
        em.getTransaction().begin();
        em.persist(categorie);
        em.getTransaction().commit();
    }

    public Categorie readById(long id) {
        return em.find(Categorie.class, id);
    }
    
    public List<Categorie> readByName(String nom) {
        TypedQuery<Categorie> typedQuery = em.createQuery("SELECT a FROM Categorie a WHERE a.nom=:nom", Categorie.class);
        typedQuery.setParameter("nom", nom);
        return typedQuery.getResultList();
    }


    public List<Categorie> readAll() {
        return em.createQuery("SELECT a FROM Categorie a", Categorie.class).getResultList();
    }
    
    public void update(Categorie categorie) {
        em.getTransaction().begin();
        em.merge(categorie);
        em.getTransaction().commit();
    }


    public void delete(Categorie categorie) {
        em.getTransaction().begin();
        em.remove(categorie);
        em.getTransaction().commit();
        }
}


