
package oraimunka0324;

import java.util.Scanner;


public class OraiMunka0324 {

    
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        bmiFeladat();
    }

    private static void bmiFeladat() {
        System.out.println("BMi kiszamitasa");
        int m = beker("Testmagasság (cm) [100;200]: ");
        int t = beker("Testtömeg (kg) [40,150]: ");
        double bmi = bmiSzamit(t , m);
        ertekeles(bmi, m , t);
        koverVagyNem(bmi);
    }
    private static void ertekeles(double bmi,int m, int t) {
        String ki = "Ön.... %d cm; %d kg, %.2f BMI".formatted(m, t, bmi);
        System.out.println("Ön...");
        kiir(ki);
    }
    private static void kiir(String szoveg) {
            System.out.print(szoveg);
            }
    
        private static double bmiSzamit(int t, int m){
            return t /Math.pow (m/100.0,2);
        }
        
        
      private static int beker(String kerdes){
          kiir(kerdes);
          return sc.nextInt();
      }

    private static void koverVagyNem(double bmi) {
        if( bmi > 25 && bmi < 29.9){
            System.out.println("\nvan feleslege");
    }
        if (bmi > 30) {
            System.out.println("\ntulyosos van feleslege amit lekell dolgozni");
        }
        if(bmi < 25){
            System.out.println("\nonnek megfelelo a bmi rataja");
        }
    }
    
      

}



