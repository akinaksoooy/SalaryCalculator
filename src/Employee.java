public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear ){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax (){
        if(this.salary > 1000){
            return this.salary * 0.03;
        }
        System.out.println("The tax is " + this.salary);
        return 0;
    }
    public int bonus (){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }else {
            return 0;
        }
    }
    public int raiseSalary(){
        int year = 2021;
        if ((year - this.hireYear) < 10){
            return this.salary *= 0.05;
        }
        else if ((year - this.hireYear) > 9 && (year - this.hireYear < 20)){
            return this.salary *= 0.10;
        }
        else if ((year - this.hireYear) > 19) {
            return this.salary *= 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
