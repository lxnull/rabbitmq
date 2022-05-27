package com.lx.config;

public class TtlQueueConfig {

    // 普通交换机
    public static final String X_EXCHANGE = "X";
    // 普通队列
    public static final String QUEUE_A = "QA";
    public static final String QUEUE_B = "QB";
    // 死信交换机
    public static final String Y_DEAD_LETTER_EXCHANGE = "Y";
    // 死信队列
    public static final String DEAD_LETTER_QUEUE = "QD";

    // 声明普通交换机
    // 声明 xExchange
    @Bean("xExchange")
    public DirectExchange xExchange(){
        return new DirectExchange(X_EXCHANGE);
    }
}
