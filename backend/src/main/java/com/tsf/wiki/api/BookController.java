package com.tsf.wiki.api;

import com.tsf.wiki.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookService bookService;
}
