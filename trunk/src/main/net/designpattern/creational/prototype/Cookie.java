package net.designpattern.creational.prototype;

public class Cookie implements Cloneable {
	
	@Override
	public Object clone(){
		try{
            Cookie copy = (Cookie)super.clone();
            return copy;
        }
        catch(CloneNotSupportedException e){
           e.printStackTrace();
           return null;
        }
	}

}
