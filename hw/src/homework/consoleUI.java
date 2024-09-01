package homework;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class consoleUI{

    private Scanner sc = new Scanner(System.in);
    private laptor lap = new laptor();

    public void run(){
        String r = "";
        Boolean b = true;

        while (b){
            System.out.println("Введите действие.");
            System.out.println("Добавить ноутбук в каталог (для сервиса) - d");
            System.out.println("Поиск ноутбука по характеристикам (для пользователя) - s");
            System.out.println("Если хоите завершить программу, нажмите - q");
            r = sc.next();
            if (r.equals("d")){
                System.out.println(lap.addLaptor());
            }
            else if(r.equals("s")){
                search se = new search();
                System.out.println(se.criteria());
            } else if (r.equals("q")) {
                System.out.println("Программа завершина.");
                System.exit(0);
            }

        }
    }
}

