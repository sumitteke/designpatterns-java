package net.designpattern.structural.composite;

import java.util.HashMap;
import java.util.Map;

public class Group extends Component {
	
	//private List<Component> components;
	private Map<String, Component> components = new HashMap<String, Component>();

	public Group(String id) {
		//components = new ArrayList<Component>();
		setId(id);
	}
	public void addComponent(Component component){
		if(component instanceof Message){
			throw new IllegalArgumentException("");
		}
		components.put(component.getId(), component);
	}
	
	public void setFiledValue(String fieldId, Object value){
		((Field)getField(fieldId)).setValue(value);
	}
	
	protected Component getField(String fieldId) {
		return components.get(fieldId);
	}

	@Override
	public void print() {
		System.out.print(getId() + "{ ");
		/*for(Component component : components){
			component.print();
		}*/
		System.out.print(" }");
		
	}
	

}
