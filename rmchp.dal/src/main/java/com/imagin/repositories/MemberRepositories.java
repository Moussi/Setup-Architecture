package com.imagin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.imagin.dom.Member;
import com.imagin.dom.Post;

public interface MemberRepositories extends JpaRepository<Member, Integer> {

	@Query("select t from Member t where t.name = :nom ")
	public Post findByName(@Param("nom")String nom);
	
}
