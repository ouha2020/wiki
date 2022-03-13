package com.tsf.wiki.api;

import com.tsf.wiki.service.OnlineToolsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/onlineTools")
public class OnlineToolsController {

    @Resource
    private OnlineToolsService onlineToolsService;
}
