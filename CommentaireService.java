/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Commentaire;
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
public abstract class CommentaireService implements CService {

    Connection cnx = MaConnexion.getInstance().getcnx();

    public void ajouter(Commentaire c) {
        String query = "INSERT INTO commenter(id_user,com,) VALUES(?,?)";
        try {
            PreparedStatement ste = cnx.prepareStatement(query);
            ste.setInt(1, c.getIdUser());
            ste.setString(2, c.getcom());

            ste.executeUpdate();
            System.out.println("commenter Added Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void modifier(Commentaire c) {
        String query = "UPDATE  SET id_user = " + c.getIdUser() + ", com = '"
                + c.getcom()
                + "' WHERE id_act = " + c.getIdAct() + "";
        try {
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Commentaire modifiee");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

   
      
    

    public void supprimer(Commentaire c)
     {
       String query ="DELETE FROM Commenter WHERE id_act = " + c.getIdAct()+ "";
        try{
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("commentaire Deleted Successfully");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
    }}

    public List<Commentaire> afficher(List<Commentaire> listc
    ) {
        try {
            List<Commentaire> List  = new ArrayList<>();
            String query = "SELECT * FROM commentaire";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(query);
            while (rs.next()) {
                Commentaire co = new Commentaire();
                co.setIdAct(rs.getInt("id_act"));
                co.setIdUser(rs.getInt("id_user"));
                co.setcom(rs.getString("com"));
                listc.add(co);

            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }

        return listc;
    }

}
