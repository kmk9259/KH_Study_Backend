<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="semiProject.com.kh.notice.model.vo.Notice"%>
    
  <%
	Notice notice = (Notice)request.getAttribute("notice");
%>
	
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Directing Template">
    <meta name="keywords" content="Directing, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>어디어디</title>
	<link rel="stylesheet"
		href="<%= request.getContextPath() %>/./resources/css/myInfo.css"
		type="text/css">


<style>
.admin {
	background-color: #FFF3E7;
	height: 1000px;
	padding: 0px 50px 50px 50px;
}

.admin-showpage {
	float: right;
	width: 1200px;
	margin-right: 50px;
	height: 700px;
	padding: 10px;
	margin-top: 2.5%;
	background-color: #FFF3E7;
/* 	border: 1px solid #D34B32;
 */}

 #wr{ 
	
	float: right;
	font-weight: 400;
}

#dt{

	float: right;
	font-weight: 400;

}

.btns{

	margin-top:10px;
}

 

</style>

</head>

<body>
    <!-- Page Preloder -->
	<!-- <div id="preloder">
        <div class="loader"></div>
    </div> -->

     <%@ include file="../common/menubar.jsp"%>
		<!-- 페이지 상단부  -->
		<!-- Listing Section Begin  -->
	<section class="listing-hero set-bg" data-setbg="<%= contextPath %>/resources/img/breadcrumb/breadcrumb-blog2.gif">
		<div class="container">
		    <div class="row">
		        <div class="col-lg-8">
		            <div class="listing__hero__option">
		
		                <div class="listing__hero__text">
		                    <h2>공지사항 </h2>
		                    <div class="breadcrumb__option">
		                        <a href="./index.jsp"><i class="fa fa-home"></i> 홈</a>
		                        <span>공지사항 </span>
		                    </div>
		                    <p>공지사항 조회페이지 </p>
		                </div>
		            </div>
		        </div>
		
		    </div>
		</div>
		</section>

<section class="page-start">
    <!--메뉴바 같이 내려오는 시작점 -->

			<section class="admin">
			<!------ MENUSIDE BAR ---------->
				<div class=" menuBar">
					<div class="col-sm-2">
						<nav class="nav-sidebar">
							<ul class="nav tabs">
								<li class="menuB parent"><a href="" data-toggle="tab">커뮤니티	관리</a></li>
								<li class="menuB "><a href="<%= contextPath %>/list.no">공지사항 조회</a></li>
								
								<li class="menuB parent"><a href="" data-toggle="tab">일정관리</a></li>
								<li class="menuB "><a href="<%= contextPath %>/list.pl">일정 조회</a></li>
								<li class="menuB "><a href="<%=contextPath%>/insertForm.pl">일정 등록</a></li>
								<li class="menuB "> <a href="<%=contextPath%>/deleteP.pl">일정 삭제</a></li>
								
								<li class="menuB parent"><a href="" data-toggle="tab">코스 관리</a></li>
								<li class="menuB "><a href="<%= contextPath %>/list.co">코스 조회</a></li>								
								<li class="menuB"><a href="<%=contextPath%>/cInsert.co">코스 등록</a></li>
								<li class="menuB"><a href="<%=contextPath%>/delete.co" >코스 삭제</a></li>
								
								<li class="menuB parent"><a href="<%=contextPath%>/allmemberList.me">회원 관리</a></li>


							</ul>
						</nav>
					</div>
				</div>	
				
				<div class="admin-showpage">
				
					 <br>
						<h2 align="center">공지사항 상세보기 </h2>
						<br>
						
			<form method="post" action="<%=contextPath %>/updateForm.no">
			
		   <input type="hidden" name ="nno" value="<%=notice.getNoticeNo()%>">
		
			   
				<div>게시글 No. <%=notice.getNoticeNo() %></div>
				<hr/>
				<div name="title" >게시글 제목 : <h3><%= notice.getNoticeTitle() %></h3> </div>
				<hr/>
				<div id="wr">작성자 : <%=notice.getNoticeWriter() %></div><br>
				<div id="dt">작성날짜 : <%=notice.getCreateDate()%></div><br><br>
			
				<div id="content" name="content"><%= notice.getNoticeContent() %></div>
			<br>
				
		 
		 	<div class="btns" align="center"> <!-- 버튼만 있는 애들  -->
		 		
			<input type="button" class="site-btn" onclick="location='list.no'" value="목록으로">&nbsp;&nbsp;	    
								        
			<% if(loginUser != null && loginUser.getUserId().equals("admin")) { %>
								       
			<button type="submit" class="site-btn">수정하기</button> &nbsp;&nbsp;
				
			<input type="button" class="site-btn" onclick="location='delete.no?nno=<%=notice.getNoticeNo()%>'" value="삭제하기 ">
			 
			
									<% } %>
					    	 </div>
		
		
			</form>
			
			
			
			 </section>

   
     </section>
                        
      


    <%@ include file="../common/footer.jsp"%>

    
    <script src="<%= contextPath %>/resources/js/main.js"></script>
</body>




<!-- 자바스크립트 함수부분  -->
		
		
<script>
    $(function () {
        var $header = $('header'); //헤더를 변수에 넣기
        var $page = $('.page-start'); //색상이 변할 부분
        var $window = $(window);
        var pageOffsetTop = $page.offset().top;//색상 변할 부분의 top값 구하기

        $window.resize(function () { //반응형을 대비하여 리사이즈시 top값을 다시 계산
            pageOffsetTop = $page.offset().top;
        });

        $window.on('scroll', function () { //스크롤시
            var scrolled = $window.scrollTop() >= pageOffsetTop; //스크롤된 상태; true or false
            $header.toggleClass('down', scrolled); //클래스 토글
        });
    });

</script>

</html>