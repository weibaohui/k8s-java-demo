package com.example.k8s;

import com.example.k8s.entity.Task;
import com.example.k8s.mapper.TaskMapper;
import org.databene.contiperf.PerfTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class K8sApplicationTests {

    @Resource
    private TaskMapper taskMapper;


    @Test
    @PerfTest(invocations = 100, threads = 10)
    public void testSelect() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(("----- selectAll method test ------"));
            List<Task> taskList = taskMapper.selectList(null);
            Assertions.assertEquals(7, taskList.size());
            taskList.forEach(System.out::println);
        }

    }


}
