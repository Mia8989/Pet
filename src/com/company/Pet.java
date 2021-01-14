package com.company;
public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet(){
        name = "default name";
        age =0;
        location ="default location";
        type="default type";
}
    public Pet(String name, String type, int age, String location)
    {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    public String getName()
    {return name;}
         public void setName(String name) {this.name = name;}

    public Integer getAge()
    {return age; }
    public void setAge(int age) {this.age =age;}

    public String getLocation()
    {return location;}
    public void setLocation(String location) {this.location = location;}

    public String getType()
    {return type;}
    public void setType(String type) {this.type = type;}
}
