//@author:Brennan Iannandrea
package fiboseriesrec;
import java.util.Scanner;
public class FiboSeriesRec {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("How many numbes do you want calculated?");
        long fi = a.nextLong();
        long tim = System.currentTimeMillis();//takes initial time
        long b = fib(0,1,fi,true);//starts recursive loop
        long sTim = System.currentTimeMillis();//takes final time
        long eTime = sTim - tim;//calculates time
        System.out.print(eTime);//outputs time
        System.out.println(" Milliseconds");
    }
    public static int fib(long c,long d, long left,boolean bo){
        if(bo){// ensures that 0 and the first 1 are accounted for
        System.out.println("0");
        if(left>1){
            System.out.println("1");
        left --;}
        return(fib(c,d,left-1,false));//recurses method
        }else{// if not first run
        if (left>0){
        long e = c+d;
        System.out.println(e);
        return (fib(d,e,left-1,false));//recurses the method
        }
        }
        return(0);//end of recursion
    }
}
