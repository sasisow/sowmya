public class Fibonacci {

    public static void main(String[] args) {
          int i= 7;
          int j= 2;
          int k= 7;
          System.out.println(i);
          System.out.println(j);
          for (int l=1;l<=10;l++) {
                k = i+j;
                 i=j;
                 j=k;
                 System.out.println(k);
          }
    }

}
