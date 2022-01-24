package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        /* A colored lit cube. Needs light source! */ 
    Box boxMesh = new Box(1f,1f,1f); 
    Geometry boxGeo = new Geometry("Colored Box", boxMesh); 
    Material boxMat = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md"); 
    boxMat.setBoolean("UseMaterialColors", true); 
    boxMat.setColor("Ambient", ColorRGBA.Green); 
    boxMat.setColor("Diffuse", ColorRGBA.Green); 
    boxGeo.setMaterial(boxMat); 
     rootNode.attachChild(boxGeo);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
