package com.lena.learn.exceptions.dima.methodsOfObject.clone;

import java.io.*;

class Cat implements Serializable{
    private String name;
    private String color;
    private int age;
    private Car car;

    public Cat(String name, String color, int age, Car car) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.car = car;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}' + car.getColor();
    }
}
public class BasketCats{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car();
        car.setColor("red");
        Cat vaska = new Cat("Vaska","Gray",4, car);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);
        //сохраняем состояние кота Васьки в поток и закрываем его(поток)
        ous.writeObject(vaska);
        ous.close();
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        //создаём кота для опытов и инициализируем его состояние Васькиным
        Cat cloneVaska = (Cat)ois.readObject();
        System.out.println(vaska);
        System.out.println(cloneVaska);
        System.out.println("*********************************************");
        cloneVaska.setColor("Black");
        cloneVaska.getCar().setColor("white");
        //Убеждаемся что у кота Васьки теперь есть клон, над которым можно ставить опыты без ущерба Василию
        System.out.println(vaska);
        System.out.println(cloneVaska);

    }
}