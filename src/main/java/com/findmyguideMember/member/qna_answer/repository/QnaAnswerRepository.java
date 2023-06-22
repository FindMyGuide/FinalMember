package com.findmyguideMember.member.qna_answer.repository;

import com.findmyguideMember.member.qna_answer.domain.QnaAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnaAnswerRepository extends JpaRepository<QnaAnswer, Long> {
}