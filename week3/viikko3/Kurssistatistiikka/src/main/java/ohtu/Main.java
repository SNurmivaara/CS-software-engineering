package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // ÄLÄ laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "https://studies.cs.helsinki.fi/courses/students/"+studentNr+"/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();

        System.out.println("Student number " + studentNr + "\n");

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        int totalHours = 0;
        int totalAssingments = 0;
        for (Submission submission : subs) {
            System.out.println(" " + submission);
            totalHours += submission.getHours();
            totalAssingments += submission.getNumberOfExercises();
        }

        System.out.println("\nTotal: " + totalAssingments + " assignments in " + totalHours + " hours.");

    }
}