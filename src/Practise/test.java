package Practise;


import java.util.HashSet;
import java.util.Set;

public class test {
public static void main(String[] args) {
	//Find Even/Odd numbers in Array
//Even numbers
	
/*int arr[]={1,2,3,4,5,6};
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2!=0){
        	System.out.println("Odd Numbers:" +arr[i]); 
       }
        else if (arr[i]%2==0) {
        	System.out.println("even Numbers:" +arr[i]);
        }
    }*/
//Swap two numbers    

  /*  int a=10,b=20;
    a=a+b;//30
    b=a-b;//10
    a=a-b;//20
    System.out.println("After swaping two numbers :" +a+"  "+b);*/
	
	//Find the minimum and Maximum values in Array
	
/*	int arr[]= {2,5,90,23,4,16,43,32,25};
	int min=arr[0],max=arr[0],second_max=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}else if(arr[i]>max) {
			second_max=max;
			max=arr[i];
			}else if (arr[i]>second_max) {
				second_max=arr[i];
			}
	}System.out.println("Min: "  + min +   "\nMax: " +max+   "\nSecond_Max: "+second_max );
  /*  Arrays.sort(arr);
   System.out.println("Second largest: "+ arr[arr.length-2]);
 System.out.println("largest number : "+ arr[arr.length-1]);
  System.out.println("smallest number: "+ arr[0]); */
    
  //Print Duplicate values in Array  
    
  /* int arr[]= {1,3,23,45,65,1,3,45,77,54,34,65};
    for(int i=0;i<arr.length-1;i++) {
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[i]==arr[j]) {
    			System.out.println("Duplicate Elements:"  +arr[i]);
    			}}}
    
   // Duplicate values in set
	
/*	Set<String> set=new HashSet<String>();
	boolean value1=set.add("one");
	boolean value2=set.add("one");
    System.out.println(value1 +" "+value2); */
    
    
    
    
    
    
}
}	
	


