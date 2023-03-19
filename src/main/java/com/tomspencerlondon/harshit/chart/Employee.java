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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (position != employee.position) return false;
        if (!name.equals(employee.name)) return false;
        return title.equals(employee.title);
    }

    @Override
    public int hashCode() {
        int result = position;
        result = 31 * result + name.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position=" + position +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}