<%@page import="com.jx372.emaillist.dao.EmaillistDao"%>
<%@page import="com.jx372.emaillist.vo.EmaillistVo"%>
<%
	request.setCharacterEncoding("utf-8");
	String firstName=request.getParameter("fn");
	String lastName=request.getParameter("ln");
	String email=request.getParameter("email");
	EmaillistVo vo = new EmaillistVo();
	vo.setFirstName(firstName);
	vo.setLastName(lastName);
	vo.setEmail(email);
	new EmaillistDao().insert(vo);
	
	//리다이렉트 응답
	response.sendRedirect("./index.jsp");


	
    %>