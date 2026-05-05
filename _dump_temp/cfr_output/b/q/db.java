/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.d.c.g;
import b.q.db$_b;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class db
implements Iterator,
g {
    private static final db$_b nullsuperclass = new db$_b(null);
    private final CharSequence O\u00d6\u00f5000;
    private int \u00f4\u00d5\u00f5000;
    private int \u00d4\u00d6\u00f5000;
    private int Stringsuperclass;
    private int \u00f5\u00d5\u00f5000;
    public static final int o\u00d6\u00f5000 = 0;
    public static final int \u00d3\u00d6\u00f5000 = 1;
    public static final int \u00f8\u00d5\u00f5000 = 2;

    public db(CharSequence charSequence) {
        this.O\u00d6\u00f5000 = charSequence;
    }

    @Override
    public final boolean hasNext() {
        if (this.\u00f4\u00d5\u00f5000 != 0) {
            return this.\u00f4\u00d5\u00f5000 == 1;
        }
        if (this.\u00f5\u00d5\u00f5000 < 0) {
            this.\u00f4\u00d5\u00f5000 = 2;
            return false;
        }
        int n2 = -1;
        int n3 = this.O\u00d6\u00f5000.length();
        int n4 = this.O\u00d6\u00f5000.length();
        block3: for (int i2 = this.\u00d4\u00d6\u00f5000; i2 < n4; ++i2) {
            char c2 = this.O\u00d6\u00f5000.charAt(i2);
            switch (c2) {
                case '\n': 
                case '\r': {
                    n2 = c2 == '\r' && i2 + 1 < this.O\u00d6\u00f5000.length() && this.O\u00d6\u00f5000.charAt(i2 + 1) == '\n' ? 2 : 1;
                    n3 = i2;
                    break block3;
                }
                default: {
                    continue block3;
                }
            }
        }
        this.\u00f4\u00d5\u00f5000 = 1;
        this.\u00f5\u00d5\u00f5000 = n2;
        this.Stringsuperclass = n3;
        return true;
    }

    public final String O\u00d3\u00d3000() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.\u00f4\u00d5\u00f5000 = 0;
        int n2 = this.Stringsuperclass;
        int n3 = this.\u00d4\u00d6\u00f5000;
        this.\u00d4\u00d6\u00f5000 = this.Stringsuperclass + this.\u00f5\u00d5\u00f5000;
        return ((Object)this.O\u00d6\u00f5000.subSequence(n3, n2)).toString();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

