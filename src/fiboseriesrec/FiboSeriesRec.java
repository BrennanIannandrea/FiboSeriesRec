//@author:Brennan Iannandrea
package fiboseriesrec;
import java.util.Scanner;
public class FiboSeriesRec {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("How many numbes do you want calculated?");
        int b = fib(0,1,a.nextInt(),true);
        
    }
    public static int fib(int c,int d, int left,boolean bo){
        if(bo){
        System.out.println("0");
        return(fib(c,d,left-1,false));
        }else{
        if (left>0){
        int e = c+d;
        System.out.println(e);
        return (fib(d,e,left-1,false));
        }
        }
        return(0);
    }
}
