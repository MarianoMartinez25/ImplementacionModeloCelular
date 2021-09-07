/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camera;

import android.app.Activity;
import android.hardware.Camera;
import java.awt.*;

/**
 *
 * @author Mariano
 */
public class CameraDemo extends Activity {

    private Button buttonclick;
    private ShutterCallBack shutterCallback;
    private PictureCallback rawCallback;
    private PictureCallback jpegCallback;
    private Preview preview[];
    private Camera camera[];

    public CameraDemo() {
        super();
    }

    protected void onCreate() {
        System.out.println("Salida del metodo onCreate de la clase CameraDemo");
    }

    public Button getButtonclick() {
        return buttonclick;
    }

    public void setButtonclick(Button buttonclick) {
        this.buttonclick = buttonclick;
    }

    public ShutterCallBack getShutterCallback() {
        return shutterCallback;
    }

    public void setShutterCallback(ShutterCallBack shutterCallback) {
        this.shutterCallback = shutterCallback;
    }

    public PictureCallback getRawCallback() {
        return rawCallback;
    }

    public void setRawCallback(PictureCallback rawCallback) {
        this.rawCallback = rawCallback;
    }

    public PictureCallback getJpegCallback() {
        return jpegCallback;
    }

    public void setJpegCallback(PictureCallback jpegCallback) {
        this.jpegCallback = jpegCallback;
    }

    public Preview[] getPreview() {
        return preview;
    }

    public void setPreview(Preview[] preview) {
        this.preview = preview;
    }

    public Camera[] getCamera() {
        return camera;
    }

    public void setCamera(Camera[] camera) {
        this.camera = camera;
    }

    public void MostrarDatos(){
        onCreate();
    }
}
