package de.neuefische.objectorientation;

import de.neuefische.objectorientation.db.StudentDb;
import de.neuefische.objectorientation.model.Student;

import java.util.ArrayList;

public class AppMain {


    public static void main(String[] args) {

        //
        StudentDb studentDataBase = new StudentDb(new ArrayList<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        Student student3 = new Student("3", "Hartmut", "Dance");
        Student student4 = new Student("4", "Gandalf", "Witchcraft");
        Student student5 = new Student("5", "Voldemort", "Magic");
        //
        studentDataBase.add(student1);;
        studentDataBase.add(student2);;
        studentDataBase.add(student3);;
        studentDataBase.add(student4);;
        studentDataBase.add(student5);;
        // Print All Students included in StudentDataBase before deletion
        printAllStudents(studentDataBase);
        // Select ID to be removed
        String toBeDeleted = "4";
        // Remove Student from ArrayList StudentDataBase
        studentDataBase.remove(toBeDeleted);
        // Print Out the new modified version of ArrayList StudentDataBase
        System.out.println(" ");
        System.out.println("After Deletion of ID" + " " + toBeDeleted+":");
        System.out.println(" ");
        printAllStudents(studentDataBase);

    }
    private static void printAllStudents(StudentDb studentDataBase) {
        for (Student student : studentDataBase.list()) {
            System.out.println("ID: " + student.getId() + " " +student.getName() + " " + "Subject:"  + " " + student.getSubject());
        }
    }
}
