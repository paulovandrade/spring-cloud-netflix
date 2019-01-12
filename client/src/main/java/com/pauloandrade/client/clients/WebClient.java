package com.pauloandrade.client.clients;

import com.pauloandrade.client.dto.MessageWebDTO;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "web")
@RibbonClient("web")
public interface WebClient {

    @GetMapping("/messages")
    MessageWebDTO getWebMessage();
}
