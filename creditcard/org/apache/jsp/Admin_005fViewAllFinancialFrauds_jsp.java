/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2023-03-20 04:58:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Admin_005fViewAllFinancialFrauds_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/connect.jsp", Long.valueOf(1540290754000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Connection connection = null;
 	try {
     

	  	Class.forName("com.mysql.jdbc.Driver");	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cc_fraud","root","root");
      	String sql="";

	}
	catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>All Financial Frauds</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-quicksand.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("	font-size: 24px;\r\n");
      out.write("	color: #FF0000;\r\n");
      out.write("}\r\n");
      out.write(".style4 {color: #CC6600}\r\n");
      out.write(".style5 {color: #660000}\r\n");
      out.write(".style7 {color: #000000;\r\n");
      out.write("		 font-size: 14px}\r\n");
      out.write(".style8 {font-weight: bold}\r\n");
      out.write(".style9 {color:#FF3300;\r\n");
      out.write("		font-size: 14px}\r\n");
      out.write(".style10 {color:#2C83B0;\r\n");
      out.write("		font-size: 14px}\r\n");
      out.write(".style11 {font-size: 12px}\r\n");
      out.write(".style12 {color:#006666}\r\n");
      out.write(".style14 {color:#663366}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1 align=\"center\"><a href=\"index.html\" class=\"style1\">Credit card fraud detection using AdaBoost and majority voting</a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"index.html\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li><a href=\"AdminLogin.jsp\"><span>Bank Admin</span></a></li>\r\n");
      out.write("          <li><a href=\"EcommerceLogin.jsp\"><span>Ecommerce</span></a></li>\r\n");
      out.write("          <li><a href=\"UserLogin.jsp\"><span>User</span></a></li>\r\n");
      out.write("          <li><a href=\"#\"><span>Contact Us</span></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"935\" height=\"285\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"935\" height=\"285\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"935\" height=\"285\" alt=\"\" /> </a> </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        <div class=\"article\"> \r\n");
      out.write("          <h2 class=\"style4\" style=\"color:#CC6600\">All Financial Frauds..</h2>\r\n");
      out.write("          <div class=\"clr\"></div>          \r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("		  <table width=\"700\" border=\"1\" align=\"left\"  cellpadding=\"0\" cellspacing=\"0\"  \">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td  width=\"35\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>ID</b></div></td>\r\n");
      out.write("					  <td  width=\"40\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>Credit Card No</b></div></td>\r\n");
      out.write("                      <td  width=\"47\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>User Name</b></div></td>\r\n");
      out.write("					  <td  width=\"47\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>Bank Name</b></div></td>\r\n");
      out.write("                      <td  width=\"60\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>Fraud Amount</b></div></td>\r\n");
      out.write("                      <td  width=\"47\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>WebSite</b></div></td>\r\n");
      out.write("                      <td  width=\"47\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>Date</b></div></td>\r\n");
      out.write("					  <td  width=\"60\"  valign=\"middle\" height=\"34\" style=\"color: #2c83b0;\"><div align=\"center\" class=\"style57 style56 style5\"><b>Fraud Type</b></div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

					  
						String s1,s2,s3,s4,s5,s6,s7;
						int i=0;
						try 
						{
						   	String query="select * from financial_fraud"; 
						   	Statement st=connection.createStatement();
						   	ResultSet rs=st.executeQuery(query);
					   		while ( rs.next() )
					   		{
								i=rs.getInt(1);
								s1=rs.getString(2);
								s2=rs.getString(4);
								s3=rs.getString(5);
								s4=rs.getString(6);
								s5=rs.getString(8);
								s6=rs.getString(9);
								s7=rs.getString(10);
								
								
							
								
							
						
					
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style7\">\r\n");
      out.write("                        ");
out.println(i);
      out.write("\r\n");
      out.write("                      </span></div></td>\r\n");
      out.write("                      <td height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style9\">\r\n");
      out.write("                            <span class=\"style9\">\r\n");
      out.write("                            ");
out.println(s1);
      out.write("\r\n");
      out.write("                            </span></div></td>\r\n");
      out.write("					  <td height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style10\">\r\n");
      out.write("                            <span class=\"style10\">\r\n");
      out.write("                            <b>");
out.println(s2);
      out.write("</b>\r\n");
      out.write("                            </span></div></td>		\r\n");
      out.write("                      <td height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style7\">\r\n");
      out.write("                            \r\n");
      out.write("                            ");
out.println(s3);
      out.write("\r\n");
      out.write("                            </span></div></td>\r\n");
      out.write("                      <td height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style7\">\r\n");
      out.write("                            \r\n");
      out.write("                            ");
out.println(s4);
      out.write("\r\n");
      out.write("                            </span></div></td>\r\n");
      out.write("					  <td height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style7\">\r\n");
      out.write("                            \r\n");
      out.write("                            ");
out.println(s5);
      out.write("\r\n");
      out.write("                            </span></div></td>\r\n");
      out.write("					  <td height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style7\">\r\n");
      out.write("                            \r\n");
      out.write("                            ");
out.println(s6);
      out.write("\r\n");
      out.write("                            </span></div></td>\r\n");
      out.write("							");

						if(s7.equalsIgnoreCase("Wrong CVV"))
						{
						
						
      out.write("\r\n");
      out.write("                      <td valign=\"middle\" height=\"0\" style=\"color:#000000;\"align=\"center\"><div align=\"center\" class=\"style14\">\r\n");
      out.write("                          <b>");
out.println(s7);
      out.write("</b>\r\n");
      out.write("                      </div></td>\r\n");
      out.write("                      ");

						}
						else
						{
						
      out.write("\r\n");
      out.write("                      <td width=\"17\" height=\"0\" align=\"center\"  valign=\"middle\"><div align=\"center\" class=\"style12\">\r\n");
      out.write("                        <b>");
out.println(s7);
      out.write("</b>\r\n");
      out.write("                      </div></td>\r\n");
      out.write("                      ");

						}
						
						
      out.write("\r\n");
      out.write("					</tr>\r\n");
      out.write("                    ");

						}
						
					
				
						connection.close();
					}
					catch(Exception e)
					{
						out.println(e.getMessage());
					}
					
      out.write("\r\n");
      out.write("          </table>\r\n");
      out.write("				  <p class=\"style19\">&nbsp;</p>\r\n");
      out.write("		          <p>&nbsp;</p>\r\n");
      out.write("				  <table width=\"476\" border=\"0\" cellspacing=\"2\" cellpadding=\"2\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"468\"><div align=\"left\"><a href=\"AdminMain.jsp\" class=\"style95\">Back</a></div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("		  \r\n");
      out.write("		  \r\n");
      out.write("		  \r\n");
      out.write("		  \r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        <div class=\"searchform\">\r\n");
      out.write("          <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"#\">\r\n");
      out.write("            <span>\r\n");
      out.write("            <input name=\"editbox_search\" class=\"editbox_search\" id=\"editbox_search\" maxlength=\"80\" value=\"Search our ste:\" type=\"text\" />\r\n");
      out.write("            </span>\r\n");
      out.write("            <input name=\"button_search\" src=\"images/search.gif\" class=\"button_search\" type=\"image\" />\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <h2 class=\"star\"><span>Sidebar</span> Menu</h2>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <ul class=\"sb_menu\">\r\n");
      out.write("            <li><a href=\"AdminMain.jsp\">Home</a></li>\r\n");
      out.write("			<li><a href=\"AdminLogin.jsp\">Logout</a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div align=center></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}