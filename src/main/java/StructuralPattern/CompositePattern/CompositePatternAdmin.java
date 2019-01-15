package StructuralPattern.CompositePattern;

public class CompositePatternAdmin {
    public static void main(String[] args) {
        Employee CEO = new Employee("Robert", "CEO", 100000);
        Employee HeadManager = new Employee("Ram", "HeadManager", 60000);
        Employee Manager = new Employee("Hari", "Manager", 40000);
        Employee Manager1 = new Employee("HariParshad", "Manager", 40000);
        System.out.println(CEO);
        CEO.add(HeadManager);
        HeadManager.add(Manager);
        HeadManager.add(Manager1);
        for (Employee employee : CEO.getSubordinates()) {
            System.out.println(employee);
            for (Employee employee1 : HeadManager.getSubordinates()) {
                System.out.println(employee1);
            }
        }
    }
}