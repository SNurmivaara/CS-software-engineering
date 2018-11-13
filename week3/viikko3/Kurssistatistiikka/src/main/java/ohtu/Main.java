package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.IntStream;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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

        // fetch ohtu-course data
        url = "https://studies.cs.helsinki.fi/courses/ohtu2018/stats";
        String ohtuText = Request.Get(url).execute().returnContent().asString();
        JsonParser parser = new JsonParser();
        JsonObject ohtuParsed = parser.parse(ohtuText).getAsJsonObject();

        //fetch rails-course data
        url = "https://studies.cs.helsinki.fi/courses/rails2018/stats";
        String railsText = Request.Get(url).execute().returnContent().asString();
        JsonObject railsParsed = parser.parse(railsText).getAsJsonObject();

        int ohtuHours = 0;
        int ohtuStudents = 0;
        int ohtuExercises = 0;
        for (int i = 1; i <= ohtuParsed.size(); i++) {
            JsonObject ohtu = ohtuParsed.getAsJsonObject(Integer.toString(i));
            ohtuHours += ohtu.get("hour_total").getAsInt();
            ohtuStudents += ohtu.get("students").getAsInt();
            ohtuExercises += ohtu.get("exercise_total").getAsInt();
        }

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

            if(Objects.equals(course.getName(), "ohtu2018")) {
                System.out.println("\n  Total of " + ohtuStudents + " students on course with " + ohtuExercises + " exercises done in " + ohtuHours + " hours.");
            }
        }

    }
}