package net.media.training.designpattern.builder;

public class PersonBuilders {
    private String name;
    private int id;
    private String city;
    private String country;

    public PersonBuilders name(String name){
        this.name = name;
        return this;
    }
    public PersonBuilders id(int id){
        this.id = id;
        return this;
    }
    public PersonBuilders city(String city){
        this.city = city;
        return this;
    }
    public PersonBuilders country(String country){
        this.country = country;
        return this;
    }

    public Person build(){
        return (new Person(name, id, city, country));
    }
}
