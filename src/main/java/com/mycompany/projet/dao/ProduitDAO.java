/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.dao;

import com.mycompany.projet.ProjetUtils;
import com.mycompany.projet.model.Produit;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Benlo
 */
public class ProduitDAO {
    
    private EntityManager em = ProjetUtils.getInstance().getEntityManager();
    
    public void create(Produit produit) {
        em.getTransaction().begin();
        em.persist(produit);
        em.getTransaction().commit();
    }

    public Produit readById(long id) {
        return em.find(Produit.class, id);
    }
    
    public Produit readByName(String nom) {
        TypedQuery<Produit> typedQuery = em.createQuery("SELECT a FROM Produit a WHERE a.nom=:nom", Produit.class);
        typedQuery.setParameter("nom", nom);
        return typedQuery.getSingleResult();
    }


    public List<Produit> readAll() {
        return em.createQuery("SELECT a FROM Produit a", Produit.class).getResultList();
    }
    
    public void update(Produit produit) {
        em.getTransaction().begin();
        em.merge(produit);
        em.getTransaction().commit();
    }


    public void delete(Produit produit) {
        em.getTransaction().begin();
        em.remove(produit);
        em.getTransaction().commit();
        }
}


