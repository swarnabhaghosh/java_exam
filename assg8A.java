import java.util.Scanner;

class Employee{
    int eid;
    String name;
    double basic;
    String city;
    void take_details(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee id : ");
        eid = sc.nextInt();

        System.out.println("Enter employee name : ");
        name = sc.next();

        System.out.println("Enter basic salary : ");
        basic = sc.nextDouble();

        System.out.println("Enter city : ");
        city = sc.next();
    }

    void show_details(){
        System.out.println("employee id = " + eid);
        System.out.println("employee name = " + name);
        System.out.println("basic salary = " + basic);
        System.out.println("city = " + city);
    }

    void show_gross_sal(){
    }
}

class Company1 extends Employee{
    void show_gross_sal(){
        double agp, merged_basic, da, hra, gross;

        agp = basic * 0.40;
        merged_basic = basic + agp;
        da = merged_basic * 0.25;
        hra = merged_basic * 0.10;

        gross = merged_basic + da + hra;

        System.out.println("Gross Salary : " + gross);
    }
}

class Company2 extends Employee{
    void show_gross_sal(){
        double agp, merged_basic, da, hra, gross;

        agp = basic * 0.50;
        merged_basic = basic + agp;
        da = merged_basic * 0.50;
        hra = merged_basic * 0.15;

        gross = merged_basic + da + hra;

        System.out.println("Gross Salary : " + gross);
    }
}

public class assg8A {
    public static void main(String[] args) {
        Company1 comp1 = new Company1();
        comp1.take_details();
        comp1.show_details();
        comp1.show_gross_sal();

        Company2 comp2 = new Company2();
        comp2.take_details();
        comp2.show_details();
        comp2.show_gross_sal();
    }
}
