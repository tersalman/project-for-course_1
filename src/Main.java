public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee sasha = new Employee("Иванов Сша Андреевич", 54_000, 1);

        Employee olya = new Employee("Селезьнева Оля Сергеевна", 35_000, 4);

        Employee andrei = new Employee("Романов Андрей Васильевич", 86_000, 3);

        Employee ivan = new Employee("Иванов Иван Ивановив", 72_000, 1);

        employees[0]=sasha;
        employees[1]=olya;
        employees[2]=andrei;
        employees[3]=ivan;


        olya.setDepartament(5);
//        System.out.println(olya);

        Employee.printAll(employees);

        Employee.foundSalaryCountAndAverageNum(employees);

        System.out.println(Employee.foundMinSalary(employees));

        System.out.println(Employee.foundMaxSalary(employees));

        Employee.getAllNames(employees);
    }
}