package com.tomspencerlondon.harshit.chart;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEmployee(
                new Employee(0, "Tim", "CEO"),
                new Employee(1, "Harry", "CTO"));

        graph.addEmployee(
                new Employee(0, "Tim", "CEO"),
                new Employee(2, "John", "CPO"));

        graph.addEmployee(
                new Employee(0, "Tim", "CEO"),
                new Employee(3, "Don", "CFO"));

        graph.addEmployee(
                new Employee(1, "Harry", "CTO"),
                new Employee(4, "Dave", "VP1"));

        graph.addEmployee(
                new Employee(1, "Harry", "CTO"),
                new Employee(5, "Will", "VP2"));

        graph.addEmployee(
                new Employee(4, "Dave", "VP1"),
                new Employee(6, "Serge", "E1"));

        graph.addEmployee(
                new Employee(4, "Dave", "VP1"),
                new Employee(7, "Gerry", "E2"));

        graph.addEmployee(
                new Employee(7, "Gerry", "E2"),
                new Employee(8, "Kevin", "SE1"));


        graph.showOrgChart();

        System.out.println(graph.commonManager(
                new Employee(8, "Kevin", "SE1"),
                new Employee(6, "Serge", "E1")));
    }
}
