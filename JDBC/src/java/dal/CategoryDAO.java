/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.List;
import model.Category;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author FPTSHOP
 */
public class CategoryDAO extends DBContext{
    public List<Category> getAll(){
        List<Category> list = new ArrayList<>();
        String sql = "select * from categories";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Category c = new Category(rs.getInt("id"),
                                          rs.getString("name"),
                                          rs.getString("describe"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println("e");
        }
        return list;
    }
    
    //insert a category
    public void insert(Category category){
        String sql = "INSERT INTO [dbo].[Categories]\n"
                + "           ([ID]\n"
                + "           ,[name]\n"
                + "           ,[describe])\n"
                + "             VALUES\n"
                + "           (?, ?, ?)";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, category.getId());
            st.setString(2, category.getName());
            st.setString(3, category.getDescribe());
            
            st.executeUpdate();
            st.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    //delete a category
    public void delete(int id){
        String sqlString="delete from Categories where id = ?";
            try {
                PreparedStatement st = connection.prepareStatement(sqlString);
                st.setInt(1, id);
                st.executeUpdate();
                st.close();
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    public void update(Category category){
        String sql = "update Categories "
                + "set name = ?, describe = ?"
                + "where id = ?";
        try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setInt(3,category.getId());
                st.setString(1, category.getName());
                st.setString(2, category.getDescribe());
                st.executeUpdate();
                st.close();
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    //tim category khi co id
    public Category getCategoryById(int id){
        String sql = "select * from Categories where id = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Category category = new Category(rs.getInt("id"),
                                        rs.getString("name"),
                                        rs.getString("describe")
                                        );
                rs.close();
                st.close();
                return category;
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    
    public static void main(String[] args) {
        CategoryDAO c = new CategoryDAO();
        List<Category> list = c.getAll();
        c.update(new Category(5, "mimi", "momo"));
    }
}
