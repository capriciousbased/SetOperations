import java.util.ArrayList;
import java.util.List;

public class Operations {

  static List<Integer> listA = List.of(1, 2, 3, 4, 5, 6);
  static List<Integer> listB = List.of(4, 5, 6, 7, 8, 9);

  public static void main(String[] args) {
    unionList();
    intersectionList();
  }

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

  public static void intersectionList() {
    List<Integer> intersection = new ArrayList<>();
    for (Integer element : listA) {
      /*     We iterate through listA and check if the current element is also in listB using the contains() method. If it is, we add it to the intersection list. At the end of the iteration, the intersection list contains only the elements that were in both listA and listB. */
      if (listB.contains(element)) {
        intersection.add(element);
      }
    }

    System.out.println("Intersection of both lists: " + intersection);
  }

}
