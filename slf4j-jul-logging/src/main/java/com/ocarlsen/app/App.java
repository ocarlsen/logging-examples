package com.ocarlsen.app;

import com.ocarlsen.app.util.LogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Demo app showcasing SLF4J logging framework with a Java logging binding.
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

    public static void main(String[] args) throws IOException {
        // Could also set 'java.util.logging.config.file' system property on command line.
        LogUtil.configureFrom("logging.properties");
        new App().demoLogger();
    }
}
