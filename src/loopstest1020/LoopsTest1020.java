/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loopstest1020;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
public class LoopsTest1020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Please input the number of stars for the diagonal: ");
//        int diag = in.nextInt();
//        System.out.print("Please input the number to check for factors: ");
//        int factorNum = in.nextInt();
        System.out.print("Please input the number to check for type: ");
        int typeCheck = in.nextInt();
////        staticClass.createDiagonal(diag);
//        staticClass.findFactors(factorNum);
        staticClass.checkType(typeCheck);
    }
}

class staticClass {
    public static void createDiagonal(int N) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }
    }
    public static void findFactors(int N) {
        for(int i=2;i<N-1;i++) {
            if(N % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void checkType(int N) {
        for(int i = 2; i <= 9; i++) {
            if(i == 9 && N % i != 0) {
                System.out.print("\nIs prime");
                break;
            }
            else if(N % i == 0) {
                if(N % 2 == 0) {
                    System.out.print("\nEven");
                    break;
                }
                else {
                    System.out.print("\nOdd");
                    break;
                }
            }
        }
    }
}