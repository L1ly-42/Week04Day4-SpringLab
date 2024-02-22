package com.example.task_01.models;

public class GreetingPojo{
    private String name;
    private String timeOfDay;

    public GreetingPojo(){}

    public GreetingPojo(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}