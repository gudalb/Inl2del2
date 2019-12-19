package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Program {
    String name;
    ProgramCoordinator programCoordinator;
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


    int getStudentCount () {
        int count = 0;

        for(Seminar seminar: seminarList) {
            for(Attendance attendance: seminar.getAttendanceList()){
                count++;
            }
        }

        return count;
    }

    public String getStudents() {
        StringBuilder string = new StringBuilder();

        string.append("Program: " + name + "\n" +
                "Coordinator: " + programCoordinator.name + "\n" +
                "Students: " + "\n");

        for(Seminar seminar: seminarList) {
            string.append("Seminar: " + seminar.getName() + "\n");
            for (Attendance attendance : seminar.getAttendanceList()) {
                string.append(attendance.student.name + "\n");
            }
        }
        return string.toString();

    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("Program: " + name + "\n" +
                        "Coordinator: " + programCoordinator.name + "\n" +
                        "Students: " + "\n");

        for(Seminar seminar: seminarList) {
            string.append("Seminar: " + seminar.getName() + "\n");
            for (Attendance attendance : seminar.getAttendanceList()) {
                string.append(attendance.student.name + "\n");
            }
        }
        return string.toString();

    }
}
