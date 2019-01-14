package StructuralPattern.AdapterPattern;

public class AudioPlayer {
    public static void main(String[] args) {
        AudioAdapter audioAdapter = new AudioAdapter();
        audioAdapter.play("mp3", "abc.mp3");
        audioAdapter.play("mp4","def.mp4");
        audioAdapter.play("vlc","ghi.vlc");
        audioAdapter.play("avi","jkl.avi");

    }
}
