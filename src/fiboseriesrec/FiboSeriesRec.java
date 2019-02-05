//@author:Brennan Iannandrea
package fiboseriesrec;
import java.util.Scanner;
public class FiboSeriesRec {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("How many numbes do you want calculated?");
        long fi = a.nextLong();
        long tim = System.currentTimeMillis();
        long b = fib(0,1,fi,true);
        long sTim = System.currentTimeMillis();
        long eTime = sTim - tim;
        System.out.print(eTime);
        System.out.println(" Milliseconds");
    }
    public static int fib(long c,long d, long left,boolean bo){
        if(bo){
        System.out.println("0");
        return(fib(c,d,left-1,false));
        }else{
        if (left>0){
        long e = c+d;
        System.out.println(e);
        return (fib(d,e,left-1,false));
        }
        }
        return(0);
    }
}
