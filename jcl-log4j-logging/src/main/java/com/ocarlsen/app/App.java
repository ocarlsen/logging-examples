package com.ocarlsen.app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Demo app showcasing JCL logging framework with Log4j.
 */
public class App {

    private final Log log;

    public App() {
        log = LogFactory.getLog(getClass());
    }

    private void demoLogger() {

        log.fatal("fatal");
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");
        log.trace("trace");

        // Log an exception.
        RuntimeException ex = new RuntimeException("Oops!");
        log.warn(ex.getMessage(), ex);
    }

    public static void main(String[] args) {
        new App().demoLogger();
    }
}

