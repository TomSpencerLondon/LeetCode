package com.tomspencerlondon.harshit.chart;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    int vertices;

    LinkedList<Employee>[] employees;

    private Employee ceo;
    public Graph(int vertices) {
        this.vertices = vertices;
        employees = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            employees[i] = new LinkedList<>();
        }
    }

    public boolean addEmployee(Employee manager, Employee employee) {
        if (manager.getPosition() == 0) {
            ceo = manager;
        }

        employees[manager.getPosition()].add(employee);

        return true;
    }

    public void showOrgChart() {
        System.out.println("Org Chart");

        for (int i = 0; i < vertices; i++) {
            if (employees[i] != null) {
                if (i == 0) {
                    System.out.print("|" + ceo.getTitle() + "| => ");

                    Iterator<Employee> iterator = employees[i].iterator();

                    while (iterator.hasNext()) {
                        System.out.print("[" + iterator.next().getTitle() + "]");

                        if (iterator.hasNext()) {
                            System.out.print(" -> ");
                        }
                    }
                    System.out.println();
                } else {
                    if (employees[i - 1] != null && !employees[i - 1].isEmpty()) {
                        System.out.print("|" + employees[i - 1].get(0).getTitle() + "| => ");
                    }

                    Iterator<Employee> iterator = employees[i].iterator();

                    while (iterator.hasNext()) {
                        System.out.print("[" + iterator.next().getTitle() + "]");

                        if (iterator.hasNext()) {
                            System.out.print(" -> ");
                        } else {
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
