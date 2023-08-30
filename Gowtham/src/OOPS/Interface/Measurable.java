package OOPS.Interface;

interface Measurable {
    double getMeasure();
}

class Employee implements Measurable {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getMeasure() {
        return salary;
    }

public static double average(Measurable[] objects) {
    if (objects.length == 0) {
        return 0.0;
    }

    double sum = 0.0;
    for (Measurable obj : objects) {
        sum += obj.getMeasure();
    }

    return sum / objects.length;
}

public static void main(String[] args) {
    Employee[] employees = {
        new Employee(50000),
        new Employee(60000),
        new Employee(75000)
    };

    double averageSalary = average(employees);
    System.out.println("Average Salary: $" + averageSalary);
    }
}
