package com.jbedu.oracle.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbedu.oracle.dao.MemberDao;

@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/write")
	public String write() {
		
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		
		memberDao.writeDao("lion", "12345", "김유신", "lion@abc,com", 32);
		
		return "writeOk";
	}

}
