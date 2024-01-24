package com.github.umarshabazov.sheferuniversity.Phone;


// 1. Создайте класс Phone, который содержит переменные number, model и weight.
public class Phone {

    public int number;
    public int weight;
    public String model;



//   2.Создайте три экземпляра этого класса.
// Созданы в классе PhoneObjects

    //3.Выведите на консоль значения их переменных.
@Override
public String toString() {
    return "Phone number is " + number +  ".\n" + "Phone weight equals " + weight + " grams." + "\nPhone model is " + model + ".";
    }

//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//    Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.

    public String receiveCall(String name) {

        return "Звонит " + name;

    }

    public int getNumber(int number) {

        return number;
    }
}
