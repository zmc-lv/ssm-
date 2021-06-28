package com.zmc.controller;

import com.zmc.pojo.Items;
import com.zmc.service.ItemsService;
import com.zmc.service.impl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 包名：com.zmc.controller
 *
 * @author zmc
 * 日期：2021/6/28  15:52
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    //@RequestMapping(value = "/list",method = RequestMethod.GET)

    @GetMapping("/list")
    public String list(Model model){
        List<Items> list = itemsService.findAll();
        //塞给页面
        model.addAttribute("items",list);
        //返回视图
        return "items";
    }
}
