/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-09-21 06:47:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.place;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import semiProject.com.kh.place.model.vo.*;
import semiProject.com.kh.member.model.vo.Member;

public final class placeListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/place/../common/menubar.jsp", Long.valueOf(1632206324817L));
    _jspx_dependants.put("/views/place/../common/footer.jsp", Long.valueOf(1632206324672L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("semiProject.com.kh.place.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("semiProject.com.kh.member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write('\r');
      out.write('\n');

	ArrayList<Place> list = (ArrayList<Place>)request.getAttribute("list");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"Directing Template\">\r\n");
      out.write("<meta name=\"keywords\" content=\"Directing, unica, creative, html\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("<title>어디어디 - 관리자페이지(일정조회)</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/myInfo.css\"\r\n");
      out.write("	type=\"text/css\">\r\n");
      out.write("<style>\r\n");
      out.write(".admin {\r\n");
      out.write("    background-color: #FFF3E7;\r\n");
      out.write("    height: 1000px; \r\n");
      out.write("    padding: 0px 50px 50px 50px;\r\n");
      out.write("}\r\n");
      out.write(".admin-showpage{\r\n");
      out.write("	float: right;\r\n");
      out.write("    width: 1400px;\r\n");
      out.write("    margin-right:50px;\r\n");
      out.write("    height: 900px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    margin-top: 2.5%;\r\n");
      out.write("    background-color: #FFF3E7;\r\n");
      out.write("    border: 1px solid #D34B32;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".thumbnail{\r\n");
      out.write("		display:inline-block;\r\n");
      out.write("		width:220px;\r\n");
      out.write("		border:1px solid white;\r\n");
      out.write("		margin:10px;\r\n");
      out.write("	}\r\n");
      out.write(".thumbnail:hover{\r\n");
      out.write("	opacity:0.7;\r\n");
      out.write("	cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Page Preloder -->\r\n");
      out.write("	<div id=\"preloder\">\r\n");
      out.write("		<div class=\"loader\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");


   Member loginUser = (Member)session.getAttribute("loginUser");
	String msg = (String)session.getAttribute("msg");
   String contextPath = request.getContextPath();
   

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 폰트 1 \r\n");
      out.write("<style>\r\n");
      out.write("h1, h2, h3, h4, h5, h6, p, span, a, input, button {\r\n");
      out.write("    font-family: 'Gowun Dodum'!important;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!-- 폰트 2 \r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Gowun+Batang:wght@400;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("h1, h2, h3, h4, h5, h6, p, span, a, input, button {\r\n");
      out.write("    font-family: 'Gowun Batang'!important;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!-- 폰트 3 -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Gowun+Batang:wght@700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("h1, h2, h3, h4, h5, h6, p, a, input, button, li, div {\r\n");
      out.write("    font-family: 'Gowun Batang'!important;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Css Styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/flaticon.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/barfiller.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/jquery-ui.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath );
      out.write("/resources/css/style.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Header Section Begin -->\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <div class=\"header__logo\">\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/img/Logo.png\" alt=\"야호\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                    <div class=\"header__nav\">\r\n");
      out.write("                        <nav class=\"header__menu mobile-menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                             \r\n");
      out.write("                                \r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath );
      out.write("/views/plan/planSelect.jsp\">일정플래너</a>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                        <li><a href=\"#\" class=\"movePage\">마음대로일정</a></li>\r\n");
      out.write("                                        <li><a href=\"#\" class=\"movePageAdmin\">추천일정</a></li>\r\n");
      out.write("                                        <li><a href=\"#\" class=\"movePage\">일정보관함</a></li>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                \r\n");
      out.write("                                <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/list.bo\">커뮤니티</a></li>\r\n");
      out.write("                                \r\n");
      out.write("                                ");
if(loginUser == null){
      out.write("  \r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath );
      out.write("/views/member/login.jsp\" onclick=\"goLogin();\">로그인</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath );
      out.write("/views/member/signUp.jsp\" onclick=\"enrollPage();\">회원가입</a></li>\r\n");
      out.write("                                 ");
}else if(loginUser.getUserId().equals("admin")) { 
      out.write("\r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath );
      out.write("/adminPage.ad\">관리자페이지</a></li>\r\n");
      out.write("                               	<li><a href=\"");
      out.print(contextPath );
      out.write("/logout.me\">로그아웃</a></li>                                \r\n");
      out.write("                                 ");
}
                                else { 
      out.write("\r\n");
      out.write("	                                <li><a href = \"");
      out.print(request.getContextPath() );
      out.write("/mypage.me\">마이페이지</a></li>\r\n");
      out.write("	                                <li><a href = \"");
      out.print(request.getContextPath() );
      out.write("/logout.me\">로그아웃</a></li>\r\n");
      out.write("							      ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                        <div class=\"header__menu__right\">\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"mobile-menu-wrap\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Header Section End -->\r\n");
      out.write("    \r\n");
      out.write("       <script type=\"text/javascript\">\r\n");
      out.write("		   function enrollPage(){\r\n");
      out.write("			   location.href = \"");
      out.print( request.getContextPath());
      out.write("/enrollForm.me\";\r\n");
      out.write("		   }\r\n");
      out.write("		   \r\n");
      out.write("		   //로그인 상태에 따라 plan페이지 이동\r\n");
      out.write("		   $(function(){\r\n");
      out.write("			   $('.movePage').click(function(){\r\n");
      out.write("	               var text = $(this).text();\r\n");
      out.write("	               ");
if(loginUser == null) {
      out.write("  //로그인 X -> 로그인페이지로 이동\r\n");
      out.write("	                    alert(\"로그인 후 이용해주세요\");\r\n");
      out.write("	                    location.href=\"");
      out.print(contextPath);
      out.write("/views/member/login.jsp\";\r\n");
      out.write("	               ");
}else{ 
      out.write("\r\n");
      out.write("	                    if(text == \"마음대로일정\"){\r\n");
      out.write("	                      	 location.href=\"");
      out.print(contextPath);
      out.write("/list.pm\";	\r\n");
      out.write("	                    }else if(text == \"일정보관함\"){\r\n");
      out.write("	                        location.href=\"");
      out.print(contextPath);
      out.write("/list.ps\";\r\n");
      out.write("	                    }\r\n");
      out.write("	               ");
}
      out.write("\r\n");
      out.write("	           })\r\n");
      out.write("		   })\r\n");
      out.write("		   \r\n");
      out.write("		  	 // 추천일정 로그인접근 \r\n");
      out.write("		   		   $(function(){\r\n");
      out.write("			   $('.movePageAdmin').click(function(){\r\n");
      out.write("	               var text = $(this).text();\r\n");
      out.write("	               ");
if(loginUser == null) {
      out.write("  //로그인 X -> 로그인페이지로 이동\r\n");
      out.write("	                    alert(\"로그인 후 이용해주세요\");\r\n");
      out.write("	                    location.href=\"");
      out.print(contextPath);
      out.write("/views/member/login.jsp\";\r\n");
      out.write("	               ");
}else{ 
      out.write("\r\n");
      out.write("	                    if(text == \"추천일정\"){\r\n");
      out.write("	                      	 location.href=\"");
      out.print(contextPath);
      out.write("/admin_List.pl\";	\r\n");
      out.write("	                    }");
      out.write("\r\n");
      out.write("	               ");
}
      out.write("\r\n");
      out.write("	           })\r\n");
      out.write("		   })\r\n");
      out.write("		   \r\n");
      out.write("		   \r\n");
      out.write("		   \r\n");
      out.write("   		</script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/jquery.barfiller.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/modernizr.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/classie.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(contextPath );
      out.write("/resources/js/photostack.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("	$(function(){\r\n");
      out.write("		var msg = \"");
      out.print(msg);
      out.write("\";\r\n");
      out.write("		if(msg != \"null\"){\r\n");
      out.write("			alert(msg);\r\n");
      out.write("			");
session.removeAttribute("msg");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("\r\n");
      out.write("   </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Hero Section Begin -->\r\n");
      out.write("	<section class=\"hero set-bg\" style=\"height: 500px\"\r\n");
      out.write("		data-setbg=\"");
      out.print( contextPath );
      out.write("/resources/img/gyeongbokgung-palace.jpg\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-12\">\r\n");
      out.write("					<div class=\"hero__text\">\r\n");
      out.write("						<div class=\"section-title\">\r\n");
      out.write("							<h2>어디어디?!</h2>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- Hero Section End -->\r\n");
      out.write("	<script>\r\n");
      out.write("            $(function(){\r\n");
      out.write("            var $header = $('header'); //헤더를 변수에 넣기\r\n");
      out.write("            var $page = $('.page-start'); //색상이 변할 부분\r\n");
      out.write("            var $window = $(window);\r\n");
      out.write("            var pageOffsetTop = $page.offset().top;//색상 변할 부분의 top값 구하기\r\n");
      out.write("            \r\n");
      out.write("            $window.resize(function(){ //반응형을 대비하여 리사이즈시 top값을 다시 계산\r\n");
      out.write("                pageOffsetTop = $page.offset().top;\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            $window.on('scroll', function(){ //스크롤시\r\n");
      out.write("                var scrolled = $window.scrollTop() >= pageOffsetTop; //스크롤된 상태; true or false\r\n");
      out.write("                $header.toggleClass('down', scrolled); //클래스 토글\r\n");
      out.write("            });\r\n");
      out.write("            });\r\n");
      out.write("        \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("	<section class=\"page-start\">\r\n");
      out.write("		<section class=\"admin\">\r\n");
      out.write("			<!------ MENUSIDE BAR ---------->\r\n");
      out.write("				<div class=\" menuBar\">\r\n");
      out.write("					<div class=\"col-sm-2\">\r\n");
      out.write("						<nav class=\"nav-sidebar\">\r\n");
      out.write("							<ul class=\"nav tabs\">\r\n");
      out.write("								<li class=\"menuB parent\"><a href=\"\" data-toggle=\"tab\">커뮤니티	관리</a></li>\r\n");
      out.write("								<li class=\"menuB \"><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">공지사항 조회</a></li>\r\n");
      out.write("								\r\n");
      out.write("								<li class=\"menuB parent\"><a href=\"\" data-toggle=\"tab\">일정관리</a></li>\r\n");
      out.write("								<li class=\"active menuB \"><a href=\"");
      out.print( contextPath );
      out.write("/list.pl\">일정 조회</a></li>\r\n");
      out.write("								<li class=\"menuB \"><a href=\"");
      out.print(contextPath);
      out.write("/insertForm.pl\">일정 등록</a></li>\r\n");
      out.write("								<li class=\"menuB \"> <a href=\"");
      out.print(contextPath);
      out.write("/deleteP.pl\">일정 삭제</a></li>\r\n");
      out.write("								\r\n");
      out.write("								<li class=\"menuB parent\"><a href=\"\" data-toggle=\"tab\">코스 관리</a></li>\r\n");
      out.write("								<li class=\"menuB \"><a href=\"");
      out.print( contextPath );
      out.write("/list.co\">코스 조회</a></li>								\r\n");
      out.write("								<li class=\" menuB\"><a href=\"");
      out.print(contextPath);
      out.write("/cInsert.co\">코스 등록</a></li>\r\n");
      out.write("								<li class=\"menuB\"><a href=\"");
      out.print(contextPath);
      out.write("/delete.co\" >코스 삭제</a></li>\r\n");
      out.write("								\r\n");
      out.write("								<li class=\"menuB parent\"><a href=\"");
      out.print(contextPath);
      out.write("/allmemberList.me\">회원 관리</a></li>\r\n");
      out.write("\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>	\r\n");
      out.write("			<div class=\"admin-showpage nice-scroll\">\r\n");
      out.write("			\r\n");
      out.write("				<div class=\"col-lg-12\">\r\n");
      out.write("			        <div class=\"section-title\">\r\n");
      out.write("			            <h2 style=\"margin: 0px;\">일정 조회</h2>\r\n");
      out.write("			        </div>	    \r\n");
      out.write("				</div><!-- class=\"col-lg-12\" -->\r\n");
      out.write("			\r\n");
      out.write("				<section class=\"most-search spad\">\r\n");
      out.write("					<div class=\"container\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("						\r\n");
      out.write("							<div class=\" \">\r\n");
      out.write("								<div class=\"tab-pane active\" id=\"tabs-1\" role=\"tabpanel\">\r\n");
      out.write("									<div class=\"row\">\r\n");
      out.write("										");
 for(Place p: list) {
      out.write("\r\n");
      out.write("										<div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("											<div class=\"listing__item\">\r\n");
      out.write("												<input type=\"hidden\" id=\"placeNo\" value=\"");
      out.print(p.getPlaceNo() );
      out.write("\">\r\n");
      out.write("											    <div class=\"listing__item__pic set-bg\" data-setbg=\"");
      out.print(contextPath );
      out.write("/resources/place_upFiles/");
      out.print(p.getTitleImg());
      out.write("\">\r\n");
      out.write("											        <img src=\"resources/img/listing/list_icon-1.png\" alt=\"\">\r\n");
      out.write("											        <div class=\"listing__item__pic__tag\">NO. ");
      out.print(p.getPlaceNo() );
      out.write("</div>\r\n");
      out.write("											        <div class=\"listing__item__pic__btns\">\r\n");
      out.write("											            <a href=\"#\"><span class=\"icon_zoom-in_alt\"></span></a>\r\n");
      out.write("											            <a href=\"#\"><span class=\"icon_heart_alt\"></span></a>\r\n");
      out.write("											        </div>\r\n");
      out.write("											    </div>\r\n");
      out.write("												<div class=\"listing__item__text\">\r\n");
      out.write("												    <div class=\"listing__item__text__inside\">\r\n");
      out.write("												        <h5>");
      out.print(p.getPlaceTitle() );
      out.write("</h5>\r\n");
      out.write("												        <p>");
      out.print(p.getDescription() );
      out.write("</p>\r\n");
      out.write("												        <div class=\"listing__item__text__rating\">\r\n");
      out.write("												            <div class=\"listing__item__rating__star\">\r\n");
      out.write("												                <span class=\"icon_star\"></span>\r\n");
      out.write("												                <span class=\"icon_star\"></span>\r\n");
      out.write("												                <span class=\"icon_star\"></span>\r\n");
      out.write("												                <span class=\"icon_star\"></span>\r\n");
      out.write("												                <span class=\"icon_star-half_alt\"></span>\r\n");
      out.write("												            </div>\r\n");
      out.write("												            <h6>");
      out.print(p.getPrice());
      out.write(" 원</h6>\r\n");
      out.write("												        </div>\r\n");
      out.write("												        <ul>\r\n");
      out.write("												            <li><span class=\"icon_pin_alt\"></span> ");
      out.print(p.getAddress() );
      out.write("</li>\r\n");
      out.write("												            <li><span class=\"icon_phone\"></span> ");
      out.print(p.getPlacePhone() );
      out.write("</li>\r\n");
      out.write("												        </ul>\r\n");
      out.write("												    </div>\r\n");
      out.write("												    <div class=\"listing__item__text__info\">\r\n");
      out.write("												        <div class=\"listing__item__text__info__left\">\r\n");
      out.write("												            <img src=\"resources/img/listing/list_small_icon-1.png\" alt=\"\">\r\n");
      out.write("												            <span>\r\n");
      out.write("												            ");

												            	String categoryName="";
																if(p.getCategoryNo()==1)
																	categoryName="먹기";
																if(p.getCategoryNo()==2)
																	categoryName="마시기";
																if(p.getCategoryNo()==3)
																	categoryName="놀기";
																
															
      out.write("\r\n");
      out.write("															");
      out.print( categoryName );
      out.write("\r\n");
      out.write("												            </span>\r\n");
      out.write("												        </div>\r\n");
      out.write("												        <div class=\"listing__item__text__info__right\">Open Now</div>\r\n");
      out.write("												    </div>\r\n");
      out.write("												    <button class=\"btn site-btn\" form=\"updateForm\">수정하기</button>\r\n");
      out.write("												    \r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div><!--<div class=\"col-lg-4 col-md-6\">  -->\r\n");
      out.write("										\r\n");
      out.write("										");
} 
      out.write("\r\n");
      out.write("										\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div><!--<div class=\"tab-content\"> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					   </div>          \r\n");
      out.write("				</section>\r\n");
      out.write("				<script>\r\n");
      out.write("				\r\n");
      out.write("					$(function(){\r\n");
      out.write("						$(\".listing__item__pic\").click(function(){\r\n");
      out.write("							\r\n");
      out.write("							var parent = $(this).parent(); \r\n");
      out.write("							var pNo = parent.children(\"#placeNo\").val();\r\n");
      out.write("							location.href='");
      out.print(contextPath);
      out.write("/detail.pl?pNo='+pNo;\r\n");
      out.write("						});\r\n");
      out.write("					});\r\n");
      out.write("					$(function(){\r\n");
      out.write("						$(\".btn\").click(function(){\r\n");
      out.write("							\r\n");
      out.write("							var parent = $(this).parent().parent(); \r\n");
      out.write("							var pNo = parent.children(\"#placeNo\").val();\r\n");
      out.write("							location.href='");
      out.print(contextPath);
      out.write("/updateForm.pl?pNo='+pNo;\r\n");
      out.write("						});\r\n");
      out.write("					});\r\n");
      out.write("				</script>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</section><!-- admin -->\r\n");
      out.write("	</section><!-- page- start -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Footer Section Begin -->\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <div class=\"footer__about\">\r\n");
      out.write("                        <div class=\"footer__about__logo\">\r\n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/img/Logo_D_1.png\" alt=\"\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>어디갈까 고민될 때는 어디어디!! &#128150;<br>\r\n");
      out.write("                        어디어디와 함께라면 지루한 일상도 특별하게\r\n");
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 offset-lg-2 col-md-6\">\r\n");
      out.write("                    <div class=\"footer__address\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <span>전화번호:</span>\r\n");
      out.write("                                <p>(+12) 345-678-910</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <span>이메일:</span>\r\n");
      out.write("                                <p>info.colorlib@gmail .com</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <span>주소:</span>\r\n");
      out.write("                                <p>서울특별시 강남구<br> 테헤란로14길 6</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <span>Connect Us:</span>\r\n");
      out.write("                                <div class=\"footer__social\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-skype\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"footer__copyright\">\r\n");
      out.write("                        <div class=\"footer__copyright__text\"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("  Copyright &copy;<script>document.write(new Date().getFullYear());</script> img by pngtree, Korea tourism oranization <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"footer__copyright__links\">\r\n");
      out.write("                            <a href=\"#\">서비스 소개</a>\r\n");
      out.write("                            <a href=\"#\">이용약관</a>\r\n");
      out.write("                            <a href=\"#\">개인정보처리방침</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- Footer Section End -->\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script src=\"");
      out.print( contextPath );
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("\r\n");
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
