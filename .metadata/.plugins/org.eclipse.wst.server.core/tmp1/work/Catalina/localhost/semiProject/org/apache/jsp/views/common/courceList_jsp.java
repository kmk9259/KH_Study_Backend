/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-09-01 06:51:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class courceList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<section class=\"most-search spad\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"container\"></div>\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"section-title\">\r\n");
      out.write("                        <h4>코스 등록</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("                    <div class=\"tab-content\">\r\n");
      out.write("                        <div class=\"tab-pane active\" id=\"tabs-1\" role=\"tabpanel\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                                    <div class=\"listing__item\">\r\n");
      out.write("                                        <div class=\"listing__item__pic set-bg\" data-setbg=\"resources/img/listing/list-1.jpg\">\r\n");
      out.write("                                            <img src=\"resources/img/listing/list_icon-1.png\" alt=\"\">\r\n");
      out.write("                                            <div class=\"listing__item__pic__tag\">Popular</div>\r\n");
      out.write("                                            <div class=\"listing__item__pic__btns\">\r\n");
      out.write("                                                <a href=\"#\"><span class=\"icon_zoom-in_alt\"></span></a>\r\n");
      out.write("                                                <a href=\"#\"><span class=\"icon_heart_alt\"></span></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"listing__item__text\">\r\n");
      out.write("                                            <div class=\"listing__item__text__inside\">\r\n");
      out.write("                                                <h5>깔리</h5>\r\n");
      out.write("                                                <p>인도에서 직접 초빙한 현지인 요리사들이 선사하는 맛있는 인도 요리</p>\r\n");
      out.write("                                                <div class=\"listing__item__text__rating\">\r\n");
      out.write("                                                    <div class=\"listing__item__rating__star\">\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star-half_alt\"></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <h6>18000- 36000</h6>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li><span class=\"icon_pin_alt\"></span> 서울 종로구 명륜4가 170-3 2층</li>\r\n");
      out.write("                                                    <li><span class=\"icon_phone\"></span> (02) 747-5050</li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"listing__item__text__info\">\r\n");
      out.write("                                                <div class=\"listing__item__text__info__left\">\r\n");
      out.write("                                                    <img src=\"../resources/img/listing/list_small_icon-1.png\" alt=\"\">\r\n");
      out.write("                                                    <span>Restaurant</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"listing__item__text__info__right\">Open Now</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                                    <div class=\"listing__item\">\r\n");
      out.write("                                        <div class=\"listing__item__pic set-bg\" data-setbg=\"resources/img/listing/list-2.jpg\">\r\n");
      out.write("                                            <img src=\"resources/img/listing/list_icon-2.png\" alt=\"\">\r\n");
      out.write("                                            <div class=\"listing__item__pic__tag top_rate\">Top Rate</div>\r\n");
      out.write("                                            <div class=\"listing__item__pic__btns\">\r\n");
      out.write("                                                <a href=\"#\"><span class=\"icon_zoom-in_alt\"></span></a>\r\n");
      out.write("                                                <a href=\"#\"><span class=\"icon_heart_alt\"></span></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"listing__item__text\">\r\n");
      out.write("                                            <div class=\"listing__item__text__inside\">\r\n");
      out.write("                                                <h5>Shrimp floured and fried</h5>\r\n");
      out.write("                                                <div class=\"listing__item__text__rating\">\r\n");
      out.write("                                                    <div class=\"listing__item__rating__star\">\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star-half_alt\"></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <h6>$40 - $70</h6>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li><span class=\"icon_pin_alt\"></span> 1012 Vesper Dr. Columbus,\r\n");
      out.write("                                                        Georgia(GA), United States</li>\r\n");
      out.write("                                                    <li><span class=\"icon_phone\"></span> (+12) 345-678-910</li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"listing__item__text__info\">\r\n");
      out.write("                                                <div class=\"listing__item__text__info__left\">\r\n");
      out.write("                                                    <img src=\"resources/img/listing/list_small_icon-2.png\" alt=\"\">\r\n");
      out.write("                                                    <span>Food & Drink</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"listing__item__text__info__right closed\">Closed</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                                    <div class=\"listing__item\">\r\n");
      out.write("                                        <div class=\"listing__item__pic set-bg\" data-setbg=\"resources/img/listing/list-3.jpg\">\r\n");
      out.write("                                            <img src=\"resources/img/listing/list_icon-3.png\" alt=\"\">\r\n");
      out.write("                                            <div class=\"listing__item__pic__tag\">Popular</div>\r\n");
      out.write("                                            <div class=\"listing__item__pic__btns\">\r\n");
      out.write("                                                <a href=\"#\"><span class=\"icon_zoom-in_alt\"></span></a>\r\n");
      out.write("                                                <a href=\"#\"><span class=\"icon_heart_alt\"></span></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"listing__item__text\">\r\n");
      out.write("                                            <div class=\"listing__item__text__inside\">\r\n");
      out.write("                                                <h5>Sweet and sour pork ribs</h5>\r\n");
      out.write("                                                <div class=\"listing__item__text__rating\">\r\n");
      out.write("                                                    <div class=\"listing__item__rating__star\">\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star\"></span>\r\n");
      out.write("                                                        <span class=\"icon_star-half_alt\"></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <h6>$40 - $70</h6>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li><span class=\"icon_pin_alt\"></span> 251 Wiley St. Forks,\r\n");
      out.write("                                                        Washington(WA), United States</li>\r\n");
      out.write("                                                    <li><span class=\"icon_phone\"></span> (+12) 345-678-910</li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"listing__item__text__info\">\r\n");
      out.write("                                                <div class=\"listing__item__text__info__left\">\r\n");
      out.write("                                                    <img src=\"resources/img/listing/list_small_icon-1.png\" alt=\"\">\r\n");
      out.write("                                                    <span>Restaurant</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"listing__item__text__info__right\">Open Now</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                               \r\n");
      out.write("    <!-- Most Search Section End -->\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <!-- Blog Section Begin -->\r\n");
      out.write("    <section class=\"news-post spad\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"section-title\">\r\n");
      out.write("                        <h2>커뮤니티</h2>\r\n");
      out.write("                        <p>어디어디 사용자 간의 후기 게시판</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic set-bg\" data-setbg=\"resources/img/blog/blog-1.jpg\">\r\n");
      out.write("                            <a href=\"https://www.youtube.com/watch?v=8EJ3zbKTWQ8\" class=\"play-btn video-popup\"><i class=\"fa fa-play\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul class=\"blog__item__tags\">\r\n");
      out.write("                                <li><i class=\"fa fa-tags\"></i> Travel</li>\r\n");
      out.write("                                <li>Videos</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">Internet Banner Advertising Most Reliable</a></h5>\r\n");
      out.write("                            <ul class=\"blog__item__widget\">\r\n");
      out.write("                                <li><i class=\"fa fa-clock-o\"></i> 19th March, 2019</li>\r\n");
      out.write("                                <li><i class=\"fa fa-user\"></i> John Smith</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic set-bg\" data-setbg=\"resources/img/blog/blog-2.jpg\"></div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul class=\"blog__item__tags\">\r\n");
      out.write("                                <li><i class=\"fa fa-tags\"></i> Travel</li>\r\n");
      out.write("                                <li>Restaurant</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">Internet Banner Advertising Most Reliable</a></h5>\r\n");
      out.write("                            <ul class=\"blog__item__widget\">\r\n");
      out.write("                                <li><i class=\"fa fa-clock-o\"></i> 19th March, 2019</li>\r\n");
      out.write("                                <li><i class=\"fa fa-user\"></i> John Smith</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic set-bg\" data-setbg=\"resources/img/blog/blog-3.jpg\"></div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul class=\"blog__item__tags\">\r\n");
      out.write("                                <li><i class=\"fa fa-tags\"></i> Travel</li>\r\n");
      out.write("                                <li>Restaurant</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">Internet Banner Advertising Most Reliable</a></h5>\r\n");
      out.write("                            <ul class=\"blog__item__widget\">\r\n");
      out.write("                                <li><i class=\"fa fa-clock-o\"></i> 19th March, 2019</li>\r\n");
      out.write("                                <li><i class=\"fa fa-user\"></i> John Smith</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Blog Section End -->\r\n");
      out.write("</section>\r\n");
      out.write("</body>\r\n");
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
