package qaace22Training;

import java.util.Arrays;

public class SumAndProductOfElementInArray {

	public static void main(String[] args) {

	int arr[] = {34,44,666,78,23};

		       int sum = 0, product = 1;

		       for(int x: arr){

		           sum += x;

		           product *= x;

		       }

		       System.out.println("Given Array: " + Arrays.toString(arr));

		       System.out.println("Sum of elements: " + sum);

		       System.out.println("Product of elements: " + product);

		   }



	}

