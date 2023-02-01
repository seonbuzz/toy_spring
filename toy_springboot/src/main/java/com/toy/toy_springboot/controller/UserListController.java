package com.toy.toy_springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.toy.toy_springboot.service.UserListService;
import com.toy.toy_springboot.util.UserListUtil;

@Controller
@RequestMapping(value = "/UserList") // view 이름. 주소
public class UserListController {

    @Autowired
    UserListService userListService;

    @Autowired // 필요한 의존 객체의 '타입'에 해당하는 빈을 찾아 주입.
    UserListUtil userListUtil;

    // 회원 수정
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public ModelAndView edit(ModelAndView modelAndView) {// 인자에서 설정
        modelAndView.setViewName("userList/edit");
        return modelAndView;
    }

    @RequestMapping(value = { "list" })
    public ModelAndView list(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        Object resultMap = userListService.getList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("UserList/list");
        // view에 전달할 값을 설정
        // 파라미터가 많아지게 되면 일일이 파라미터를 지정하는게 귀찮아짐. 이를 Map으로 간단하게 받아올 수 있음.
        // 단점 : 개발한 이외의 사람들이 유지보수하기에는 어려움이 있음.
        return modelAndView;
    }
}
