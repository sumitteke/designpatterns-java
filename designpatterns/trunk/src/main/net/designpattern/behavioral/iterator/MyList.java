package net.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyList<E>{
	
	private List<E> list;
	
	public MyList() {
		list = new ArrayList<E>();
	}
	
	public OddIterator<E> getOddIterator() {
		OddIterator<E> iterator = new OddIterator<E> () {

			public E first() {
				// TODO Return first odd
				return null;
			}

			public E last() {
				// TODO Return last odd
				return null;
			}

			public E next() {
				// TODO Return next odd
				return null;
			}

			public E previous() {
				// TODO Return previous odd
				return null;
			}
			
		};
		return iterator;
	}
	
	public EvenIterator<E> getEvenIterator() {
		EvenIterator<E> iterator = new EvenIterator<E> () {

			public E first() {
				// TODO Return first even element
				return null;
			}

			public E last() {
				// TODO Return last even element
				return null;
			}

			public E next() {
				// TODO Return next even element
				return null;
			}

			public E previous() {
				// TODO Return previous even element
				return null;
			}
			
		};
		return iterator;
	}
	
	public MyIterator<E> getIterator() {
		MyIterator<E> iterator = new MyIterator<E> () {

			public E first() {
				// TODO Return what ever u want
				return null;
			}

			public E last() {
				// TODO Return what ever u want
				return null;
			}

			public E next() {
				// TODO Return what ever u want
				return null;
			}

			public E previous() {
				// TODO Return what ever u want
				return null;
			}
			
		};
		return iterator;
	}

}
