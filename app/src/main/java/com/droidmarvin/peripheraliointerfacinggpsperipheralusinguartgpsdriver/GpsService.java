package com.droidmarvin.peripheraliointerfacinggpsperipheralusinguartgpsdriver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GpsService extends Service {
    public GpsService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_NOT_STICKY;
    }
}
