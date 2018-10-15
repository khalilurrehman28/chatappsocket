package com.app.chatapp_socket.background;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class backgroundService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
