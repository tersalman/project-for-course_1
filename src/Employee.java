public class Employee {
    private String names;
    private int salary;
    private int departament;
    private static int checker = 0;
    private int id;

    public Employee(String names, int salary, int departament) {
        this.names = names;
        this.salary = salary;
        this.departament = departament;
        this.id = checker;
        checker++;

    }

    public String getNames() {
        return names;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int a) {
        salary = a;

    }

    public void setDepartament(int a) {
        departament = a;

    }

    @Override
    public String toString() {
        return " Name " + names + " Salary " + salary + " Departament " + departament + " Id " + id;
    }

    public static void printAll(Employee[] a) {
        for (Employee employee : a) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void foundSalaryCountAndAverageNum(Employee[] a) {
        int total = 0;
        int index = 0;
        double averageCount = 0;
        for (Employee employee : a) {
            if (employee != null) {
                index++;
                total = total + employee.salary;
            }

        }
        averageCount = total / index;
        System.out.println(total);
        System.out.println(averageCount);

    }

    public static int foundMinSalary(Employee[]a) {
        int minSalary = 1000000;
        for (Employee employee : a) {
            if (employee != null) {
                if (employee.salary < minSalary) {
                    minSalary = employee.salary;
                }
            }
        }
        return minSalary;
    }


    public static int foundMaxSalary(Employee[]a) {
        int maxSalary = -1;
        for (Employee employee : a) {
            if (employee != null) {
                if (employee.salary > maxSalary) {
                    maxSalary = employee.salary;
                }
            }
        }
        return maxSalary;
    }

    public static void getAllNames(Employee[]a) {
        for (Employee employee : a) {
            if (employee != null) {
                System.out.println(employee.getNames());
            }
        }
    }

}
