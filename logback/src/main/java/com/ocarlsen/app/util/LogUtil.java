package com.ocarlsen.app.util;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * This class encapsulates functionality normally in SLF4J.
 */
public class LogUtil {

    private static final LoggerContext loggerContext = new LoggerContext();
    private static final ContextInitializer contextInitializer = new ContextInitializer(loggerContext);

    public static Logger getLogger(Class<?> clazz) {
        return loggerContext.getLogger(clazz);
    }

    public static void autoConfig() throws JoranException {
        contextInitializer.autoConfig();
    }
}
