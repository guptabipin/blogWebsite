package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entites.posts;
import com.tech.blog.dao.PostDao;
import com.techno.dairy.helper.ConnectionProvider;
import com.tech.blog.entites.userdata;

public final class show_005fblog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Jsp pages</title>\n");
      out.write("        <!-- CSS only bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!--CSS page link-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!--fonts icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- icon for blog -->\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .banner-background{\n");
      out.write("                clip-path: polygon(50% 0%, 100% 0, 100% 88%, 65% 100%, 24% 90%, 0 100%, 0 0);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            userdata userdata = (userdata) session.getAttribute("CurrentUser");
            if (userdata == null) {
                response.sendRedirect("login_page.jsp");
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        ");
            int postId = Integer.parseInt(request.getParameter("post_id"));
            PostDao d = new PostDao(ConnectionProvider.getConnection());

            posts p = d.getPostByPostId(postId);

        
      out.write("\n");
      out.write("\n");
      out.write("        <h2>post_Id : ");
      out.print( postId);
      out.write("</h2>\n");
      out.write("        <h2>");
      out.print(p.getpTitle());
      out.write("</h2> \n");
      out.write("\n");
      out.write("        <!--main contain of body -->\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row my-1\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6 offset-md-2\">\n");
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <h4>");
      out.print(p.getpTitle());
      out.write("</h4>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <p>");
      out.print(p.getpContent());
      out.write("</p>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            <pre>");
      out.print( p.getpCode());
      out.write("</pre>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"card-footer\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--end of body -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
