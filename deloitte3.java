import java.util.Scanner;

public class deloitte3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = new String();
    System.out.println("enter string str");
    s = sc.nextLine();
    StringBuilder str = new StringBuilder();
    str.append(s);
    print(str);

  }

  private static void print(StringBuilder str) {
    str.insert(0, "do not ");
    System.out.println(str);
  }
}
