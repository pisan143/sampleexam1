public class MyArray {
    private int capacity;
    private int[] nums;

    public MyArray(int capacity) {
        this.capacity = capacity;
        this.nums = new int[capacity];
    }

    public int get(int index) {
        if (index >= 0 && index < capacity) {
            return this.nums[index];
        }
        return 0;
    }

    public int getException(int index) {
        try {
            return this.nums[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public void set(int index, int value) {
        if (index >= 0 && index < capacity) {
            this.nums[index] = value;
        }
    }

    public void setException(int index, int value) {
        try {
            this.nums[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            // do nothing
        }
    }
}
