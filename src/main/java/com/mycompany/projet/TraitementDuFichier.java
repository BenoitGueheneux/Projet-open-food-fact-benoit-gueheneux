/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet;

import com.mycompany.projet.model.Additif;
import com.mycompany.projet.model.Allergene;
import com.mycompany.projet.model.Categorie;
import com.mycompany.projet.model.Ingredient;
import com.mycompany.projet.model.Marque;
import com.mycompany.projet.model.Produit;
import com.mycompany.projet.dao.AdditifDAO;
import com.mycompany.projet.dao.AllergeneDAO;
import com.mycompany.projet.dao.CategorieDAO;
import com.mycompany.projet.dao.IngredientDAO;
import com.mycompany.projet.dao.MarqueDAO;
import com.mycompany.projet.dao.ProduitDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benlo
 */
public class TraitementDuFichier {
    
    public static void traitement(){
        Path path = Paths.get("donnees/open-food-facts.csv");
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            int i = 0;
            reader.readLine();
            for (String line = reader.readLine();((i<1000)&&(line!=null));line = reader.readLine(),i++) {
                Produit produit = new Produit();
                String[] elements;
                String[] colonnes = line.split("\\|");
                for (int j = 0; j < colonnes.length; j++) {
                    if(colonnes[j].trim().length()==0){
                        continue;
                    }
                    switch (j) {
                        case 0:
                            Categorie categorie = new Categorie();
                            categorie.setNom(colonnes[j]);
                            List<Categorie> categorieListe = new CategorieDAO().readByName(colonnes[j]);
                            if(categorieListe.isEmpty()){
                                new CategorieDAO().create(categorie);
                            } else{
                                categorie = categorieListe.get(0);
                                new CategorieDAO().update(categorie);  
                            }
                            categorie.getProduits().add(produit);
                            break;
                        case 1:
                            elements = colonnes[j].split(",");
                            for (String element : elements) {
                                Marque marque = new Marque();
                                marque.setNom(element);
                                List<Marque> marqueListe = new MarqueDAO().readByName(element);
                                new ProduitDAO().create(produit);
                                if (marqueListe.isEmpty()) {
                                    new MarqueDAO().create(marque);
                                } else {
                                    marque = marqueListe.get(0);
                                    new MarqueDAO().update(marque);
                                }
                                produit.getMarques().add(marque);
                            }
                            break;
                        case 2:
                            produit.setNom(colonnes[j]);
                            break;
                        case 3:
                            produit.setScoreNutritionnel(colonnes[j].charAt(0));
                            break;
                        case 4:
                            elements = colonnes[j].split(",");
                            for (String element : elements) {
                                Ingredient ingredient = new Ingredient();
                                ingredient.setNom(element);
                                List<Ingredient> ingredientListe = new IngredientDAO().readByName(element);
                                //new ProduitDAO().create(produit);
                                if (ingredientListe.isEmpty()) {
                                    new IngredientDAO().create(ingredient);
                                } else {
                                    ingredient = ingredientListe.get(0);
                                    new IngredientDAO().update(ingredient);
                                }
                                produit.getIngredients().add(ingredient);
                            }
                            break;
                        case 5:
                            produit.setEnergie100g(Float.valueOf(colonnes[j]));
                            break;
                        case 6:
                            produit.setGraisse100g(Float.valueOf(colonnes[j]));
                            break;
                        case 7:
                            produit.setSucrese100g(Float.valueOf(colonnes[j]));
                            break;
                        case 8:
                            produit.setFibres100g(Float.valueOf(colonnes[j]));
                            break;
                        case 9:
                            produit.setProteines100g(Float.valueOf(colonnes[j]));
                            break;
                        case 10:
                            produit.setSel100g(Float.valueOf(colonnes[j]));
                            break;
                        case 11:
                            produit.setVitA100g(Float.valueOf(colonnes[j]));
                            break;
                        case 12:
                            produit.setVitD100g(Float.valueOf(colonnes[j]));
                            break;
                        case 13:
                            produit.setVitE100g(Float.valueOf(colonnes[j]));
                            break;
                        case 14:
                            produit.setVitK100g(Float.valueOf(colonnes[j]));
                            break;
                        case 15:
                            produit.setVitC100g(Float.valueOf(colonnes[j]));
                            break;
                        case 16:
                            produit.setVitB1100g(Float.valueOf(colonnes[j]));
                            break;
                        case 17:
                            produit.setVitB2100g(Float.valueOf(colonnes[j]));
                            break;
                        case 18:
                            produit.setVitPP100g(Float.valueOf(colonnes[j]));
                            break;
                        case 19:
                            produit.setVitB6100g(Float.valueOf(colonnes[j]));
                            break;
                        case 20:
                            produit.setVitB9100g(Float.valueOf(colonnes[j]));
                            break;
                        case 21:
                            produit.setVitB12100g(Float.valueOf(colonnes[j]));
                            break;
                        case 22:
                            produit.setCalcium100g(Float.valueOf(colonnes[j]));
                            break;
                        case 23:
                            produit.setMagnesium100g(Float.valueOf(colonnes[j]));
                            break;
                        case 24:
                            produit.setIron100g(Float.valueOf(colonnes[j]));
                            break;
                        case 25:
                            produit.setFer100g(Float.valueOf(colonnes[j]));
                            break;
                        case 26:
                            produit.setBetaCarotene100g(Float.valueOf(colonnes[j]));
                            break;
                        case 27:
                            produit.setPresenceHuileDePalme(convertionStringEnBoolean(colonnes[j]));
                            break;
                        case 28:
                            elements = colonnes[j].split(",");
                            for (String element : elements) {
                                Allergene allergene = new Allergene();
                                allergene.setNom(element);
                                List<Allergene> allergeneListe = new AllergeneDAO().readByName(element);
                                //new ProduitDAO().create(produit);
                                if (allergeneListe.isEmpty()) {
                                    new AllergeneDAO().create(allergene);
                                } else {
                                    allergene = allergeneListe.get(0);
                                    new AllergeneDAO().update(allergene);
                                }
                                produit.getAllergenes().add(allergene);
                            }
                            break;
                        case 29:
                            elements = colonnes[j].split(",");
                            for (String element : elements) {
                                Additif additif = new Additif();
                                additif.setNom(element);
                                List<Additif> additifListe = new AdditifDAO().readByName(element);
                                //new ProduitDAO().create(produit);
                                if (additifListe.isEmpty()) {
                                    new AdditifDAO().create(additif);
                                } else {
                                    additif = additifListe.get(0);
                                    new AdditifDAO().update(additif);
                                }
                                produit.getAdditifs().add(additif);
                            }
                            break;
                        default:
                            break;
                    }
                }
                new ProduitDAO().create(produit);
                //Création objets
                
//                List<Marque> marques = new ArrayList<>();
//                //String[] tableauMarque = elements[1].split(",");
//                for (int j = 0; j < tableauMarque.length; j++) {
//                    marques.add(new Marque(tableauMarque[j]));
//                    
//                }
//                Marque marque = new Marque(elements[1]);
//                Ingredient ingredient = new Ingredient(elements[4]);
//                Allergene allergene = new Allergene(elements[28]);
//                Additif additif = new Additif(elements[29]);
                //Produit produit = new Produit(elements[2], elements[3].charAt(0),convertionStringEnFloat(elements[5]),convertionStringEnFloat(elements[6]),convertionStringEnFloat(elements[7]),convertionStringEnFloat(elements[8]),convertionStringEnFloat(elements[9]),convertionStringEnFloat(elements[10]),convertionStringEnFloat(elements[11]),convertionStringEnFloat(elements[12]),convertionStringEnFloat(elements[13]),convertionStringEnFloat(elements[14]),convertionStringEnFloat(elements[15]),convertionStringEnFloat(elements[16]),convertionStringEnFloat(elements[17]),convertionStringEnFloat(elements[18]),convertionStringEnFloat(elements[19]),convertionStringEnFloat(elements[20]),convertionStringEnFloat(elements[21]),convertionStringEnFloat(elements[22]),convertionStringEnFloat(elements[23]),convertionStringEnFloat(elements[24]),convertionStringEnFloat(elements[25]),convertionStringEnFloat(elements[26]),convertionStringEnBoolean(elements[27]));
                
                
//                categorie.getProduits().add(produit);
//                produit.getMarques().add(marque);
//                
//                
//                new IngredientDAO().create(ingredient);
//                new AllergeneDAO().create(allergene);
//                new AdditifDAO().create(additif);
//                new MarqueDAO().create(marque);
//                new CategorieDAO().create(categorie);
//               
// Méthode d'olivier a completer si temps                
//                for(int j=0;j<elements.length;j++){
//                    if(elements[j].trim().length()==0){
//                        continue;
//                    }
//                    switch (j) {
//                        case 28:
//                            break;
//                        default:
//                            throw new AssertionError();
//                    }
//                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TraitementDuFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static boolean convertionStringEnBoolean(String string){
        return string.equals("1");
    }
    
    public static Float convertionStringEnFloat(String string){
        if(string.equals("")){
            return 0f;
        } else {
            return Float.valueOf(string);
    }
}
}
