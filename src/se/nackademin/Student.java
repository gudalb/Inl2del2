package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Seminar> seminarList = new ArrayList<>();

    Student (String name) {
        this.name = name;
    }

    void attendSeminar (Seminar seminar) {
        seminarList.add(seminar);
    }

    String getName () {
        return  name;
    }

    String getAttendanceString () {
        StringBuilder string = new StringBuilder();

        string.append("Student attendance for: " + name + "\n");

        for(Seminar seminar: seminarList) {
            string.append(seminar.getName() + " Attended: " + seminar.getStudentAttendance(this) + "\n");
        }

        return string.toString();
    }

    List<Seminar> getSeminarsAttended () {
        List<Seminar> attendendSeminars = new ArrayList<>();

        for(Seminar seminar: seminarList) {
                if(seminar.getStudentAttendance(this))
                    attendendSeminars.add(seminar);

        }

        return attendendSeminars;
    }

    @Override
    public String toString() {
        return "Student name: " + name;
    }
}
