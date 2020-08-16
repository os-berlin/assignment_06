package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list() {
		//Assert
		CustomList<Integer> sut = new CustomArrayList<>();
		
		//Act
		sut.add(1);
		Integer value = sut.get(0);
		
		//Assert
		assertEquals(1, value);
	}
	
	@Test 
	void should_add_x_items_to_list () {
		int x = 20000;
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for (int i=0; i < x; i++) {
			sut.add(i);
		}
		
		for (int i=0; i < x; i++) {
			assertEquals(i, sut.get(i));
		}
	}
	
	@Test
	void should_insert_item_at_index_into_list () {
		int sutSize = 30;
		int index = 5;
		//if (sutSize == index) this test fails but I guess it's OK since throwing and OutOfBoundsException is expected
		//or how should I test explicitly for that exception?
		
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i<sutSize; i++) {
			sut.add(i);
		}
		
		Integer newSize = sut.getSize()+1;
		sut.add(index, 1000);
		Integer size = sut.getSize();
		
		
		assertEquals(1000, sut.get(index));
		assertEquals (size, newSize);

	}
	
	@Test
	void should_remove_item_from_list () {
		int x = 24;
		int index = 5;
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for (int i=0; i < x; i++) {
			sut.add(i);
		}
		
		
		Integer nextItem = sut.get(index+1);	
		Integer newSize = sut.getSize()-1;
		
		sut.remove(index);
		
		Integer removedItem = sut.get(index);
		Integer size = sut.getSize();
		
		boolean notNull = true;
		for (int i=0; i < sut.getSize(); i++ ) {
			if (sut.get(i) == null) notNull = false;
		}
		
		assertEquals(removedItem, nextItem);
		assertEquals(size, newSize);
		assertEquals(true, notNull);
		
			
	}

}
