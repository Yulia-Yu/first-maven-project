package ru.itgirl;


import java.io.InputStream;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        day = day.toLowerCase();
        switch(day){
            case "monday":
                day = "Понедельник";
                break;
            case "tuesday":
                day = "Вторник";
                break;
            case "wednesday":
                day = "Среда";
                break;
            case "thursday":
                day = "Четверг";
                break;
            case "friday":
                day = "Пятница";
                break;
            case "saturday":
                day = "Суббота";
                break;
            case "sunday":
                day = "Воскресенье";
                break;
        }

        System.out.println("Сегодня " + day +  "!");
    }
}
