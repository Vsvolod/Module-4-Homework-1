package org.example;

public class Main {
    public static void main(String[] args) {
        Phone nokia = new Phone();
        nokia.number = "+38 063 529 4462";
        nokia.model = "Nokia 3310";
        nokia.weight = 0.59;

        Phone samsung = new Phone();
        samsung.number = "+38 098 22 55 804";
        samsung.model = "Samsung Galaxy x10";
        samsung.weight = 0.45;

        Phone iphone = new Phone();
        iphone.number = "555 - 32 - 45";
        iphone.model = "iPhone 5s";
        iphone.weight = 0.9;
        //  System.out.println(samsung.model); // Тут выполняется условие "выведите на консоль значение их переменных.
        //  nokia.receiveCall(" Seva", nokia.number); Tut vipolnyayetsya usloviye "Vizovite recivecall s 2mya parametrami.
        //  nokia.sendMessage(nokia.number); // Тут выполняется условие с методом с переменной длины "Send message", Но я не уверен что правильно его понял.
        nokia.sendMessage(nokia.number);
    }
}