import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class Exaa {

        public static void main(String[] args) {
            String urlString = "https://coderbyte.com/api/challenges/json/rest-get-simple";

            try {
                // Create a URL object
                URL url = new URL(urlString);

                // Open a connection to the URL
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                // Set the request method to GET
                conn.setRequestMethod("GET");

                // Get the response code
                int responseCode = conn.getResponseCode();

                // Check if the response code is 200 (HTTP OK)
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    // Read the response into a StringBuilder
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    // Parse the response to extract the hobbies
                    String responseBody = response.toString();
                    String hobbies = extractHobbies(responseBody);

                    // Print the hobbies property
                    System.out.println(hobbies);
                } else {
                    System.out.println("GET request failed. Response Code: " + responseCode);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Method to extract hobbies from the JSON response
        private static String extractHobbies(String responseBody) {
            // Extract the part after the "hobbies" key
            String key = "\"hobbies\":\"";
            int startIndex = responseBody.indexOf(key) + key.length();

            if (startIndex == -1) {
                return ""; // Hobbies key not found
            }

            int endIndex = responseBody.indexOf("\"", startIndex);
            if (endIndex == -1) {
                endIndex = responseBody.length(); // If no closing quote found, go to end of string
            }

            String hobbies = responseBody.substring(startIndex, endIndex);

            // Return hobbies, replacing escaped commas with actual commas
            return hobbies.replace("\\,", ",");
        }
    }

