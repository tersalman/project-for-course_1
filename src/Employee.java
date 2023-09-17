public class Employee {
    private String names;
    private float salary;
    private int departament;
    private static int checker = 0;
    private int id;

    public Employee(String names, float salary, int departament) {
        this.names = names;
        this.salary = salary;
        this.departament = departament;
        this.id = checker;
        checker++;

    }

    public String getNames() {
        return names;
    }

    public float getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }

    public int getId() {
        return id;
    }

    public void setSalary(float a) {
        salary = a;

    }

    public void setDepartament(int a) {
        departament = a;

    }

    @Override
    public String toString() {
        return "names='" + names +", salary=" + salary + ", departament=" + departament + ", id=" + id;
    }


}
