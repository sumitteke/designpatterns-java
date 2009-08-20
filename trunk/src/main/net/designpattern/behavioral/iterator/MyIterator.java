package net.designpattern.behavioral.iterator;

public interface MyIterator<E> {
	
	public E next();
	
	public E previous();
	
	public E first();
	
	public E last();
}
