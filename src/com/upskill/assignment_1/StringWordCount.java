package com.upskill.assignment_1;

import java.util.HashMap;

public class StringWordCount {
	

	
	    public static void main(String[] args) {
	        String text = "the quick brown fox jumps over the lazy dog";
	        String[] words = text.split(" ");
	        
	        // Create a new HashMap to store word counts
	        HashMap<String, Integer> wordCount = new HashMap<>();
	        
	        // Loop through each word in the array and increment the count in the HashMap
	        for (String word : words) {
	            if (wordCount.containsKey(word)) {
	                int count = wordCount.get(word);
	                wordCount.put(word, count + 1);
	            } else {
	                wordCount.put(word, 1);
	            }
	        }
	        
	        // Print the word counts
	        for (String word : wordCount.keySet()) {
	            int count = wordCount.get(word);
	            System.out.println(word + ": " + count);
	        }
	    }
	}






