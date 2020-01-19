package org.ljn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ljn.service.IStudentService;
import org.ljn.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class QueryStudentByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  IStudentService studentService ;
	
	public void init() {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		studentService = (IStudentService)context.getBean("studentService");
	}
       
    public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
		System.out.println(studentService);
	}


    public QueryStudentByIdServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//IStudentService studentService = new StudentServiceImpl();	
		String name = studentService.queryStudentById(); 
		System.out.println(name);
		request.setAttribute("name", name);
		request.getRequestDispatcher("result.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//IStudentService studentService = new StudentServiceImpl();
		doGet(request, response);
	}

}
