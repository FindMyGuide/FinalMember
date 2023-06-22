package com.findmyguideMember.member.qna_answer.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QnaAnswer {
    @Id
    @GeneratedValue
    @Column(name = "qna_answer_id")
    private Long id;

    private String title;

    private String content;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;
}
