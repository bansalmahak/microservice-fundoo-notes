package com.bridgeit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TokenAuthenticator {

	 public static boolean authenticateToken(Long id, String token) throws SQLException, ClassNotFoundException {
         int result = 0;
         String myDriver = "com.mysql.cj.jdbc.Driver";
         String myUrl = "jdbc:mysql://localhost:3306/UserInfo";
         Class.forName(myDriver);
         Connection conn = DriverManager.getConnection(myUrl, "root", "admin");
         String query = "SELECT * FROM user where userid = ?";
         PreparedStatement statement= conn.prepareStatement(query);
         statement.setLong(1,id);
         ResultSet rs = statement.executeQuery();

         while (rs.next()) {
             boolean verified = rs.getBoolean("is_verify");
             if (verified == true)
                 result = 1;
         }

         if (result == 1)
             return true;
         else
             return false;

}}