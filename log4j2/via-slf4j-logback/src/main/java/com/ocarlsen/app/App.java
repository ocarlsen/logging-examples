package com.ocarlsen.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demo app showcasing Log4j2 logging bridge to SLF4J framework.
 */
public class App {

    private final Logger logger;

    private App() {
        this.logger = LogManager.getLogger(getClass());
    }

    private void demoLogger() {

        logger.fatal("fatal");
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
