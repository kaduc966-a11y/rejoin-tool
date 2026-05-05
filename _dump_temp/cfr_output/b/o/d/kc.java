/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class kc
extends xc {
    private final char[] \u00f400000;

    public kc(int n2) {
        super(n2);
        this.\u00f400000 = new char[n2];
    }

    protected final int o00000(char[] cArray) {
        return cArray.length;
    }

    public final void o00000(char c2) {
        int n2 = this.\u00d300000();
        this.o00000(n2 + 1);
        this.\u00f400000[n2] = c2;
    }

    public final char[] null() {
        kc kc2 = this;
        return (char[])kc2.o00000(kc2.\u00f400000, new char[this.\u00d200000()]);
    }
}

