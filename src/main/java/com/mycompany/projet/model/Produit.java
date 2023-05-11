/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benlo
 */
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Character scoreNutritionnel;
    private Double energie100g;
    private Double graisse100g;
    private Double sucrese100g;
    private Double fibres100g;
    private Double proteines100g;
    private Double sel100g;
    private Double vitA100g;
    private Double vitD100g;
    private Double vitE100g;
    private Double vitK100g;
    private Double vitC100g;
    private Double vitB1100g;
    private Double vitB2100g;
    private Double vitPP100g;
    private Double vitB6100g;
    private Double vitB9100g;
    private Double vitB12100g;
    private Double calcium100g;
    private Double magnesium100g;
    private Double iron100g;
    private Double fer100g;
    private Double betaCarotene100g;
    private Boolean presenceHuileDePalme;
    @ManyToMany
    private List<Marque> marques = new ArrayList<>();
    @ManyToMany
    private List<Additif> additifs = new ArrayList<>();
    @ManyToMany
    private List<Allergene> allergenes = new ArrayList<>();
    @ManyToMany
    private List<Ingredient> ingredients = new ArrayList<>();

//    public Produit(String nom, Character scoreNutritionnel, Double energie100g, Double graisse100g, Double sucrese100g, Double fibres100g, Double proteines100g, Double sel100g, Double vitA100g, Double vitD100g, Double vitE100g, Double vitK100g, Double vitC100g, Double vitB1100g, Double vitB2100g, Double vitPP100g, Double vitB6100g, Double vitB9100g, Double vitB12100g, Double calcium100g, Double magnesium100g, Double iron100g, Double fer100g, Double betaCarotene100g, Boolean presenceHuileDePalme) {
//        this.nom = nom;
//        this.scoreNutritionnel = scoreNutritionnel;
//        this.energie100g = energie100g;
//        this.graisse100g = graisse100g;
//        this.sucrese100g = sucrese100g;
//        this.fibres100g = fibres100g;
//        this.proteines100g = proteines100g;
//        this.sel100g = sel100g;
//        this.vitA100g = vitA100g;
//        this.vitD100g = vitD100g;
//        this.vitE100g = vitE100g;
//        this.vitK100g = vitK100g;
//        this.vitC100g = vitC100g;
//        this.vitB1100g = vitB1100g;
//        this.vitB2100g = vitB2100g;
//        this.vitPP100g = vitPP100g;
//        this.vitB6100g = vitB6100g;
//        this.vitB9100g = vitB9100g;
//        this.vitB12100g = vitB12100g;
//        this.calcium100g = calcium100g;
//        this.magnesium100g = magnesium100g;
//        this.iron100g = iron100g;
//        this.fer100g = fer100g;
//        this.betaCarotene100g = betaCarotene100g;
//        this.presenceHuileDePalme = presenceHuileDePalme;
//    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Character getScoreNutritionnel() {
        return scoreNutritionnel;
    }

    public void setScoreNutritionnel(Character scoreNutritionnel) {
        this.scoreNutritionnel = scoreNutritionnel;
    }

    public Double getEnergie100g() {
        return energie100g;
    }

    public void setEnergie100g(Double energie100g) {
        this.energie100g = energie100g;
    }

    public Double getGraisse100g() {
        return graisse100g;
    }

    public void setGraisse100g(Double graisse100g) {
        this.graisse100g = graisse100g;
    }

    public Double getSucrese100g() {
        return sucrese100g;
    }

    public void setSucrese100g(Double sucrese100g) {
        this.sucrese100g = sucrese100g;
    }

    public Double getFibres100g() {
        return fibres100g;
    }

    public void setFibres100g(Double fibres100g) {
        this.fibres100g = fibres100g;
    }

    public Double getProteines100g() {
        return proteines100g;
    }

    public void setProteines100g(Double proteines100g) {
        this.proteines100g = proteines100g;
    }

    public Double getSel100g() {
        return sel100g;
    }

    public void setSel100g(Double sel100g) {
        this.sel100g = sel100g;
    }

    public Double getVitA100g() {
        return vitA100g;
    }

    public void setVitA100g(Double vitA100g) {
        this.vitA100g = vitA100g;
    }

    public Double getVitD100g() {
        return vitD100g;
    }

    public void setVitD100g(Double vitD100g) {
        this.vitD100g = vitD100g;
    }

    public Double getVitE100g() {
        return vitE100g;
    }

    public void setVitE100g(Double vitE100g) {
        this.vitE100g = vitE100g;
    }

    public Double getVitK100g() {
        return vitK100g;
    }

    public void setVitK100g(Double vitK100g) {
        this.vitK100g = vitK100g;
    }

    public Double getVitC100g() {
        return vitC100g;
    }

    public void setVitC100g(Double vitC100g) {
        this.vitC100g = vitC100g;
    }

    public Double getVitB1100g() {
        return vitB1100g;
    }

    public void setVitB1100g(Double vitB1100g) {
        this.vitB1100g = vitB1100g;
    }

    public Double getVitB2100g() {
        return vitB2100g;
    }

    public void setVitB2100g(Double vitB2100g) {
        this.vitB2100g = vitB2100g;
    }

    public Double getVitPP100g() {
        return vitPP100g;
    }

    public void setVitPP100g(Double vitPP100g) {
        this.vitPP100g = vitPP100g;
    }

    public Double getVitB6100g() {
        return vitB6100g;
    }

    public void setVitB6100g(Double vitB6100g) {
        this.vitB6100g = vitB6100g;
    }

    public Double getVitB9100g() {
        return vitB9100g;
    }

    public void setVitB9100g(Double vitB9100g) {
        this.vitB9100g = vitB9100g;
    }

    public Double getVitB12100g() {
        return vitB12100g;
    }

    public void setVitB12100g(Double vitB12100g) {
        this.vitB12100g = vitB12100g;
    }

    public Double getCalcium100g() {
        return calcium100g;
    }

    public void setCalcium100g(Double calcium100g) {
        this.calcium100g = calcium100g;
    }

    public Double getMagnesium100g() {
        return magnesium100g;
    }

    public void setMagnesium100g(Double magnesium100g) {
        this.magnesium100g = magnesium100g;
    }

    public Double getIron100g() {
        return iron100g;
    }

    public void setIron100g(Double iron100g) {
        this.iron100g = iron100g;
    }

    public Double getFer100g() {
        return fer100g;
    }

    public void setFer100g(Double fer100g) {
        this.fer100g = fer100g;
    }

    public Double getBetaCarotene100g() {
        return betaCarotene100g;
    }

    public void setBetaCarotene100g(Double betaCarotene100g) {
        this.betaCarotene100g = betaCarotene100g;
    }

    public Boolean getPresenceHuileDePalme() {
        return presenceHuileDePalme;
    }

    public void setPresenceHuileDePalme(Boolean presenceHuileDePalme) {
        this.presenceHuileDePalme = presenceHuileDePalme;
    }

    public List<Marque> getMarques() {
        return marques;
    }

    public void setMarques(List<Marque> marques) {
        this.marques = marques;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    

}
