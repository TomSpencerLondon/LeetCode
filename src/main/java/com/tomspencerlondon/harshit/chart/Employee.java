package com.tomspencerlondon.harshit.chart;

class Employee {
    private int position;
    private String name;
    private String title;

    public Employee(int position, String name, String title) {
        this.position = position;
        this.name = name;
        this.title = title;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }


}