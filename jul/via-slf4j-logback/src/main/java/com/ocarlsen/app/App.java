package com.ocarlsen.app;

import org.slf4j.bridge.SLF4JBridgeHandler;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Demo app showcasing Java logging bridge to SLF4J framework.
 */
public class App {

    private final Logger logger;

    public App() {
        logger = Logger.getLogger(App.class.getName());
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

    /**
     * "Contrary to other bridging modules, namely acl-via-slf4j and log4j-via-slf4j,
     * which reimplement ACL and respectively log4j, the jul-to-slf4j module does not reimplement
     * the java.util.logging because packages under the java.* namespace cannot be replaced."
     *
     * @link https://www.slf4j.org/legacy.html#jul-to-slf4j
     * @link https://www.slf4j.org/api/org/slf4j/bridge/SLF4JBridgeHandler.html
     */
    private static void setupJulToSlf4j() {

        // Remove existing handlers attached to j.u.l root logger.
        SLF4JBridgeHandler.removeHandlersForRootLogger();

        // Add SLF4JBridgeHandler to j.u.l root logger.
        SLF4JBridgeHandler.install();
    }

    public static void main(String[] args) throws IOException {
        setupJulToSlf4j();

        new App().demoLogger();
    }
}
