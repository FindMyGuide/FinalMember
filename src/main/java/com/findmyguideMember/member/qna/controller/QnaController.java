package com.findmyguideMember.member.qna.controller;

import com.findmyguideMember.member.qna.dto.QnaRequest;
import com.findmyguideMember.member.qna.dto.QnaResponse;
import com.findmyguideMember.member.qna.service.QnaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/qna")
public class QnaController {

    private QnaService qnaService;

    @PostMapping
    public ResponseEntity<QnaResponse> register(
            @RequestBody final QnaRequest qnaRequest) {
        QnaResponse qnaResponse = qnaService.save(qnaRequest);
        return ResponseEntity.ok().body(qnaResponse);
    }
}
