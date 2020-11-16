/**
 * The GNU General Public License
 * Copyright (c) 2020-2020 zhangt2333@gmail.com
 **/

package cn.edu.sdu.qd.oj.balloon.controller;

import cn.edu.sdu.qd.oj.balloon.model.Volunteer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class IndexController {
    @GetMapping("/{path}")
    public String index(@PathVariable("path") String path) {
        return path.isEmpty() ? "index" : path;
    }
}