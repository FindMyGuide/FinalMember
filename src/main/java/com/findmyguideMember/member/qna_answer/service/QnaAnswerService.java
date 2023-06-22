package com.findmyguideMember.member.qna_answer.service;

import com.findmyguideMember.member.qna_answer.domain.QnaAnswer;
import com.findmyguideMember.member.qna_answer.dto.QnaAnswerRequest;
import com.findmyguideMember.member.qna_answer.dto.QnaAnswerResponse;
import com.findmyguideMember.member.qna_answer.repository.QnaAnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class QnaAnswerService {

    private final QnaAnswerRepository qnaAnswerRepository;

    @Transactional
    public QnaAnswerResponse save(QnaAnswerRequest qnaAnswerRequest) {

        QnaAnswer save = qnaAnswerRepository.save(qnaAnswerRequest.toQnaAnswer());
        return new QnaAnswerResponse(save);

    }

    @Transactional
    public QnaAnswerResponse update(Long qna_answer_id, String title, String content) {
        QnaAnswer qnaAnswer = qnaAnswerRepository.findById(qna_answer_id).get();
        qnaAnswer.setTitle(title);
        qnaAnswer.setContent(content);
        return null;
    }

    public void delete(QnaAnswer qnaAnswer) {
        qnaAnswerRepository.deleteById(qnaAnswer.getId());
    }
}
