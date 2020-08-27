package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list() {
		// Assert
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(1);
		Integer value = sut.get(0);

		// Assert
		assertEquals(1, value);
	}

	@Test
	void should_add_x_items_to_list() {
		long x = 10000;
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < x; i++) {
			sut.add(i);
		}

		for (int i = 0; i < x; i++) {
			assertEquals(i, sut.get(i));
		}
	}

	@Test
	void should_insert_item_at_last_index_into_list() {
		int sutSize = 10;
		int lastIndex = 9;

		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() + 1;
		sut.add(lastIndex, 1000);
		Integer postAddSize = sut.getSize();

		assertEquals(1000, sut.get(lastIndex));
		assertEquals(postAddSize, expectedSize);

	}

	@Test
	void should_insert_item_at_first_index_into_list() {
		int sutSize = 10;
		int firstIndex = 0;

		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() + 1;
		sut.add(firstIndex, 1000);
		Integer postAddSize = sut.getSize();

		assertEquals(1000, sut.get(firstIndex));
		assertEquals(postAddSize, expectedSize);

	}

	@Test
	void should_insert_item_at_mid_index_into_list() {
		int sutSize = 10;
		int midIndex = 5;

		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() + 1;
		sut.add(midIndex, 1000);
		Integer postAddSize = sut.getSize();

		assertEquals(1000, sut.get(midIndex));
		assertEquals(postAddSize, expectedSize);

	}

	@Test
	void should_remove_item_at_first_index_from_list() {
		int sutSize = 24;
		int index = 0;

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer nextItem = sut.get(index + 1);
		Integer expectedSize = sut.getSize() - 1;

		sut.remove(index);

		Integer postRemoveItem = sut.get(index);
		Integer postRemoveSize = sut.getSize();

		boolean notNull = true;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				notNull = false;
		}

		assertEquals(postRemoveItem, nextItem);
		assertEquals(postRemoveSize, expectedSize);
		assertEquals(true, notNull);
	}

	@Test
	void should_remove_item_at_mid_index_from_list() {
		int sutSize = 24;
		int index = 5;

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer nextItem = sut.get(index + 1);
		Integer expectedSize = sut.getSize() - 1;

		sut.remove(index);

		Integer postRemoveItem = sut.get(index);
		Integer postRemoveSize = sut.getSize();

		boolean notNull = true;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				notNull = false;
		}

		assertEquals(postRemoveItem, nextItem);
		assertEquals(postRemoveSize, expectedSize);
		assertEquals(true, notNull);
	}

	@Test
	void should_remove_item_at_last_index_from_list() {
		int sutSize = 24;
		int index = 23;

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() - 1;

		sut.remove(index);

		Integer postRemoveSize = sut.getSize();

		boolean notNull = true;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				notNull = false;
		}

		assertEquals(postRemoveSize, expectedSize);
		assertEquals(true, notNull);
	}

	@Test
	void should_remove_item_at_first_index_from_full_list() {
		int sutSize = 10;
		int index = 0;

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() - 1;

		sut.remove(index);

		Integer postRemoveSize = sut.getSize();

		boolean notNull = true;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				notNull = false;
		}

		assertEquals(postRemoveSize, expectedSize);
		assertEquals(true, notNull);
	}
	
	@Test
	void should_remove_item_at_mid_index_from_full_list() {
		int sutSize = 10;
		int index = 5;

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() - 1;

		sut.remove(index);

		Integer postRemoveSize = sut.getSize();

		boolean notNull = true;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				notNull = false;
		}

		assertEquals(postRemoveSize, expectedSize);
		assertEquals(true, notNull);
	}
	
	@Test
	void should_remove_item_at_last_index_from_full_list() {
		int sutSize = 10;
		int index = 9;

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < sutSize; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() - 1;

		sut.remove(index);

		Integer postRemoveSize = sut.getSize();

		boolean notNull = true;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				notNull = false;
		}

		assertEquals(postRemoveSize, expectedSize);
		assertEquals(true, notNull);
	}

}
