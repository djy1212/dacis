package yully.dacis.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
    @GetMapping("/jinjumungo")
    public String jinjumungo() {
        System.out.println("jinjumungo");
        return "jinjumungo";
    }
}
