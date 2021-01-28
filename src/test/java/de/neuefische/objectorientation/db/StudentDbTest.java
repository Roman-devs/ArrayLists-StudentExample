package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDbTest {
    @Test
    @DisplayName("Testing remove Method")
    public void studentDBTest() {

        // List being created and Deleted from
        StudentDb studentDataBase = new StudentDb(new HashMap<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        Student student3 = new Student("3", "Hartmut", "Dance");
        Student student4 = new Student("4", "Gandalf", "Witchcraft");
        Student student5 = new Student("5", "Voldemort", "Magic");
        studentDataBase.put(student1);
        studentDataBase.put(student2);
        studentDataBase.put(student3);
        studentDataBase.put(student4);
        studentDataBase.put(student5);
        ;
        // Remove Item with String ID 4
        studentDataBase.remove("4");
        //
        // List that is expected
        StudentDb studentDataBase2 = new StudentDb(new HashMap<>());
        studentDataBase2.put(student1);
        ;
        studentDataBase2.put(student2);
        ;
        studentDataBase2.put(student3);
        ;
        studentDataBase2.put(student5);
        ;
        // Compare Results
        assertEquals(studentDataBase, studentDataBase2);
    }

    @Test
    @DisplayName("Testing Exception try/catch")
    public void studentDBExceptionTest() {
        // List being created and Deleted from
        StudentDb studentDataBase = new StudentDb(new HashMap<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        Student student3 = new Student("3", "Hartmut", "Dance");
        Student student4 = new Student("4", "Gandalf", "Witchcraft");
        Student student5 = new Student("5", "Voldemort", "Magic");
        studentDataBase.put(student1);
        studentDataBase.put(student2);
        studentDataBase.put(student3);
        studentDataBase.put(student4);
        studentDataBase.put(student5);
        // Remove Item with String ID 4

        try {
            studentDataBase.put(student3);
            fail();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            assertEquals(e.getMessage(), "The value for key - 3 - already exists!");
        }

    }

    @Test
    @DisplayName("Testing the Optional return type in case the return is valid and not null")
    public void studentDBOptionalTestFindByIDFail(){
        StudentDb studentDataBase = new StudentDb(new HashMap<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        studentDataBase.put(student1);
        studentDataBase.put(student2);
        Optional<Student> actual = studentDataBase.findByID("3");
        Optional<Student> expected = Optional.empty();
        assertEquals(actual, expected);


    }

    @Test
    @DisplayName("Testing the Optional return type in case the return is invalid")
    public void studentDBOptionalTestFindByID(){
        StudentDb studentDataBase = new StudentDb(new HashMap<>());
        Student student1 = new Student("1", "Frank", "Sport");
        Student student2 = new Student("2", "Horst", "Tabletennis");
        studentDataBase.put(student1);
        studentDataBase.put(student2);
        Optional<Student> actual = studentDataBase.findByID("2");
        Optional<Student> expected = Optional.of(student2);
        assertEquals(actual, expected);


    }
}