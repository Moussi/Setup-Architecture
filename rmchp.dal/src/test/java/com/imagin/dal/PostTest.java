package com.imagin.dal;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imagin.dom.Member;
import com.imagin.dom.Post;
import com.imagin.dom.WjaIssue;
import com.imagin.repositories.MemberRepositories;
import com.imagin.repositories.PostRepositories;
import com.imagin.repositories.WjaIssueRepositories;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/application.xml")
public class PostTest {

	@Autowired
	PostRepositories repository;
	@Autowired
	MemberRepositories repositorymem;

	@Autowired
	WjaIssueRepositories repositorywja;

	@Test
	public void test() {
		Member post = new Member();
		post.setAddress(new Date().toString());
		post.setName("first member");

		
		WjaIssue wja=new WjaIssue();
		wja.setDescription("dddd");
		wja.setMember(post);
		
		repositorywja.save(wja);
		
		Member dbpost = repositorymem.findOne(post.getId());
		assertNotNull(dbpost);
		// System.out.println(dbpost.getNom());
		// System.out.println("date :"+repositorymem.findByName("forth Post").getDate());
	}

}
