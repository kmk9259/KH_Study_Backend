/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-09-01 08:12:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.plan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class planMy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"Directing Template\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Directing, unica, creative, html\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Directing | Template</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Font -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Css Styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/flaticon.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/barfiller.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/jquery-ui.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/style.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- ???????????? ??????????????? -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("    <script src=\"//code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .header__logo_myplan{\r\n");
      out.write("            padding-top: 25px;\r\n");
      out.write("            padding-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .planInput{\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            resize: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .date_2{\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        #dateBtn{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .listArea{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border:1px solid black;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        .searchArea{\r\n");
      out.write("            margin-top:50px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .listArea>tbody>tr:hover{\r\n");
      out.write("            background:darkgrey;\r\n");
      out.write("            cursor:pointer\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"ov-hid\">\r\n");
      out.write("    <!-- Page Preloder -->\r\n");
      out.write("    <!-- <div id=\"preloder\">\r\n");
      out.write("        <div class=\"loader\"></div>\r\n");
      out.write("    </div> -->\r\n");
      out.write("\r\n");
      out.write("   <!-- Header Section Begin -->\r\n");
      out.write("    <header class=\"header header--normal\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <div class=\"header__logo_myplan\">\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/img/Logo_D_1.png\" alt=\"??????\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                    <div class=\"header__nav\">\r\n");
      out.write("                        <nav class=\"header__menu mobile-menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                                <li><a href=\"./selectPlan.html\">???????????????</a>\r\n");
      out.write("                \r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                        <li><a href=\"./listing.html\">??????????????????</a></li>\r\n");
      out.write("                                        <li><a href=\"./listing-details.html\">????????????</a></li>\r\n");
      out.write("                                        <li><a href=\"./planSave.html\">???????????????</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("                                <li><a href=\"./blog.html\">????????????</a></li>\r\n");
      out.write("                \r\n");
      out.write("                                <li><a href=\"#\">?????????</a></li>\r\n");
      out.write("                                <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                        <div class=\"header__menu__right\">\r\n");
      out.write("                \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"mobile-menu-wrap\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Header Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Filter Begin -->\r\n");
      out.write("    <div class=\"filter nice-scroll\">\r\n");
      out.write("        <form action=\"\" method=\"POST\">\r\n");
      out.write("            <div class=\"filter__title\">\r\n");
      out.write("                <h5>?????? ??????</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <input type=\"text\" class=\"planInput\" name=\"planTitle\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"filter__title\">\r\n");
      out.write("                <h5>?????? ??????</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <!-- <input type=\"text\" class=\"planInput\" id=\"start\"> -->\r\n");
      out.write("                <input type=\"text\" class=\"planInput\" name=\"planDate\" id=\"startDate\" required>\r\n");
      out.write("                <!-- <button type=\"submit\" class=\"btn btn-primary\">??????</button> -->\r\n");
      out.write("                <button id=\"dateBtn\">??????</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script> \r\n");
      out.write("                //?????? ?????? ?????? -> h5?????? ??? ??????\r\n");
      out.write("                $('#dateBtn').click(function(){\r\n");
      out.write("                    var value = $(\"#startDate\").val();\r\n");
      out.write("                    console.log(value);\r\n");
      out.write("                    $(\"#planDate\").text('???????????? ?????? : ' + value);\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"filter__title\">\r\n");
      out.write("                <h5>??????</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <textarea class=\"planInput\" name=\"planMemo\" id=\"\" cols=\"20\" rows=\"8\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"filter__title\">\r\n");
      out.write("                <h5>?????? ??????</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("\r\n");
      out.write("                <!--select ??? ??? ??????-->\r\n");
      out.write("                <select name=\"region\" class=\"planInput\" id=\"region\">\r\n");
      out.write("                    <option value=\"1\" selected>????????????</option>\r\n");
      out.write("                    <option value=\"2\">??????</option>\r\n");
      out.write("                    <option value=\"3\">??????</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"filter__title\">\r\n");
      out.write("                <h5 id=\"planDate\" class=\"planInput\">???????????? ?????? : </h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table class=\"listArea\" align=\"center\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th width=\"50\">?????????</th>\r\n");
      out.write("                        <th width=\"200\">??????</th>\r\n");
      out.write("                        <th width=\"50\"></th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("					<td>????????? ??????</td>\r\n");
      out.write("					<td>????????? ?????? ????????? 11-1??????</td>\r\n");
      out.write("					<td><button onClick=\"rowDelete(this)\">??????</button></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("					<td>????????? ??????</td>\r\n");
      out.write("					<td>????????? ?????? ????????? 11-1??????</td>\r\n");
      out.write("					<td><button onClick=\"rowDelete(this)\">??????</button></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("					<td>????????? ??????</td>\r\n");
      out.write("					<td>????????? ?????? ????????? 11-1??????</td>\r\n");
      out.write("					<td><button onClick=\"rowDelete(this)\">??????</button></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"filter__btns\">\r\n");
      out.write("                <button type=\"submit\">?????? ????????????</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                function rowDelete(obj){\r\n");
      out.write("                    $(obj).parent().parent().remove();\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Filter End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Listing Section Begin --> <!--ov.hid-->\r\n");
      out.write("    <section class=\"listing nice-scroll\">\r\n");
      out.write("        <div class=\"listing__text__top\">\r\n");
      out.write("            <div class=\"listing__text__top__left\">\r\n");
      out.write("                <a href=\"#\"><h5>??????</h5></a>\r\n");
      out.write("                <a href=\"#\"><h5>??????</h5></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- <div class=\"listing__text__top__right\">Nearby <i class=\"fa fa-sort-amount-asc\"></i></div> -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <table class=\"listArea\">\r\n");
      out.write("            <form>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td rowspan=\"3\">\r\n");
      out.write("                        <div id=\"titleImgArea\" align=\"center\">\r\n");
      out.write("                            ?????? ??????\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>?????? ???</td>\r\n");
      out.write("                    <td><button onclick=\"newPage()\">???</button></td>\r\n");
      out.write("                    <td><button>+</button></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"3\">??????</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"3\">?????? ??????</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("            <form>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td rowspan=\"3\">\r\n");
      out.write("                        <div id=\"titleImgArea\" align=\"center\">\r\n");
      out.write("                            ?????? ??????\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>?????? ???</td>\r\n");
      out.write("                    <td><button onclick=\"newPage()\">???</button></td>\r\n");
      out.write("                    <td><button>+</button></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"3\">??????</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"3\">?????? ??????</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("        </table>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Listing Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Map Begin -->\r\n");
      out.write("    <div class=\"listing__map\">\r\n");
      out.write("        <iframe\r\n");
      out.write("            src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d423283.43556031643!2d-118.69192431097179!3d34.020730495817475!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x80c2c75ddc27da13%3A0xe22fdf6f254608f4!2sLos%20Angeles%2C%20CA%2C%20USA!5e0!3m2!1sen!2sbd!4v1586670019340!5m2!1sen!2sbd\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Map End -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script> \r\n");
      out.write("        // ?????? ?????? ?????? \r\n");
      out.write("        $(function () {\r\n");
      out.write("            $('#startDate').datepicker({\r\n");
      out.write("             })\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        function newPage()  {\r\n");
      out.write("            window.open('./placeDetail.html');\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.barfiller.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
