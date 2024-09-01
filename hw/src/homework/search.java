package homework;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class search {
    public String model = "";
    public String ozu = "";
    public String hardDrive = "";
    public String color = "";
    public Scanner s = new Scanner(System.in);
    laptor lap = new laptor();
    servis ser = new servis();

    public boolean criteria(){
        Map<String, String> phone = new HashMap<>();
        System.out.println("1 Введите модель, если не знаете какую, поставьте - : ");
        model = s.next();
        if(model.equals("-")){
            model = null;

        }
        System.out.println("2 Введите озу, если не знаете какой хотите обьем, поставте -: ");
        ozu = s.next();
        if (ozu.equals("-")){
            ozu = null;
        }
        System.out.println("3 Введите объем жестого диска, если не знаете какой хотите, поставьте - :");
        hardDrive = s.next();
        if(hardDrive.equals("-")){
            hardDrive = null;
        }
        System.out.println("4 Введите цвет, если не знаете, какой хотите, поставьте - : ");
        color = s.next();
        if (color.equals("-")){
            color = null;
        }

//        if (model.equals(null) & ozu.equals(null) & hardDrive.equals(null) & color.equals(null)){
//            System.out.println("Недостаточно данных для происка.");
//            System.exit(0);
//        }

        if (laptor.laptor.containsKey(model)) {
            System.out.println(phone.put(model, null));
        }
        else if (laptor.laptor.containsKey(ozu)){
            System.out.println(laptor.laptor.get(ozu));
        }
        else if (laptor.laptor.containsKey(hardDrive)){
            System.out.println(laptor.laptor.get(hardDrive));
        }
        else if(laptor.laptor.containsKey(color)){
            System.out.println(laptor.laptor.get(color));
        }
        return false;
    }

}

