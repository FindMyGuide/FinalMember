package com.findmyguideMember.member.qna_answer.dto;

import com.findmyguideMember.member.qna_answer.domain.QnaAnswer;
import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QnaAnswerRequest {

    private String title;

    private String content;

//    private LocalDateTime createAt;

//    private LocalDateTime updateAt;

    public QnaAnswer toQnaAnswer() {
        return QnaAnswer.builder()
                .title(title)
                .content(content)
                .build();
    }
}
