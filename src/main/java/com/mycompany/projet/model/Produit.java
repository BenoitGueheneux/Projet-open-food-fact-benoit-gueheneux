/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.model;

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
    private Float energie100g;
    private Float graisse100g;
    private Float sucrese100g;
    private Float fibres100g;
    private Float proteines100g;
    private Float sel100g;
    private Float vitA100g;
    private Float vitD100g;
    private Float vitE100g;
    private Float vitK100g;
    private Float vitC100g;
    private Float vitB1100g;
    private Float vitB2100g;
    private Float vitPP100g;
    private Float vitB6100g;
    private Float vitB9100g;
    private Float vitB12100g;
    private Float calcium100g;
    private Float magnesium100g;
    private Float iron100g;
    private Float fer100g;
    private Float betaCarotene100g;
    private Boolean presenceHuileDePalme;
    @ManyToMany
    private List<Marque> marques = new ArrayList<>();
    @ManyToMany
    private List<Additif> additifs = new ArrayList<>();
    @ManyToMany
    private List<Allergene> allergenes = new ArrayList<>();
    @ManyToMany
    private List<Ingredient> ingredients = new ArrayList<>();

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

    public Float getEnergie100g() {
        return energie100g;
    }

    public void setEnergie100g(Float energie100g) {
        this.energie100g = energie100g;
    }

    public Float getGraisse100g() {
        return graisse100g;
    }

    public void setGraisse100g(Float graisse100g) {
        this.graisse100g = graisse100g;
    }

    public Float getSucrese100g() {
        return sucrese100g;
    }

    public void setSucrese100g(Float sucrese100g) {
        this.sucrese100g = sucrese100g;
    }

    public Float getFibres100g() {
        return fibres100g;
    }

    public void setFibres100g(Float fibres100g) {
        this.fibres100g = fibres100g;
    }

    public Float getProteines100g() {
        return proteines100g;
    }

    public void setProteines100g(Float proteines100g) {
        this.proteines100g = proteines100g;
    }

    public Float getSel100g() {
        return sel100g;
    }

    public void setSel100g(Float sel100g) {
        this.sel100g = sel100g;
    }

    public Float getVitA100g() {
        return vitA100g;
    }

    public void setVitA100g(Float vitA100g) {
        this.vitA100g = vitA100g;
    }

    public Float getVitD100g() {
        return vitD100g;
    }

    public void setVitD100g(Float vitD100g) {
        this.vitD100g = vitD100g;
    }

    public Float getVitE100g() {
        return vitE100g;
    }

    public void setVitE100g(Float vitE100g) {
        this.vitE100g = vitE100g;
    }

    public Float getVitK100g() {
        return vitK100g;
    }

    public void setVitK100g(Float vitK100g) {
        this.vitK100g = vitK100g;
    }

    public Float getVitC100g() {
        return vitC100g;
    }

    public void setVitC100g(Float vitC100g) {
        this.vitC100g = vitC100g;
    }

    public Float getVitB1100g() {
        return vitB1100g;
    }

    public void setVitB1100g(Float vitB1100g) {
        this.vitB1100g = vitB1100g;
    }

    public Float getVitB2100g() {
        return vitB2100g;
    }

    public void setVitB2100g(Float vitB2100g) {
        this.vitB2100g = vitB2100g;
    }

    public Float getVitPP100g() {
        return vitPP100g;
    }

    public void setVitPP100g(Float vitPP100g) {
        this.vitPP100g = vitPP100g;
    }

    public Float getVitB6100g() {
        return vitB6100g;
    }

    public void setVitB6100g(Float vitB6100g) {
        this.vitB6100g = vitB6100g;
    }

    public Float getVitB9100g() {
        return vitB9100g;
    }

    public void setVitB9100g(Float vitB9100g) {
        this.vitB9100g = vitB9100g;
    }

    public Float getVitB12100g() {
        return vitB12100g;
    }

    public void setVitB12100g(Float vitB12100g) {
        this.vitB12100g = vitB12100g;
    }

    public Float getCalcium100g() {
        return calcium100g;
    }

    public void setCalcium100g(Float calcium100g) {
        this.calcium100g = calcium100g;
    }

    public Float getMagnesium100g() {
        return magnesium100g;
    }

    public void setMagnesium100g(Float magnesium100g) {
        this.magnesium100g = magnesium100g;
    }

    public Float getIron100g() {
        return iron100g;
    }

    public void setIron100g(Float iron100g) {
        this.iron100g = iron100g;
    }

    public Float getFer100g() {
        return fer100g;
    }

    public void setFer100g(Float fer100g) {
        this.fer100g = fer100g;
    }

    public Float getBetaCarotene100g() {
        return betaCarotene100g;
    }

    public void setBetaCarotene100g(Float betaCarotene100g) {
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

    public List<Ingredient> getIngredient() {
        return ingredients;
    }

    public void setIngredient(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    

}
