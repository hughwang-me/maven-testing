package com.uwjx.maven.module1.controller;

import com.uwjx.maven.commons.model.BookModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class M1TestController {

    @GetMapping(value = "m1")
    public String run(){
        log.warn("m1 - run");
        BookModel bookModel = new BookModel();
        bookModel.setId(1);
        bookModel.setName("book1");
        return bookModel.toString();
    }
}
