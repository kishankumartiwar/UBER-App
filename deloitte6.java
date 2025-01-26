import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

public class deloitte6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder target = new StringBuilder();
    StringBuilder reference = new StringBuilder();
    HashSet<Character> set = new HashSet<>();
    String tar = new String();
    String ref = new String();
    System.out.println("enter target string");
    tar = sc.nextLine();
    System.out.println("enter reference string");
    ref = sc.nextLine();
    target.append(tar);
    reference.append(ref);
    for (int i = 0; i < target.length(); i++) {
      set.add(target.charAt(i));
    }

    for (int i = 0; i < reference.length(); i++) {
      if (set.contains(reference.charAt(i))) {
        reference.deleteCharAt(i);
        i--;

      }

    }
    System.out.println(reference);
  }
}
