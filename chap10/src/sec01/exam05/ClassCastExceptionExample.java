package sec01.exam05;   //ClassCastException. 상속과 구현에서 올바른 타입 변환이 발생하지 않았을 때 실행 예외

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
