package allPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoolJavaPrograms {
	// Method to reverse the string without using String reverse function of string builder
	public String reverseStringWithoutStringBuilderFunction(String input) {
		char chars[] = input.toCharArray();
		String reverseString = null;
		for (int i = chars.length - 1; i >= 0; i--) {
			reverseString = reverseString + chars[i];
		}
		return reverseString;
	}

	// Method to reverse the string using String reverse function of string builder
	public String reverseStringUsingStringBuilderFunction(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	// Method to count number of words in a string using HashMap
	public void countWordsOfStringUsingHashmap(String input) {
		String splitString[] = input.split(" ");
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for (String string : splitString)
			countMap.put(string, countMap.containsKey(string) ? countMap.get(string) + 1 : 1);
		System.out.println(countMap);
	}

	// Method to verify whether a given number is a prime or not
	public static boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	// Method to verify whether a string is palindrome or not
	public void palindromeCheck(String input) {
		String reverseString = "";
		for (int i = input.length() - 1; i >= 0; i--)
			reverseString = reverseString + input.charAt(i);

		if (input.equals(reverseString))
			System.out.println("Given string is a palindrome string");
		else
			System.out.println("Given string is not a palindrome string");
	}

	// Method to verify whether a number is palindrome or not
	public void palindromeCheckForNumber(int input) {
		int remainder = 0, reverse = 0, originalNumber = input;
		while (input > 0) {
			remainder = input % 10;
			input = input / 10;
			reverse = reverse * 10 + remainder;
		}

		if (originalNumber == reverse)
			System.out.print("Given number is a palindrome number");
		else
			System.out.print("Given number is not a palindrome number");
	}

	//Method to print first 'n' Fibonacci numbers using non recursive approach from the series of infinite Fibonacci numbers starting from 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 ..
	public void fibonacciSeries(int num) {
		int a = 0, b = 0, c = 1;

		for (int i = 1; i <= num; i++) {
			a = b;
			
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
	}
	
	//Recursive method to print first 'n' Fibonacci numbers using recursive approach from the series of infinite Fibonacci numbers starting from 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ..
	public int fibonacciSeriesUsingRecursive(int n) {
		if (n==0) 
			return 0;
		if(n == 1 || n == 2) 
			return 1;
		return fibonacciSeriesUsingRecursive(n-2) + fibonacciSeriesUsingRecursive(n-1);
	}
	
	//Method to print Fibonacci series numbers until the given fibonacci number.
	//If n = 55, then this method will print Fibonacci numbers until 55 Fibonacci number from the series starting from 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ..
	//If n = 987, then this method will print Fibonacci numbers until 987 Fibonacci number from the series starting from 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 ..
	public void fibonacciNumbersUntilN(int n) {
		int a = 0, b = 0, c = 1;
		
		while(a < n) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
	}

	// Method to find duplicate characters in a string
	public void duplicateCharsInString(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : charArray) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// Method to sort array in ascending order
	public void sortArrayInAscendingOrder(int input[]) {
		System.out.println("Initial array is: ");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

		int temp = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

		System.out.println("Sorted array is: ");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	// Method to sort array in descending order
	public void sortArrayInDescendingOrder(int input[]) {
		System.out.println("Initial array is: ");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

		int temp = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] < input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

		System.out.println("Sorted array is: ");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	// Method to verify whether a num is armstrong num or not
	public void armstrongNumberCheck(int num) {
		int temp = 0, temp1 = num, temp2;
		while (num > 0) {
			temp2 = num % 10;
			num = num / 10;
			temp = temp + (temp2 * temp2 * temp2);
		}

		if (temp == temp1)
			System.out.println(temp1 + " is an armstrong number");
		else
			System.out.println(temp1 + " is not an armstrong number");
	}

	// Method to remove duplicate elements from string
	public String removeDuplicateCharsFromString(String input) {
		/**
		 * Simple approach is to insert all the characters of the string into a HashSet which will automatically take care of ignoring duplicates. 
		 * 
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < input.length(); i++)
			set.add(input.charAt(i));

		System.out.print(set);
		**/
		
		//The problem with the above approach is that set does not maintain insertion order and gives the final strings with characters in ascending order. 
		//To print the string by just removing the duplicate characters and not changing the order of other characters, lets use indexOf() method of string.
		String str = "";
		int length = input.length();
		
		for(int i=0; i<length; i++) {
			char ch = input.charAt(i);
			if(str.indexOf(ch) < 0)
				str += ch;
		}
		return str;
	}
	
	// Method to reverse a number
	public void reverseNumber(int num) {
		int reverse = 0, remainder = 0;

		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println(reverse);
	}

	// Method to print first non repeated character of a string
	public void getFirstNonRepeatedCharOfString(String str) {
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		char result = ' ';
		char charArray[] = str.toCharArray();

		for (char character : charArray)
			countMap.put(character, countMap.containsKey(character) ? countMap.get(character) + 1 : 1);

		for (Map.Entry<Character, Integer> character : countMap.entrySet()) {
			if (character.getValue() == 1) {
				result = character.getKey();
				break;
			}
		}

		if (result == ' ')
			System.out.println("Didn't find any non repeated characters");
		else
			System.out.println("First non repeated character is: " + result);
	}

	// Method to find second highest number in an array
	public void secondHighestNumInArray(int input[]) {

		int largest = input[0], secondLargest = Integer.MIN_VALUE;
		int arrSize = input.length;

		for (int i = 1; i < arrSize; i++) {
			if (input[i] > largest) {
				secondLargest = largest;
				largest = input[i];
			} else if (input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}

		System.out.println("Second largest number is:" + secondLargest);
		System.out.println("Largest Number is: " + largest);

	}

	// Method to find third largest element in the array without sorting and using
	// nested for loops.
	public void thirdLargestElementInArray(int arr[]) {
		int arr_size = arr.length;

		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}

		// Initialize first, second and third Largest element
		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		// Traverse array elements to find the third Largest
		for (int i = 1; i < arr_size; i++) {
			/*
			 * If current element is greater than first, then update first, second and third
			 */
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}

			/* If arr[i] is in between first and second */
			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			}

			/* If arr[i] is in between second and third */
			else if (arr[i] > third) {
				third = arr[i];
			}
		}

		System.out.printf("The third Largest element is %d\n", third);
	}

	// Method to convert xxxxxxxxxx to (xxx)xx-xx-xxx
	public void phoneNumberFormatter(String input) {
		System.out.println("(" + input.substring(0, 3) + ")" + input.substring(3, 5) + "-" + input.substring(5, 7) + "-"
				+ input.substring(7));
	}

	// Method to reverse a linked list
	public void reverseLinkedList(LinkedList<Object> l) {

		for (int i = 0, j = l.size() - 1; i < j; i++)
			l.add(i, l.remove(j));

		System.out.println("Reverse order of given List is :" + l);
	}

	// Method to convert J1a2v3a4 to jaavvvaaaa
	public void repeatCharsWithGivenNumbers(String input) {
		char[] charArray = input.toCharArray();
		String result = "";

		for (int i = 0; i < charArray.length; i = i + 2) {
			char currentChar = charArray[i];
			int j = Character.getNumericValue(charArray[i + 1]);
			for (int k = 0; k < j; k++)
				result = result + currentChar;
		}

		System.out.println("Final string is: " + result);
	}

	// Method to convert jaavvvaaaa to J1a2v3a4
	public void convertRepeatCharsToNumbers(String input) {
		String output = "";
		int count = 0;

		for (int i = 0; i < input.length(); i = i + count) {
			count = 0;
			output = output + input.charAt(i);
			for (int j = i; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j))
					count++;
				else
					break;
			}
			output = output + count;
		}

		System.out.println("Final converted string is " + output);
	}

	// Method to rotate an array to right by 'k' times
	public void rotateArrayByK(int[] nums, int k) {

		System.out.println("Initial array: ");
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println("");

		for (int i = 0; i < k; i++) {
			int j, last;
			last = nums[nums.length - 1];

			for (j = nums.length - 1; j > 0; j--)
				nums[j] = nums[j - 1];

			nums[0] = last;
		}

		System.out.println("Array after right rotation: ");
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}

	// Method to find which version (ver1 = 2.4.7 & ver2 = 1.64.7455) is greater or
	// lesser
	public void versionCheck(String ver1, String ver2) {
		String[] ver1Array = ver1.split("\\.");
		String[] ver2Array = ver2.split("\\.");
		String myString = "";

		if (ver1Array.length == 3 && ver2Array.length == 3) {
			if (Integer.parseInt(ver1Array[0]) > Integer.parseInt(ver2Array[0]))
				myString = "Version 1 is greater than Version 2";
			else if (Integer.parseInt(ver1Array[0]) < Integer.parseInt(ver2Array[0]))
				myString = "Version 1 is lesser than Version 2";
			else if (Integer.parseInt(ver1Array[0]) == Integer.parseInt(ver2Array[0])) {
				if (Integer.parseInt(ver1Array[1]) > Integer.parseInt(ver2Array[1]))
					myString = "Version 1 is greater than Version 2";
				else if (Integer.parseInt(ver1Array[1]) < Integer.parseInt(ver2Array[1]))
					myString = "Version 1 is lesser than Version 2";
				else if (Integer.parseInt(ver1Array[1]) == Integer.parseInt(ver2Array[1])) {
					if (Integer.parseInt(ver1Array[2]) > Integer.parseInt(ver2Array[2]))
						myString = "Version 1 is greater than Version 2";
					else if (Integer.parseInt(ver1Array[2]) < Integer.parseInt(ver2Array[2]))
						myString = "Version 1 is lesser than Version 2";
					else if (Integer.parseInt(ver1Array[2]) == Integer.parseInt(ver2Array[2])) {
						myString = "Version 1 and Version 2 are same";
					}
				}
			}
		} else
			myString = "Given versions are not in the correct format";
		System.out.println(myString);
	}

	// Amazon customer reviews question - This method will output a maximum of 3
	// keyword suggestions in alphabetical order after each character is typed by
	// the customer in search field.
	// Leetcode link:
	// https://leetcode.com/discuss/interview-question/850261/Amazon-Customer-Reviews-Question/996273
	public List<List<String>> amazonSearchSuggestions(List<String> repository, String customerQuery) {

		List<List<String>> res = new ArrayList<List<String>>();

		for (int i = 1; i < customerQuery.length(); i++) {
			String s = customerQuery.substring(0, i + 1).toLowerCase();
			List<String> temp = new ArrayList<String>();

			for (int j = 0; j < repository.size(); j++) {
				if (repository.get(j).toLowerCase().startsWith(s)) {
					temp.add(repository.get(j).toLowerCase());
				}
			}

			Collections.sort(temp);

			List<String> v = new ArrayList<String>();
			for (int p = 0; p <= 2 && p < temp.size(); p++) {
				v.add(temp.get(p));
			}
			res.add(v);
		}
		return res;
	}

	// Method to print all sub arrays of the given array using iterative approach.
	public void printSubarraysUsingIterations(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = i; j < arr.length; j++) {
				temp.add(arr[j]);
				System.out.println(temp);
			}
		}
	}

	// Method to print all sub arrays of the given array using recursion
	public void printSubarraysUsingRecursion(int[] arr, int start, int end) {

		if (end == arr.length)
			return;

		else if (start > end)
			printSubarraysUsingRecursion(arr, 0, end + 1);

		else {
			List<Integer> temp = new ArrayList<Integer>();
			for (int i = start; i <= end; i++)
				temp.add(arr[i]);

			System.out.println(temp);
			printSubarraysUsingRecursion(arr, start + 1, end);
		}
		return;
	}

	// Method to print max sub array length of given array whose product is 1
	public void printMaxSubArrayLengthWhoseProductIsOne(int[] arr) {

		List<Integer> lengthsList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> temp = new ArrayList<Integer>();

			for (int j = i; j < arr.length; j++) {
				temp.add(arr[j]);

				if (productOfListElements(temp) == 1) {
					lengthsList.add(temp.size());
				}
			}
		}
		System.out.println(Collections.max(lengthsList));
	}

	// Method to find the product of given list
	public int productOfListElements(List<Integer> myList) {
		int size = myList.size();
		int result = 1;
		for (int i = 0; i < size; i++) {
			result = result * myList.get(i);
		}
		return result;
	}

	// Method to iterate and print map values using for each loop
	public void iterateOverMap() {
		Map<String, String> myMap_645614 = new HashMap<String, String>();

		myMap_645614.put("GFG", "geeksforgeeks.org");
		myMap_645614.put("Practice", "practice.geeksforgeeks.org");
		myMap_645614.put("Code", "code.geeksforgeeks.org");
		myMap_645614.put("Quiz", "quiz.geeksforgeeks.org");

		for (Map.Entry<String, String> entry : myMap_645614.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	// Method to return the smallest positive number missing from an unsorted array
	public int smallestPositiveInteger(int A[]) {
		int n = A.length;
		boolean[] present = new boolean[n + 1];

		for (int i = 0; i < n; i++) {
			// Only mark the required elements. All non-positive elements and the elements
			// greater n + 1 will never be the answer.
			// For example, the array will be {1, 2, 3} in the worst case and the result
			// will be 4 which is n + 1
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;
		}

		// Find the first element which didn't appear in the original array
		for (int i = 1; i <= n; i++)
			if (!present[i])
				return i;

		// If the original array was of the type {1, 2, 3} in its sorted form, return
		// n+1
		return n + 1;
	}

	// Method to return a Palindrome string having N chars with K distinct
	// characters.
	// Lets say N = 4 and K = 2, Then the answer can be baab or abba or any thing
	// which contains only 2 alphabetical characters.
	// The answer cannot be aaaa or bbbb as the palindrome string has only one
	// character.
	public static void generatePalindromHavingNCharsWithKDistinctChars(int N, int K) {

		if (N >= (K * 2) - 1) {
			char letters[] = new char[K];

			System.out.print("List of characters to be used for building the palindrome string are: ");
			for (int i = 0; i < K; i++) {
				letters[i] = (char) ('a' + i);
				System.out.print(letters[i] + " ");
			}

			int l, r, j;

			char Arr[] = new char[N];

			if (N % 2 == 0) {
				l = N / 2 - 1;
				r = N / 2;
				j = 0;
			} else {
				Arr[N / 2] = letters[0];
				l = N / 2 - 1;
				r = N / 2 + 1;
				j = 1;
			}

			while (l >= 0 && r <= N) {
				Arr[l] = letters[j];
				Arr[r] = letters[j];

				l--;
				r++;
				j++;

				if (j >= K)
					j = 0;
			}

			System.out.println();
			System.out.println("Final palindrome string is: " + new String(Arr));
		} else
			System.out.println("We cannot form a palindrome string of lenght " + N + " by using " + K + " Characters");
	}

	// Method to find the highest sum of two numbers in the array whose sum of
	// digits are also same

	// Input: arr[]={55, 23, 32, 46, 88}
	// Output: 101
	// Explanation: Pair {55, 46} will give the sum of 55 + 46 = 101

	// Input: arr[]={18, 19, 23, 15}
	// Output: Error message

	public static void highestSumWithHighestDigitsSum(int[] A) {
		Arrays.sort(A);
		int n = A.length;
		int result = 0;

		for (int j = n - 1; j > 0; j--) {
			int jElementDigitsSum = digitsSum(A[j]);
			for (int i = n - 2; i > j; i--) {
				int iElementDigitsSum = digitsSum(A[i]);
				if (iElementDigitsSum == jElementDigitsSum) {
					result = A[i] + A[j];
					break;
				}
			}
		}

		if (result != 0)
			System.out.println("Final sum is: " + result);
		else
			System.out.println("Array doesn't have numbers satisfying the given conditions");
	}

	// Method to find the sum of the digits of a number
	public static int digitsSum(int a) {
		int remainder = 0, result = 0;

		while (a > 0) {
			remainder = a % 10;
			a = a / 10;
			result = result + remainder;
		}

		return result;
	}

	// Method to count the uppercase, lowercase, special characters and numeric
	// values
	public static void countOfDifferentTypeOfChars(String str) {
		int upper = 0, lower = 0, number = 0, special = 0;
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else
				special++;
		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
	}

	// Method to find out the distance between two characters of a string
	public static void distanceBwnTwoCharsOfString(String str, char ch1, char ch2) {

		// If we just need to test +ve scenario, the below code will work. But to cover
		// all the use cases, we need custom code.
		// System.out.println("Distance between two characters is " + (str.indexOf(ch2)
		// - str.indexOf(ch1)));

		char charArray[] = str.toCharArray();
		int arrayLength = charArray.length;
		int pos1 = -1, pos2 = -1;

		for (int i = 0; i < arrayLength; i++) {
			char element = charArray[i];
			if (element == ch1)
				pos1 = i;
			if (element == ch2)
				pos2 = i;
		}

		if (pos1 == -1 || pos2 == -1)
			System.out.println("Atleast one of the given character not found in the string");
		else
			System.out.println("Distance between two characters is: " + (Math.abs(pos2 - pos1)));
	}

	// Method to put _ between a small and capital letter in a given string
	public static void puttingUnderscoreBetweenSmallAndCapitalLetters(String str) {
		int strLength = str.length();
		String result = "";

		for (int i = 0; i < strLength; i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					&& (str.charAt(i + 1) >= 'A' && str.charAt(i + 1) <= 'Z'))
				result = result + str.charAt(i) + '_';
			else
				result = result + str.charAt(i);
		}

		if (result.equals(str))
			System.out
					.println("There is no scope to insert _ between the small and capital letters in the given string");
		else
			System.out.println("Final string after inserting _ between small and capital letter is: " + result);
	}

	// Java program to write into a file and then read the same file
	public static void writeAndReadFile() {

		// Writing into a file
		try {
			FileWriter writer = new FileWriter("MyFile.txt", true);
			writer.write("Hello World");
			writer.write("\r\n"); // write new line
			writer.write("Good Bye!");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading from the file
		try {
			FileReader reader = new FileReader("MyFile.txt");
			int character;

			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeAndReadFileUsingBufferedClass() {

		// Writing into file
		try {
			FileWriter writer = new FileWriter("SampleTextFileToWriteData.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write("Hello World");
			bufferedWriter.newLine();
			bufferedWriter.write("See You Again!");

			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading from file
		try {
			FileReader reader = new FileReader("SampleTextFileWithData.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("Line starts here");
				System.out.println(line);
				System.out.println("Line ends here");
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void sameAndDiffElementsOfLists(List<Integer> list1, List<Integer> list2) {

		// Method-1: Using the inbuilt methods of collection framework
		List<Integer> list3 = new ArrayList<Integer>(list1);
		list1.retainAll(list2);
		System.out.println("Common elements: " + list1);

		list3.removeAll(list1);
		System.out.println("List-1 specific elements: " + list3);

		list2.removeAll(list1);
		System.out.println("List-2 specific elements: " + list2);

		// Method-2: Using the core logic of java and finding out the required data
//		List<Integer> list1OnlyElements = new ArrayList<Integer>();
//		List<Integer> list2OnlyElements = new ArrayList<Integer>();
//		List<Integer> commonElements = new ArrayList<Integer>();
//		
//		for(Integer l1: list1) {
//				if(list2.contains(l1)) commonElements.add(l1);
//				else list1OnlyElements.add(l1);
//			}
//		
//		for(Integer l2: list2)
//			if(!list1.contains(l2)) list2OnlyElements.add(l2);
//		
//		System.out.println("List-1 only elements: "+ list1OnlyElements);
//		System.out.println("List-2 only elements: "+ list2OnlyElements);
//		System.out.println("Common elements in both the lists: "+commonElements);
	}

	public static void slidingWindowMax(int arr[], int n, int k) {
		int j, max;

		for (int i = 0; i <= n - k; i++) {

			max = arr[i];

			for (j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}

	// Method to print the below pattern
	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10
	// 11 12 13 14 15
	public static void printFloydsTriangle(int n) {
		int i, j, k = 1;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k + "  ");
				k++;
			}
			System.out.println();
		}
	}

	// Method to print the below pattern
	// 15 14 13 12 11
	// 10 9 8 7
	// 6 5 4
	// 3 2
	// 1
	public static void printReverseFloydsTriangle(int num) {
		int k = 15;
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
		}
	}

	// Method to print the below pattern
	// 1
	// 3 2
	// 6 5 4
	// 10 9 8 7
	// 15 14 13 12 11
	public static void printFloydsTriangleWithReverseNumbers(int n) {
		int k = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = k + i; j > k - i; j--) {
				System.out.print(j + " ");
				k++;
			}
			System.out.println();
		}
	}

	// Method to print the length of the maximum sub string in a given string
	public static int lengthOfLongestSubstring(String s) {
		String test = "";
		int maxLength = -1;

		if (s.isEmpty())
			return 0;
		else if (s.length() == 1)
			return 1;

		for (char c : s.toCharArray()) {
			String current = String.valueOf(c);

			// If string already contains the character then substring after repeating
			// character
			if (test.contains(current))
				test = test.substring(test.indexOf(current) + 1);
			test = test + current;
			maxLength = Math.max(test.length(), maxLength);
		}
		return maxLength;
	}

	public static void findMedianOfSortedArrays(int[] firstArray, int[] secondArray) {

		int mergedArraySize = firstArray.length + secondArray.length;

		int[] mergedArray = new int[mergedArraySize];
		int pos = 0;

		for (int element : firstArray) {
			mergedArray[pos] = element;
			pos++;
		}

		for (int element : secondArray) {
			mergedArray[pos] = element;
			pos++;
		}

		Arrays.sort(mergedArray);

		double median;
		if (mergedArraySize % 2 == 0)
			median = (double) (mergedArray[mergedArraySize / 2] + mergedArray[(mergedArraySize / 2) - 1]) / 2;
		else
			median = (double) mergedArray[mergedArraySize / 2];

		System.out.println(median);
	}

	// Method to reverse the characters in a word without changing the position of
	// the words in the sentence
	// Input: My name is Maruthi. Output: yM eman si ihturaM
	public static void reverseCharsOfWordsWithoutChangingWordsPosition(String input) {

		String output = "";
		String[] strArray = input.split(" ");

		for (int i = 0; i < strArray.length; i++) {

			String temp = "";
			int length = strArray[i].length();
			for (int j = length - 1; j >= 0; j--) {
				temp = temp + strArray[i].charAt(j);
			}
			output = output + temp + " ";
		}
		System.out.println(output);
	}

	// Method to print three numbers when sum of two numbers is equal to its next
	// number.
	// Input: [1, 2, 3, 5, 6, 6, 7, 8, 15] Output: [1, 2, 3] [2, 3, 5] [7, 8, 15]
	public static void printNumsWhenSumOfTwoNumsIsEqualToNextNum(List<Integer> inputList) {
		int listSize = inputList.size();
		for (int i = 0; i < listSize - 2; i++) {
			int firstNum = inputList.get(i);
			int secondNum = inputList.get(i + 1);
			int thirdNum = inputList.get(i + 2);
			if ((firstNum + secondNum) == thirdNum) {
				System.out.print("[" + firstNum + " " + secondNum + " " + thirdNum + "]");
				System.out.println();
			}
		}
	}
	
	// Method to print Pascal triangle
	// Input : N = 5
	// Output:
    //           1
    //         1   1
    //       1   2   1
    //     1   3   3   1
	//   1   4   6   4   1
	// 1   5   10   10   5   1
	
	// nCr formula: n ! / ( n – r ) ! r ! 
	// After using nCr formula, the pictorial representation becomes:

	//	           0C0
	//	        1C0   1C1
	//	     2C0   2C1   2C2
	//	  3C0   3C1   3C2   3C3
	public static void pascalTriangle(int n) {
		
		int ncrValue = 0, i, j;
		for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) 
                System.out.print(" "); // for left spacing
 
            for (j = 0; j <= i; j++) 
            	System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));
               
			System.out.println();
		}
	}
	
	//Method to find the factorial of a given number using recursive approach
	public static int factorial(int i) {
		if(i==0)
			return 1;
		return i * factorial(i-1);
	}
	
	
	//Method to convert a sentence to camel case.
	//Input: My name is Maruthi
	//Output: MyNameIsMaruthi
	public static void convertSentenceToCamelCase(String str) {
//		str = str.substring(0, 1).toUpperCase() + str.substring(1);
//		//Method-1: Using string builder
//		StringBuilder builder = new StringBuilder(str);
//		for (int i = 0; i < builder.length(); i++) {
//			if (builder.charAt(i) == ' ') {
//				builder.deleteCharAt(i);
//				builder.replace(i, i+1, String.valueOf(Character.toUpperCase(builder.charAt(i))));
//			}
//		}
//		System.out.println(builder);
		
		//Method-2: Without using string builder
		int n = str.length();
		String result = String.valueOf(Character.toUpperCase(str.charAt(0)));
		
		for (int i=1; i<n; i++) {
			if(str.charAt(i)== ' ') {
				result = result + Character.toUpperCase(str.charAt(i+1));
				i++;
			}
			else
				result = result + str.charAt(i);
		}
		System.out.println(result);
	}
	
	//Method to find the nearest smallest and largest prime number for a given number
	//Input: 15
	//Output: Small prime - 13, large prime - 17
	public static void NearestSmallLargePrimeOfGivenNumber(int n) {
		
		for(int i=n+1;i<=Integer.MAX_VALUE;i++) {
			if(isPrimeNumber(i)) {
				System.out.println("Largest prime of n is: "+i);
				break;
			}	
		}
		
		for(int i=n-1;i>0;i--) {
			if(isPrimeNumber(i)) {
				System.out.println("Smallest prime of n is: "+i);
				break;
			}	
		}
	}
	
	//Method to convert Roman numbers to Integers
	//Input: MCMXCIV
	//Output: 1994
	
	//Time Complexity: The time complexity of this code is O(n), where n is the length of Roman Number in String format 
	//as we are traversing String only once.
	public static int romanToIntegerConversion(String romanNum) {
		Map<Character, Integer> romanValues = new HashMap<Character, Integer>();
		romanValues.put('I',1);
		romanValues.put('V',5);
		romanValues.put('X',10);
		romanValues.put('L',50);
		romanValues.put('C',100);   
		romanValues.put('D',500);   
		romanValues.put('M',1000);
		
		int result = romanValues.get(romanNum.charAt(0));
		int romanNumLength = romanNum.length();
		
		for(int i=1; i<romanNumLength; i++) {
			char currentChar = romanNum.charAt(i);
			char previousChar = romanNum.charAt(i-1);
			if(romanValues.get(currentChar) > romanValues.get(previousChar))
				result = result + (romanValues.get(currentChar)) - (2 * (romanValues.get(previousChar)));
			else
				result = result + romanValues.get(currentChar);
		}
		return result;
	}
	
	//Method to convert given array values into a wave. Given an array of arr[0..n-1], then the wave form of the array is like: 
	//arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
	//Input: 10, 90, 49, 2, 1, 5, 23
	//Output: 90, 10, 49, 1, 5, 2, 23
	public static void convertArrayToWave(int[] inputArray) {
		
		//One easy method is to sort the array in ascending order and swap all adjacent elements. For example, let the input array be {3, 6, 5, 10, 7, 20}. 
		//After sorting, we get {3, 5, 6, 7, 10, 20}. After swapping adjacent elements, we get {5, 3, 7, 6, 20, 10}. 
		//The code looks as shown below. 
		/**
		Arrays.sort(inputArray);
		
		for(int i=0; i<inputArray.length; i+=2) {
			swap(inputArray, i, i+1);
		}
		**/
		
		//The problem with the above code is that the time complexity of the above solution is O(nLogn) if a O(nLogn) sorting algorithm like Merge Sort, Heap Sort, .. etc is used.
		//This same problem can be solved in O(n) time by doing a single traversal of given array.
		
		//The idea is based on the fact that if we make sure that all even positioned (at index 0, 2, 4, ..) elements are greater than their adjacent odd elements, we don’t need to worry about odd positioned element. Following are simple steps. 
		//1) Traverse all even positioned elements of input array, and do following. 
		//	a) If current element is smaller than previous odd element, swap previous and current. 
		//	b) If current element is smaller than next odd element, swap next and current.
		
		int arrayLength = inputArray.length;
		for (int i = 0; i < arrayLength; i+=2) {
			if(i>0 && inputArray[i]<inputArray[i-1])
				swap(inputArray, i, i-1);
			if(i<arrayLength-1 && inputArray[i]<inputArray[i+1])
				swap(inputArray, i, i+1);
		}
		
		for(int arr: inputArray)
			System.out.print(arr + " ");
	}
	
	//Method to swap two elements of an array present at given indices
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//Method to find whether the two strings are anagrams or not
	//An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
	//For example, “abcd” and “dabc” are an anagram of each other.
	public static boolean anagramsCheck(char str1[], char str2[]) {
		
		//Method-1: In the following implementation, it is assumed that the characters are stored using 8 bit and there can be 256 possible characters.
		//Create a count array of size 256. Initialize all values in count array as 0.
		//increment the value in count array for characters in str1 and decrement for characters in str2. 
		//Finally, if all count values are 0, then the two strings are anagram of each other. 
		
		/**int[] countArray = new int[256];
		
		if(str1.length != str2.length)
			return false;
		else {
			for(int i=0; i<str1.length; i++) {
				countArray[str1[i] - 'a']++;
				countArray[str2[i] - 'a']--;
			}
		}
		
		for(int i=0; i<countArray.length; i++)
			if(countArray[i]!=0)
				return false;
		return true; **/
		
		//The complexity of the above program is O(n) which is fine. But we are creating an array of size 256 which occupies more space.
		//we can optimise it using HashMap where we can store character and count of character in HashMap. 
		//Idea is to put all characters of one String in HashMap and reducing them as we encounter while looping over other String.
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str1.length; i++) 
			map.put(str1[i], map.containsKey(str1[i]) ? map.get(str1[i]) + 1 : 1);
		for(int i=0; i<str2.length; i++)
			map.put(str2[i], map.get(str2[i]) - 1);
		for(Map.Entry<Character, Integer> value: map.entrySet())
			if(value.getValue() != 0)
				return false;
		return true;
	}

	//Method to find the largest number that can be formed with the given integers
	/** 
	 * First, we convert each integer to a string. Then, we sort the array of strings.
	 * While it might be tempting to simply sort the numbers in descending order, this causes problems for sets of numbers with the same leading digit. 
	 * For example, sorting the problem example in descending order would produce the number 95343039534303, while the correct answer can be achieved by transposing the 33 and the 3030. 
	 * Therefore, for each pairwise comparison during the sort, we compare the numbers achieved by concatenating the pair in both orders. We can prove that this sorts into the proper order as follows:
	 * 
 	 * Assume that (without loss of generality), for some pair of integers aa and bb, our comparator dictates that aa should precede bb in sorted order. 
 	 * This means that a\frown b > b\frown aa⌢b>b⌢a (where \frown⌢ represents concatenation). For the sort to produce an incorrect ordering, there must be some cc for which bb precedes cc and cc precedes aa. 
 	 * This is a contradiction because a\frown b > b\frown aa⌢b>b⌢a and b\frown c > c\frown bb⌢c>c⌢b implies a\frown c > c\frown aa⌢c>c⌢a. In other words, our custom comparator preserves transitivity, so the sort is correct.
 	 * 
	 * Once the array is sorted, the most "significant" number will be at the front. There is a minor edge case that comes up when the array consists of only zeroes, so if the most significant number is 00, we can simply return 00. 
	 * Otherwise, we build a string out of the sorted array and return it.
	 * 
	 * Complexity Analysis
	 * Time complexity : O(nlgn)
	 * Although we are doing extra work in our comparator, it is only by a constant factor. Therefore, the overall runtime is dominated by the complexity of sort, which is O(nlgn) in Python and Java.
	 * 
	 * Space complexity : O(n)
	 * Here, we allocate O(n) additional space to store the copy of nums. Although we could do that work in place (if we decide that it is okay to modify nums), we must allocate O(n) space for the final return string. 
	 * Therefore, the overall memory footprint is linear in the length of nums.
	 * 
	 * */
	public String largestNumWithGivenIntegers(int[] arr) {
		
		String[] stringArray = new String[arr.length];
		
		// Get input integers as strings.
		for(int i=0; i<arr.length; i++)
			stringArray[i] = String.valueOf(arr[i]);
		
		// Sort strings according to custom comparator.
		Arrays.sort(stringArray, new LargestNumberComparator());
		
		if(stringArray[0].equals(0))
			return "0";
		
		// Build largest number from sorted array.
		String largestNumberInString = "";
		for(String str: stringArray)
			largestNumberInString += str;
		
		return largestNumberInString;
	}
	
	//Method to remove vowels from a string
	public String removeVowelsFromString(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}
	
	//Method to find GCD of two numbers
	//The HCF or GCD of two integers is the largest integer that can exactly divide both numbers (without a remainder).
	//Lets say a = 81 and b = 153, then GCD(a,b) is 9. Because 81 % 9 = 0 and 153 % 9 = 0
	public int gcdOfTwoNumbers(int a, int b) {
		int gcd = 1;
		
		for(int i=2; i<=a && i<=b; i++) {
			if(a % i == 0 && b % i == 0)
				gcd = i;
		}
		return gcd;
	}
	
	//Method to find LCM of two numbers
	//The LCM of two integers is the smallest positive integer that is perfectly divisible by both the numbers (without a remainder).
	//Lets say a = 72 and b = 120, then LCM(a,b) is 360. Because 360 % 72 = 0 and 360 % 120 = 0
	public int lcmOfTwoNumbers(int a, int b) {
		
		//Method-1: Using loop
		//Take the largest number between a and b as initial value of lcm
		int lcm, temp = (a > b) ? a : b;
		
		while(true) {
			if(temp % a == 0 && temp % b == 0) {
				lcm = temp;
				break;
			}
			temp++;
		}
		return lcm;
		
		//Method-2: Finding LCM using GCD
		//As per the formulae, LCM = (a * b)/GCD(a,b)
		//int gcd = gcdOfTwoNumbers(a,b);
		//return (a * b)/gcd;
	}
	
	//Binary search
	public int binarySearch(int[] arr, int left, int right, int x) {
		
		if(right >= left) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == x) //If the element is present at the middle itself
				return mid;
			
			if(arr[mid] > x) //If element is smaller than mid, then it can only be present in left subarray
				return binarySearch(arr, left, mid - 1, x);
			
			//Else the element can only be present in right subarray
			return binarySearch(arr, mid+1, right, x);
		}
			return -1;
	}
	
	//Method to find the number of occurrences for each error code in the log file
	public void numberOfOccurrencesForEachErrorInLogFile() {
		
	}
	
	//Problem statement: Given a list of integers, count and return the number of times each value appears as an array of integers.
	//Input: arr[] = [1, 1, 3, 2, 1]
	//Output: [0, 3, 1, 1]
	//All of the values are in the range [0..3], so create an array of zeros, [0, 0, 0, 0]. The results of each iteration follow:
	//i 	arr[i]	result
	//0 	1		[0, 1, 0, 0]
	//1 	1		[0, 2, 0, 0]
	//2 	3		[0, 2, 0, 1]
	//3 	2		[0, 2, 1, 1]
	//4 	1		[0, 3, 1, 1]
	public List<Integer> frequencyOfArrayElements(List<Integer> arr){
		int inputArraySize = arr.size();
        int[] freqArray = new int[inputArraySize];
        
        for(int i=0; i<inputArraySize; i++) 
            freqArray[arr.get(i)] = freqArray[arr.get(i)] + 1;
        
        List<Integer> result = new ArrayList<Integer>();
        for(int temp: freqArray)
            result.add(temp);
        
        return result;
	}
	
	//Given a square matrix, calculate the absolute difference between the sums of its diagonals. For example, the square matrix array is shown below:
	//1 2 3
	//4 5 6
	//9 8 9
	//The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. Their absolute difference is |15 - 17| = 2
	public int diagonalDifference(List<List<Integer>> arr) {
	        int ld = 0, rd = 0;
	        int matrixSize = arr.size();
	        
	        for(int i=0, j=matrixSize-1; i<matrixSize; i++, j--) {
	        	ld = ld + arr.get(i).get(i);
	        	rd = rd + arr.get(i).get(j); 
	        }
	       return Math.abs(ld - rd);
	}
	
	//Given a camelCase string, find the number of words in the given sentence
	//Input: oneTwoThree
	//Output: 3 (one, Two, Three)
	public int NumOfWordsInCamelCaseSentence(String s) {
		int result = 1;
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)))
				result++;
		}
		return result;
	}
	
	//Given a password string, find the minimum number of characters that must be added to make the password strong
	public int minCharsRequired(String password) {	
		boolean lowercase = false;
        boolean uppercase = false;
        boolean number = false;
        boolean special = false;
        char[] schars = "!@#$%^&*()-+".toCharArray();
        
        Set<Character> cs = new HashSet<>();
        for (char c : schars)
            cs.add(c);
      
        int n = password.length();
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') number = true;
            if (c >= 'a' && c <= 'z') lowercase = true;
            if (c >= 'A' && c <= 'Z') uppercase = true;
            if (cs.contains(c)) special = true;
        }
        
        int need = 0;
        need += lowercase ? 0 : 1;
        need += uppercase ? 0 : 1;
        need += number ? 0 : 1;
        need += special ? 0 : 1;
        
        return n + need < 6 ? 6 - n : need;
	}
	
	//Print the number of errors for each error code in the error logs file
	public void printFrequencyOfErrors() {
		try {
			FileReader reader = new FileReader("ErrorLogsFile.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			Map<String, Integer> errorsMap = new TreeMap<String, Integer>();
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				if(line.contains("ERROR: 500")) {
					String errorKey = "ERROR: 500";
					errorsMap.put(errorKey, errorsMap.containsKey(errorKey) ? errorsMap.get(errorKey) + 1 : 1);
				}
				else if(line.contains("ERROR: 501")) {
					String errorKey = "ERROR: 501";
					errorsMap.put(errorKey, errorsMap.containsKey(errorKey) ? errorsMap.get(errorKey) + 1 : 1);
				}
				else if(line.contains("ERROR: 502")) {
					String errorKey = "ERROR: 502";
					errorsMap.put(errorKey, errorsMap.containsKey(errorKey) ? errorsMap.get(errorKey) + 1 : 1);
				}	
			}
			reader.close();
			
			for(Map.Entry<String, Integer> ele: errorsMap.entrySet()) {
				System.out.println(ele.getKey() + " - " + ele.getValue());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method sorts the array using quickSort algorithm
	 * 
	 * @param arr - The array to be sorted
	 * @param low - Starting index
	 * @param high - Ending index
	 */
	public void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			// pi is partitioning index, arr[p] is now at right place
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	/**
	 * This function takes last element as pivot, places the pivot element at its correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 * 
	 * @param arr - The array to be sorted
	 * @param low - Starting index
	 * @param high - Ending index
	 */
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		
		for(int j=low; j<=high-1; j++) {
			if(arr[j] < pivot)
				i++;
				swap(arr, i, j);
		}
		swap(arr, i + 1, high);
	    return (i + 1);
	}
	
	public static void main(String[] args) {
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		Object arr2[] = { 1, 2, 1, 2, 1, 2, 3, "Hello", "World", "Hello" };
		int arr3[] = { 100, 14, 46, 47, 94, 52, 86, 36, 89 };
		int arr4[] = { 1, -1, 1, -1, 1, 1, 1, -1, -1, 1, -1 };
		int arr5[] = { -45, -18, -614, -44, -73, 0, 1, 2, 3, 25, 41, 6, 486 };
		int arr6[] = { 55, 23, 32, 46, 88 };
		int arr7[] = { 10, 90, 49, 2, 1, 5, 23 };
		int arr8[] = {4,39,6, 29,8};

		LinkedList<Object> l = new LinkedList<Object>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
		List<String> l2 = Stream.of("mobile", "mouse", "moneypot", "monitor", "mousepad").collect(Collectors.toList());
		List<Integer> l3 = List.of(1, -1, -1, -1, 1, 1, 1, 1);
		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(1, -1, -1, 1, 1, 1, 1));
		List<Integer> l5 = new ArrayList<Integer>(Arrays.asList(19, -1, 37, 99, 1, 0, 56));
		List<Integer> l6 = new ArrayList<Integer>() {
			{
				add(19);
				add(-1);
				add(3);	
				add(69);
				add(1);
				add(889);
				add(26);
			}
		};

		CoolJavaPrograms JP = new CoolJavaPrograms();
		
		JP.printFrequencyOfErrors();
		
		
	}
}
