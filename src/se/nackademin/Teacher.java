package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    String name;
    List<Seminar> seminarList = new ArrayList<>();
    ProgramCoordinator programCoordinator;

    Teacher (ProgramCoordinator programCoordinator, String name) {
        this.programCoordinator = programCoordinator;
        this.name = name;
    }


    void addSeminar (Seminar seminar) {
        seminarList.add(seminar);
    }

    String getName () {
        return name;
    }

    List<Seminar> getSeminarHistory () {
        return seminarList;
    }

    String getSeminarHistoryString () {
        StringBuilder string = new StringBuilder();

        string.append("Seminar history for: " + name + "\n");

        for(Seminar seminar: seminarList) {
            string.append(seminar.getName() + "\n");
        }

        return string.toString();
    }

    Seminar getCurrentSeminar () {
        return seminarList.get(seminarList.size()-1);
    }

    @Override
    public String toString() {
        return "Teacher: " + name;
    }
}
