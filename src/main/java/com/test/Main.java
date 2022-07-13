package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("hello world.");
        LOGGER.info("hello world");
        LOGGER.warn("hello world");
        LOGGER.error("hello world");
    }
}
