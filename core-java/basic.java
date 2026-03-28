import java.util.*;
public class basic {
  public static void main(String[] args) {
    List<Integer> list =new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(2, 6);
    System.out.println(list);
    list.remove(2);
    System.out.println(list);

    List<Object> list2 = new ArrayList<>();
    list2.add("Java");
    list2.add(1);
    list2.add(true);
    System.err.println(list2);

    Vector<Integer> vector = new Vector<>();
    vector.add(1);
    vector.add(5);
    vector.add(3);
    vector.remove(0);
    System.err.println(vector);
    System.out.println(vector.size());
    System.out.println(vector.contains(2));
    System.out.println(vector.isEmpty());
    vector.sort(null);
    System.out.println(vector);

    Iterator<Integer> iterator = vector.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    vector.forEach(e->{
      System.out.println(e);
      System.out.println("Geeks for Geeks");
    });

  }
}
