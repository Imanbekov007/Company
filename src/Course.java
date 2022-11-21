import java.util.Arrays;

public class Course {
    private String programming;
   private Person[]groups;
    private Instructor instructors;
   private Mentor[]mentors;

    public String getProgramming() {
        return programming;
    }

    @Override
    public String toString() {
        return "Course{" +
                "programming='" + programming + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", instructors=" + instructors +
                ", mentors=" + Arrays.toString(mentors) +
                '}';
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public Person[] getGroups() {
        return groups;
    }

    public void setGroups(Person[] groups) {
        this.groups = groups;
    }

    public Instructor getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor instructors) {
        this.instructors = instructors;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Course(String programming, Person[] groups, Instructor instructors, Mentor[] mentors) {
        this.programming = programming;
        this.groups = groups;
        this.instructors = instructors;
        this.mentors = mentors;
    }
}

