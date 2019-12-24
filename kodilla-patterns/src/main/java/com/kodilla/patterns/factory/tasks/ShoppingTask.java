package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final int quantity;
    boolean taskStatus = false;


    public ShoppingTask(String taskName, String whatToBuy, int quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("The task: [" + taskName + "-> to buy: " + quantity + " cans of " + whatToBuy + "] has done");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        taskStatus = true;
            return taskStatus;
        }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public int getQuantity() {
        return quantity;
    }
}
