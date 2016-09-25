package nz.ac.vuw.ecs.nasadailyimage.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.renderscript.ScriptGroup;
import android.text.StaticLayout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Yiming on 11/08/16.
 */
public class PictureUtils {
    public static Bitmap getBitmapFromURL(String src){
        //##Missing##
        // Add implementation for this function to obtain a bitmap from the given image url.
        // Hints:
        // 1. Define URL
        // 2. Make HttpURLConnection
        // 3. set connection and InputStream
        // 4. Use BitmapFactory.decodeStream to get the bitmap, then return.
        try{

            System.out.println("trying to get bitmap from url");
            URL u = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) u.openConnection();
            return BitmapFactory.decodeStream(connection.getInputStream());

        }  catch(Exception e){
            e.printStackTrace();
        }




        return null;
    }
}
