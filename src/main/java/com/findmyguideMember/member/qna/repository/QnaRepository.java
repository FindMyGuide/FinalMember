package com.findmyguideMember.member.qna.repository;

import com.findmyguideMember.member.qna.domain.Qna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnaRepository extends JpaRepository<Qna, Long> {
}
