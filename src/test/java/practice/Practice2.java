package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {


	public static void main(String[] args) {
		
		
		
		int n = Integer.parseInt("123");
		Integer n2 = Integer.valueOf("123");
		System.out.println(n);
		System.out.println(n2);
		
		String str = "Hello World";
		System.out.println("HI");
		
		
		String str1 = " I am learning java java java programing";
		
		Map<String,Integer> mapp = new HashMap();
		int count1 = 1;
		
		String [] arr1 = str.split(" ");
		for (int i = 0; i < arr1.length; i++) {
			if (!mapp.containsKey(arr1[i])) {
				mapp.put(arr1[i], count1);
				
			}else
				mapp.put(arr1[i],mapp.get(arr1[i]) +1);
		}
		

		Map<String,Integer> map = new HashMap();
		Integer count =1;
		//2. Split Array and iterate through the array using split
		String [] arr = str.split(" ");// split string and save to array
		
	//Now iterate through the array
		for (int j = 0; j < arr.length; j++) {
			if(!map.containsKey(arr[j])) {
				
				map.put(arr[j],count);
			}else {//if the string in the map then add it to existing one +
				
			//	map.put(arr[i],map.get(arr[i])+1);
			}//java,1
			
		}
		for (String key : map.keySet()) {
			System.out.println("The count of word " + key + " = " +map.get(key));
		}


		System.out.println(reverse(str));
		System.out.println("HI");
	}
	
	
	public static String reverse(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1; i >=0; i--) {
			
			reverse += str.charAt(i);
		}
		
		
		return reverse;
		
		
		
		
		
		
		
	}
	
	
	
	
}











