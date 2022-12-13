public class Cow extends Animal {

    @Override
    void sound() {

        System.out.println("Muuu");
        SoundOfAnimals.soundOfAnimal("cow.mp3");
    }
}
