class DynamicArray {

    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        data = new int[capacity];
        size = 0;
        this.capacity= capacity;
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
        data[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        data[size] = n;
        size++;
    }

    public int popback() {
       size = size-1;
       return data[size];
    }

    private void resize() {
    capacity = capacity * 2;
    int[] bigger = new int[capacity];
    for (int i = 0; i < size; i++) {
        bigger[i] = data[i];
    }
    data = bigger;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
