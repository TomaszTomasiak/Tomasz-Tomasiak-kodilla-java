package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Task in progress: " + toString());
        return false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (!executeTask()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "DrivingTask [" + taskName + " " +  where + " " + using +"]";
    }
}
