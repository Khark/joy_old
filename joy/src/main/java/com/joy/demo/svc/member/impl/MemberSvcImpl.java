package com.joy.demo.svc.member.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.joy.demo.advice.RestException;
import com.joy.demo.domain.maria.member.memberEntity;
import com.joy.demo.repository.MemberRepository;
import com.joy.demo.svc.member.MemberSvc;

@Service
public class MemberSvcImpl implements MemberSvc {
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public memberEntity selectMember(Long memberno) {
		// TODO Auto-generated method stub
		return memberRepository.findById(memberno).orElseThrow(() -> 
		new RestException(HttpStatus.NOT_FOUND, "Not found member"));
	}
	
	
}
