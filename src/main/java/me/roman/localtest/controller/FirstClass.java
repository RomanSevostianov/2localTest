package me.roman.localtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstClass {

    @GetMapping
    public String start() {
        return "Приложение запущено!";
    }

    @GetMapping({"path/info"})
    public String info() {
        return "имя ученика,\nназвание проекта,\nдату создания проекта,\nописание проекта.";
    }

    @GetMapping({"path/to/info"})
    public String page(@RequestParam String page) {
        return "Page: " + page;
    }

}
