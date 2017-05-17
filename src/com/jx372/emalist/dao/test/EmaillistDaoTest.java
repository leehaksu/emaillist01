package com.jx372.emalist.dao.test;

import com.jx372.emaillist.dao.EmaillistDao;
import com.jx372.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertTest();
		getListTest();
	}
	public static void insertTest()
	{
		EmaillistDao dao = new EmaillistDao ();
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName("안");
		vo.setLastName("대혁");
		vo.setEmail("kickscar");
		dao.insert(vo);
	}
	
	public static void getListTest()
	{
		EmaillistDao dao =new EmaillistDao();
		dao.getList();
		
	}

}
