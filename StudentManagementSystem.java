package com.elevateLabs;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    
    static class Student {
        private int id;
        private String name;
        private double marks;

        public Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getMarks() { return marks; }

        public void setName(String name) { this.name = name; }
        public void setMarks(double marks) { this.marks = marks; }

        
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
        }
    }

    
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n-- Student List --");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = scanner.nextInt();
        Student student = findStudentById(id);

        if (student != null) {
            scanner.nextLine(); 
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new marks: ");
            double marks = scanner.nextDouble();

            student.setName(name);
            student.setMarks(marks);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = scanner.nextInt();
        Student student = findStudentById(id);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}