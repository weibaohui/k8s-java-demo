package com.example.k8s.controller;

import com.example.k8s.entity.Task;
import com.example.k8s.mapper.TaskMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author weibh
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{world}")
    public String hello(@PathVariable String world) {
        return String.format("hello %s", world);
    }

    @Resource
    private TaskMapper taskMapper;

    @GetMapping("/tt")
    public void tt() {
        for (int i = 0; i < 1; i++) {
            List<Task> taskList = taskMapper.selectList(null);
            taskList.forEach(System.out::println);
        }
    }

}
