package com.smaato.CountService.service.impl;

import com.smaato.CountService.service.CountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl implements CountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountServiceImpl.class);

    @Override
    public void processCount(int uniqueRequests) {
        LOGGER.info("{}", uniqueRequests);
    }
}
