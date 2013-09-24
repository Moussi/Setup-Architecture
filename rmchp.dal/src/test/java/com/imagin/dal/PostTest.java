package com.imagin.dal;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imagin.dom.Post;
import com.imagin.repositories.PostRepositories;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application.xml")
public class PostTest {

	@Autowired
	PostRepositories repository;
	
	@Test
	public void test() {
		Post post = new Post();
		post.setDate(new Date());
		post.setNom("forth Post");
		
		repository.save(post);
		
		Post dbpost = repository.findOne(post.getIdpost());
		assertNotNull(dbpost);
		//System.out.println(dbpost.getNom());
		System.out.println("date :"+repository.findByName("third Post").getDate());
	}

}

