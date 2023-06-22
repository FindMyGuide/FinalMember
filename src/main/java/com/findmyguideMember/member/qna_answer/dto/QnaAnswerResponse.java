package com.findmyguideMember.member.qna_answer.dto;

import com.findmyguideMember.member.qna.enum_category.Category;
import com.findmyguideMember.member.qna_answer.domain.QnaAnswer;

import java.time.LocalDateTime;

public class QnaAnswerResponse {
    private String title;

    private String content;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    public QnaAnswerResponse(QnaAnswer qnaAnswer) {
        this.title =qnaAnswer.getTitle();
        this.content = qnaAnswer.getContent();
        this.createAt = qnaAnswer.getCreateAt();
        this.updateAt = qnaAnswer.getUpdateAt();
    }
}
