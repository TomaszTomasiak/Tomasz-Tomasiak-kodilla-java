package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private boolean taskStatus = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Task in progress: " + toString());
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        taskStatus = false;
        return taskStatus;
    }


    @Override
    public String toString() {
        return "DrivingTask [" + taskName + " " + where + " " + using + "]";
    }
}
