package StringsAssignment;

import java.util.Random;

public class RadomStringBuilder {
    
  public static void main(String[] args) {      //10
        int length = 10; // Specify the desired length of the random string
        StringBuilder randomString = new StringBuilder();

        // Define the characters that can be used in the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~!@#$%^&*()_+";

        // Create a Random object
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // Generate a random index within the range of the characters string
            int randomIndex = random.nextInt(characters.length());

            // Append the randomly selected character to the StringBuilder
            randomString.append(characters.charAt(randomIndex));
        }

        // Convert the StringBuilder to a String
        String result = randomString.toString();

        System.out.println("Random String: " + result);
    }
}
