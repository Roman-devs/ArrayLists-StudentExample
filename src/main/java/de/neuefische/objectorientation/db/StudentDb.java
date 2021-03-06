package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;

import java.util.*;

public class StudentDb {
    // Member Variables
//    private final ArrayList<Student> students;
    private final HashMap<String, Student> students;

    public StudentDb(HashMap<String, Student> students) {
        this.students = students;
    }
// private Student[] students;

//    public StudentDb(ArrayList<Student> students) {
//        this.students = students;
//    }
    public void put(Student student) throws RuntimeException{
        if(contains(student)) {
            throw new RuntimeException("The value for key - "  + student.getId() + " " + "- already exists!");
        }
        students.put(student.getId(), student);
    }

//    public void remove1(Student student) {
//        students.remove(student);
//        }
    public void remove(String id) {
                students.remove(id);
            }
    public HashMap<String, Student> map(){
        return students;
    }
    public Student getStudent(String id) {
        return students.get(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDb studentDb = (StudentDb) o;
        return Objects.equals(students, studentDb.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    public boolean contains(Student student){
        return students.containsKey(student.getId());
    }

    public Optional<Student>  findByID(String ID){
        if (students.containsKey(ID)){
            return Optional.of(students.get(ID));
        }
        return Optional.empty();
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

//    public boolean contains(String id) {
//        for (Student student : students) {
//            if (student.getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
