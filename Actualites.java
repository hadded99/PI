/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Actualites {
    private int idAct,idUser;
    private String titreArticle,contuArticle,image,video;

    public Actualites() {
    }

    public Actualites(int idAct, int idUser, String titreArticle, String contuArticle, String image, String video) {
        this.idAct = idAct;
        this.idUser = idUser;
        this.titreArticle = titreArticle;
        this.contuArticle = contuArticle;
        this.image = image;
        this.video = video;
       
    }

    public Actualites(int idUser, String titreArticle, String contuArticle, String image, String video) {
        this.idUser = idUser;
        this.titreArticle = titreArticle;
        this.contuArticle = contuArticle;
        this.image = image;
        this.video = video;
      
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

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }

    public String getContuArticle() {
        return contuArticle;
    }

    public void setContuArticle(String contuArticle) {
        this.contuArticle = contuArticle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

  

    @Override
    public String toString() {
        return "Actualites{" + "idAct=" + idAct + ", idUser=" + idUser + ", titreArticle=" + titreArticle + ", contuArticle=" + contuArticle + ", image=" + image + ", video=" + video + '}';
    }
    

   
   
    
}
