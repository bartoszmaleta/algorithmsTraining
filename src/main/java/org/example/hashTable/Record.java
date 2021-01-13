package org.example.hashTable;

public class Record {
    Object key;
    Object data;

    public Record(Object key, Object data) {
        this.key = key;
        this.data = data;
    }

    public Object getKey() {
        return key;
    }

    public Object getData() {
        return data;
    }
}
