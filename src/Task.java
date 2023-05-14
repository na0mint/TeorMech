import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Task {
    /*
    Мапа для хранения дано и того, что нужно найти.
    Данные записываются в строгом соотвествии с типовым вариантом схемы.
    Для записи угла силы нужно использовать тот же ключ, но с постфиксом "angle". Например, для силы
    F1 угол будет записан в F1angle.
    Для указания на значение, которое нужно найти, к соотвествующему ключу поместить null.
    Чтобы поместить null, укажите букву вместо численного значения.
    Для завершения ввода параметров в качестве ключа запишите "end".

    Все величины следует указывать в системе Си.
     */


    Map<String, Double> data = new HashMap<>();

    default void printData() {
        data.forEach((String key, Double value) -> System.out.println(key + " = " + value));
    }
    double compute(String unknown);
    default void init() {
        Scanner input = new Scanner(System.in);
        String key = "";

        System.out.println("Введите дано и то, что нужно найти.");

        while(true) {
            System.out.println("Вводите параметр и его значение:");
            try {
                key = input.nextLine();
                if(key.equals("end")) {
                    return;
                }

                data.put(key, Double.valueOf(input.nextLine()));
            } catch(NumberFormatException e) {
                data.put(key, null);
            }
        }
    }

    default void getAnswer() {
        init();
        data.forEach((String key, Double value) -> data.put(key, compute(key)));
    }
}
