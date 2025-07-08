package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
      return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] temp = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null && key.equals(item.getName())) {
                temp[count++] = item;
            }
        }
        return Arrays.copyOf(temp, count);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item newItem) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        newItem.setId(id);
        items[index] = newItem;
        return true;
    }

}