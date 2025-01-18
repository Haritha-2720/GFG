//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.reverseDigits(n);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        
        int split =0;
        while(n>0){
            
            int store = n%10;
            
            split = (split*10)+store;
            
            n=n/10;
        }
        return split;
    }
}