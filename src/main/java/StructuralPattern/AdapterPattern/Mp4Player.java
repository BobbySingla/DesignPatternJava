package StructuralPattern.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

        return;
    }

    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: "+fileName);
    }
}
