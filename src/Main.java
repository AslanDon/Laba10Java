public class Main {
    public static void main(String[] args) {

    }
}

class Animal{
    String food;
    String location;

    public void makeNoise(){
        System.out.println("Животное издает звуки");
    }

    public void eat(){
        System.out.println("Животное ест");
    }

    public void sleep(){
        System.out.println("Животное спит");
    }

}

class  Dog extends Animal{

    public String kliki;
    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }
    @Override
    public void eat(){
        System.out.println("Собака кушает собачий корм");
    }
}

class Cat extends Animal{
    public String kogti;
    @Override
    public void makeNoise(){
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat(){
        System.out.println("Кошка кушает жидкий кошачий корм");
    }
}

class Horse extends Animal{
    public String kopita;
    @Override
    public void makeNoise(){
        System.out.println("Конь ржот");
    }
    @Override
    public void eat(){
        System.out.println("Конь ест яблоки");
    }
}

class Veterinar{
    public void treatAnimal(Animal animal){
        System.out.println(animal.food);
        System.out.println(animal.location);
    }
}