import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class deloitte4 {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder();
    String input = new String();
    input = sc.nextLine();
    str.append(input.toUpperCase());
    HashSet<Character> set = new HashSet<>();
    set.add('V');
    set.add('I');
    set.add('B');
    set.add('G');
    set.add('Y');
    set.add('O');
    set.add('R');

    for (int i = 0; i < str.length(); i++) {
      if (set.contains(str.charAt(i))) {
        map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
      }
    }
    int mincount = Integer.MAX_VALUE;
    for (char c : set) {
      if (map.containsKey(c)) {
        mincount = Math.min(mincount, map.get(c));
      } else {
        mincount = 0;
        break;
      }
    }

    System.out.println("Minimum VIBGYOR that can be printed is " + mincount);

  }
}
