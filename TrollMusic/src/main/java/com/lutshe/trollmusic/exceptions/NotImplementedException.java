package com.lutshe.trollmusic.exceptions;

/**
 * Created by Arsen Adzhiametov on 29.10.2015
 */
public class NotImplementedException extends RuntimeException {

    public NotImplementedException() {
        super("Method not implemented yet");
    }
}
