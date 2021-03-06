package com.blackzheng.me.piebald.util;

import java.io.UnsupportedEncodingException;

/**
 * Created by BlackZheng on 2016/4/8.
 */
public class Decoder {
    public static String decodeURL(String rawURL){
        try {
            return new String(rawURL.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return rawURL;
        }
    }
    public static String decodeStr(String str){
        if(str != null){
            try {
                return new String(str.getBytes("iso8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        return "Unknown";
    }
}
