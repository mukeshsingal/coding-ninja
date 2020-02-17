import java.io.*;

class Prerequisites {
    private static void main(String[] args) {
        
    }
    /**
     * Q1
     * --------
     * Given an array of integers, print two integer values:
     * First, the sum of all numbers which are even as well as whose index are even.
     * Second, the sum of all numbers which are odd as well as whose index are odd.
     * Print the two integers space separated. (Arrays is 0-indexed)
     * 
     * https://classroom.codingninjas.com/app/classroom/me/602/content/9164/offering/67630/problem/2941
     * 
     */
    public static void sumOfNumber() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int size = Integer.parseInt(br.readLine());
              
              //Initialize the array of same size
            String[] arr = br.readLine().split(" ");
              
            int evenSum = 0;
              int oddSum = 0;
            for (int i = 0; i < arr.length; i++) {
              int number = Integer.parseInt(arr[i]);
              if((i & 1) == 0){
                  if((number & 1) == 0) {
                      evenSum += number;
                  }
              }
              else {
                  if((number & 1) == 1) {
                     oddSum += number; 
                  }
              }
            }
            System.out.print(evenSum + " " + oddSum);
        }
        catch(Exception ex) {

        }
    }

    /**
     * Given a 2-d square matrix of order ‘n’, find the sum of elements of both diagonals and all boundaries elements. Boundary elements refer to the elements present on all the four boundaries of matrix.
     */
    public static void sumOfArrayDiagonalsAndBounderies() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int size = Integer.parseInt(br.readLine());
            
            int[][] matrix = new int[size][size];
            
            for(int i = 0; i < size; i++) {
                String[] arr = br.readLine().split(" ");
                int index = 0;
                for(String j : arr) {
                    matrix[i][index] = Integer.parseInt(j);    
                    index++;
                }
            }
            
            int count = 0;
            
            for(int i = 0; i < size; i++) count += matrix[0][i];
            for(int i = 1; i < size; i++) count += matrix[i][size-1];
            for(int i = 0; i < size-1; i++) count += matrix[size-1][i];    
            for(int i = 1; i < size-1; i++) count += matrix[i][0];    
            for(int i = 1; i < size-1; i++) count += matrix[i][i];
            for(int i = 1; i < size-1; i++) count += matrix[i][size-1-i];
            
            if((size & 1) == 1) {
                count -= matrix[size/2][size/2];
            }
            
            System.out.println(count);
        }
        catch(Exception ex) {

        }
       
    }
    /**
     * There are ‘n’ number of villages. You are given an array of size ‘n’ representing the population of each village. 
     * Every year, there is a cricket competition between two teams and villagers who come to see the match. 
     * Villagers from ith village and (n-i)-1th village (0 <= i < n/2) are combined and then formed groups of 10 people each. 
     * For e.g. villagers from villages 0 and n-1, 1 and n-2, 2 and n-3 are combined. 
     * The number of villages is always even. So, clearly there will be n/2 combinations from all the villages. Y
     * ou have to tell how many groups will be formed in each combination and how many villagers will be left 
     * without the complete group of 10 peoples.
     */
    
    void PRE4() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            int numberOfGroups = Integer.parseInt(br.readLine());
            String[] populationStr = br.readLine().split(" ");
        
            int[] population = new int[numberOfGroups];
        
            for(int i = 0; i < numberOfGroups; i++) {
                population[i] = Integer.parseInt(populationStr[i]);
            }
        
		    for(int i = 0; i < numberOfGroups/2; i++) {
            
                int grpCount = (population[i]+  population[numberOfGroups - 1 - i])/10;
                int peopleLeft =  (population[i]+  population[numberOfGroups - 1 - i])%10;
            
                System.out.println(grpCount + " " + peopleLeft);
            }
        }
        catch(Exception ex){
            
        }
    }
}