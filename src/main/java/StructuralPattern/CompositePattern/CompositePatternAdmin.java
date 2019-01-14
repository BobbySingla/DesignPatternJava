package StructuralPattern.CompositePattern;

public class CompositePatternAdmin {
    public static void main(String[] args) {

        Employee CEO = new Employee("Robert", "CEO", 100000);
        Employee HeadSales = new Employee("Ram", "HeadSales", 60000);

        Employee Manager = new Employee("Hari", "Manager", 40000);
        Employee Manager1 = new Employee("HariParshad", "Manager", 40000);
        System.out.println(CEO);
        CEO.add(HeadSales);
        HeadSales.add(Manager);
        HeadSales.add(Manager1);

        for (Employee employee : CEO.getSubordinates()) {
            System.out.println(employee);
            for (Employee employee1 : HeadSales.getSubordinates()) {
                System.out.println(employee1);
            }
        }


    }
}
