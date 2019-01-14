package StructuralPattern.AdapterPattern;

public class AudioAdapter implements MediaPlayer{
    MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 File : "+fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else {
            System.out.println("Invalid media format : "+audioType+" can't be played");
        }
    }
}