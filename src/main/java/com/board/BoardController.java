package com.board;
// ㅇㅁㄹㅇ
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/board/list")
    public String boardlist(Model model){
        model.addAttribute("list",boardService.getBoardList());
        return "list";
    }
    @RequestMapping(value = "/board/add",method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }
    @RequestMapping(value = "/board/addok",method = RequestMethod.POST )
    public String addPosrOK(BoardVO vo){
        int i =boardService.insertBoard(vo);
        if(i==0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공!!");
        return "redirect:list";
    }
    @RequestMapping(value = "/board/editform/{id}",method = RequestMethod.GET)
    public String editpost(@PathVariable("id")int id, Model model){
        BoardVO boardVO = boardService.getBoard(id);
        model.addAttribute("u",boardVO);
        return "editpost";
    }
    @RequestMapping(value = "/board/editok",method = RequestMethod.POST)
    public String editPostOk(BoardVO vo){
        if(boardService.updateBoard(vo)==0)
            System.out.println("데이터 수정 실패");
        else
            System.out.println("데이터 수정 성공!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/board/deleteok/{id}",method = RequestMethod.GET)
    public String deletePostOk(@PathVariable("id") int id){
        if(boardService.deleteBoard(id)==0)
            System.out.println("데이터 삭제 실패");
        else
            System.out.println("데이터 삭제 성공!!");
        return "redirect:../list";
    }

}
