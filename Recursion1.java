public class recursion {
     public static void main(String[] args) {


    // NO. 1
    System.out.println(pangkat(9, 2));
   
    // NO. 2
    for (int i = 0; i < 10; i++) {
      System.out.println((i + 1) + " : " + fibonacci(i));
    }
    
    // NO. 3
    System.out.println(deret(1));

    // NO. 4
    System.out.println(nameRepeat(" SALMAN KASEP", 1));
  }

  public static int pangkat(int angka, int eksponen) {
    int repeatTime = eksponen - 1;
    if (repeatTime == 0 ) {
      return angka;
    } else {
      return angka * pangkat(angka, eksponen - 1); 
    }

  }

  public static int fibonacci(int n) {
    if ( n == 0 ) {
      return 0;
    }

    if ( n == 1) {
      return 1;
    }

    if ( n == 2 ) {
      return 1;
    }