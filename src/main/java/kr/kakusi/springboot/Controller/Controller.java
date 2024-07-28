package kr.kakusi.springboot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String index() {
        System.out.println("hello world");
        return "hello world";
    }
    @GetMapping("/test")
    public String test() {
        String a = "테스트1입니다." ;
        return a;
    }
    @PostMapping("/test2")
    public String test2() {
        return "test2";
    }
}
