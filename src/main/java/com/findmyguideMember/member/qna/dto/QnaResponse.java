package com.findmyguideMember.member.qna.dto;

import com.findmyguideMember.member.qna.domain.Qna;
import com.findmyguideMember.member.qna.enum_category.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class QnaResponse {
    private String title;

    private String content;

    private Category category;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    public QnaResponse(Qna qna){
        this.title = qna.getTitle();
        this.content = qna.getContent();
        this.category = qna.getCategory();
        this.createAt = qna.getCreateAt();
        this.updateAt = qna.getUpdateAt();
    }

}
