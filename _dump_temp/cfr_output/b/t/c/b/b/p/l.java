/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_c;
import b.t.c.b.b.p.l$_b;
import b.t.c.b.b.p.y;

class l
extends y {
    private final int OO0000;
    private final int oO0000;

    l(byte[] byArray, int n2, int n3) {
        super(byArray);
        if (n2 < 0) {
            int n4 = n2;
            throw new IllegalArgumentException(new StringBuilder(29).append("Offset too small: ").append(n4).toString());
        }
        if (n3 < 0) {
            int n5 = n2;
            throw new IllegalArgumentException(new StringBuilder(29).append("Length too small: ").append(n5).toString());
        }
        if ((long)n2 + (long)n3 > (long)byArray.length) {
            int n6 = n2;
            n2 = n3;
            throw new IllegalArgumentException(new StringBuilder(48).append("Offset+Length too large: ").append(n6).append("+").append(n2).toString());
        }
        this.OO0000 = n2;
        this.oO0000 = n3;
    }

    @Override
    public byte o00000(int n2) {
        if (n2 < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(28).append("Index too small: ").append(n2).toString());
        }
        if (n2 >= ((b)this).\u00f400000()) {
            int n3 = ((b)this).\u00f400000();
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(41).append("Index too large: ").append(n2).append(", ").append(n3).toString());
        }
        return this.if[this.OO0000 + n2];
    }

    @Override
    public int \u00f400000() {
        return this.oO0000;
    }

    @Override
    protected int oO0000() {
        return this.OO0000;
    }

    @Override
    protected void o00000(byte[] byArray, int n2, int n3, int n4) {
        System.arraycopy(this.if, this.oO0000() + n2, byArray, n3, n4);
    }

    @Override
    public b$_c \u00d400000() {
        return new l$_b(this, null);
    }
}

