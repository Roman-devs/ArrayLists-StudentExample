package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;

import java.util.ArrayList;

public class StudentDb {
    // Member Variables
    private final ArrayList<Student> students;

    // private Student[] students;

    public StudentDb(ArrayList<Student> students) {
        this.students = students;
    }


    public void add(Student student) {
        students.add(student);
    }


//    public void remove1(Student student) {
//        students.remove(student);
//        }

    public void remove(String id) {
        for (Student student : list()){
            if (student.getId().equals(id)){
                students.remove(student);
            }
        }
    }

    public ArrayList<Student> list(){
        return students;
    }

//        Student[] updatedData = new Student[students.length - 1];
//
//        boolean removed = false;
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getId().equals(id)) {
//                removed = true;
//            } else {
//                int updatedIndex = removed ? i - 1 : i;
//                updatedData[updatedIndex] = students[i];
//            }
//        }
//
//        students = updatedData;
//    }

    public boolean contains(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
