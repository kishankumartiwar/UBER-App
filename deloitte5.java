import java.util.*;
import java.util.Scanner;

public class deloitte5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> l = new ArrayList<>();
    System.out.println("enter number in list ");

    while (true) {
      int num = sc.nextInt();

      if (num == -1) {
        break;
      }
      l.add(num);
    }
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < l.size(); i++) {
      if (l.get(i) % 2 == 0) {
        evenSum += l.get(i);
      } else {
        oddSum += l.get(i);
      }
    }

    System.out.println("even sum is : " + evenSum);
    System.out.println("odd sum is : " + oddSum);

  }
}
