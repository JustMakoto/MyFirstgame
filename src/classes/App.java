/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author pupil
 */
public class App {
    public void firstGame() {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        int start = 1;
        int min = 0;
        int max = 10;
        int attempt = 1;
        System.out.println("---============================================================================---");
        System.out.println("Программа задумает число и попросит вас угадать его за определенное кол-во попыток.");
        System.out.println("---============================================================================---");
        System.out.print("1)Свой диапазон\n2)Стандартный диапазон (0-10) \nВаше действие: ");
        int diapon = scanner.nextInt();
        if (diapon == 1){
            System.out.print("\nМинимальное число: ");
            min = scanner.nextInt();
            System.out.print("Максимальное число: ");
            max = scanner.nextInt();
        }
        System.out.print("Введите желаемое кол-во попыток:");
        int lives = scanner.nextInt();
        int livesDef = lives;

        int randomNumber = min + rnd.nextInt(max - min + 1);
        int gameNum = 1;
        int winGame = 0;
        System.out.print("\nЗагаданное число находится в диапазоне от "+min+" до "+max+"\n\n");
        while (start == 1){
        
        
        System.out.print("У вас осталось попыток: " + livesDef + "\nПопытка номер: "+attempt+"\nВаш вариант ответа: ");
        int choose = scanner.nextInt();
        if (choose == randomNumber){
            System.out.println("\nПравильно! Вы угадали");
            
            winGame += 1;
            System.out.print("\n1)Сыграть еще раз \n2)Выйти \n3)Задать новый диапазон, указать новое кол-во попыток и начать новую игру  \nВаше действие: ");
            int play = scanner.nextInt();
            if (play == 1){
                start = 1;
                livesDef = lives;
                randomNumber = min + rnd.nextInt(max - min + 1);
                gameNum += 1;
                attempt = 1;
            }if (play == 2) {
                System.out.println("\nИгра окончена!\nВсего игр: "+ gameNum+"\nВыйгршных игр: "+winGame);
                start = 0;
            }if (play ==3) {
            System.out.print("\nМинимальное число: ");
            min = scanner.nextInt();
            System.out.print("Максимальное число: ");
            max = scanner.nextInt();
            System.out.print("Введите желаемое кол-во попыток:");
            lives = scanner.nextInt();
            livesDef = lives;
            start = 1;
            randomNumber = rnd.nextInt(11);
            gameNum += 1;
            attempt = 1;
            }
        
        }else {
            System.out.println("\n\nНеверно!");
            livesDef -= 1;
            attempt += 1;
        }
        
        if (livesDef == 0){
            System.out.println("Вы не смогли угадать, загаданное число равняется: "+randomNumber); 
            
            System.out.print("\n1)Сыграть еще раз \n2)Выйти \n3)Задать новый диапазон, указать новое кол-во попыток и начать новую игру\nВаше действие: ");
            int play = scanner.nextInt();
            if (play == 1){
                start = 1;
                livesDef = lives;
                randomNumber = rnd.nextInt(11);
                gameNum += 1;
                attempt = 0;
            }if (play ==2) {
                System.out.println("\nИгра окончена!\nВсего игр: "+ gameNum+"\nВыйгршных игр: "+winGame);
                start = 0;
            }if (play ==3) {
            System.out.print("Минимальное число: ");
            min = scanner.nextInt();
            System.out.print("Максимальное число: ");
            max = scanner.nextInt();
            System.out.print("Введите желаемое кол-во попыток:");
            lives = scanner.nextInt();
            livesDef = lives;
            start = 1;
            randomNumber = rnd.nextInt(11);
            gameNum += 1;
            attempt = 0;
            
            }
        }}
        
        
        
        
        }
    }

