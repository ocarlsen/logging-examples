package com.ocarlsen.app;

import org.apache.log4j.Logger;

/**
 * Demo app showcasing Log4j logging.
 */
public class App {

    private final Logger logger;

    private App() {
        this.logger = Logger.getLogger(getClass());
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
