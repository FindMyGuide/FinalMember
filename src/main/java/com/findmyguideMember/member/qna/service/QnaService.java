package com.findmyguideMember.member.qna.service;

import com.findmyguideMember.member.qna.domain.Qna;
import com.findmyguideMember.member.qna.dto.QnaRequest;
import com.findmyguideMember.member.qna.dto.QnaResponse;
import com.findmyguideMember.member.qna.repository.QnaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class QnaService {
    private final QnaRepository qnaRepository;

    @Transactional
    public QnaResponse save(QnaRequest qnaRequest) {

        Qna save = qnaRepository.save(qnaRequest.toQna());
        return new QnaResponse(save);

    }

    @Transactional
    public QnaResponse update(Long qna_id,String title, String content) {
        Qna qna = qnaRepository.findById(qna_id).get();
        qna.setTitle(title);
        qna.setContent(content);
        // 맞는지 모르겠음
        return null;
    }

    public void delete(Qna qna) {
        qnaRepository.deleteById(qna.getId());
    }

}
