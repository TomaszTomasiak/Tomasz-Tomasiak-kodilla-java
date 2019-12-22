package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {


    @Test
    public void testGetLastLog() {


        String lastLogResult = Logger.getInstance().getLastLog();

        Assert.assertEquals("Batman", lastLogResult);
    }
}
