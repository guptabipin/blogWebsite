
package com.tech.blog.dao;
import com.tech.blog.entites.category;
import com.tech.blog.entites.posts;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostDao {
    
    Connection con;

    public PostDao(Connection con) {
        this.con = con;
    }
    
    //array list
    public ArrayList<category> getAllCategroy(){
        ArrayList<category> list = new ArrayList<>();
        
        try{
            String q = "select * from categories" ;
            Statement st = this.con.createStatement();
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next()){
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String descp = rs.getString("description");
                
                //object of categroy
                category cat = new category(cid,name,descp);
                list.add(cat);
            }
            
        }
        catch(Exception e){
            System.out.println("Error is : "+e);
        }
        
        return list;
        
    }
    
    //posts data to save in database
    
    public boolean savePost(posts p){
    boolean f = false;
    try{
        String q = "insert into posts (pTitle,pContent,pcode,pPic,catId) values(?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(q);
        pstmt.setString(1,p.getpTitle());
        pstmt.setString(2,p.getpContent());
        pstmt.setString(3,p.getpCode());
        pstmt.setString(4,p.getpPic());
        pstmt.setInt(5,p.getCatId());
        
        pstmt.executeUpdate();
        f=true;
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    return f;
}
    
    
    
    //get all post in all post categories
    
    public List<posts> getAllPosts()
    {
        List <posts> list = new ArrayList<>();
        //fetch all post
        
        try{
            
             PreparedStatement p = con.prepareStatement("select * from posts order by pid desc");
             
             ResultSet set = p.executeQuery();
             
             while(set.next()){
                 
                 int pid = set.getInt("pid");
                 String pTitle= set.getString("pTitle");
                 String pContent = set.getString("pContent");
                 String pCode = set.getString("pCode");
                 String pPic = set.getString("pPic");
                 Date pDate= set.getDate("pDate");
                 int catId = set.getInt("catId");
                 
                 posts post = new posts(pid,pTitle,pContent,pCode,pPic,pDate,catId);
                 
                 list.add(post);
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    
    //get post by id
    
    public List<posts> getPostByCatId(int catId){
        List <posts> list = new ArrayList<>();
        //fetch all post by id
        
        try{
             
             PreparedStatement p = con.prepareStatement("select * from posts where catId=?");
             
             p.setInt(1, catId);
             
             ResultSet set = p.executeQuery();
             
             while(set.next()){
                 
                 int pid = set.getInt("pid");
                 String pTitle= set.getString("pTitle");
                 String pContent = set.getString("pContent");
                 String pCode = set.getString("pCode");
                 String pPic = set.getString("pPic");
                 Date pDate= set.getDate("pDate");
                 
                 posts post = new posts(pid,pTitle,pContent,pCode,pPic,pDate,catId);
                 
                 list.add(post);
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    
    // get all infor about user by useing post id in url
    public posts getPostByPostId(int postId){
        
        posts post = null;
        String q = "select * from posts where pid=?";
        try{
            PreparedStatement p = this.con.prepareStatement(q);
            p.setInt(1, postId);
            
            ResultSet set = p.executeQuery();
            if(set.next()){
                
                int pid = set.getInt("pid");
                 String pTitle= set.getString("pTitle");
                 String pContent = set.getString("pContent");
                 String pCode = set.getString("pCode");
                 String pPic = set.getString("pPic");
                 Date pDate= set.getDate("pDate");
                 int cid= set.getInt("catid");
                 
                  post = new posts(pid,pTitle,pContent,pCode,pPic,pDate,cid);
                 
                
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return post;
    }
    
    
}
