package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final int quantity;
    private


    public ShoppingTask(String taskName, String whatToBuy, int quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        System.out.println("The task: [" + taskName + "-> to buy: " + quantity + " cans of " + whatToBuy + "] has done");
        return true;
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

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public int getQuantity() {
        return quantity;
    }
}