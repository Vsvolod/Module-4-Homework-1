package org.example;

public class Phone {
    String number;
    String model;
    double weight;

    public void Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public void Phone(String number, String model, double weight){
        this.Phone(number, model);
        this.weight = weight;
    }
    public void  Phone(){
    }

    public void receiveCall(String name) {
        System.out.println("Phones " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println(number + name + " phones you");
    }

    public String sendMessage(String forWho){
        forWho = "User " + number + " will receive your message.";
       System.out.println(forWho);
       return forWho;
    }

}
