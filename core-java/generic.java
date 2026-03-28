public class generic {
  public static void main(String[] args) {
    System.out.println("Generic Example");
    GenericExample<String> genericExample = new GenericExample<>("Hello");
    System.out.println(genericExample.getData());
    genericExample.setData("World");
    System.out.println(genericExample.getData());
  }
}

class GenericExample<T> {
  private T data;
  public GenericExample(T data) {
    this.data = data;
  }
  public T getData() {
    return data;
  }
  public void setData(T data) {
    this.data = data;
  }
}


