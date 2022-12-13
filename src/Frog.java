public class Frog extends Animal{
    @Override
    void sound() {

        System.out.println("Ribbit");
        SoundOfAnimals.soundOfAnimal("Frog.mp3");
    }

    @Override
    public void move() {
        System.out.println("E broasca,nu face multe");
    }
}
