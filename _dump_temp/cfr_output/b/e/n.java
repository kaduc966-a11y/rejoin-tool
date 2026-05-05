/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.o.d.fc;
import b.s.ec;
import java.util.NoSuchElementException;

public final class n
extends ec {
    private final int \u00f8\u00f8\u00f5000;
    private final int Stringclassclass;
    private boolean \u00f4\u00f8\u00f5000;
    private int \u00f5\u00f8\u00f5000;

    public n(char n2, char c2, int n3) {
        this.\u00f8\u00f8\u00f5000 = n3;
        this.Stringclassclass = c2;
        this.\u00f4\u00f8\u00f5000 = this.\u00f8\u00f8\u00f5000 > 0 ? fc.o00000(n2, c2) <= 0 : fc.o00000(n2, c2) >= 0;
        this.\u00f5\u00f8\u00f5000 = this.\u00f4\u00f8\u00f5000 ? n2 : this.Stringclassclass;
    }

    public final int nullObjectnew() {
        return this.\u00f8\u00f8\u00f5000;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f4\u00f8\u00f5000;
    }

    @Override
    public final char o\u00d6\u00d3000() {
        int n2 = this.\u00f5\u00f8\u00f5000;
        if (n2 == this.Stringclassclass) {
            if (!this.\u00f4\u00f8\u00f5000) {
                throw new NoSuchElementException();
            }
            this.\u00f4\u00f8\u00f5000 = false;
        } else {
            this.\u00f5\u00f8\u00f5000 += this.\u00f8\u00f8\u00f5000;
        }
        return (char)n2;
    }
}

