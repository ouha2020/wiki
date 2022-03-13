package com.tsf.wiki.api;

import com.tsf.wiki.service.DocService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/doc")
public class DocController {

    @Resource
    private DocService docService;
}
