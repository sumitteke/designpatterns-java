package net.designpattern.structural.composite;

public class Eg {

	public static void main(String[] args) {
		Field field1 = new Field("Field1");
		Field field2 = new Field("Field2");
		Field field3 = new Field("Field3");
		
		Group group1 = new Group("Group1");
		group1.addComponent(field1);
		group1.addComponent(field2);
		Group group2 = new Group("Group2");
		group2.addComponent(field3);
		group2.addComponent(group1);
		
		Message message = new Message("Message");
		message.addComponent(field1);
		message.addComponent(group1);
		message.addComponent(group2);
		message.addComponent(field3);
		
		message.print();

	}

}
