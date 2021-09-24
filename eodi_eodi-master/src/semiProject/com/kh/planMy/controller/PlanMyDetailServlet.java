package semiProject.com.kh.planMy.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semiProject.com.kh.board.model.vo.PageInfo;
import semiProject.com.kh.place.model.vo.Place;
import semiProject.com.kh.planMy.model.service.PlanMyService;
import semiProject.com.kh.planMy.model.vo.PlanMy;

/**
 * Servlet implementation class PlanMyDetailServlet
 */
@WebServlet("/detailP.ps")
public class PlanMyDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlanMyDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int planNo = Integer.parseInt(request.getParameter("planNo"));
		
		PlanMy pm = new PlanMyService().selectPlanMy(planNo);
		ArrayList<Place> pList = new PlanMyService().selectPlace_planMy(planNo);
	
		if(pm != null) {
			//memo가 null일때 대비해줘야 한다...
			if(pm.getPlanMemo() != null) {
				pm.setPlanMemo(pm.getPlanMemo().replaceAll("<br>", "\n"));  //db에는 <br>로 띄어쓰기가 저장되고 화면에 이걸 다시 띄우면 <br>로 나오기 때문에 바꿔준다.			
			}
			
			request.setAttribute("pm", pm);
			request.setAttribute("pList", pList);
			request.getRequestDispatcher("views/plan/planSaveDetail.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "일정 상세보기 실패");
			RequestDispatcher view = request.getRequestDispatcher("views/common/errorPage.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
