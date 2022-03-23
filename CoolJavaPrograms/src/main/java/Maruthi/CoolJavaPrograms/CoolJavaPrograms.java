package Maruthi.CoolJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CoolJavaPrograms 
{
	//Method to reverse the string without using String reverse function of string builder
	public String reverseStringWithoutStringBuilderFunction(String input) {
		char chars[] = input.toCharArray();
		String reverseString = null;
		for(int i= chars.length-1; i>=0; i--) {
			reverseString = reverseString + chars[i];
		}
		return reverseString;
	}

	//Method to reverse the string using String reverse function of string builder
	public StringBuilder reverseStringUsingStringBuilderFunction(String input) {
		StringBuilder str2 = new StringBuilder();
		return str2.append(input).reverse();
	}

	//Method to count number of words in a string using HashMap
	public void countWordsOfStringUsingHashmap(String input) {
		String splitString[] = input.split(" ");
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for (String string : splitString)
			countMap.put(string, countMap.containsKey(string) ? countMap.get(string)+1 : 1);
		System.out.println(countMap);
	}

	//Method to verify whether a given number is a prime or not
	public void primeNumberCheck(int num) {
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println("Given number is a prime number");
		else
			System.out.println("Given number is not a prime number");
	}

	//Method to verify whether a string is palindrome or not
	public void palindromeCheck(String input) {
		String reverseString = "";
		for(int i=input.length()-1; i>=0; i--)
			reverseString = reverseString + input.charAt(i);

		if(input.equals(reverseString)) System.out.println("Given string is a palindrome string");
		else System.out.println("Given string is not a palindrome string");
	}

	//Method to verify whether a number is palindrome or not
	public void palindromeCheckForNumber(int input) {
		int remainder = 0, reverse = 0, originalNumber = input;
		while(input > 0) {
			remainder = input % 10;
			input = input/10;
			reverse = reverse * 10 + remainder;
		}

		if(originalNumber == reverse)
			System.out.print("Given number is a palindrome number");
		else
			System.out.print("Given number is not a palindrome number");
	}

	//Method for Fibonacci series
	public void fibonacciSeries(int num) {
		int a = 0, b = 0, c = 1;

		for( int i=1; i<=num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
	}

	//Method to find duplicate characters in a string
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

	//Method to find second highest number in an array
	public void secondHighestNumInArray(int input[]) {
		int largest = 0, secondLargest = 0;
		for(int i=0; i<input.length; i++) {
			if(input[i] > largest) {
				secondLargest = largest;
				largest = input[i];
			}
			else if(input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}
		System.out.println("Second largest number is:" + secondLargest);
		System.out.println("Largest Number is: "  +largest);
	}

	//Method to sort array in ascending order
	public void sortArrayInAscendingOrder(int input[]) {
		System.out.println("Initial array is: ");
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}

		int temp = 0;
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i]>input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

		System.out.println("Sorted array is: ");
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}
	}

	//Method to sort array in descending order
	public void sortArrayInDescendingOrder(int input[]) {
		System.out.println("Initial array is: ");
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}

		int temp = 0;
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i]<input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

		System.out.println("Sorted array is: ");
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}
	}

	//Method to verify whether a num is armstrong num or not
	public void armstrongNumberCheck(int num) {
		int temp = 0, temp1 = num, temp2;
		while(num>0) {
			temp2 = num%10;
			num = num/10;
			temp = temp + (temp2*temp2*temp2);
		}

		if(temp == temp1) System.out.println(temp1 + " is an armstrong number");
		else System.out.println(temp1 + " is not an armstrong number");
	}

	//Method to remove duplicate elements from array [Array should be independent of type]
	public void removeIntArrayDuplicates(Object input[]) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		for (int i = 0; i < input.length; i++)
			set.add(input[i]);

		set.size();

		System.out.print(set);
	}

	//Method to reverse a number
	public void reverseNumber(int num) {
		int reverse = 0, remainder = 0;

		while(num>0) {
			remainder = num % 10;
			num = num/10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println(reverse);
	}

	//Method to print first non repeated character of a string
	public void getFirstNonRepeatedCharOfString(String str) {
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		char result = ' ';
		char charArray[] = str.toCharArray();

		for(char character : charArray)
			countMap.put(character, countMap.containsKey(character) ? countMap.get(character) + 1 : 1);

		for(Map.Entry<Character, Integer> character : countMap.entrySet()) {
			if(character.getValue() == 1) {
				result = character.getKey();
				break;
			}
		}

		if(result == ' ') System.out.println("Didn't find any non repeated characters");
		else System.out.println("First non repeated character is: " + result);
	}

	//Method to find third largest element in the array without sorting and using nested for loops.
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
			/* If current element is greater than first, then update first, second and third */
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

	//Method to convert xxxxxxxxxx to (xxx)xx-xx-xxx
	public void phoneNumberFormatter(String input) {
		System.out.println("(" + input.substring(0, 3) + ")" + input.substring(3, 5) + "-" + input.substring(5, 7) +"-" + input.substring(7));
	}

	//Method to reverse a linked list
	public void reverseLinkedList(LinkedList<Object> l) {

		for (int i = 0, j = l.size() - 1; i < j; i++)
			l.add(i, l.remove(j));

		System.out.println("Reverse order of given List is :" + l);
	}

	//Method to convert J1a2v3a4 to jaavvvaaaa
	public void repeatCharsWithGivenNumbers(String input) {
		char[] charArray = input.toCharArray();
		String result = "";

		for(int i=0; i<charArray.length; i = i+2) {
			char currentChar = charArray[i];
			int j = Character.getNumericValue(charArray[i+1]);
			for(int k=0; k<j; k++)
				result = result + currentChar;
		}

		System.out.println("Final string is: " + result);
	}

	//Method to convert jaavvvaaaa to J1a2v3a4
	public void convertRepeatCharsToNumbers(String input) {
		String output = "";
		int count = 0;

		for(int i=0; i<input.length(); i = i + count) {
			count = 0;
			output = output + input.charAt(i);
			for(int j=i; j<input.length(); j++) {
				if(input.charAt(i) == input.charAt(j))
					count++;
				else
					break;
			}
			output = output + count;
		}

		System.out.println("Final converted string is " + output);
	}

	//Method to rotate an array to right by 'k' times
	public void rotateArrayByK(int[] nums, int k) {

		System.out.println("Initial array: ");    
		for(int i = 0; i< nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println("");

		for (int i=0; i<k; i++) {
			int j, last;
			last = nums[nums.length-1];

			for(j = nums.length-1; j > 0; j--)      
				nums[j] = nums[j-1];      

			nums[0] = last;
		}

		System.out.println("Array after right rotation: ");    
		for(int i = 0; i< nums.length; i++)
			System.out.print(nums[i] + " ");    
	}

	//Method to find which version (ver1 = 2.4.7 & ver2 = 1.64.7455) is greater or lesser
	public void versionCheck(String ver1, String ver2) {
		String[] ver1Array = ver1.split("\\.");
		String[] ver2Array = ver2.split("\\.");
		String myString = "";

		if(ver1Array.length == 3 && ver2Array.length == 3) {
			if(Integer.parseInt(ver1Array[0])  > Integer.parseInt(ver2Array[0]))
				myString = "Version 1 is greater than Version 2";
			else if (Integer.parseInt(ver1Array[0])  < Integer.parseInt(ver2Array[0]))
				myString = "Version 1 is lesser than Version 2";
			else if(Integer.parseInt(ver1Array[0])  == Integer.parseInt(ver2Array[0])) {
				if(Integer.parseInt(ver1Array[1])  > Integer.parseInt(ver2Array[1]))
					myString = "Version 1 is greater than Version 2";
				else if (Integer.parseInt(ver1Array[1])  < Integer.parseInt(ver2Array[1]))
					myString = "Version 1 is lesser than Version 2";
				else if(Integer.parseInt(ver1Array[1])  == Integer.parseInt(ver2Array[1])) {
					if(Integer.parseInt(ver1Array[2])  > Integer.parseInt(ver2Array[2]))
						myString = "Version 1 is greater than Version 2";
					else if (Integer.parseInt(ver1Array[2])  < Integer.parseInt(ver2Array[2]))
						myString = "Version 1 is lesser than Version 2";
					else if(Integer.parseInt(ver1Array[2])  == Integer.parseInt(ver2Array[2])) {
						myString = "Version 1 and Version 2 are same";
					}
				}
			}
		}
		else
			myString = "Given versions are not in the correct format";
		System.out.println(myString);
	}

	//Amazon customer reviews question - This method will output a maximum of 3 keyword suggestions in alphabetical order after each character is typed by the customer in search field.
	//Leetcode link: https://leetcode.com/discuss/interview-question/850261/Amazon-Customer-Reviews-Question/996273
	public List<List<String>> amazonSearchSuggestions(List<String> repository, String customerQuery) {

		List<List<String>> res = new ArrayList<List<String>>();

		for(int i=1;i<customerQuery.length();i++){
			String s = customerQuery.substring(0,i+1).toLowerCase();
			List<String> temp = new ArrayList<String>();

			for(int j=0;j<repository.size();j++){
				if(repository.get(j).toLowerCase().startsWith(s)){
					temp.add(repository.get(j).toLowerCase());
				}
			}

			Collections.sort(temp);

			List<String> v=new ArrayList<String>();
			for(int p=0;p<=2 && p<temp.size();p++){
				v.add(temp.get(p));
			}
			res.add(v);
		}
		return res;
	}

	//Method to print all sub arrays of the given array using iterative approach.
	public void printSubarraysUsingIterations(int[] arr) {

		for(int i=0;i<arr.length;i++){
			List<Integer> temp = new ArrayList<Integer>();
			for(int j=i;j<arr.length;j++){
				temp.add(arr[j]);
				System.out.println(temp);
			}
		}
	}

	//Method to print all sub arrays of the given array using recursion
	public void printSubarraysUsingRecursion(int[] arr, int start, int end) {

		if (end == arr.length)
			return;

		else if (start > end)
			printSubarraysUsingRecursion(arr, 0, end + 1);

		else
		{  
			List<Integer> temp = new ArrayList<Integer>();
			for (int i = start; i <= end; i++)
				temp.add(arr[i]);

			System.out.println(temp);
			printSubarraysUsingRecursion(arr, start + 1, end);
		}
		return;
	}

	//Method to print max sub array length of given array whose product is 1
	public void printMaxSubArrayLengthWhoseProductIsOne(int[] arr) {

		List<Integer> lengthsList = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			List<Integer> temp = new ArrayList<Integer>();

			for(int j=i;j<arr.length;j++){
				temp.add(arr[j]);

				if(productOfListElements(temp) == 1) {
					lengthsList.add(temp.size());
				}
			}
		}
		System.out.println(Collections.max(lengthsList));
	}

	//Method to find the product of given list
	public int productOfListElements(List<Integer> myList) {
		int size = myList.size();
		int result = 1;
		for(int i=0; i<size; i++) {
			result = result * myList.get(i);
		}
		return result;
	}

	//Method to iterate and print map values using for each loop
	public void iterateOverMap() {
		Map<String,String> myMap_645614 = new HashMap<String,String>();

		myMap_645614.put("GFG", "geeksforgeeks.org");
		myMap_645614.put("Practice", "practice.geeksforgeeks.org");
		myMap_645614.put("Code", "code.geeksforgeeks.org");
		myMap_645614.put("Quiz", "quiz.geeksforgeeks.org");

		for (Map.Entry<String,String> entry : myMap_645614.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}


	//Method to return the smallest positive number missing from an unsorted array
	public int smallestPositiveInteger(int A[]) {
		int n = A.length;
		boolean[] present = new boolean[n + 1];

		for(int i=0; i<n; i++) {
			// Only mark the required elements. All non-positive elements and the elements greater n + 1 will never be the answer.
			// For example, the array will be {1, 2, 3} in the worst case and the result will be 4 which is n + 1
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;
		}

		//Find the first element which didn't appear in the original array
		for (int i = 1; i <= n; i++)
			if (!present[i])
				return i;

		// If the original array was of the type {1, 2, 3} in its sorted form, return n+1
		return n+1;
	}

	//Method to return a Palindrome string having N chars with K distinct characters.
	//Lets say N = 4 and K = 2, Then the answer can be baab or abba or any thing which contains only 2 alphabetical characters.  
	//The answer cannot be aaaa or bbbb as the palindrome string has only one character.
	public static void generatePalindromHavingNCharsWithKDistinctChars (int N, int K) {
		
		if(N >= (K*2)-1) {
			char letters[] = new char[K];
			
			System.out.print("List of characters to be used for building the palindrome string are: ");
			for (int i=0; i < K; i++) {
				letters[i] = (char) ('a'+i);
				System.out.print(letters[i] + " ");
			}
			
			int l, r, j;
			
			char Arr[] = new char[N];
			
			if (N % 2 == 0) {
				l = N/2-1; 
				r = N/2;
				j = 0;
			}	
			else {
				Arr[N/2] = letters[0];
				l = N/2 - 1;
				r = N/2 + 1;
				j = 1;
			}
			
			while(l >= 0 && r <= N) {
				Arr[l] = letters[j];
				Arr[r] = letters[j];
				
				l--;
				r++;
				j++;
				
				if (j>=K) j = 0;
			}
		
			System.out.println();
			System.out.println("Final palindrome string is: " + new String(Arr));
		}
		else 
			System.out.println("We cannot form a palindrome string of lenght "+N+" by using "+K+" Characters");
	}
	
	//Method to find the highest sum of two numbers in the array whose sum of digits are also same
	
	//Input:  arr[]={55, 23, 32, 46, 88}
	//Output:  101
	//Explanation: Pair {55, 46} will give the sum of 55 + 46 = 101 

	//Input: arr[]={18, 19, 23, 15}
	//Output: Error message
	
	public static void highestSumWithHighestDigitsSum(int[] A) {
		Arrays.sort(A);
		int n = A.length;
		int result = 0;
		
		for(int j = n-1; j > 0; j--) {
			int jElementDigitsSum = digitsSum(A[j]);
			for(int i = n-2; i > j; i--) {
				int iElementDigitsSum = digitsSum(A[i]);
				if(iElementDigitsSum == jElementDigitsSum) {
					result = A[i] + A[j];
					break;
				}
			}
		}	
		
		if(result != 0) System.out.println("Final sum is: "+result);
		else System.out.println("Array doesn't have numbers satisfying the given conditions");
	}
	
	public static int digitsSum(int a){
		int remainder = 0, result = 0;
		 
		while(a>0) {
			remainder = a % 10;
			a = a/10;
			result = result + remainder; 
		}
		
		return result;
	}

	public static void main( String[] args )
	{
		int arr[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
		Object arr2[] = {1, 2, 1, 2, 1, 2, 3, "Hello", "World", "Hello"};
		int arr3[] = {100, 14, 46, 47, 94, 52, 86, 36, 89};
		int arr4[] = {1, -1, 1, -1, 1, 1, 1, -1, -1, 1, -1};
		int arr5[] = {-45, -18, -614, -44, -73, 0, 1, 2, 3, 25, 41, 6, 486};
		int arr6[] = {55, 23, 32, 46, 88};

		LinkedList<Object> l = new LinkedList<Object>(); l.add("One"); l.add("Two");
		l.add("Three"); l.add("Four"); l.add("Five");

		List<String> l2 = new ArrayList<String>(); l2.add("mobile"); l2.add("mouse");
		l2.add("moneypot"); l2.add("monitor"); l2.add("mousepad");

		List<Integer> l3 = new ArrayList<Integer>(); l3.add(1); l3.add(-1);
		l3.add(-1); l3.add(-1); l3.add(1); l3.add(1); l3.add(1); l3.add(1);

		List<Integer> l4 = new ArrayList<Integer>(); l4.add(1); l4.add(-1);
		l4.add(-1); l4.add(1); l4.add(1); l4.add(1); l4.add(1);

		CoolJavaPrograms JP = new CoolJavaPrograms();
//		System.out.println(JP.reverseStringWithoutStringBuilderFunction("Hello World"));
//		System.out.println(JP.reverseStringUsingStringBuilderFunction("Hello World"));
//		JP.countWordsOfStringUsingHashmap("This is Hello World");
//		JP.primeNumberCheck(32987);
//		JP.palindromeCheck("99999999");
//		JP.palindromeCheckForNumber(956778898);
//		JP.fibonacciSeries(10);
//		JP.duplicateCharsInString("HelloWorldIsHere");
//		JP.secondHighestNumInArray(arr);
//		JP.sortArrayInAscendingOrder(arr);
//		JP.sortArrayInDescendingOrder(arr);
//		JP.armstrongNumberCheck(468);
//		JP.removeIntArrayDuplicates(arr2);
//		JP.reverseNumber(1061960);
//		JP.getFirstNonRepeatedCharOfString("abcdefghijabcdgh");
//		JP.getFirstNonRepeatedCharOfString("HelloWorldHelloWorld");
//		JP.thirdLargestElementInArray(arr3);
//		JP.phoneNumberFormatter("9945293684");
//		JP.reverseLinkedList(l);
//		JP.repeatCharsWithGivenNumbers("J1a2v3a4");
//		JP.rotateArrayByK(arr, 3);
//		JP.versionCheck("2.15.178", "1.5.45.00");
//		JP.convertRepeatCharsToNumbers("AAAABBCCCAABCD");
//		System.out.println(JP.amazonSearchSuggestions(l2, "mouse"));
//		JP.printSubarraysUsingIterations(arr);
//		JP.printSubarraysUsingRecursion(arr,0,0);
//		JP.productOfListElements(l4);
//		JP.printMaxSubArrayLengthWhoseProductIsOne(arr4);
//		JP.iterateOverMap();
//		System.out.println(JP.smallestPositiveInteger(arr5));
//		CoolJavaPrograms.generatePalindromHavingNCharsWithKDistinctChars(4, 2);
//		CoolJavaPrograms.highestSumWithHighestDigitsSum(arr6);
	}
}
