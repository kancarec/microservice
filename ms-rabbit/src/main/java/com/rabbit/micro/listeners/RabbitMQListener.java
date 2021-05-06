package com.rabbit.micro.listeners;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.rabbit.micro.data.SmsRequest;

@Component
public class RabbitMQListener {

	@RabbitListener(bindings = @QueueBinding(value = @Queue(name = "firm-sms-q", durable = "true", autoDelete = "false"), exchange = @Exchange(name = "firm-exc", durable = "true", autoDelete = "false", type = ExchangeTypes.DIRECT), key = "firm.sms"))
	@SendTo("firm-response-exc/firm.response")
	public String handleSMSMessage(final SmsRequest str) {
		System.out.println("Received SMS : " + str);
		return "SMS Sent Successfully : " + str;
	}

}
