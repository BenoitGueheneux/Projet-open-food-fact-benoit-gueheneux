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
        TraitementDuFichier.traitement();
        ProjetUtils.getInstance().getEntityManager().close();
    }
}
