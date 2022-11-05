import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringList{
  private final List<String> list = Arrays.asList("hello");

  public void clear() {
      list = new ArrayList<>();
  }
  public int size() {
      return list.size();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StringList list = new StringList();
        list.clear();
        System.out.println(list.size());
    }
}