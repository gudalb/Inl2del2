package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    String name;
    Teacher teacher;
    //List<Student> studentList;
    List<Attendance> attendanceList = new ArrayList<>();
    Program program;
    List<Subject> subjects = new ArrayList<>();



    Seminar (String name, Program program, List<Subject> subjects, Teacher teacher) {
        this.name = name;
        this.program = program;

        for(Subject subject: subjects) {
            this.subjects.add(subject);
        }


        this.teacher = teacher;
        teacher.seminarList.add(this);
    }

    void addStudentAttendance (Boolean attended, Student student) {

        for(Attendance attendance: attendanceList) {
            if (attendance.getStudent().getName().equals(student.getName()))
                return;
        }

        Attendance tempAttendance = new Attendance(attended, this, student );
        attendanceList.add(tempAttendance);
        student.attendSeminar(this);
    }


    boolean getStudentAttendance (Student student) {
        for(Attendance attendance: attendanceList) {
            if (attendance.getStudent().getName().equals(student.getName()))
                return true;
        }
        return false;
    }

    String getSeminarSubjects () {
        StringBuilder string = new StringBuilder();
        string.append("Subjects for seminar: " + name + "\n");
        for(Subject subject: subjects) {
            string.append(subject.getName() + " ");
        }
        return string.toString();
    }

    String attendanceString () {
        StringBuilder string = new StringBuilder();

        string.append(("Seminar: " + name + "\n"));

        for(Attendance attendance: attendanceList) {
            string.append(attendance + "\n");
        }

        return string.toString();
    }
    List<Attendance> getAttendanceList () {
        return attendanceList;
    }

    int getTotalAttendance () {
        int count = 0;

        for(Attendance attendance: attendanceList) {
            if (attendance.getAttendance())
                count++;
        }

        return count;
    }

    String getName () {
        return name;
    }

}
