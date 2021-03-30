package com.company;

public class Rectangle {
    // поля класса
    double x;
    double y;

    // конструктор 1
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
}
    // конструктор 2
    public Rectangle(double x) {
        this.x = x;
        this.y = x;
    }
    // метод calculateArea
    double calculateArea() {
       double S = x * y;
        return S;
    }
    // метод printArea
    void printArea(double S) {
         System.out.println(S);
    }
    // метод printRectangleKind
    void printRectangleKind() {
        if(x == y) {
            System.out.println("Это квадрат");
        } else {System.out.println("Это прямоугольник");}
    }
    // метод isTheSameRectangle
   boolean isTheSameRectangle(Rectangle rectangle) {
       return this.x == rectangle.x &&
               this.y == rectangle.y;
    }


    //    // сравнение объектов
//    boolean theSamePerson(Person person) {
//        return this.firstName.equals(person.firstName) &&
//                this.lastName.equals(person.lastName) &&
//                this.age == person.age;
//    }

}