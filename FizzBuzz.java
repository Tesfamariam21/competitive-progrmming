import java.util.Scanner;
import java.util.ArrayList;
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        int i=1;
        while (i<=n){
            if (i%3==0 && i%5==0){
                ans.add("FizzBuzz");
            }
            else if (i%3==0){
                ans.add("Fizz");
            }
            else if( i%5==0){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        i+=1;
        }
        return ans;
    }
}
class myclass{
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        int num=x.nextInt();

        Solution obj= new Solution();
        obj.fizzBuzz(num);
    }
}

