package com.ocarlsen.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo app showcasing SLF4J logging framework with a SimpleLogger binding.
 */
public class App {

    private final Logger logger;

    public App() {
        logger = LoggerFactory.getLogger(getClass());
    }

    private void demoLogger() {

        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");

        // Log an exception.
        RuntimeException ex = new RuntimeException("Oops!");
        logger.warn(ex.getMessage(), ex);
    }

    public static void main(String[] args) {
        new App().demoLogger();
    }
}
