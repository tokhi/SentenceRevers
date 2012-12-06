package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SentenceReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence (e.g; The quick brown fox jumped): ");
		String sen = input.nextLine();
		
		String[] words = tokenize(sen);
		
		for(int i = 0 ; i < words.length; i++){
			stack.push(words[i]);
		}
		
		System.out.println(stack);
		

	}
	
	public static String[] tokenize(String sentence){
		String[] words = null;
		for (int i = 0; i < sentence.length(); i++) {
				words = sentence.split(" ");
		}
		return words;
	}
	
}
