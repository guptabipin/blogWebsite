
package com.tech.blog.dao;
import com.tech.blog.entites.userdata;
import java.sql.*;

public class UserDao {
    
   private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
   
    // method to insert user to database;
    
    public boolean saveUser(userdata userdata){
                    boolean f= false;

        
        try{
            //user--> database
            
            String quer = "insert into userdata(name,email,password,gender) values(?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(quer);
            pst.setString(1,userdata.getName());
            pst.setString(2,userdata.getEmail());
            pst.setString(3, userdata.getPassword());
            pst.setString(4,userdata.getGender());
            
            pst.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return f; 
    }
    
    //get login user by email and password
    public userdata getUserByEmailAndPassword(String email,String password){
      userdata userdata=null;
      
      try{
          
          String query = "select * from userdata where email=? and password=?";
          PreparedStatement ps=con.prepareStatement(query);
          
          ps.setString(1,email);
          ps.setString(2,password);
          
         ResultSet set=ps.executeQuery();
         if(set.next()){
             userdata = new userdata();
             
             //data from db
             String name = set.getString("name");
             
             // set to user userdata object
             userdata.setName(name);
             
             userdata.setEmail(set.getString("email"));    //emial -> coloumn name
             userdata.setPassword(set.getString("password"));
             userdata.setGender(set.getString("gender"));
             userdata.setDate(set.getDate("rdate"));
             
         }
          
      }
      catch(Exception e){
          e.printStackTrace();
      }
        
        return userdata;
    }
    
    
    
}
