package com.wz.controller;

import com.wz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class CateggoryController {
    @Autowired
    CategoryService categoryService;


}
