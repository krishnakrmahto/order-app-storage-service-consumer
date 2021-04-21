package com.course.kafka.broker.consumer;

import com.course.kafka.broker.message.PromotionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UppercasePromotionListener
{
    @KafkaListener(topics = "t.commodity.promotion-uppercase")
    public void consume(PromotionMessage message)
    {
        log.info("Consuming uppercase PromotionMessage: {}", message);
    }
}
