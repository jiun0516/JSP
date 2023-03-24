package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DAO.LoginDAO;
import com.tenco.controller.DTO.LoginDTO;

@WebServlet("/loginProc")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginDTO loginDTO = new LoginDTO();
	LoginDAO loginDAO = new LoginDAO();
       
    public LoginProc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// method : post (form 태그에서)
	// http://localhost:8080/demo3/loginProc
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form --> 반드시 속성 name = "email"
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String isRemember = request.getParameter("isRemember");
		String hobby = request.getParameter("hobby");
		String[] likes = request.getParameterValues("like"); // 배열처리 (다중 선택)
		System.out.println("email : " + email);
		System.out.println("password : " + password);
		System.out.println("isRemember : " + isRemember);
		System.out.println("hobby : " + hobby);
		if(likes != null) {
			for (String like : likes) {
				System.out.println("like : " + like);
			}			
		}
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		
		loginDTO.setEmail(request.getParameter("email"));
		loginDTO.setPassword(request.getParameter("password"));
		loginDTO.setHobby(request.getParameter("hobby"));
		int result = loginDAO.insert(loginDTO);
		System.out.println("result : " + result);
	}

}
