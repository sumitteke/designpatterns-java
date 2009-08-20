package net.designpattern.structural.composite;

public class Field extends Component {

	public Field(String id) {
		setId(id);
	}
	
	public void setBaseDataType(){
		
	}

	@Override
	public void print() {
		System.out.print("" + getId() + ", ");
	}
	
	public void setValue(Object value){
		
	}

}
