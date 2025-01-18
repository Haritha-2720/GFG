//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        
        int  save=0;
        
        int temp=n;
        
        while(temp>0){
            
            int store = temp%10;
            
            save =(save*10)+store;
            
            temp=temp/10;
            
        }
        
        int result = (int) Math.pow(n,save);
        
        return result;
        
        
        
       
    }
    
     
}
