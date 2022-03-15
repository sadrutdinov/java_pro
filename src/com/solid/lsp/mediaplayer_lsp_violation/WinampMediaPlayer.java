package com.solid.lsp.mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer {

    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
