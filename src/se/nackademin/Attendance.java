package se.nackademin;

public class Attendance {
    boolean attendance;
    Seminar seminar;
    Student student;





    Attendance(boolean attended, Seminar seminar, Student student) {
        this.attendance = attended;
        this.seminar = seminar;
        this.student = student;
    }



    boolean getAttendance () {
        return attendance;
    }

    Student getStudent () {
        return student;
    }

    void registerAttendance () {
        attendance = true;
    }

    void removeAttendance () {
        attendance = false;
    }

    @Override
    public String toString() {
        return "Student: " + student.getName() + " Attended: " + attendance;
    }
}
