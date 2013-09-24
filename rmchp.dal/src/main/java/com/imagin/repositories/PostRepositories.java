package com.imagin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.imagin.dom.Post;

public interface PostRepositories extends JpaRepository<Post, Integer> {

	@Query("select t from Post t where t.nom = :nom ")
	public Post findByName(@Param("nom")String nom);
	
}
