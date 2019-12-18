package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {
    String name;
    List<Teacher> teacherList;
    Program program;

    ProgramCoordinator (String name, Program program) {
        this.name = name;
        teacherList = new ArrayList<>();
        this.program = program;
        program.setProgramCoordinator(this);
    }

    void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    Program getProgram () {
        return program;
    }

    Teacher findTeacher(String name) {

        for(Teacher t: teacherList) {
            if(t.name.equalsIgnoreCase(name)) {
                return t;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Program Coordinator: " + name + " Responsible for program: " + program.getName();
    }
}
