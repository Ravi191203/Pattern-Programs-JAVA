/*
WAP to print the following pattern.
    A
   AB
  ABC
 ACBD
ABCDE
*/
public class AlphabetPattern7{
  public static void main(String[] args) {
    int n=5,k;
    for(int i=1;i<=n;i++)
    {
      for(int j=0;j<n-i;j++)
      {
        System.out.print(" ");
      }
      k=65;
      for(int j=1;j<=i;j++)
      {
        System.out.print((char)k);
        k++;
      }
      System.out.println();
    }
  }
}
