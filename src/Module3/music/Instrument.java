package Module3.music;


public class Instrument {
    String type;
    String name;
    double preice;
    int quantity;


    Instrument guitar = new Guitar();
    Instrument piano = new Piano();
    Instrument trumpet = new Trumpet();

    public void play(){
        System.out.println("Music play");

    }
}
