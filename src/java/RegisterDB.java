

import com.tech.blog.dao.UserDao;
import com.tech.blog.entites.userdata;
import com.techno.dairy.helper.ConnectionProvider;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;

@MultipartConfig
public class RegisterDB extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            String check = request.getParameter("Check");

            if (check == null) {
                out.println("Please accept terms and conditions");
            } 
            else {
                String name = request.getParameter("UserName");
                String email = request.getParameter("Email");
                String password = request.getParameter("Password");
                String gender = request.getParameter("gen");

                //create a userdata object to set all the data to that object
                userdata user = new userdata(name, email, password, gender);

                //create a user dao object for connection established
                UserDao dao = new UserDao(ConnectionProvider.getConnection());
                if (dao.saveUser(user)) {
                    out.println("Data Saved");

                }
            else{
                out.println("Failed !! to Saved Data");
            }

        } 
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }

}
