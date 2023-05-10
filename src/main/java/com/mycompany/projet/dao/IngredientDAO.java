/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.dao;

import com.mycompany.projet.ProjetUtils;
import com.mycompany.projet.model.Ingredient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Benlo
 */
public class IngredientDAO {
    
    private EntityManager em = ProjetUtils.getInstance().getEntityManager();
    
    public void create(Ingredient ingredient) {
        em.getTransaction().begin();
        em.persist(ingredient);
        em.getTransaction().commit();
    }

    public Ingredient readById(long id) {
        return em.find(Ingredient.class, id);
    }
    
    public List<Ingredient> readByName(String nom) {
        TypedQuery<Ingredient> typedQuery = em.createQuery("SELECT a FROM Ingredient a WHERE a.nom=:nom", Ingredient.class);
        typedQuery.setParameter("nom", nom);
        return typedQuery.getResultList();
    }


    public List<Ingredient> readAll() {
        return em.createQuery("SELECT a FROM Ingredient a", Ingredient.class).getResultList();
    }
    
    public void update(Ingredient ingredient) {
        em.getTransaction().begin();
        em.merge(ingredient);
        em.getTransaction().commit();
    }


    public void delete(Ingredient ingredient) {
        em.getTransaction().begin();
        em.remove(ingredient);
        em.getTransaction().commit();
        }
}


