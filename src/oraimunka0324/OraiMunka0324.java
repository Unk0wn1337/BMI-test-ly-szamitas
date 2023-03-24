
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
    
    }


}
