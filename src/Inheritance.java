public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.color2="red";
        car.start();
        car.openSunroof();

    }
}

class Vehicle {
    String color2;

    void start() {
        System.out.println("차량이 출발합니다.");
    }
}

class Car extends Vehicle {
    Engine engine = new Engine();// Car 클래스는 Vehicle을 상속받음
    void openSunroof() {
        System.out.println("선루프를 엽니다.");
    }
}

class bike extends Vehicle {
    void backbreak() {
        System.out.println("브레이크.");
    }
}

class Engine {
    void run() {

    }
}