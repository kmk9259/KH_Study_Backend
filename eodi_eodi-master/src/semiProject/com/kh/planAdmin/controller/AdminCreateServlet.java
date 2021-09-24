package semiProject.com.kh.planAdmin.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semiProject.com.kh.member.model.vo.Member;
import semiProject.com.kh.place.model.vo.Place;
import semiProject.com.kh.planAdmin.model.service.AdminPlanService;
import semiProject.com.kh.planAdmin.model.vo.AdminPlan;

/**
 * Servlet implementation class AdminCreateServlet
 */
@WebServlet("/adminCreate.pl")
public class AdminCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int userNo = ((Member) request.getSession().getAttribute("loginUser")).getUserNo(); // 1. 로그인유저번호
		
		//사용자가 선택한 테마와,위치의 번호를 받을 파라미터값을 가져온다. 
		String themeNo = request.getParameter("theme"); // 2. 테마 가져옴 1,2,3 
		String areaNo = request.getParameter("area"); // 3. 위치가져옴
	
		//아무것도 선택하지 않았을때 널 포인트 익셉션 오류를 잡기위하여 
		//if문 안에 널이 아닐때로 넣었다. 
		if(themeNo != null && areaNo !=null) {
			
		int theme =Integer.parseInt(request.getParameter("theme"));  //테마 
		int area = Integer.parseInt(request.getParameter("area"));  // 위치
		
		//값이 
			 
			String bDate = request.getParameter("chooseDate"); // 선택된 날짜
			String m = bDate.substring(0, 2);
			String d = bDate.substring(3, 5);
			String y = bDate.substring(6);
			String aDate = y + "-" + m + "-" + d;
			// Date planDate= java.sql.Date.valueOf(aDate);
			Date adminDate = Date.valueOf(aDate);
		
			ArrayList<Place> pList = new AdminPlanService().selectPList(area,theme);
			
			//AdminPlan adminList = new AdminPlan(area, adminDate);
			//int result = new AdminPlanService().selectPList(pList);
						
			request.setAttribute("pList", pList);
			
			request.setAttribute("adminDate", adminDate); // 날짜랑 
			request.setAttribute("areaNo", areaNo); //위치 
		
		
		
				//request.setAttribute("msg", "추천일정조회를 성공적으로 완료 하였습니다.");
				request.getRequestDispatcher("views/adminPlan/adminPlan_detail.jsp");
	

			} else {

			request.setAttribute("msg", "추천일정 조회에 실패했습니다.");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
					
		}
		
		request.getRequestDispatcher("views/adminPlan/adminPlan_detail.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
