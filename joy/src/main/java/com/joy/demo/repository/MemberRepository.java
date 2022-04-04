package com.joy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joy.demo.domain.maria.member.memberEntity;

public interface MemberRepository extends JpaRepository<memberEntity , Long>  {

	
	
}
