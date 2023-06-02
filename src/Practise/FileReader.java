package Practise;
import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class FileReader {
	

	
	    public static void main(String[] args) {
	        String fileName = "C:\\Users\\dell\\Desktop\\your_file.txt"; // Replace with the actual file name

	        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))) {
	            String line;
	            Map<String, Integer> wordCounts = new HashMap<>();

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\s+");

	                for (String word : words) {
	                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
	                }
	            }

	            String mostRepeatedWord = null;
	            int maxCount = 0;
	            boolean isMultipleWordsWithSameCount = false;

	            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
	                int count = entry.getValue();

	                if (count > maxCount) {
	                    mostRepeatedWord = entry.getKey();
	                    maxCount = count;
	                    isMultipleWordsWithSameCount = false;
	                } else if (count == maxCount) {
	                    isMultipleWordsWithSameCount = true;
	                }
	            }

	            if (isMultipleWordsWithSameCount) {
	                System.out.println("-1"); // Multiple words with the same count
	            } else {
	                System.out.println(mostRepeatedWord);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file: " + e.getMessage());
	        }
	    }
	}
	
	

