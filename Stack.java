import java.lang.StringBuilder;

/**
 * Stack implemented with a fixed length array
 */
public class Stack {
    private int[] data;
    private int cur;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.data = new int[this.size];
        this.cur = -1;
    }

    public void push(int i) {
        if (cur + 1 == size)
            throw new IllegalStateException("stack full"); 
        data[++cur] = i;
    }

    public boolean empty() {
        return cur == -1;
    }

    public int pop() {
        if (this.empty())
            throw new IllegalStateException("stack empty");
        return data[cur--];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0; i<cur+1; i++) {
            sb.append(data[i]);
            if (i < cur) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String args[]) {
        Stack stack = new Stack(1);
        stack.push(1);
        stack.pop();
        stack.push(2);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
