public class Tc {
    void function(int n){
        int i=1,s=1;
        while(s<=n){
            i++;
            s=s+i;
            System.out.println("Hello world");
        }
    }
    public static void main(String[] args) {
        int n = 10; // Replace with your desired input
            Tc tc = new Tc();
            tc.function(n);
    } 
}

/*
 The time complexity of this code is O(sqrt(n)),
because the while loop continues until the value of s becomes greater than n, 
and s is the sum of the first i integers, where i starts from 2 and increments by 1 in each iteration.

So, the value of s can be written as s = 2 + 3 + 4 + ... + i. 
Using the formula for the sum of arithmetic series, we can simplify this to s = (i/2)(i + 1) - 1.

Therefore, the condition for the while loop can be written as (i/2)(i + 1) - 1 <= n, 
which simplifies to i^2 + i - 2n - 2 <= 0.

Solving for i using the quadratic formula, we get i = (-1 + sqrt(8n + 9))/2. 
Therefore, the number of iterations of the while loop is approximately sqrt(n), 
which gives a time complexity of O(sqrt(n)).
 */
