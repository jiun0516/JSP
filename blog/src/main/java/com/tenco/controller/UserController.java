package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import netscape.javascript.JSObject;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/usercontroller")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 문제 2
		// JSON 형식으로 name=홍길동, age=10 이라는 값을 리턴시키세요
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8;");
		PrintWriter pw = response.getWriter();
		pw.print("{\r\n"
				+ "	\"name\" : \"홍길동\",\r\n"
				+ "	\"age\" : 10\r\n"
				+ "}");
	}

	// Method : post
	// http://localhost:8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아오고 ?? 연산을해서 응답 처리 해보기
		// 요청시 파라미터로 넘겨온 키값을 확인해서 값을 추출하는 기술을 알아보자
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		
		System.out.println("name : " + name);
		System.out.println("pwd : " + pwd);
		
		// 응답 처리
		// MIME TYPE text/html 방식 -> 이름과 비번을 확인 하였습니다.
		PrintWriter writer = response.getWriter();
		writer.print("이름과 비번을 확인 하였습니다.");
		
		PrintWriter pw = response.getWriter();
		pw.print("{\r\n"
				+ "	\"name\" : \"홍길동\",\r\n"
				+ "	\"age\" : 10\r\n"
				+ "}");
		
	}

}
