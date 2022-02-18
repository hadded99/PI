/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import Services.ActualitesService;
import entities.Actualites;
import tools.MaConnexion;

/**
 *
 * @author Fayechi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaConnexion mc = MaConnexion.getInstance();
        Actualites a = new Actualites(1,1,"rrr","fdfd","fdfd","fdfd");
          
          ActualitesService as = new ActualitesService();
          
          System.out.println(as.afficher());
          as.supprimer(a);
          System.out.println(as.afficher());
    }
    
}
