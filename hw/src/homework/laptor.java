package homework;

import java.util.*;

public class laptor {

    public boolean addLaptor() {
        return false;
    }

    public class Laptop {
        String brand;
        int ram;
        int hdd;
        String os;
        String color;

        public Laptop(String brand, int ram, int hdd, String os, String color) {
            this.brand = brand;
            this.ram = ram;
            this.hdd = hdd;
            this.os = os;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Laptop{" +
                    "brand='" + brand + '\'' +
                    ", ram=" + ram +
                    ", hdd=" + hdd +
                    ", os='" + os + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static Set<Laptop> laptops = new HashSet<>();
        public void model (){
            laptops.add(new Laptop("Dell", 16, 512, "Windows", "Black"));
            laptops.add(new Laptop("Apple", 8, 256, "MacOS", "Silver"));
            laptops.add(new Laptop("Lenovo", 32, 1024, "Windows", "Gray"));
        }
    }
