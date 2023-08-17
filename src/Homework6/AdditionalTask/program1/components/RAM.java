package Homework6.AdditionalTask.program1.components;

public class RAM {

    private final String title;
    private final int volume;

    public RAM() {
        title = "DDR3";
        volume = 8;;
    }

    public RAM(String setTitle, int setVolume){
        title = setTitle;
        volume = setVolume;
    }

    public void displayInformation() {
        System.out.printf("SSD\n   title: %s\n   volume: %d\n", title, volume);
    }
}
