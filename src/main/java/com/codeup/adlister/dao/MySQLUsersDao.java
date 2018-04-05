package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;



public class MySQLUsersDao implements Users {

    private Connection con;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("SELECT * FROM users WHERE username =? ");
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }else{
                return null;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving user.", e);
        }
    }

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }


}
