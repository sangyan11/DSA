package Recursion;

public class StairPath {
  static void printStairPath(int n,String psf){
      if(n<=0){
          if(n==0){
              System.out.println(psf);
          }
          return;
      }

      printStairPath(n-1,psf+1);
      printStairPath(n-2,psf+2);
      printStairPath(n-3,psf+3);
  }
    public static void main(String[] args) {
         printStairPath(6,"");
    }
}
