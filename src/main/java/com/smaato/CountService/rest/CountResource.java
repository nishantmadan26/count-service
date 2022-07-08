package com.smaato.CountService.rest;

import com.smaato.CountService.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/smaato")
public class CountResource {

    @Autowired
    private CountService countService;

    @PostMapping(value = "/count", params = "uniqueRequests")
    public void countRequest(@RequestParam(value = "uniqueRequests") int uniqueRequests) {
        countService.processCount(uniqueRequests);
    }
}
