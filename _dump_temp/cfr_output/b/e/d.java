/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.s.fb;
import java.util.NoSuchElementException;

public final class d
extends fb {
    private final int o\u00f5\u00f5000;
    private final int O\u00f5\u00f5000;
    private boolean StringObjectclass;
    private int \u00f8\u00f4\u00f5000;

    public d(int n2, int n3, int n4) {
        this.o\u00f5\u00f5000 = n4;
        this.O\u00f5\u00f5000 = n3;
        this.StringObjectclass = this.o\u00f5\u00f5000 > 0 ? n2 <= n3 : n2 >= n3;
        this.\u00f8\u00f4\u00f5000 = this.StringObjectclass ? n2 : this.O\u00f5\u00f5000;
    }

    public final int ifnewnew() {
        return this.o\u00f5\u00f5000;
    }

    @Override
    public final boolean hasNext() {
        return this.StringObjectclass;
    }

    @Override
    public final int \u00f4\u00d4\u00d3000() {
        int n2 = this.\u00f8\u00f4\u00f5000;
        if (n2 == this.O\u00f5\u00f5000) {
            if (!this.StringObjectclass) {
                throw new NoSuchElementException();
            }
            this.StringObjectclass = false;
        } else {
            this.\u00f8\u00f4\u00f5000 += this.o\u00f5\u00f5000;
        }
        return n2;
    }
}

