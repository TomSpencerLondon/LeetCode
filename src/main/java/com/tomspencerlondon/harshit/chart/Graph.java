package com.tomspencerlondon.harshit.chart;

import java.util.*;

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

    // Pass optional parameter of list of employees
    // empty if last level
    // delete the positions
    // link people - VP1 starting from CEO for example
    public boolean addEmployee(Employee manager, Employee employee) {
        if (manager.getPosition() == 0) {
            ceo = manager;
        }

        employees[manager.getPosition()].add(employee);

        return true;
    }

    // CEO -> CTO -> VP1 -> E1 -> SE1A
    //                      ^
    // CEO -> CTO -> VP1 -> E2 -> SE1E
    //                      ^

    // VP2, SE1A
    // CEO -> CPO -> VP2
    //         ^
    // CEO -> CTO -> VP1 -> E1 -> SE1A
    //         ^
    // one or both employees not present -> return no common manager

    public Employee commonManager(Employee employeeOne, Employee employeeTwo) {
        List<Employee> employeeOnePath = pathTo(employeeOne);
        List<Employee> employeeTwoPath = pathTo(employeeTwo);
        Employee manager = null;
        for (int i = 0; i < Math.min(employeeOnePath.size(), employeeTwoPath.size()); i++) {
            if (employeeOnePath.get(i).equals(employeeTwoPath.get(i))) {
                manager = employeeOnePath.get(i);
            }
        }

        return manager;
    }

    private List<Employee> pathTo(Employee employee) {
        boolean[] isVisited = new boolean[vertices];
        List<Employee> path = new ArrayList<>();
        path.add(ceo);
        return findPath(ceo, employee, isVisited, path, new ArrayList<>());
    }

    private List<Employee> findPath(Employee current, Employee employee, boolean[] isVisited, List<Employee> path, List<Employee> result) {
        if (current.equals(employee)) {
            result.addAll(path);
            return path;
        }

        isVisited[current.getPosition()] = true;

        for (Employee neighbour : employees[current.getPosition()]) {
            if (!isVisited[neighbour.getPosition()]) {
                path.add(neighbour);
                findPath(neighbour, employee, isVisited, path, result);

                if (neighbour.equals(employee)) {
                    break;
                }

                path.remove(neighbour);
            }
        }

        return result;
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
