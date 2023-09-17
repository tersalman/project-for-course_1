public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    static int index = 0;

    public EmployeeBook() {

    }


    public void printAll() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }


    public void foundSalaryCountAndAverageNum() {
        float total = 0;
        int index = 0;
        double averageCount = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                index++;
                total = total + employee.getSalary();
            }

        }
        averageCount = total / index;
        System.out.println(total);
        System.out.println(averageCount);

    }


    public void getAllNames() {
        for (Employee employee : this.employees) {
            if (employee != null) {
                System.out.println(employee.getNames());
            }
        }
    }

    public void setProcentInSalary(float a) {
        float b = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                b = employee.getSalary() * a;
                employee.setSalary(employee.getSalary() + b);
            }
        }
    }

    public String foundAPerWithMinSalary() {
        float minSalary = 1000_000f;
        String a = null;
        for (Employee employee : this.employees) {
            if (employee == null) {
                break;
            } else {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    a = employee.getNames();
                }
            }
        }
        return a;

    }

    public String foundAPerWithMaxSalary() {
        float maxSalary = 0;
        String a = null;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    a = employee.getNames();
                }
            }
        }
        return a;
    }

    public String foundInDepartamentAPerWithMinSalary(int departament) {
        float minSalary = 100_000f;
        String a = null;
        for (Employee employee : this.employees) {
            if (employee == null) {
                break;
            } else if (employee.getDepartament() == departament) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    a = employee.getNames();
                }
            }
        }
        return a;
    }

    public String foundInDepartamentAPerWithMaxSalary(int departament) {
        float maxSalary = 0;
        String a = null;
        for (Employee employee : this.employees) {
            if (employee == null) {
                break;
            } else if (employee.getDepartament() == departament) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    a = employee.getNames();
                }
            }
        }
        return a;
    }

    public float foundTotalSumOfSalryInDepartament(int departament) {
        float total = 0;
        for (Employee employee : this.employees) {
            if (employee == null) {
                break;
            } else if (employee.getDepartament() == departament) {
                total += employee.getSalary();

            }
        }
        return total;
    }

    public float foundAveregeSumOfSalryInDepartament(int departament) {
        float total = 0;
        int index = 0;
        float averegeSum = 0;
        for (Employee employee : this.employees) {
            if (employee == null) {
                break;
            } else if (employee.getDepartament() == departament) {
                total += employee.getSalary();
                index++;
            }
        }
        averegeSum = total / index;
        return averegeSum;
    }

    public void setProcentInSalaryInDepartament(float procent, int departament) {
        float b = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.getDepartament() == departament) {
                    b = employee.getSalary() * procent;
                    employee.setSalary(employee.getSalary() + b);
                }
            }
        }
    }

    public void printPerInDepartament(int departament) {
        System.out.println("Employees in departament " + departament);
        for (Employee employee : this.employees) {

            if (employee != null) {
                if (employee.getDepartament() == departament) {
                    System.out.println("Name " + employee.getNames() + " Salary " + employee.getSalary() + " Id " + employee.getId());
                }
            }
        }

    }

    public void findSalarySmallerThanNum(float border) {
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.getSalary() < border) {
                    System.out.println(employee.getNames());
                }
            }
        }

    }
    public void findSalaryBiggerThanNum(float border) {
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.getSalary() >= border) {
                    System.out.println(employee.getNames());
                }
            }
        }
    }

    public void addEmployee(String name, float salary, int departament) {
        for (int i = 0;i< this.employees.length; i++) {
            if (this.employees[i] == null) {
               this.employees[i] = new Employee(name, salary, departament);
                break;
            }
        }
    }

    public boolean deleteEmployee(int id) {
        for (Employee employee : employees) {
            if (employee!=null) {
                if (employee.getId() == id) {
                    employee=null;
                    return true;
                }
            }
        }
        return false;
    }

    public void changeEmployeeSalary(String name, float salary) {
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.getNames().equalsIgnoreCase(name)) {
                    employee.setSalary(salary);
                }
            }
        }
    }

    public void changeEmployeeDepartament(String name, int dep) {
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (employee.getNames().equalsIgnoreCase(name)) {
                    employee.setDepartament(dep);
                }
            }
        }
    }



    public void printAllOfDep() {
        int dep =1;
        for (Employee employee : this.employees) {
            System.out.println("Pers in departament "+ dep);
            for (Employee employee1 : this.employees) {
                if (employee1!=null) {
                    if (employee1.getDepartament() == dep) {

                        System.out.println("Name: "+ employee1.getNames());
                    }
                }
            }
            if (dep == 5) {
                break;
            }
            dep++;

        }
    }

}
