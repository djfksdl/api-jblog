package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	private SqlSession sqlSession;

	//회원가입
	public void joinInsert() {
		System.out.println("UserDao.joinInsert");
		
		
	}
	
}
