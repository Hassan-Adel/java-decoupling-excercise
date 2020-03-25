package com.mytube;

import com.mytube.interfaces.EmailService;
import com.mytube.interfaces.VideoDatabase;
import com.mytube.interfaces.VideoEncoder;
import com.mytube.interfaces.VideoProcessor;

public class InMemoryVideoProcessor implements VideoProcessor {
    VideoEncoder encoder;
    VideoDatabase database;
    EmailService emailService;

    public InMemoryVideoProcessor(VideoEncoder videoEncoder, VideoDatabase videoDatabase, EmailService emailService) {
        this.encoder = videoEncoder;
        this.database = videoDatabase;
        this.emailService = emailService;
    }

    @Override
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

