package com.findmyguideMember.member.qna.dto;

import com.findmyguideMember.member.qna.domain.Qna;
import com.findmyguideMember.member.qna.enum_category.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QnaRequest {

    private String title;

    private String content;

    private Category category;

//    private LocalDateTime createAt;

//    private LocalDateTime updateAt;

    public Qna toQna() {
        return Qna.builder()
                .title(title)
                .content(content)
                .category(category)
                .build();
    }
}
