package com.demo.controller;


import com.demo.pojo.Weiuser;
import com.demo.config.utiles.ExcelUtiles;
import com.demo.service.WeiuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ExcelConrtroller {

    @Autowired
    WeiuserService weiuserService;

    @RequestMapping("export")
    public void export(HttpServletResponse response){

        List<Weiuser> list = weiuserService.selectAll();
        //Workbook workbook = ExcelUtiles.exportExcel(new ExportParams("信息","表格1"),Weiuser.class,list);
        ExcelUtiles.exportExcel(list,"信息","表格1",Weiuser.class,"信息.xls",response);
    }

    @RequestMapping(value = "importExcel",method = RequestMethod.POST)
    @ResponseBody
    public String importExcel(@RequestParam("textFile")MultipartFile file){
        System.out.println(file);
        System.out.println(file);
        List<Weiuser> list = ExcelUtiles.importExcel(file,0,1,Weiuser.class);
        int i = weiuserService.insertAll(list);
        if (i>0){
            return "导入成功";
        }
        return "导入失败";
    }

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
