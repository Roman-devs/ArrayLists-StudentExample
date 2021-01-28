package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDbTest {
    @Test
    public void studentDBTest(){

        // List being created and Deleted from
        StudentDb studentDataBase = new StudentDb(new ArrayList<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        Student student3 = new Student("3", "Hartmut", "Dance");
        Student student4 = new Student("4", "Gandalf", "Witchcraft");
        Student student5 = new Student("5", "Voldemort", "Magic");
        studentDataBase.add(student1);;
        studentDataBase.add(student2);;
        studentDataBase.add(student3);;
        studentDataBase.add(student4);;
        studentDataBase.add(student5);;
        // Remove Item with Strin ID 4
        studentDataBase.remove("4");
        //
        // List that is expected
        StudentDb studentDataBase2 = new StudentDb(new ArrayList<>());
        studentDataBase2.add(student1);;
        studentDataBase2.add(student2);;
        studentDataBase2.add(student3);;
        studentDataBase2.add(student5);
        // Compare Results
        assertEquals(studentDataBase.list(), studentDataBase2.list());
    }

}