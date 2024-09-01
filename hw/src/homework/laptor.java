package homework;

import java.util.*;

public class laptor {

    public static Map<String, String> laptor = new HashMap<>();
    private static Scanner s = new Scanner(System.in);
    public static String model = "";
    public static int count = 0;

    public  Map<String, String> addLaptor(){
        System.out.println("Введите модель ноутбука и его характеристики.");
        while (count != 4){
            if (count == 0){
                System.out.println("Введите модель ноутбука: ");
                model = s.next();
                laptor.put(model, "model");
                count +=1;
            }
            if (count == 1){
                System.out.println("Введите обьем озу модели" + "("+ model +"): ");
                laptor.put(s.next(), model);
                count +=1;
            }
            if (count == 2){
                System.out.println("Введите объем жестого диска" + "(" + model + "): ");
                laptor.put(s.next(), model);
                count +=1;
            }
            if (count == 3){
                System.out.println("Введите операционную систему модели " + "(" + model + "): ");
                laptor.put(s.next(), model);
                count += 1;
            }
            if (count == 4){
                System.out.println("Введите цвет ноутбука модели" + "(" + model + "): ");
                laptor.put(s.next(), model);
            }

        }
        count = 0;
        model = "";
        System.out.println(laptor);
        return laptor;
    }
}
