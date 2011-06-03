package net.designpattern.structural.flyweight;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class FlyweightSample {
	
	private String data;
	
	private static final WeakHashMap<FlyweightSample, WeakReference<FlyweightSample>> flyweightData = 
		new WeakHashMap<FlyweightSample, WeakReference<FlyweightSample>>();
	
	private FlyweightSample(String data){
		this.data = data;
	}
	
	public static FlyweightSample create(String data) {
		// We are unconcerned with object creation cost, we are reducing overall memory consumption
		FlyweightSample obj = new FlyweightSample(data);
		
		if(!flyweightData.containsKey(obj)){
			flyweightData.put(obj, new WeakReference<FlyweightSample>(obj));
		}
		// return the single immutable copy with the given values
		return flyweightData.get(obj).get();
	}
	
	@Override
	public boolean equals(Object obj) {
        if (obj instanceof FlyweightSample) {
            if (obj == this) {
                return true;
            }
            FlyweightSample other = (FlyweightSample) obj;
            return other.data.equals(data);
        }
        return false;
    }

	// Getters for the data, but no setters. FlyweightSample is immutable.
}
