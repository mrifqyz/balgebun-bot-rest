package com.bot.balgebunbot;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
@LineMessageHandler
public class BalgebunBotApplication extends SpringBootServletInitializer {

    @Autowired
    private LineMessagingClient lineMessagingClient;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BalgebunBotApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BalgebunBotApplication.class, args);
    }

    @EventMapping
    public void handleTextEvent(MessageEvent<TextMessageContent> messageEvent){
        String message = messageEvent.getMessage().getText().toLowerCase();
        String[] pesanSplit = message.split(" ");
        if(pesanSplit[0].equals("b.help")){
            String replyToken = messageEvent.getReplyToken();
            reply(replyToken, "No commands available yet!");
        }
    }

    private void reply(String replyToken, String answer){
        TextMessage message = new TextMessage(answer);
        try {
            lineMessagingClient
                    .replyMessage(new ReplyMessage(replyToken, message))
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Ada error saat ingin membalas chat");
        }
    }

}
