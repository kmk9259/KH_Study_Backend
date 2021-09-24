package com.kh.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.kh.model.vo.User;

/**
 * Servlet implementation class JqAjaxServlet2
 */
@WebServlet("/jqTest6.do")
public class JqAjaxServlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JqAjaxServlet6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User(1,"유재석",30,'남'));
		list.add(new User(2,"한지민",31,'여'));
		list.add(new User(3,"배수지",32,'여'));
		list.add(new User(4,"송지효",33,'여'));
		list.add(new User(5,"김종국",34,'남'));
		
		String keyword = request.getParameter("keyword");
		
		JSONArray jArr = new JSONArray();
		JSONObject jsonUser = null;
		
		for(User user : list)
		{
			if(user.getName().contains(keyword))
			{
				jsonUser = new JSONObject();
				jsonUser.put("no", user.getNo());
				jsonUser.put("name", user.getName());
				jsonUser.put("age", user.getAge());
				jsonUser.put("gender", user.getGender()+""); 
				
				jArr.add(jsonUser);
			}
		}
		JSONObject jsonMap = null;
		
		if(keyword != null && jArr != null)
		{
			jsonMap = new JSONObject();
			
			jsonMap.put("jArr", jArr);
			jsonMap.put("keyword", keyword);
		}
		
		//브라우저로 json 객체 전송
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().print(jsonMap);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
