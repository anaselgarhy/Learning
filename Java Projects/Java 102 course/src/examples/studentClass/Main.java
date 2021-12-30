package examples.studentClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        try{
            System.out.print("Please enter student name: ");
            student.setName(input.next());
            System.out.print("Please enter student age: ");
            student.setAge(input.nextInt());
            System.out.print("Please enter student department: ");
            student.setDepartment(input.next());
            System.out.print("Please enter student GPA: ");
            student.setGPA(input.nextFloat());
            student.printInfo();
        } catch(OverFlowNumber e){
            System.err.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.err.println("The input not valid number");
        } finally{
            input.close();
        }
    }
}
