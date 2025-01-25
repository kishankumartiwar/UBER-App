import java.util.Scanner;

public class deloitte2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter the size of dnum and bnum");
    n = sc.nextInt();
    int dnum[] = new int[n];
    int bnum[] = new int[n];
    System.out.println("enter dnum");
    for (int i = 0; i < n; i++) {
      dnum[i] = sc.nextInt();
    }
    System.out.println("enter bnum");
    for (int i = 0; i < n; i++) {
      bnum[i] = sc.nextInt();
    }
    System.out.println("here is the resultant : ");
    for (int i = 0; i < n; i++) {
      if (bnum[i] == 1) {
        System.out.println(dnum[i]);
      }
    }

  }
}
