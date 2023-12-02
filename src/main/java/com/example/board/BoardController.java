package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/board/list")
    public String boardList(Model model) {
        model.addAttribute("list", boardService.getBoardList());
        return "boardlist";
    }

    @RequestMapping(value = "/board/add", method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }


}
