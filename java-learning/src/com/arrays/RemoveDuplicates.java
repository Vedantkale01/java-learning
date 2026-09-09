package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter array size : ");
		        int size = sc.nextInt();

		        int[] a = new int[size];

		        System.out.println("Enter array elements one by one : ");

		        for(int i = 0; i <= a.length - 1; i++)
		        {
		            a[i] = sc.nextInt();
		        }

		        int count = 0;

		        for(int i = 0; i <= a.length - 1; i++)
		        {
		            if(isPreviouslyPresent(a, i) == false)
		            {
		                count++;
		            }
		        }

		        int[] a2 = new int[count];

		        int indexA2 = 0;

		        for(int i = 0; i <= a.length - 1; i++)
		        {
		            if(isPreviouslyPresent(a, i) == false)
		            {
		                a2[indexA2] = a[i];
		                indexA2++;
		            }
		        }

		        System.out.println("Result = " + Arrays.toString(a2));

//================
		        //solution 2
		        int[] b = new int[a.length];
		        int indexB = 0;

		        for(int i = 0; i < a.length; i++)
		        {
		            boolean found = false;

		            for(int j = 0; j < indexB; j++)
		            {
		                if(a[i] == b[j])
		                {
		                    found = true;
		                    break;
		                }
		            }

		            if(found == false)
		            {
		                b[indexB] = a[i];
		                indexB++;
		            }
		        }

		        System.out.println("Result:");

		        for(int i = 0; i < indexB; i++)
		        {
		            System.out.print(b[i] + " ");
		        }
		        
//====================		        
		        
		    }

		    public static boolean isPreviouslyPresent(int[] a, int i)
		    {
		        boolean result = false;

		        for(int j = 0; j <= i - 1; j++)
		        {
		            if(a[j] == a[i])
		            {
		                result = true;
		                break;
		            }
		        }

		        return result;
		    }
		
		    
		    
}
