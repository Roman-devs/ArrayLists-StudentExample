package de.neuefische.objectorientation;

import de.neuefische.objectorientation.db.StudentDb;
import de.neuefische.objectorientation.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AppMain {


    public static void main(String[] args) {

        //
        StudentDb studentDataBase = new StudentDb(new HashMap<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        Student student3 = new Student("3", "Hartmut", "Dance");
        Student student4 = new Student("4", "Gandalf", "Witchcraft");
        Student student5 = new Student("5", "Voldemort", "Magic");
        //
        studentDataBase.put(student1.getId(), student1);;
        studentDataBase.put(student2.getId(), student1);;
        studentDataBase.put(student3.getId(), student1);;
        studentDataBase.put(student4.getId(), student1);;
        studentDataBase.put(student5.getId(), student1);;
        // Print All Students included in StudentDataBase before deletion
//        printAllStudents(studentDataBase);
//        // Select ID to be removed
//        String toBeDeleted = "4";
//        // Remove Student from ArrayList StudentDataBase
//        studentDataBase.remove(toBeDeleted);
//        // Print Out the new modified version of ArrayList StudentDataBase
//        System.out.println(" ");
//        System.out.println("After Deletion of ID" + " " + toBeDeleted+":");
//        System.out.println(" ");

    }
//    private static void printAllStudents(StudentDb studentDataBase) {
//        for (Student student : studentDataBase.getValue()) {
//            System.out.println("ID: " + student.getId() + " " +student.getName() + " " + "Subject:"  + " " + student.getSubject());
//        }
//    }
}
