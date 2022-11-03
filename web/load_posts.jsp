<%@page import="com.tech.blog.entites.posts"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.techno.dairy.helper.ConnectionProvider"%>


<div class="row">

<%
    
    PostDao d = new PostDao(ConnectionProvider.getConnection());
    
    int cid = Integer.parseInt(request.getParameter("cid"));
    List <posts> posts=null;
    if(cid==0){
     posts = d.getAllPosts();
    }
    
    else{
        posts=d.getPostByCatId(cid);
    }
    
    if(posts.size()==0){
        out.println("<h3 class=' display-3 text-center' >No posts in this categories..</h3>");
        return;
    }
    
    for(posts p : posts)
    {
        %>
        
        <div class="col-md-6 mt-2">
            <div class="card" style="width:18rem;">
                <img class="card-img-top" src="blog_pics/<%=p.getpPic()%>" alt="Card image cap"> 

                <div class="card-body">
                    <b><%=p.getpTitle()%></b>
                    <p><%=p.getpContent()%></p>
                    
                </div>
                    
                    <div class="card-footer">
                        <a href="show_blog.jsp?post_id=<%=p.getPid()%>" class="btn btn-outline-success btn-sm">Read More..</a>
                    </div>
            </div>            
        </div>       
        <%
    }
    
%>
</div>
