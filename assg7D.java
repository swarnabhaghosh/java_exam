import java.util.Scanner;

class Name{
    String first;
    String middle;
    String last;
    Name(String first, String middle, String last){
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
}

class DOB{
    int day;
    int month;
    int year;
    DOB(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Student{
    int id;
    Name name;
    String gender;
    DOB dob;
    int[] marks = new int[3]; //Engish, Maths, CS

    Student(Scanner sc, int id, String first, String middle, String last, String gender, int day, int month, int year){
        this.id = id;
        name = new Name(first, middle, last);
        this.gender = gender;
        dob = new DOB(day, month, year);
        System.out.println("Enter marks : ");
        for(int i = 0; i < 3; i++){
            marks[i] = sc.nextInt();
        }
    }

    public void showDetails(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name.first + " " + name.middle + " " + name.last);
        System.out.println("Gender : " + gender);
        System.out.println("Date of Birth : " + dob.day + "/" + dob.month + "/" + dob.year);
        System.out.println("marks of English : " + marks[0]);
        System.out.println("marks of Mathematics : " + marks[1]);
        System.out.println("marks of Computer Science : " + marks[2]);
    }
}

public class assg7D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = sc.nextInt();

        Student student[] = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter ID : ");
            int id = sc.nextInt();
            System.out.println("Enter First Name : ");
            String first = sc.next();
            System.out.println("Enter Middle Name : ");
            String middle = sc.next();
            System.out.println("Enter Last Name : ");
            String last = sc.next();
            System.out.println("Enter Gender : ");
            String gender = sc.next();
            System.out.println("Enter Date of Birth : ");
            int day = sc.nextInt();
            System.out.println("Enter Month of Birth : ");
            int month = sc.nextInt();
            System.out.println("Enter Year of Birth : ");
            int year = sc.nextInt();
            
            student[i] = new Student(sc, id, first, middle, last, gender, day, month, year);
        }

        System.out.println("for search ID wise -> 1");
        System.out.println("for search First name wise -> 2");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter ID : ");
                int search_ID = sc.nextInt();
                for(int i = 0; i < n; i++){
                    if(student[i].id == search_ID){
                        student[i].showDetails();
                    }
                }
                break;
            case 2:
                System.out.println("enter first name : ");
                String search_name = sc.next();
                for(int i = 0; i < n; i++){
                    if(student[i].name.first.equals(search_name)){
                        student[i].showDetails();
                    }
                }
                break;
            default:
                break;
        }
    }
}


