package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Program {
    String name;
    ProgramCoordinator programCoordinator;
    List<Student> studentList = new ArrayList<>();
    List<Seminar> seminarList = new ArrayList<>();

    Program (String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addSeminar(Seminar seminar) {
        seminarList.add(seminar);
    }

    void setProgramCoordinator(ProgramCoordinator PC) {
        this.programCoordinator = PC;
    }

    void addStudent (Student student) {
        studentList.add(student);
    }

    List<Student> getStudents () {
        return studentList;
    }

    int getStudentCount () {
        int count = 0;

        for(Student student: studentList) {
            count++;
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("Program: " + name + "\n" +
                        "Coordinator: " + programCoordinator.name + "\n" +
                        "Students: " + "\n");

        for(Student student: studentList) {
            string.append(student.name + "\n");
        }

        return string.toString();

    }
}
