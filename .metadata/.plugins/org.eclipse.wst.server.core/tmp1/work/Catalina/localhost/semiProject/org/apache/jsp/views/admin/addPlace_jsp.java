/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-08-31 13:24:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addPlace_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/admin/../common/menubar.jsp", Long.valueOf(1630414612290L));
    _jspx_dependants.put("/views/admin/../common/footer.jsp", Long.valueOf(1630411746958L));
  }

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
      out.write("    <meta name=\"description\" content=\"Directing Template\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Directing, unica, creative, html\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>어디어디 - 로그인</title>\r\n");
      out.write("    <!-- Google Font -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Css Styles -->\r\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" type=\"text/css\"> -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/bootstrap.min333.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/flaticon.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/barfiller.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/jquery-ui.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/./resources/css/myInfo.css\" type=\"text/css\">\r\n");
      out.write("       \r\n");
      out.write("    <!-- login Section -->\r\n");
      out.write("    <!-- 첫 번째 -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--CSS-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!--JS-->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Page Preloder -->\r\n");
      out.write("	<div id=\"preloder\">\r\n");
      out.write("        <div class=\"loader\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write('\r');
      out.write('\n');

	
	String contextPath = request.getContextPath();
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<!-- Google Font -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Css Styles -->\r\n");
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
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Header Section Begin -->\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <div class=\"header__logo\">\r\n");
      out.write("                        <a href=\"");
      out.print(contextPath );
      out.write("/index.jsp\"><img src=\"");
      out.print(contextPath );
      out.write("/resources/img/Logo.png\" alt=\"야호\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                    <div class=\"header__nav\">\r\n");
      out.write("                        <nav class=\"header__menu mobile-menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                             \r\n");
      out.write("                                \r\n");
      out.write("                                <li><a href=\"./selectPlan.html\">일정플래너</a>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                        <li><a href=\"./listing.html\">마음대로일정</a></li>\r\n");
      out.write("                                        <li><a href=\"./listing-details.html\">추천일정</a></li>\r\n");
      out.write("                                        <li><a href=\"./blog-details.html\">일정보관함</a></li>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"./faq.html\">FAQ</a></li>\r\n");
      out.write("                                <li><a href=\"./blog.html\">커뮤니티</a></li>\r\n");
      out.write("                               \r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath );
      out.write("/views/member/login.jsp\">로그인</a></li>\r\n");
      out.write("                                <li><a href=\"./signUp.html\">회원가입</a></li>\r\n");
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
      out.write("    <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.barfiller.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Hero Section Begin -->\r\n");
      out.write("        <section class=\"hero set-bg\" data-setbg=\"");
      out.print( contextPath );
      out.write("/resources/img/gyeongbokgung-palace.jpg\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <div class=\"hero__text\">\r\n");
      out.write("                            <div class=\"section-title\">\r\n");
      out.write("                                <h2>어디어디?!</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    <!-- Hero Section End -->\r\n");
      out.write("       <script>\r\n");
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
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"page-start\">\r\n");
      out.write("		<section class=\"login\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"sidenav\">\r\n");
      out.write("					<div class=\"login-main-text\">\r\n");
      out.write("						<h2>\r\n");
      out.write("							Eodi Eodi<br> Admin Page\r\n");
      out.write("						</h2>\r\n");
      out.write("						<p>Welcome To Admin Page</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!------ MENUSIDE BAR ---------->\r\n");
      out.write("				<div class=\"container menuBar\">\r\n");
      out.write("					<div class=\"col-sm-2\">\r\n");
      out.write("						<nav class=\"nav-sidebar\">\r\n");
      out.write("							<ul class=\"nav tabs\">\r\n");
      out.write("								<li class=\" menuB parent\"><a href=\"#mInfo\"\r\n");
      out.write("									data-toggle=\"tab\">커뮤니티 관리</a></li>\r\n");
      out.write("								<li class=\"menuB \"><a href=\"#\" data-toggle=\"tab\">공지사항\r\n");
      out.write("										등록</a></li>\r\n");
      out.write("								<li class=\"menuB \"><a href=\"#\" data-toggle=\"tab\">공지사항\r\n");
      out.write("										수정</a></li>\r\n");
      out.write("								<li class=\"menuB parent\"><a href=\"\">일정관리</a></li>\r\n");
      out.write("								<li class=\"active menuB \"><a href=\"#\" data-toggle=\"tab\">일정\r\n");
      out.write("										등록</a></li>\r\n");
      out.write("								<li class=\"menuB \"><a href=\"#\" data-toggle=\"tab\">일정 삭제</a></li>\r\n");
      out.write("								<li class=\"menuB\"><a href=\"#\" data-toggle=\"tab\">코스 등록</a></li>\r\n");
      out.write("								<li class=\"menuB\"><a href=\"#\" data-toggle=\"tab\">코스 삭제</a></li>\r\n");
      out.write("								<li class=\"menuB parent\"><a href=\"#\">회원 관리</a></li>\r\n");
      out.write("\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"container-showpage\" style=\"height: 850px\">\r\n");
      out.write("					<!-- tab content -->\r\n");
      out.write("					<div class=\"tab-content\">\r\n");
      out.write("						<!-- 일정 등록 -->\r\n");
      out.write("						<div class=\"tab-pane active text-style\" id=\"mInfo\">\r\n");
      out.write("							<h2>일정 등록</h2>\r\n");
      out.write("							<br> <br>\r\n");
      out.write("							<form name=\"addPlace\">\r\n");
      out.write("								<div class=\"form-group\">\r\n");
      out.write("									<label class=\"control-label\">지역</label> <input maxlength=\"100\"\r\n");
      out.write("										type=\"text\" required=\"required\" class=\"form-control\"\r\n");
      out.write("										placeholder=\"지역을 입력해주세요\" /> <label class=\"control-label\">카테고리</label>\r\n");
      out.write("									<input maxlength=\"100\" type=\"text\" required=\"required\"\r\n");
      out.write("										class=\"form-control\" placeholder=\"카테고리를 입력해주세요\" /> <label\r\n");
      out.write("										class=\"control-label\">상호명</label> <input maxlength=\"100\"\r\n");
      out.write("										type=\"text\" required=\"required\" class=\"form-control\"\r\n");
      out.write("										placeholder=\"상호명을 입력해주세요\" /> <label class=\"control-label\">전화번호</label>\r\n");
      out.write("									<input maxlength=\"100\" type=\"tel\" required=\"required\"\r\n");
      out.write("										class=\"form-control\" placeholder=\"전화번호를 입력해주세요\" /> <label\r\n");
      out.write("										class=\"control-label\">주요 메뉴</label> <input maxlength=\"100\"\r\n");
      out.write("										type=\"text\" required=\"required\" class=\"form-control\"\r\n");
      out.write("										placeholder=\"주요 메뉴를 입력해주세요\" /> <label class=\"control-label\">영업\r\n");
      out.write("										시간</label> <input maxlength=\"100\" type=\"text\" required=\"required\"\r\n");
      out.write("										class=\"form-control\" placeholder=\"영업 시간을 입력해주세요\" /> <label\r\n");
      out.write("										class=\"control-label\">대표 금액</label> <input maxlength=\"100\"\r\n");
      out.write("										type=\"text\" required=\"required\" class=\"form-control\"\r\n");
      out.write("										placeholder=\"대표 금액을 입력해주세요\" /> <label class=\"control-label\">상세\r\n");
      out.write("										주소</label> <input maxlength=\"100\" type=\"text\" required=\"required\"\r\n");
      out.write("										class=\"form-control\" placeholder=\"상세주소를 입력해주세요\" /> <br>\r\n");
      out.write("									<br>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<button class=\"nextBtn btn-ms pull-right\" type=\"submit\">등록</button>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<!-- Google Font -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Css Styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/flaticon.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/barfiller.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/jquery-ui.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/style.css\" type=\"text/css\">\r\n");
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
      out.write("    <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.barfiller.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/jquery.barfiller.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("    \r\n");
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