public class Main {
    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook();
        employees.addEmployee("Иванов Сaша Андреевич", 54_000F, 1);
        employees.addEmployee("Селезьнева Оля Сергеевна", 35_000F, 4);
        employees.addEmployee("Романов Андрей Васильевич", 86_000F, 3);
        employees.addEmployee("Иванов Иван Иванович", 72_000F, 1);
        employees.addEmployee("Tereschenko Salman Antonovich", 40_000F,4);
        employees.addEmployee("Yablochkin vlad ivanovich",60_000f,5);


        employees.changeEmployeeSalary("Tereschenko Salman Antonovich",100000);



       employees.printAll();

       employees.foundSalaryCountAndAverageNum();





        employees.getAllNames();


        System.out.println(employees.foundAPerWithMinSalary());
        System.out.println(employees.foundAPerWithMaxSalary());

        System.out.println(employees.foundInDepartamentAPerWithMaxSalary(1));

        System.out.println(employees.foundAveregeSumOfSalryInDepartament(1));

        employees.printAllOfDep();


        System.out.println(employees.deleteEmployee(0));


        employees.printAll();
    }
}