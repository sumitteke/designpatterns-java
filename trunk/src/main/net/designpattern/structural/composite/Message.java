package net.designpattern.structural.composite;

public class Message extends Group {

	public Message(String id) {
		super(id);
	}
	//add xtra functionality at message level.

	public static void main(String[] args){
		Message orderMessage = new Message("Order");
		orderMessage.addComponent(new Field("Symbol"));
		Group mulitpleOrders = new Group("Multiple");
		mulitpleOrders.addComponent(new Field("Qty"));
		
		orderMessage.addComponent(mulitpleOrders);
		
		orderMessage.setFiledValue("Symbol", 10);
		orderMessage.setFiledValue("Symbol", "String");
	}
}
