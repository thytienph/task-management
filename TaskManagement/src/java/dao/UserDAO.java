/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author ZenBook
 */
public class UserDAO extends DBContext {

    public User getUserById(int id) {
        String sql = "select * from task_management.user where id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                user.setGender(rs.getString("gender"));
                return user;
            }
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    public void createNewUser(String fullname, String email, String mobile, String gender, String password) {
        String sql = "insert into task_management.user"
                + "(fullname, email, mobile, gender, password)\n"
                + "values(?,?,?,?,?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, fullname);
            ps.setString(2, email);
            ps.setString(3, mobile);
            ps.setString(4, gender);
            ps.setString(5, password);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        UserDAO u = new UserDAO();
        u.createNewUser("dd", "dd@gmail.com", "0123456787", "Female", "12345678");
//        System.out.println(u.getUserById(1).toString());
    }
}
