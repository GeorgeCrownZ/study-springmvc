import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach(item -> {
            System.out.println(item);
        });
    }
}
