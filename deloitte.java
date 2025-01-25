import java.util.HashSet;
import java.util.Scanner;

class deloitte {
  public static void main(String[] args) {
    HashSet<Character> set = new HashSet<>();
    set.add('S');
    set.add('T');
    set.add('U');
    set.add('C');
    set.add('T');
    set.add('R');
    set.add('A');
    set.add('L');
    StringBuilder s = new StringBuilder();
    System.out.println("enter the string ");
    Scanner sc = new Scanner(System.in);
    String userInput = new String();
    userInput = sc.nextLine();
    s.append(userInput.toUpperCase());
    for (int i = 0; i < s.length(); i++) {
      if (set.contains(s.charAt(i))) {
        s.deleteCharAt(i);
        i--;
      }
    }
    System.out.println(s);
  }
}