package com.github.umarshabazov.sheferuniversity.Phone;


// 1. Создайте класс Phone, который содержит переменные number, model и weight.
public class Phone {

    public int number;

    public int weight;
    public String model;


//   2.Создайте три экземпляра этого класса. description
// Созданы в классе PhoneObjects

    //3.Выведите на консоль значения их переменных.
    @Override
    public String toString() {
        return "Phone number is " +
                number + ".\n" + "Phone weight equals " + weight +
                " grams." + "\nPhone model is " + model + ".";
    }

//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//    Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.

    public void receiveCall(String name) {

        System.out.println("Звонит " + name);

    }

    public int getNumber(int number) {

        return number;
    }
//   5. Добавить конструктор в класс Phone, который принимает на вход три параметра
//   для инициализации переменных класса number, model и weight.

    public Phone(int number, int weight, String model) {

//        this.number = number;
//        this.weight = weight;
//        this.model = model;

//        + 8.Вызвать из конструктора с тремя параметрами конструктор с двумя.
        this(number, model);
        this.weight = weight;


    }

    //   6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса
//   - number, model.
    public Phone(int number, String model) {

        this.number = number;
        this.model = model;
    }

    //   7. Добавить конструктор без параметров.
    public Phone() {
    }


    //   9. Добавьте перегруженный метод receiveCall, который принимает два параметра
//    - имя звонящего и номер телефона звонящего. Вызвать этот метод.
    public void receiveCall(String name, int number) {

    }

    //   10. Создать метод sendMessage с аргументами переменной длины (vararg).
//    Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
//    Метод выводит на консоль номера этих телефонов.
    public void sendMessage(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
