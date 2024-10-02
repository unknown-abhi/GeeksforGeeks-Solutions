//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends




class Solution {
    Set<String> list = new TreeSet<>();
    
    public void permutation(String S, String ans){
        
        if(S.length() == 0){
            list.add(ans);
            return;
        }
        
        for(int i = 0; i < S.length(); i++){
            
            char c = S.charAt(i);
            
            permutation(S.substring(0, i) + S.substring(i + 1), ans + c);
        }
    }
    
    public List<String> find_permutation(String S) {
        // Code here
        
        permutation(S, "");
        
        return new ArrayList<>(list);
    }
}