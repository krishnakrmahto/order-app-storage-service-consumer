package com.course.kafka.broker.service;

import com.course.kafka.broker.message.DiscountMessage;
import com.course.kafka.broker.message.PromotionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@KafkaListener(topics = "t.commodity.promotion.and.discount")
public class PromotionListener
{
    @KafkaHandler
    public void consumePromotion(PromotionMessage message)
    {
        log.info("Consuming PromotionMessage: {}", message);
    }

    @KafkaHandler
    public void consumeDiscount(DiscountMessage message)
    {
        log.info("Consuming DiscountMessage: {}", message);
    }
}
