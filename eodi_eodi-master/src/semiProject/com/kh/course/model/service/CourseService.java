package semiProject.com.kh.course.model.service;

import static semiProject.com.kh.common.JDBCTemplate.close;
import static semiProject.com.kh.common.JDBCTemplate.commit;
import static semiProject.com.kh.common.JDBCTemplate.getConnection;
import static semiProject.com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import semiProject.com.kh.course.model.dao.CourseDao;
import semiProject.com.kh.course.model.vo.Course;
import semiProject.com.kh.course.model.vo.CoursePlace;
import semiProject.com.kh.place.model.vo.Place;

public class CourseService {
	
	public int insertCourse(Course c, String[] pNo) {
		Connection conn = getConnection();
		int result1 = new CourseDao().insertCourse(conn, c);
		int result2 =0;
		
		for(int i=0; i<pNo.length; i++)
		{
			int placeNum =Integer.parseInt(pNo[i]);
			result2 = new CourseDao().insertCoursePlace(conn,placeNum);
		}
		if(result1 > 0 && result2>0)
		{
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(conn);
		return result1 * result2;
	}
	
	public ArrayList<Course> selectCList(int areaNo) {
		Connection conn = getConnection();
		ArrayList<Course> list = new CourseDao().selectCList(conn, areaNo);
		
		close(conn);
		return list;
	}
	
	public ArrayList<Place> selectCoursePlaceList(int cNo) {
		Connection conn = getConnection();
		ArrayList<Place> list = new CourseDao().selectCoursePlaceList(conn, cNo);
		
		close(conn);
		return list;
	}

	public int delectCourse(int cNo) {
		Connection conn = getConnection();
		int result1 = new CourseDao().delectCourse(conn, cNo);
		int result2 = new CourseDao().delectCoursePlace(conn,cNo);
		if(result1 >0  &&result2>0)
		{
			commit(conn);
		}
		else
			rollback(conn);
		close(conn);
		return result1*result2;
	}

	public ArrayList<Course> selectCourseAttachment(int cNo, int aNo) {
		Connection conn = getConnection();
		ArrayList<Course> clist = new CourseDao().selectCourseAttachment(conn, cNo, aNo);
		
		close(conn);
		return clist;
	}

	public Course selectUpdateCourse(int cNo) {
		Connection conn = getConnection();
		
		Course c = new CourseDao().selectCourse(conn, cNo);
		close(conn);
		return c;
	}


	public ArrayList<CoursePlace> selectCPno(int cNo) {
		Connection conn = getConnection();
		ArrayList<CoursePlace> cplist =  new CourseDao().selectCPno(conn, cNo);
		
		close(conn);
		return cplist;
	}


	public int updateCourse(Course c, int cNo, String pNo, int cpNo) {
		Connection conn = getConnection();
		int result1 = new CourseDao().updateCourse(conn, c);
		int result2 = new CourseDao().updateCoursePlace(conn, cNo, pNo,cpNo);
		if(result1 > 0 && result2>0)
		{
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(conn);
		return result1 * result2;
	}

	
	
}
