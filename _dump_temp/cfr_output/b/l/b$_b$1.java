/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.s.t;
import java.io.BufferedInputStream;
import java.util.NoSuchElementException;

public final class b$_b$1
extends t {
    private int thisObjectclass = -1;
    private boolean \u00d5\u00f4\u00f5000;
    private boolean \u00d8\u00f4\u00f5000;
    final /* synthetic */ BufferedInputStream \u00d4\u00f4\u00f5000;

    b$_b$1(BufferedInputStream bufferedInputStream) {
        this.\u00d4\u00f4\u00f5000 = bufferedInputStream;
    }

    public final int returnnewnew() {
        return this.thisObjectclass;
    }

    public final void \u00d5\u00f40000(int n2) {
        this.thisObjectclass = n2;
    }

    public final boolean \u00d5\u00d4\u00d3000() {
        return this.\u00d5\u00f4\u00f5000;
    }

    public final void o\u00d20000(boolean bl) {
        this.\u00d5\u00f4\u00f5000 = bl;
    }

    public final boolean \u00d4\u00d4\u00d3000() {
        return this.\u00d8\u00f4\u00f5000;
    }

    public final void O\u00d20000(boolean bl) {
        this.\u00d8\u00f4\u00f5000 = bl;
    }

    private final void \u00d8\u00d4\u00d3000() {
        if (!this.\u00d5\u00f4\u00f5000 && !this.\u00d8\u00f4\u00f5000) {
            this.thisObjectclass = this.\u00d4\u00f4\u00f5000.read();
            this.\u00d5\u00f4\u00f5000 = true;
            this.\u00d8\u00f4\u00f5000 = this.thisObjectclass == -1;
        }
    }

    @Override
    public final boolean hasNext() {
        this.\u00d8\u00d4\u00d3000();
        return !this.\u00d8\u00f4\u00f5000;
    }

    @Override
    public final byte newnewnew() {
        this.\u00d8\u00d4\u00d3000();
        if (this.\u00d8\u00f4\u00f5000) {
            throw new NoSuchElementException("Input stream is over.");
        }
        byte by = (byte)this.thisObjectclass;
        this.\u00d5\u00f4\u00f5000 = false;
        return by;
    }
}

