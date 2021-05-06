package com.firm.micro.listeners;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FirmListener {
	@RabbitListener(bindings = @QueueBinding(value = @Queue(name = "firm-response-q", durable = "true", autoDelete = "false"), exchange = @Exchange(name = "firm-response-exc", durable = "true", autoDelete = "false", type = ExchangeTypes.DIRECT), key = "firm.response"))
	public void handleSMSMessage(final String str) {
		System.out.println("Received Response : " + str);
	}

}
