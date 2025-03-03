package com.rodrigvf.GameZone.infra.beans;

import com.rodrigvf.GameZone.core.gateway.EventGateway;
import com.rodrigvf.GameZone.core.usecases.CreateEventCase;
import com.rodrigvf.GameZone.core.usecases.CreateEventCaseImpl;
import com.rodrigvf.GameZone.core.usecases.GetEventCase;
import com.rodrigvf.GameZone.core.usecases.GetEventCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEventCase createEventCase(EventGateway eventGateway) {
        return new CreateEventCaseImpl(eventGateway);
    }

    @Bean
    public GetEventCase getEventCase(EventGateway eventGateway) {
        return new GetEventCaseImpl(eventGateway);
    }
}
