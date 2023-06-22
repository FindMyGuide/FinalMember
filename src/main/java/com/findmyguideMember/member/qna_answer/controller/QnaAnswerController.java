package com.findmyguideMember.member.qna_answer.controller;

import com.findmyguideMember.member.qna_answer.dto.QnaAnswerRequest;
import com.findmyguideMember.member.qna_answer.dto.QnaAnswerResponse;
import com.findmyguideMember.member.qna_answer.service.QnaAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/qna_anwer")
public class QnaAnswerController {
    private QnaAnswerService qnaAnswerService;

    @PostMapping
    public ResponseEntity<QnaAnswerResponse> register(
            @RequestBody final QnaAnswerRequest qnaAnswerRequest) {
        QnaAnswerResponse qnaAnswerResponse = qnaAnswerService.save(qnaAnswerRequest);
        return ResponseEntity.ok().body(qnaAnswerResponse);
    }

}
