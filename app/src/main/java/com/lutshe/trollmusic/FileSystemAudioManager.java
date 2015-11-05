package com.lutshe.trollmusic;

import android.os.Environment;

import java.io.File;

/**
 * Created by Arsen Adzhiametov on 01.11.2015
 */
public class FileSystemAudioManager {

    private String pathToAudioFolder = Environment.getExternalStorageDirectory() + "/trollmusic";


    public String getAudionInPosition(int position) {
        File file = new File(pathToAudioFolder);
        File[] list = file.listFiles();
        return list[position].getAbsolutePath();
    }

    public int getAudioCount() {
        File file = new File(pathToAudioFolder);
        if (!file.exists()) {
            file.mkdir();
            return 0;
        }
        File[] list = file.listFiles();
        int count = 0;
        for (File f : list) {
            String name = f.getName();
            if (name.endsWith(".mp3"))
                count++;
        }
        return count;
    }

    public String getAudioNameInPosition(int position) {
        File file = new File(pathToAudioFolder);
        File[] list = file.listFiles();
        return list[position].getName().substring(0,7);
    }
}
