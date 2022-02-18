/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Actualites;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tools.MaConnexion;

/**
 *
 * @author MEDIA LAC
 */
public class ActualitesService implements IService<Actualites>{
  Connection cnx = MaConnexion.getInstance().getCnx();
    @Override
    public void ajouter(Actualites a) {
        String query="INSERT INTO actualites(id_user,titre_article,contu_article,image,video) VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement ste = cnx.prepareStatement(query);
            ste.setInt(1,a.getIdUser());
            ste.setString(2,a.getTitreArticle());
            ste.setString(3,a.getContuArticle());
            ste.setString(4,a.getImage());
            ste.setString(5,a.getVideo());
            
         
            ste.executeUpdate();
            System.out.println("actualites Added Successfully");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    /**
     *
     * @return
     */
  @Override
    public List<Actualites> afficher() {
        List<Actualites> listA = new ArrayList<>();
        String query = "SELECT * FROM actualites";
        try{
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(query);
            while (rs.next()){
                Actualites act = new Actualites();
                act.setIdAct(rs.getInt("id_act"));
                act.setIdUser(rs.getInt("id_user"));
                act.setTitreArticle(rs.getString("titre_article"));
                act.setContuArticle(rs.getString("contu_article"));
                act.setImage(rs.getString("image"));
                act.setVideo(rs.getString("video"));
               
                
                listA.add(act);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listA;
    }

    @Override
    public void modifier(Actualites a) {
        String query = "UPDATE actualites SET id_user = " + a.getIdUser()+ ", titre_article = '" +
                a.getTitreArticle()+ "', contu_article = '" + a.getContuArticle()+ "', image = '"
                + a.getImage()+ "', video= '" + a.getVideo()+
                "' WHERE id_act = " + a.getIdAct()+ "";
        try{
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Actualites modifiee");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
     }

    @Override
    public void supprimer(Actualites a) {
        String query ="DELETE FROM actualites WHERE id_act = " + a.getIdAct()+ "";
        try{
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("actualites Deleted Successfully");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
