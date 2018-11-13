package ohtu;

import java.util.stream.IntStream;

public class Course {
    private String name;
    private String fullName;
    private int week;
    private String term;
    private int year;
    private int[] exercises;

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setExercises(int[] exercises) {
        this.exercises = exercises;
    }

    public String getName() {
        return this.name;
    }

    public String getCourseInfo() {
        return fullName + " " + term + " " + year;
    }

    public int getWeek() {
        return week;
    }

    public int[] getExercises() {
        return exercises;
    }

    public int numberOfExercisesOnAWeek(int week) {
        return exercises[week];
    }

}
