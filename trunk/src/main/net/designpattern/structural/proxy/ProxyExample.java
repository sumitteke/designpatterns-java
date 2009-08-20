package net.designpattern.structural.proxy;

import java.util.ArrayList;

interface Image {
    public void displayImage();
}
 
class RealImage implements Image {
    private String filename;
    public RealImage(String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }
 
    private void loadImageFromDisk() {
        // Potentially expensive operation
        // ...
        System.out.println("Loading   "+filename);
    }
 
    public void displayImage() { System.out.println("Displaying "+filename); }
}
 
class ProxyImage implements Image {
    private String filename;
    private Image image;
 
    public ProxyImage(String filename) { this.filename = filename; }
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename); // load only on demand
        }
        image.displayImage();
    }
}
 
public class ProxyExample {
    public static void main(String[] args) {
        ArrayList<Image> images = new ArrayList<Image>();
        images.add( new ProxyImage("HiRes_10MB_Photo1") );
        images.add( new ProxyImage("HiRes_10MB_Photo2") );
        images.add( new ProxyImage("HiRes_10MB_Photo3") );
 
        images.get(0).displayImage(); // loading necessary
        images.get(1).displayImage(); // loading necessary
        images.get(0).displayImage(); // no loading necessary; already done
        // the third image will never be loaded - time saved!
    }
}

