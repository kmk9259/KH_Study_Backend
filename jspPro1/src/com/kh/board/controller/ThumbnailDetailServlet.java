package com.kh.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.board.model.service.BoardService;
import com.kh.board.model.vo.Attachment;
import com.kh.board.model.vo.Board;

/**
 * Servlet implementation class ThumbnailDetailServlet
 */
@WebServlet("/detail.th")
public class ThumbnailDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThumbnailDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		Board b = new BoardService().selectBoard(bId);
		
		ArrayList<Attachment> fileList = new BoardService().selectThumbnail(bId);
		
		if(b != null)
		{
			request.setAttribute("b", b);
			request.setAttribute("fileList", fileList);
			
			request.getRequestDispatcher("views/thumbnail/thumbnailDetailView.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "사진게시판 상세보기에 실패하였습니다.");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
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
