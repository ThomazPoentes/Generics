import java.math.BigDecimal;
import java.util.LinkedList;

public class GenericLinkedList<T> {
    private LinkedList<T> list;

    public GenericLinkedList() {
        list = new LinkedList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public static void main(String[] args) {
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("John Doe");
        stringList.add("Jane Doe");
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));

        GenericLinkedList<Long> longList = new GenericLinkedList<>();
        longList.add(20L);
        longList.add(30L);
        System.out.println(longList.get(0));
        System.out.println(longList.get(1));

        GenericLinkedList<BigDecimal> bigDecimalList = new GenericLinkedList<>();
        bigDecimalList.add(new BigDecimal("1000.00"));
        bigDecimalList.add(new BigDecimal("2000.00"));
        System.out.println(bigDecimalList.get(0));
        System.out.println(bigDecimalList.get(1));
    }

}