package com.linkedin.javacodechallenges;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {
                List<String> output = new ArrayList<String>();
                for (String student : students) {
                    int count = 0;
                    for (Map.Entry<String, List<String>> location : attendeesMapping.entrySet()) {
                        System.out.println(location.getKey());
                        
                        if(location.getValue().contains(student)){
                            count++;
                        }  
                    }  
                    if (count < 2 ) {
                        output.add(student);
                    }
                }    
        return output;
    }

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }

}
