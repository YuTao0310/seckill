package com.example.seckilldemo;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class RabbitmqTest {
    
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test1() {
        for (int i = 0; i < 100; i++)
            rabbitTemplate.convertAndSend("seckillExchange", "test", "just test" + i);
    }
}