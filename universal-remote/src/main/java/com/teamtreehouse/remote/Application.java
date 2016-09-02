package com.teamtreehouse.remote;

import com.teamtreehouse.remote.devices.AppleTv;
import com.teamtreehouse.remote.devices.BluRayPlayer;
import com.teamtreehouse.remote.devices.Stereo;

public class Application {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl();
        BluRayPlayer bluRay = new BluRayPlayer();
        Stereo stereo = new Stereo();
        AppleTv appleTv = new AppleTv();
        rc.addDevice(bluRay);
        rc.addDevice(stereo);
        rc.addDevice(appleTv);
        rc.pressPowerButton();
        rc.pressPowerButton();
    }
}
