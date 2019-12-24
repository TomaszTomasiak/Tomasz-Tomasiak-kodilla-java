package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean taskStatus = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.taskStatus = taskStatus;
    }

    @Override
    public void executeTask() {
        System.out.println("To do: [" + taskName + " " + whatToPaint + " in " + color +"]");
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
}
