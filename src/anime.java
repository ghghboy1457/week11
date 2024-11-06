// 포함 관계: Food 클래스 (음식)
class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// 부모 클래스 Animal
class Animal {
    protected String name;
    protected String sound;
    protected Food food;

    public Animal(String name, String sound, Food food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
    }

    // 오버라이딩을 위한 메서드
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    // 오버로딩된 메서드 (음식을 먹는 방법)
    public void eat() {
        System.out.println(name + " 는 이거를 먹어 >>> " + food.getName());
    }

    public void eat(String extraFood) {
        System.out.println(name + " 는 " + food.getName() + " 이거를 먹는다>>> " + extraFood);
    }
}

// 자식 클래스 Dog
class Dog extends Animal {

    public Dog(String name, Food food) {
        super(name, "ㄱㄱ", food);
    }

    // 오버라이딩된 메서드
    @Override
    public void makeSound() {
        System.out.println(name + " 소리: 월월!");
    }
}

// 자식 클래스 Cat
class Cat extends Animal {

    public Cat(String name, Food food) {
        super(name, "Meow", food);
    }

    // 오버라이딩된 메서드
    @Override
    public void makeSound() {
        System.out.println(name + " 소리: 냥냥!");
    }
}

// 자식 클래스 Bird
class Bird extends Animal {

    public Bird(String name, Food food) {
        super(name, "꺄악", food);
    }

    // 오버라이딩된 메서드
    @Override
    public void makeSound() {
        System.out.println(name + " 소리: 짹!");
    }
}

public class anime {
    public static void main(String[] args) {
        // 음식을 설정
        Food dogFood = new Food("뼈다귀");
        Food catFood = new Food("고양이 음식은");
        Food birdFood = new Food("날다");

        // 동물 객체 생성
        Animal dog = new Dog("개", dogFood);
        Animal cat = new Cat("고양이", catFood);
        Animal bird = new Bird("새", birdFood);

        // 오버라이딩된 소리 출력
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        // 오버로딩된 eat 메서드 호출
        dog.eat();
        cat.eat("물고기");
        bird.eat("지렁이");
    }
}
