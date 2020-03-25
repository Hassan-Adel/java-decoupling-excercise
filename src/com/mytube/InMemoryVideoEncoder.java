package com.mytube;

import com.mytube.interfaces.VideoEncoder;

public class InMemoryVideoEncoder implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
