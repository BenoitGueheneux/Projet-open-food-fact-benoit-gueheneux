/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benlo
 */
public class testSurDonnees {
    public static void main(String[] args) {
        try {
            creationList();
        } catch (IOException ex) {
            Logger.getLogger(testSurDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void creationList() throws IOException {
        Path path = Paths.get("donnees/open-food-facts.csv");
        //Path path = Paths.get("C:/Users/Benlo/OneDrive/Documents/NetBeansProjects/Projet-open-food-fact-benoit-gueheneux/donnees/openfoodok.xlsx");
	List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        boolean verifEgaliteColumn = true;
        String[] tokens = lines.get(0).split("\\|");
        int tailleColumn = tokens.length;
        System.out.println(tailleColumn);
        int temp =0;
	for (int i = 0; i < lines.size(); i++) {
            tokens = lines.get(i).split("\\|");
            if(tailleColumn!=tokens.length){
                System.out.println(tokens[27]);
                verifEgaliteColumn=false;
                System.out.println(tokens.length);
                temp++;
            }
                
	}
        System.out.println(verifEgaliteColumn);
        System.out.println(temp);
    }
}
