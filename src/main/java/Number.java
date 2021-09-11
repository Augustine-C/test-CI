public class Number {
    private int val;

    public Number(int num) {
        this.val = num;
    }

    public void add(int num) {
        this.val += num;
    }

    public void sub(int num) {
        this.val -= num;
    }

    public int getVal() {
        return this.val;
    }
}
