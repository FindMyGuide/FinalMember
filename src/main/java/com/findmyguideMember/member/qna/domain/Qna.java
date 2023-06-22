package com.findmyguideMember.member.qna.domain;

import com.findmyguideMember.member.qna.enum_category.Category;
import com.findmyguideMember.member.qna_answer.domain.QnaAnswer;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Qna {
    @Id
    @GeneratedValue
    @Column(name = "qna_id")
    private Long id;

    private String title;

    private String content;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    // 맞는지 모르겠음
    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany
    private List<QnaAnswer> qnaAnswerList = new ArrayList<>();
}
