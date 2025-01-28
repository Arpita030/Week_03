package singly_linked_list.StudentRecordManagement;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Specific Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Display All Students");
            System.out.println("7. Update Student Grade");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number, Name, Age, Grade: ");
                    studentList.addAtBeginning(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                    break;
                case 2:
                    System.out.print("Enter Roll Number, Name, Age, Grade: ");
                    studentList.addAtEnd(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                    break;
                case 3:
                    System.out.print("Enter Position, Roll Number, Name, Age, Grade: ");
                    studentList.addAtPosition(scanner.nextInt(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                    break;
                case 4:
                    System.out.print("Enter Roll Number to Delete: ");
                    studentList.deleteByRollNumber(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Roll Number to Search: ");
                    Student student = studentList.searchByRollNumber(scanner.nextInt());
                    if (student != null) {
                        System.out.println("Found: Roll Number: " + student.rollNumber + ", Name: " + student.name +
                                ", Age: " + student.age + ", Grade: " + student.grade);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 6:
                    studentList.displayAll();
                    break;
                case 7:
                    System.out.print("Enter Roll Number and New Grade: ");
                    studentList.updateGrade(scanner.nextInt(), scanner.next());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
