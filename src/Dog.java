public  class Dog extends Animal{

    @Override
     void sound() {

        System.out.println("Bark");
        SoundOfAnimals.soundOfAnimal("dog.mp3");
     }
}
