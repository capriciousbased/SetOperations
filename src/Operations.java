import java.util.ArrayList;
import java.util.List;

public class Operations {

  public static void main(String[] args) {
    unionList();
  }

  static List<Integer> listA = List.of(1, 2, 3, 4, 5, 6);
  static List<Integer> listB = List.of(4, 5, 6, 7, 8, 9);

  public static void unionList() {
    List<Integer> result = new ArrayList<>(listA);
    result.addAll(listB);

    for (int i = 0; i < result.size(); i++) {
      for (int j = i + 1; j < result.size(); j++) {
        if (result.get(i).equals(result.get(j))) {
          result.remove(j);
          j--;
        }
      }
    }
    System.out.println(result);
  }
}
