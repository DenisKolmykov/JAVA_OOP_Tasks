package less_OOP_07_Decorator_Factory_Observer;


interface MediaPlayer {
    void play();
}

class AudioPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing audio...");
    }
}

class VideoPlayer {
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

class VideoPlayerAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public VideoPlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play() {
        videoPlayer.playVideo();
    }
}

public class less_oop_07_seminar_adapter3 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();

        VideoPlayer videoPlayer = new VideoPlayer();
        MediaPlayer videoPlayerAdapter = new VideoPlayerAdapter(videoPlayer);
        videoPlayerAdapter.play();
    }
}