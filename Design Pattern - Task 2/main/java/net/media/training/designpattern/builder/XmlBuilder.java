package net.media.training.designpattern.builder;

public class XmlBuilder {
    int id;
    String name, city, country;
    String finalString="";
    Person person;

    XmlBuilder(Person person){
        this.person = person;
    }

    public XmlBuilder addId(){
        finalString = finalString + "<Person id=\"" + person.getId();
        return this;
    }

    public XmlBuilder addName(){
        finalString = finalString + "\" name=\"" + person.getName();
        return this;
    }

    public XmlBuilder addCity(){
        finalString = finalString + "\">" + "<Address><City>" + person.getCity();
        return this;
    }

    public XmlBuilder addCountry(){
        finalString = finalString + "</City><Country>" + person.getCountry() + "</Country></Address>" +
                "</Person>";
        return this;
    }

    public String printDetails(){
        System.out.println(finalString);
        return finalString;
    }

}