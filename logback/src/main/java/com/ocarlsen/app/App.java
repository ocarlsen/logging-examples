package com.ocarlsen.app;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.joran.spi.JoranException;
import com.ocarlsen.app.util.LogUtil;

/**
 * Demo app showcasing Logback logging.
 */
public class App {

    private final Logger logger;

    private App() {
        logger = LogUtil.getLogger(getClass());
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

    public static void main(String[] args) throws JoranException {
        // Try to use Logback without using SLF4J LoggerFactory.
        LogUtil.autoConfig();
        new App().demoLogger();
    }
}
