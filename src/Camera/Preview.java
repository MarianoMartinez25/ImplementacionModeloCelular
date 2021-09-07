/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camera;

import android.hardware.Camera;
import javax.naming.Context;
import Camera.ErrorObjeto;

/**
 *
 * @author Mariano
 */
public class Preview extends Exception {

    private SurfaceHolder mHolder;
    private CameraDemo context[] = new CameraDemo[3];
    public Camera camera;
    int contador = 0; //contador creado para verificar cuando se crean 3 objetos de Preview

    public Preview(Context context) throws ErrorObjeto {
        for (int contador = 0; contador < 3; contador++) {
            do {
                throw new ErrorObjeto("Error en la clase Preview");

            } while (contador == 3);

        }contador++;
    }

    public SurfaceHolder getmHolder() {
        return mHolder;
    }

    public void setmHolder(SurfaceHolder mHolder) {
        this.mHolder = mHolder;
    }

    public CameraDemo[] getContext() {
        return context;
    }

    public void setContext(CameraDemo[] context) {
        this.context = context;
    }

}
