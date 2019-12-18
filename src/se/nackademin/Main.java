package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Program programEtt = new Program("Ett program");
        ProgramCoordinator progCoo = new ProgramCoordinator("Benny", programEtt);
        Teacher teacher1 = new Teacher(progCoo, "Franz");

        Student student1 = new Student("Kalle", programEtt);
        Student student2 = new Student("Eva", programEtt);

        Subject chemistry = new Subject("chemistry");

        List<Subject> seminar1subjects = new ArrayList<>();
        seminar1subjects.add(new Subject("History"));
        seminar1subjects.add(new Subject("Chemistry"));

        Seminar seminar1 = new Seminar("Seminar1", programEtt,seminar1subjects, teacher1);

        // skapa attendance för seminar1
        seminar1.addStudentAttendance(true, student1);
        seminar1.addStudentAttendance(false, student2);


        // program en coordinator ansvarar för
        System.out.println(progCoo);

        // attendance för ett seminar
        System.out.println(seminar1.attendanceString());

        // antal elever i programEtt
        System.out.println("Student count programEtt: " + programEtt.getStudentCount());

        // lägga till ny Student i program
        Student student3 = new Student("Fred", programEtt);

        // attendance för student
        System.out.println(student1.getAttendanceString());

        // seminarier för lärare
        System.out.println(teacher1.getSeminarHistoryString());

        // seminar ämnen
        System.out.println(seminar1.getSeminarSubjects());






    }
}
