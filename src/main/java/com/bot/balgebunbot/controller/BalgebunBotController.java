package com.bot.balgebunbot.controller;

import com.bot.balgebunbot.service.ApplicationService;
import com.bot.balgebunbot.service.UniversalHandler;
import com.bot.balgebunbot.service.state.StateHelper;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;

@LineMessageHandler
public class BalgebunBotController {

    @Autowired
    private LineMessagingClient lineMessagingClient;

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private UniversalHandler universalHandler;

    @Autowired
    private StateHelper stateHelper;

}
