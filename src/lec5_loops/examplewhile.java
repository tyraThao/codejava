
package lec5_loops;

public class examplewhile {
    public static void main(String[] args){
        int n = 91;
        int factor = 2;
        while(n % factor != 0){
            factor++;
        }
        System.out.print("First factor: "+ factor);
    }
}
