package com.mycom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.mycom.myapp.dto.BookDto;



@Controller
public class BookController {

  
    @GetMapping(value="/bookList")
    public String bookList(Model model) {
   
   
        model.addAttribute("bookDto", new BookDto(1, "오늘의 운세", "오늘은 맑음", 20));
       
        
        return "bookList"; 
    }
}