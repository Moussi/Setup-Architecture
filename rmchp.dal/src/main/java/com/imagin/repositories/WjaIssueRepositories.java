package com.imagin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.imagin.dom.Post;
import com.imagin.dom.WjaIssue;

public interface WjaIssueRepositories extends JpaRepository<WjaIssue, Integer> {

	@Query("select t from WjaIssue t where t.title = :nom ")
	public Post findByName(@Param("nom")String nom);
	
}
