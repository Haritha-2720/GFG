//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            long res = obj.seriesSum(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long seriesSum(int n) {
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            
        }
        return sum;
        
    }
    
}
        
