/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.s.d.i;
import java.util.ConcurrentModificationException;

public class i$_e {
    private final i \u00f4O\u00f5000;
    private int forpublicString;
    private int \u00f5O\u00f5000;
    private int \u00d8O\u00f5000;

    public i$_e(i i2) {
        this.\u00f4O\u00f5000 = i2;
        this.\u00f5O\u00f5000 = -1;
        this.\u00d8O\u00f5000 = i.\u00d400000(this.\u00f4O\u00f5000);
        this.privatepublicsuper();
    }

    public final i \u00f8\u00f6\u00d2000() {
        return this.\u00f4O\u00f5000;
    }

    public final int \u00d8\u00f6\u00d2000() {
        return this.forpublicString;
    }

    public final void whileString(int n2) {
        this.forpublicString = n2;
    }

    public final int \u00f5\u00f6\u00d2000() {
        return this.\u00f5O\u00f5000;
    }

    public final void \u00d3\u00d60000(int n2) {
        this.\u00f5O\u00f5000 = n2;
    }

    public final void privatepublicsuper() {
        while (this.forpublicString < i.return(this.\u00f4O\u00f5000) && i.\u00d300000(this.\u00f4O\u00f5000)[this.forpublicString] < 0) {
            int n2 = this.forpublicString;
            this.forpublicString = n2 + 1;
        }
    }

    public final boolean hasNext() {
        return this.forpublicString < i.return(this.\u00f4O\u00f5000);
    }

    public final void remove() {
        this.\u00f4\u00f6\u00d2000();
        if (!(this.\u00f5O\u00f5000 != -1)) {
            String string = "Call next() before removing element from the iterator.";
            throw new IllegalStateException(string.toString());
        }
        this.\u00f4O\u00f5000.\u00d40\u00d3000();
        i.o00000(this.\u00f4O\u00f5000, this.\u00f5O\u00f5000);
        this.\u00f5O\u00f5000 = -1;
        this.\u00d8O\u00f5000 = i.\u00d400000(this.\u00f4O\u00f5000);
    }

    public final void \u00f4\u00f6\u00d2000() {
        if (i.\u00d400000(this.\u00f4O\u00f5000) != this.\u00d8O\u00f5000) {
            throw new ConcurrentModificationException();
        }
    }
}

