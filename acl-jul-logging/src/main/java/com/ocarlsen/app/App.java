package com.ocarlsen.app;

import com.ocarlsen.app.util.LogUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.logging.Level;

/**
 * Demo app showcasing ACL logging framework with default Java logging.
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

    public static void main(String[] args) throws IOException {
        // Could also set 'java.util.logging.config.file' system property on command line.
        LogUtil.configureFrom("logging.properties");
        new App().demoLogger();
    }
}
