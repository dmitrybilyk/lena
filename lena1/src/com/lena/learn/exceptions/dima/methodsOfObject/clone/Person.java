package com.lena.learn.exceptions.dima.methodsOfObject.clone;

public class Person {
        private int age;
        private String name;
        private Car car;
        public Person(int age, String name){
            this.age=age;
            this.name=name;
        }
        // конструктор копии
        public Person(Person other) {
            this(other.getAge(), other.getName());
            Car car2 = new Car();
            car2.setColor(other.getCar().getColor());
            this.car = car2;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}' + car.getColor();
        }

        public static void main(String[] args) {
            Car car = new Car();
            car.setColor("red");
            Person original = new Person(18, "Grishka");
            original.setCar(car);
            Person clone = new Person(original);
            clone.getCar().setColor("white");
            System.out.println(original);
            System.out.println(clone);
        }
}