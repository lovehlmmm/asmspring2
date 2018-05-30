package com.asm.fpt.asm.controller;

import com.asm.fpt.asm.entity.Attendance_Slots;
import com.asm.fpt.asm.model.SpringModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@Controller

public class StudentsManagerController {
@Autowired

    private SpringModel springModel;
    @RequestMapping(path = "/attend/list", method = RequestMethod.GET)
    public String getList(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        Page<Attendance_Slots> pagination = springModel.findAll( PageRequest.of(page - 1, limit));
        model.addAttribute("pagination", pagination);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        model.addAttribute("datetime", Calendar.getInstance().getTime());
        return "attend-list";
    }

}
