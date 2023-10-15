package br.com.carstore.model;

public class Car {
    private final String name;
    private String id;

    public Car(String name){
        this.name = name;
    }
    public Car (String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getId(){
        return id;
    }

}
