/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasrc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserUtil {

    public static String getUserName(String userId) {
        String userName = "";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT name FROM user WHERE id = ?");
            pst.setString(1, userId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                userName = rs.getString("name");
            }

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userName;
    }
}
