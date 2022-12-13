public class Horse extends Animal{
    @Override
    void sound() {

        System.out.println("Neighh");
        SoundOfAnimals.soundOfAnimal("Horse.mp3");
    }

    @Override
    public void move() {
        System.out.println("*CLACK*CLACK*");
    }
}
