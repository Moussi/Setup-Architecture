package com.imagin.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagin.dom.Post;
import com.imagin.repositories.PostRepositories;

@Service
public class PostService implements IPostService {

	@Autowired
	PostRepositories repo;
	
	@Override
	public Post recentPost() {
		// TODO Auto-generated method stub
		
		return repo.findByName("third Post");
	}

}
