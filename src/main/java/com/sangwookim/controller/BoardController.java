package com.sangwookim.controller;


import com.sangwookim.domain.Board;
import com.sangwookim.service.BoardService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j
@Controller
@RequestMapping("/board/*")
public class BoardController {

    @Autowired
    private BoardService service;

    @ResponseBody
    @RequestMapping(value ="/list/{category}", method= RequestMethod.GET)
    public ResponseEntity<List<Board>> getList(@PathVariable("category")String category){
        log.info("category = " + category);
        return new ResponseEntity<>(service.getList(category), HttpStatus.OK);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@RequestParam("category") String category, Model model) {
        model.addAttribute("category", category);
        log.info("category = " + category);
        return "board/list";
    }

}
