package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component는 부모클래스 자식으로 @Service, @Repository, @Controller
//@Component == @Bean 싱글톤 객체라는 의미

//dao를 서비스에 끼우기 위해 싱글톤으로 만들기
@Repository
public class MemberDAO {

	
	//mybatis를 DAO에 끼우기
	//SqlSessionTemplate은 mybatis의 original이름
	@Autowired
	SqlSessionTemplate mybatis;

	public void insert(MemberVO vo) {
		mybatis.insert("member.insert", vo);
		//orm을 정의하는 mapper파일
	}

	public void update(MemberVO vo) {
		mybatis.update("member.update", vo);
	}

	public void delete(MemberVO vo) {
		mybatis.delete("member.delete", vo);
	}
	
	public MemberVO one(MemberVO vo) {
	MemberVO vo2 = mybatis.selectOne("member.one", vo);
						//네임스페이스이름.id , 입력파라메터
	return vo2;
	}
	
	public List list() {
		List<MemberVO> list = mybatis.selectList("member.list");
		System.out.println(list.size());
		return list;
	}
}
