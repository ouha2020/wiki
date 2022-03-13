package com.tsf.wiki.api;

import com.tsf.wiki.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;
}
