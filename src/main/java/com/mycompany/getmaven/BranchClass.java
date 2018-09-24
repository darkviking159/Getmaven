package com.mycompany.getmaven;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AppleDudeBrent
 */
public class BranchClass {
    
    private String naam;
    private String voornaam;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public String toString() {
        return "BranchClass{" + "naam=" + naam + ", voornaam=" + voornaam + '}';
    }
    
    
    
}
