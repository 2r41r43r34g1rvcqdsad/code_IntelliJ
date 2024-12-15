

public class Functions {  // Capitalized the class name
    int add;
    int sub;
    int multi;
    int div;
    int n;
    int m;

    public void calculations(int n, int m) {
        this.n = n;
        this.m = m;
        add = n + m;
        sub = n - m;
        multi = n * m;
        div = n / m;
    }

    public int getAdd() {
        return add;
    }

    public int getSub() {
        return sub;
    }

    public int getMulti() {
        return multi;
    }

    public int getDiv() {
        return div;
    }
}



