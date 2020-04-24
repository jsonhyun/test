package com.yi.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.MemberVO;
import com.yi.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDAOTest {
	
	@Autowired
	private MemberDAO dao;
	
	@Test
	public void testDao() {
		System.out.println(dao);
	}
	
	@Test
	public void testCreateMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("user00");
		vo.setUsername("user00");
		vo.setEmail("user00@test.com");
		dao.createMember(vo);
	}
	
	@Test
	public void testReadMember() throws Exception {
		MemberVO vo = dao.readMember("user00");
		System.out.println(vo);
	}
	
	@Test
	public void testList() throws Exception {
		List<MemberVO> list = dao.list();
		for(MemberVO vo : list) {
			System.out.println(vo);
		}
	}
	
	@Test
	public void testUpdateMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("test00");
		vo.setUsername("test00");
		vo.setEmail("test00@test.com");
		dao.updateMember(vo);
	}
	
	@Test
	public void testDeleteMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		dao.deleteMember(vo);
	}
	
}
