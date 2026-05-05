/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.e;
import b.t.c.b.b.p.e$1;
import java.util.Arrays;
import java.util.Stack;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class e$_e {
    private final Stack super = new Stack();

    private e$_e() {
    }

    private b super(b b2, b b3) {
        this.\u00d200000(b2);
        this.\u00d200000(b3);
        b2 = (b)this.super.pop();
        while (!this.super.isEmpty()) {
            b3 = (b)this.super.pop();
            b2 = new e(b3, b2, null);
        }
        return b2;
    }

    private void \u00d200000(b object) {
        while (true) {
            if (((b)object).\u00f600000()) {
                this.super((b)object);
                return;
            }
            if (!(object instanceof e)) break;
            object = (e)object;
            this.\u00d200000(e.o00000((e)object));
            object = e.\u00d200000((e)object);
        }
        object = String.valueOf(String.valueOf(object.getClass()));
        throw new IllegalArgumentException(new StringBuilder(49 + ((String)object).length()).append("Has a new type of ByteString been created? Found ").append((String)object).toString());
    }

    private void super(b b2) {
        int n2 = this.super(b2.\u00f400000());
        int n3 = e.OO0000()[n2 + 1];
        if (this.super.isEmpty() || ((b)this.super.peek()).\u00f400000() >= n3) {
            this.super.push(b2);
            return;
        }
        n2 = e.OO0000()[n2];
        b b3 = (b)this.super.pop();
        while (!this.super.isEmpty() && ((b)this.super.peek()).\u00f400000() < n2) {
            b b4 = (b)this.super.pop();
            b3 = new e(b4, b3, null);
        }
        b3 = new e(b3, b2, null);
        while (!this.super.isEmpty()) {
            n2 = this.super(b3.\u00f400000());
            n3 = e.OO0000()[n2 + 1];
            if (((b)this.super.peek()).\u00f400000() >= n3) break;
            b b5 = (b)this.super.pop();
            b3 = new e(b5, b3, null);
        }
        this.super.push(b3);
    }

    private int super(int n2) {
        n2 = Arrays.binarySearch(e.OO0000(), n2);
        if (n2 < 0) {
            n2 = -(n2 + 1) - 1;
        }
        return n2;
    }

    /* synthetic */ e$_e(e$1 e$1) {
        this();
    }

    static /* synthetic */ b super(e$_e e$_e, b b2, b b3) {
        return e$_e.super(b2, b3);
    }
}

