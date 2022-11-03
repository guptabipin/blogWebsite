package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
  }

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
      			null, true, 8192, true);
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <!-- CSS only bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("   \n");
      out.write("        <!--CSS page link-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <!--fonts icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .banner-background{\n");
      out.write("                clip-path: polygon(50% 0%, 100% 0, 100% 88%, 65% 100%, 24% 90%, 0 100%, 0 0);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--navbar -->\n");
      out.write("                        \n");
      out.write("        ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- icon for blog -->\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("\n");
      out.write("        <!--fonts icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark primary-bg\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">  <span class='fab fa-blogger-b'></span>Techno Diary</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">  <span class=\"fa fa-bell\"></span> LearnCode with  <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"fa fa-check-square-o\"></span> Categories\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Programming Language</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Project Implementation</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-address-book-o\"></span> Contact Us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"login_page.jsp\"><span class=\"fa fa-user-circle-o\"></span> Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"register_page.jsp\"><span class=\"fa fa-user-plus\"></span> Signup</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-light my-2 my-sm-0 btn-colour\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--banner -->\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid p-0 m-0\">\n");
      out.write("            \n");
      out.write("            <div class=\"jumbotron primary-bg text-white banner-background\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h3 class=\"display-4\">Welcome to Techno Dairy</h3>\n");
      out.write("                    <p>Welcome to Technology Dairy, world of technology\n");
      out.write("                    A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output.[citation needed] Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.\n");
      out.write("                    </p>\n");
      out.write("                    \n");
      out.write("                    <button class=\"btn btn-outline-light m-1 btn-colour\"><span class=\"fa fa-external-link\"></span> Start ! its Free</button>\n");
      out.write("                    <a href=\"login_page.jsp\" class=\"btn btn-outline-light btn-colour\"><span class=\"fa fa-user-circle-o fa-spin\"></span> Login</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--card-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn btn-colour text-white\">Read more</a>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn btn-colour text-white\">Read more</a>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn btn-colour text-white\">Read more</a>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            <div class=\"row mt-4\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn btn-colour text-white\">Read more</a>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn btn-colour text-white\">Read more</a>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn btn-colour text-white\">Read more</a>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("                        \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--javascript -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"javascript/myjs.js\" type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("        </script>\n");
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
