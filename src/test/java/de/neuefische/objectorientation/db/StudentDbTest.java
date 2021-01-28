package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDbTest {
    @Test
    public void studentDBTest(){

        // List being created and Deleted from
        StudentDb studentDataBase = new StudentDb(new HashMap<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        Student student3 = new Student("3", "Hartmut", "Dance");
        Student student4 = new Student("4", "Gandalf", "Witchcraft");
        Student student5 = new Student("5", "Voldemort", "Magic");
        studentDataBase.put(student1.getId(), student1);;
        studentDataBase.put(student2.getId(), student1);;
        studentDataBase.put(student3.getId(), student1);;
        studentDataBase.put(student4.getId(), student1);;
        studentDataBase.put(student5.getId(), student1);;
        // Remove Item with String ID 4
       studentDataBase.remove("4");
        //
        // List that is expected
        StudentDb studentDataBase2 = new StudentDb(new HashMap<>());
        studentDataBase2.put(student1.getId(), student1);;
        studentDataBase2.put(student2.getId(), student1);;
        studentDataBase2.put(student3.getId(), student1);;
        studentDataBase2.put(student5.getId(), student1);;
        // Compare Results
        assertEquals(studentDataBase, studentDataBase2);
    }

}