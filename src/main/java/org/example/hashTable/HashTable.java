package org.example.hashTable;

public class HashTable {
    private static final int TABLE_SIZE = 100;
    private final Record[] tableData = new Record[TABLE_SIZE];

    public void put(Object key, Object value) {
        int keyCode = key.hashCode();
        int step = 0;
        int slot = hash(keyCode, step);
        while(!isEmpty(slot)) {
            slot = hash(keyCode, step++);
        }
        tableData[slot] = new Record(key, value);
    }
    public boolean keyExists(Object key) {
        int keyCode = key.hashCode();
        int step = 0;
        int slot = hash(keyCode, step);
        while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
            slot = hash(keyCode, step++);
        }
        return tableData[slot] != null;
    }

    public Object get(Object key) {
        int keyCode = key.hashCode();
        int step = 0;
        int slot = hash(keyCode, step);
        while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
            slot = hash(keyCode, step++);
        }
        return (tableData[slot] != null) ? tableData[slot].getData() : null;
    }

    private int hash(int key, int step) {
        if (step == 0) {
            return key % TABLE_SIZE;
        }
        return (key % TABLE_SIZE + step * step) % TABLE_SIZE;
    }

    private boolean isEmpty(int slot) {
        return tableData[slot] == null;
    }

}