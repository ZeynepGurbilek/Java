public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary,int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        double taxValue;
        if (this.salary <= 1000) {
            taxValue = 0;
        } else {
            taxValue= this.salary*0.03;
        }
        return taxValue;
    }

    double bonus(){
        int bonus;
        if(workHours <= 40){
            bonus = 0;
        }else{
            bonus = (workHours - 40)*30;
        }
        return bonus;
    }

    double raiseSalary() {
        int gap = 2021 - this.hireYear;
        double raise = 0;
        if(gap <= 9){
            raise = (this.salary*5)/100;
        }else if(gap > 9 && gap <= 19){
            raise = (this.salary*10)/100;
        }else if(gap > 19){
            raise = (this.salary*15)/100;
        }
        return raise;
    }

    void printInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hours : " + this.workHours);
        System.out.println("Year of start : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Increase in salary : " + raiseSalary());
        System.out.println("Salary with taxes and bonuses : " + (this.salary + bonus() - tax()));
        System.out.println("Total salary : " + (raiseSalary() + this.salary - tax() + bonus()));

    }




}




