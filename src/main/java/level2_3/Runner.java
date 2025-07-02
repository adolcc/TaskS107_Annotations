package level2_3;

import level1.entities.Worker;

import java.io.IOException;

public class Runner {

    public void runLevel2Exercises() {

        System.out.println("===== Executing Level 2_3 - Exercise 1: Custom Annotation and JSON Serialization =====");

        Song mySong = new Song(
                "Another One Bites the Dust",
                "Queen",
                214.0
        );
        System.out.println("\nAttempting to serialize song: " + mySong);

        try {
            JsonSerializer.serializeObject(mySong);
        } catch (IOException e) {
            System.err.println("Error during JSON serialization: " + e.getMessage());
            e.printStackTrace();

        }

        System.out.println("\nAttempting to serialize a Worker (not annotated):");

        Worker workerToSerialize = new Worker("Test", "User", 15.0);

        try {
            JsonSerializer.serializeObject(workerToSerialize);
        } catch (IOException e) {
            System.err.println("Error during JSON serialization: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n--- End of Level 2_3 Demonstrations ---");
    }
}