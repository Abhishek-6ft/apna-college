package day02;
import java.util.Scanner;

class Student {
    public String name;
    public int roll_no;
    public double grade;

    // Constructor
    public Student(String name, int roll_no, double grade) {
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 100;
        Student[] students = new Student[MAX_STUDENTS];
        int studentCount = 0;
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu");
            System.out.println("1. Add Student");
            System.out.println("2. Display all Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    if (studentCount < MAX_STUDENTS) {
                        System.out.print("Enter Student Roll No: ");
                        int roll_no = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Student Grade: ");
                        double grade = sc.nextDouble();

                        students[studentCount++] = new Student(name, roll_no, grade);
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Student lis1t is full.");
                    }
                }
                case 2 -> {
                    if (studentCount == 0) {
                        System.out.println("No students to display.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println("ID: " + students[i].getRollNo() +
                                    ", Name: " + students[i].getName() +
                                    ", Grade: " + students[i].getGrade());
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter Student Roll No to Search: ");
                    int searchRollNo = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getRollNo() == searchRollNo) {
                            System.out.println("ID: " + students[i].getRollNo() +
                                    ", Name: " + students[i].getName() +
                                    ", Grade: " + students[i].getGrade());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                }
                case 4 -> {
                    running = false;
                    System.out.println("Exiting the program.");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
