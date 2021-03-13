package practice;

import java.util.Arrays;

public class Practice3 {

	public static void main(String[] args) {
		
		
//		
//	int [] array = new int[5];
//	for (int i = 5; i > 0; i--) {
//		array[5-i]=i;
//		System.out.println(Arrays.toString(array));
//	}
//           Arrays.parallelSort(array);
//           
//           for (int i = 0; i < 5; ++i) {
//			
//        	   System.out.println(array[i]);
//           }
           
           
         int a[][]  = {{2,3},
        		       {4,5},
        		       {7,3}
        
         } ;
         
         System.out.println(a[2][0] + a[2][1]);
         
         int rows, cols, sumRow, sumCol;    

         rows = a.length;    
       cols = a[0].length;    
           
       //Calculates sum of each row of given matrix    
       for(int i = 0; i < rows; i++){    
           sumRow = 0;    
           for(int j = 0; j < cols; j++){    
           System.out.println(    sumRow = sumRow + a[i] 	[j]);    
           }    
           System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
       }    
           
       //Calculates sum of each column of given matrix    
       for(int i = 0; i < cols; i++){    
           sumCol = 0;    
           for(int j = 0; j < rows; j++){    
             sumCol = sumCol + a[j][i];    
           }    
           System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
       }
       
       int [][] data =  new int [4][7];
      
      for (int i = 0; i < data.length; i++) {
		for (int j = 0; j < data[i].length; j++) {
			data[2][j] = j+1;
			
		}
	}
      
      
      for (int i = 0; i < data.length; i++) {
		for (int j = 0; j < data[i].length; j++) {
			System.out.print(data[i][j]+ "\t");
		}
		
      System.out.println();
   }    

      
      String [][]  n = new String [][] {{"0","0"}};
      n[0][0] = "Helleo";
      
      System.out.println(Arrays.deepToString(n));
	}    	 
        	
        	 
        
	}


