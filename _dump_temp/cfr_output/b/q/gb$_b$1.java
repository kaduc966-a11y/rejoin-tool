/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.bb;
import b.e.m;
import b.o.d.c.g;
import b.q.f;
import b.q.gb;
import b.qb;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class gb$_b$1
implements Iterator,
g {
    private int \u00f5\u00d6\u00f5000 = -1;
    private int privatesuperclass;
    private int \u00f4\u00d6\u00f5000;
    private m forsuperclass;
    private int \u00d8\u00d6\u00f5000;
    final /* synthetic */ gb \u00d5\u00d6\u00f5000;

    gb$_b$1(gb gb2) {
        this.\u00d5\u00d6\u00f5000 = gb2;
        this.\u00f4\u00d6\u00f5000 = this.privatesuperclass = bb.o00000(gb.String(gb2), 0, gb.\u00d300000(gb2).length());
    }

    public final int \u00d8\u00d3\u00d3000() {
        return this.\u00f5\u00d6\u00f5000;
    }

    public final void \u00d3\u00f40000(int n2) {
        this.\u00f5\u00d6\u00f5000 = n2;
    }

    public final int \u00d5\u00d3\u00d3000() {
        return this.privatesuperclass;
    }

    public final void o\u00f40000(int n2) {
        this.privatesuperclass = n2;
    }

    public final int \u00d3\u00d3\u00d3000() {
        return this.\u00f4\u00d6\u00f5000;
    }

    public final void newreturn(int n2) {
        this.\u00f4\u00d6\u00f5000 = n2;
    }

    public final m \u00d4\u00d3\u00d3000() {
        return this.forsuperclass;
    }

    public final void o00000(m m2) {
        this.forsuperclass = m2;
    }

    public final int nullsupernew() {
        return this.\u00d8\u00d6\u00f5000;
    }

    public final void \u00d4\u00f40000(int n2) {
        this.\u00d8\u00d6\u00f5000 = n2;
    }

    /*
     * Unable to fully structure code
     */
    private final void o\u00d3\u00d3000() {
        block5: {
            if (this.\u00f4\u00d6\u00f5000 < 0) {
                this.\u00f5\u00d6\u00f5000 = 0;
                this.forsuperclass = null;
                return;
            }
            if (gb.\u00d200000(this.\u00d5\u00d6\u00f5000) <= 0) break block5;
            ++this.\u00d8\u00d6\u00f5000;
            if (this.\u00d8\u00d6\u00f5000 >= gb.\u00d200000(this.\u00d5\u00d6\u00f5000)) ** GOTO lbl-1000
        }
        if (this.\u00f4\u00d6\u00f5000 > gb.\u00d300000(this.\u00d5\u00d6\u00f5000).length()) lbl-1000:
        // 2 sources

        {
            this.forsuperclass = new m(this.privatesuperclass, f.\u00d400000(gb.\u00d300000(this.\u00d5\u00d6\u00f5000)));
            this.\u00f4\u00d6\u00f5000 = -1;
        } else {
            var1_1 = (qb)gb.o00000(this.\u00d5\u00d6\u00f5000).o00000(gb.\u00d300000(this.\u00d5\u00d6\u00f5000), this.\u00f4\u00d6\u00f5000);
            if (var1_1 == null) {
                this.forsuperclass = new m(this.privatesuperclass, f.\u00d400000(gb.\u00d300000(this.\u00d5\u00d6\u00f5000)));
                this.\u00f4\u00d6\u00f5000 = -1;
            } else {
                var2_3 = ((Number)var1_1.\u00d400000()).intValue();
                var1_2 = ((Number)var1_1.\u00d300000()).intValue();
                this.forsuperclass = bb.\u00d400000(this.privatesuperclass, var2_3);
                this.privatesuperclass = var2_3 + var1_2;
                this.\u00f4\u00d6\u00f5000 = this.privatesuperclass + (var1_2 == 0 ? 1 : 0);
            }
        }
        this.\u00f5\u00d6\u00f5000 = 1;
    }

    public final m forsupernew() {
        if (this.\u00f5\u00d6\u00f5000 == -1) {
            this.o\u00d3\u00d3000();
        }
        if (this.\u00f5\u00d6\u00f5000 == 0) {
            throw new NoSuchElementException();
        }
        m m2 = this.forsuperclass;
        this.forsuperclass = null;
        this.\u00f5\u00d6\u00f5000 = -1;
        return m2;
    }

    @Override
    public final boolean hasNext() {
        if (this.\u00f5\u00d6\u00f5000 == -1) {
            this.o\u00d3\u00d3000();
        }
        return this.\u00f5\u00d6\u00f5000 == 1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

