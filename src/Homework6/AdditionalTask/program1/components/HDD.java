package Homework6.AdditionalTask.program1.components;

public class HDD {

    private final String title;
    private final int volume;
    private final String type;

    public HDD() {
        title = "WD10EZRZ";
        volume = 1000;
        type = "внутренний";
    }

    public HDD(String setTitle, int setVolume, String setType){
        title = setTitle;
        volume = setVolume;
        type = setType;
    }

    public void displayInformation() {
        System.out.printf("HDD\n   title: %s\n   volume: %d\n   type: %s\n", title, volume, type);
    }
}
