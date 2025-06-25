Student Management System - Java (CLI) ✅ Description This is a Command-Line Interface (CLI) based Student Record Management System written in Java. It allows users to Add, View, Update, and Delete student records using simple menu-driven options.

💻 Features Add new student with ID, Name, and Marks

View all students

Update existing student details by ID

Delete a student record by ID

Simple and interactive CLI interface

Uses ArrayList for storing data in memory

🛠️ Tools & Technologies Language: Java

IDE: VS Code / IntelliJ IDEA Community Edition

Java Version: Java 8 or above

Data Structure: ArrayList

📂 Project Structure plaintext Copy Edit StudentManagementSystem.java README.md 🚀 How to Run

Compile the Java program bash Copy Edit javac StudentManagementSystem.java
Run the program bash Copy Edit java StudentManagementSystem
Follow the on-screen menu: text Copy Edit ==== Student Management System ====
Add Student
View Students
Update Student
Delete Student
Exit Enter your choice: 📄 Sample Student Record Format Each student has:
ID (int)

Name (String)

Marks (double)

Example:

yaml Copy Edit ID: 101, Name: Alice, Marks: 89.5

📋 Program Structure
1. Student Class (Inner Class)
Fields: id, name, marks
Includes:
Constructor
Getters and Setters
toString() method
2. CLI Menu
Options:
1 ➝ Add Student
2 ➝ View Students
3 ➝ Update Student
4 ➝ Delete Student
5 ➝ Exit
3. Core Functions
addStudent() - Adds a new student
viewStudents() - Displays all students
updateStudent() - Modifies student by ID
deleteStudent() - Deletes student by ID
findStudentById() - Searches for student by ID
# StudentManagementSystemm
