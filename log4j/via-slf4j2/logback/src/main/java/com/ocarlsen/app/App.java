package com.ocarlsen.app;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Demo app showcasing Log4j logging bridge to SLF4J2 framework.
 */
public class App {

    private final Logger logger;

    private App() {
        logger = Logger.getLogger(getClass().getName());
    }

    private void demoLogger() {

        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");

        // Log an exception.
        RuntimeException ex = new RuntimeException("Oops!");
        logger.log(Level.WARNING, ex.getMessage(), ex);
    }

    public static void main(String[] args) throws IOException {
        new App().demoLogger();
    }
}
