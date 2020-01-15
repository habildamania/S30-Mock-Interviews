// Time Complexity : O(numRows^2) - Since we have a while loop executing numofrows time and each while loop has a nested for loop which executes numRows time in the worst case 
// Space Complexity : O(1) since no Auxillary space of unknown size is used
// Is this the most optimized approach - Yes, the coding technique used is Dynamic Programming
// Your code here along with comments explaining your approach

import java.util.*;
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> IntRes = new ArrayList<>();
        IntRes.add(1);
        result.add(IntRes);
        int k =1;
        while(k<numRows)
        {
            List<Integer> NextRow = new ArrayList<>();
            NextRow.add(1);
            for(int i = 1; i < IntRes.size(); i++)
            {
                NextRow.add(IntRes.get(i - 1) + IntRes.get(i));
            }
            NextRow.add(1);
            IntRes = NextRow;
            result.add(NextRow);
            k++;
        }
        return result;   
    }
}

class Main{
    public static void main(String[] args)
    {
        PascalTriangle obj = new PascalTriangle();
        int k = 6;  //number of rows that need to be displayed in the Pascal triangle
        System.out.println("The Pascal Triangle upto " + k + " is " + obj.generate(k));
    }
}