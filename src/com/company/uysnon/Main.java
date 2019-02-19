package com.company.uysnon;

import java.util.Scanner;

public class Main {

    private static final String [][] STRINGS_HELLO_WORLD =
            {
                    {"1. -en", "Hello World"},
                    {"2. -ru", "Привет, мир"},
                    {"3. -CHN", "你好，世界"},
                    {"4. -ar", "مرحبا بالعالم"},
                    {"5. -de", "Hallo Welt"},
                    {"6. -fr", "Bonjour le monde"}
    };

    public static void main(String[] args) {
        System.out.println("Write number of item in the following list:");
        for (int i = 0; i< STRINGS_HELLO_WORLD.length; i++) {
            System.out.println(STRINGS_HELLO_WORLD[i][0]);
        }
        int number = -1;
        Scanner scanner = new Scanner(System.in); //Сканнер для считывания номера, по которому выведится стркоа
        while ((number<1)||(number>STRINGS_HELLO_WORLD.length)){
            number = scanner.nextInt();
        }
        scanner.close();
        System.out.println(STRINGS_HELLO_WORLD[number-1][1]);
    }
}
