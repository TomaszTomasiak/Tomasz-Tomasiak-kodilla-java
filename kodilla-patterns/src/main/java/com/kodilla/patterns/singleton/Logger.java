package com.kodilla.patterns.singleton;

public final class Logger {
    private static Logger logger = null;
    private String lastLog = "Batman";

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;

    }

    private void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

}
