package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	private Integer size = 0;

	@Override
	public boolean add(T item) {
		add(size, item);
		return true;
	}

//new (and improved) for this assignment
	@Override
	public boolean add(int index, T item) {
		checkArraySize();
		if (index == size) {
			items[index] = item;
			size++;
		} else if (index >= 0 && index <= size) {
			size++;
			for (int i = size; i >= index; i--) {
				items[i + 1] = items[i];
			}
			items[index] = item;
		} else
			throw new IndexOutOfBoundsException("index doesn't exist!");

		return true;
	}

	private void checkArraySize() {
		if (size == items.length) {
			Object[] biggerArray = new Object[size * 2];
			for (int i = 0; i < size; i++) {
				biggerArray[i] = items[i];
			}
			items = biggerArray;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

//new (and improved) for this assignment
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		T removedItem = null;
		if (index >= 0 && index < size - 1) {
			removedItem = (T) items[index];
			for (int i = index; i < size - 1; i++) {
				items[i] = items[i + 1];
			}
			size--;
		} else if (index == size - 1) {
			size--;
		} else if (index > size && index < items.length) {
			System.out.println("+++++ index exists, but there's noting to remove! +++++");
		} else
			throw new IndexOutOfBoundsException("index doesn't exist!");

		return removedItem;
	}

}
