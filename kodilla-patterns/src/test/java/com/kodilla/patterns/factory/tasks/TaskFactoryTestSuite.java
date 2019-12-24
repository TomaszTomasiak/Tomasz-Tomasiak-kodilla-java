package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        boolean isTaskExecutedResult = shopping.isTaskExecuted();
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals(true, isTaskExecutedResult);
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        boolean isTaskExecutedResult = painting.isTaskExecuted();
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals(false, isTaskExecutedResult);
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        boolean isTaskExecutedResult = driving.isTaskExecuted();
        //Then
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertEquals(false, isTaskExecutedResult);
    }
}
