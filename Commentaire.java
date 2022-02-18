/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Commentaire {
    private int idAct,idUser;
    private String com;
  

    public Commentaire() {
    }

    public Commentaire(int idAct, int idUser, String com) {
        this.idAct = idAct;
        this.idUser = idUser;
        this.com = com;
      
       
    }

    public Commentaire(int idUser, String com) {
        this.idUser = idUser;
        this.com = com;
       
      
    }

    public int getIdAct() {
        return idAct;
    }

    public void setIdAct(int idAct) {
        this.idAct = idAct;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getcom() {
        return com;
    }

    public void setcom(String com) {
        this.com = com;
    }

  

    @Override
    public String toString() {
        return "COMMENTAIRE{" + "idAct=" + idAct + ", idUser=" + idUser + ", com=" + com + '}';
    }
    

   
   
    
}
