package Maruthi.CoolJavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
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
		for (String string : splitString) {
			if(countMap.containsKey(string)) countMap.put(string, countMap.containsKey(string) ? countMap.get(string)+1 : 1);
			else countMap.put(string, 1);	
		}
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
		char inputArray[] = input.toCharArray();
		String result = "(xxx)xx-xx-xxx", finalResult = "";
		char resultArray[] = result.toCharArray();
	
		for(int i=0, j=0; i<resultArray.length; i++) {
			if(resultArray[i] == 'x') {
				resultArray[i] = inputArray[j];
				j++;
				finalResult += resultArray[i];
			}
			else 
				finalResult += resultArray[i];
		}
		
		System.out.println("Converted string is : "+finalResult);
	}
	
	public static void main( String[] args )
    {
       int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
       Object arr2[] = { 1, 2, 1, 2, 1, 2, 3, "Hello", "World", "Hello" };
       int arr3[] = { 100, 14, 46, 47, 94, 52, 86, 36, 89 };
       CoolJavaPrograms JP = new CoolJavaPrograms();
//       System.out.println(JP.reverseStringWithoutStringBuilderFunction("Hello World"));
//       System.out.println(JP.reverseStringUsingStringBuilderFunction("Hello World"));
//       JP.countWordsOfStringUsingHashmap("This is Hello World");
//       JP.primeNumberCheck(32987);
//       JP.palindromeCheck("99999999");
//       JP.fibonacciSeries(10);
//       JP.duplicateCharsInString("HelloWorldIsHere");
//       JP.secondHighestNumInArray(arr);
//       JP.sortArrayInAscendingOrder(arr);
//       JP.sortArrayInDescendingOrder(arr);
//       JP.armstrongNumberCheck(468);
//       JP.removeIntArrayDuplicates(arr2);
//       JP.reverseNumber(1061960);
//       JP.getFirstNonRepeatedCharOfString("abcdefghijabcdgh");
//       JP.getFirstNonRepeatedCharOfString("HelloWorldHelloWorld");
//       JP.thirdLargestElementInArray(arr3);
//       JP.phoneNumberFormatter("99452936847");
    }
}
