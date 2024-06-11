package com.sc.andbag.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Controller
public class Test {

    @GetMapping("/")
    @ResponseBody
    public String test(){
        return "Hi";
    }
}
