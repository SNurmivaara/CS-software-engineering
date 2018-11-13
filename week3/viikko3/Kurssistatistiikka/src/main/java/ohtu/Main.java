package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.IntStream;

import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // ÄLÄ laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        // fetch student data and convert to gson
        String url = "https://studies.cs.helsinki.fi/courses/students/"+studentNr+"/submissions";
        String bodyText = Request.Get(url).execute().returnContent().asString();
        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        // fetch course info and covert to gson
        url = "https://studies.cs.helsinki.fi/courses/courseinfo";
        String courseText = Request.Get(url).execute().returnContent().asString();
        Course[] courses = mapper.fromJson(courseText, Course[].class);

        System.out.println("Student number " + studentNr);

        int totalHours = 0;
        int totalAssingments = 0;
        for (Course course : courses) {
            System.out.println("\nCourse name: " + course.getCourseInfo() + "\n");
            for (Submission submission : subs) {
                if (Objects.equals(submission.getCourse(), course.getName())) {
                    System.out.println("  week " + submission.getWeek() + ":");
                    System.out.println("    completed " + submission.getNumberOfExercises() + "/" + course.numberOfExercisesOnAWeek(submission.getWeek()) + " assingments spending " + submission.getHours() + " hours. Completed exercises: " + submission.listExercises());
                    totalHours += submission.getHours();
                    totalAssingments += submission.getNumberOfExercises();
                }
            }
            System.out.println("\n  Total of " + totalAssingments + "/" + IntStream.of(course.getExercises()).sum() + " assignments done in " + totalHours + " hours.");
            totalAssingments = 0;
            totalHours = 0;
        }

    }
}