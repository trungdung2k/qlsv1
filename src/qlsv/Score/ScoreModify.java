/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv.Score;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CRUD (insert, update, delete, findAll)
 * @author Diep.Tran
 */
public class ScoreModify {
    public static List<Score> findAll() {
        List<Score> scoreList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");
            
            //query
            String sql = "select * from score";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Score std;
                std = new Score(resultSet.getInt("id"),
                        resultSet.getString("namestudent"),
                        resultSet.getString("namesubject"),
                        resultSet.getString("cc"),                   
                        resultSet.getString("gk"),
                        resultSet.getString("kt"),
                        resultSet.getString("xl")

                );
                scoreList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return scoreList;
    }
    
    public static void insert(Score std) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");
            
            //query
            String sql = "insert into score(namestudent,namesubject,cc,gk,kt,xl) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql); 
            statement.setString(1, std.getNamestudent());
            statement.setString(2, std.getNamesubject());
            statement.setString(3, std.getCc());
            statement.setString(4, std.getGk());           
            statement.setString(5, std.getKt());
            statement.setString(6, std.getXl());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void update(Score std) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");
            
            //query
            String sql = "update score set namestudent=?,namesubject=?, cc=?, gk=?, kt=? , xl=? where id = ?";
            statement = connection.prepareCall(sql);            
            statement.setString(1, std.getNamestudent());
            statement.setString(2, std.getNamesubject());
            statement.setString(3, std.getCc());
            statement.setString(4, std.getGk());           
            statement.setString(5, std.getKt());
            statement.setString(6, std.getXl());
            statement.setInt(7, std.getId());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");
            
            //query
            String sql = "delete from score where id = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
     public static List<Score> findByNamestudent(String namestudent) {
        List<Score> scoreList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLSV", "root", "");
            
            //query
            String sql = "select * from score where namestudent like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+namestudent+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Score std;
                std = new Score(resultSet.getInt("id"),
                        resultSet.getString("namestudent"),
                        resultSet.getString("namesubject"),
                        resultSet.getString("cc"),                   
                        resultSet.getString("gk"),
                        resultSet.getString("kt"),
                        resultSet.getString("xl"));
                scoreList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ScoreModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return scoreList;
}
}
    
   
