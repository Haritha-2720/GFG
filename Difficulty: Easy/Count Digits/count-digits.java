//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int count = 0; // Initialize counter
        int temp = n;  // Make a copy of n for processing digits
        
        while (temp > 0) {
            int store = temp % 10; // Extract the last digit
            
            // Check if store is non-zero and n is divisible by store
            if (store != 0 && n % store == 0) {
                count++;
            }
            
            temp = temp / 10; // Remove the last digit
        }
        
        return count; // Return the total count
    }
}
