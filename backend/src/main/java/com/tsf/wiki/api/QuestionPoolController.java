package com.tsf.wiki.api;

import com.tsf.wiki.service.QuestionPoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/questionPool")
public class QuestionPoolController {

    @Resource
    private QuestionPoolService questionPoolService;
}
