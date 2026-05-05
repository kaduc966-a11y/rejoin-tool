/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.y;
import java.io.OutputStream;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_b
extends OutputStream {
    private static final byte[] \u00d400000 = new byte[0];
    private final int \u00d300000;
    private final ArrayList new;
    private int return;
    private byte[] o00000;
    private int \u00d500000;

    b$_b(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Buffer size < 0");
        }
        this.\u00d300000 = n2;
        this.new = new ArrayList();
        this.o00000 = new byte[n2];
    }

    @Override
    public final synchronized void write(int n2) {
        if (this.\u00d500000 == this.o00000.length) {
            this.super(1);
        }
        this.o00000[this.\u00d500000++] = (byte)n2;
    }

    @Override
    public final synchronized void write(byte[] byArray, int n2, int n3) {
        if (n3 <= this.o00000.length - this.\u00d500000) {
            System.arraycopy(byArray, n2, this.o00000, this.\u00d500000, n3);
            this.\u00d500000 += n3;
            return;
        }
        int n4 = this.o00000.length - this.\u00d500000;
        System.arraycopy(byArray, n2, this.o00000, this.\u00d500000, n4);
        this.super(n3 -= n4);
        System.arraycopy(byArray, n2 += n4, this.o00000, 0, n3);
        this.\u00d500000 = n3;
    }

    public final synchronized b \u00d300000() {
        this.super();
        return b.o00000(this.new);
    }

    private byte[] super(byte[] byArray, int n2) {
        byte[] byArray2 = new byte[n2];
        System.arraycopy(byArray, 0, byArray2, 0, Math.min(byArray.length, n2));
        return byArray2;
    }

    public final synchronized int \u00d200000() {
        return this.return + this.\u00d500000;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.\u00d200000());
    }

    private void super(int n2) {
        this.new.add(new y(this.o00000));
        this.return += this.o00000.length;
        n2 = Math.max(this.\u00d300000, Math.max(n2, this.return >>> 1));
        this.o00000 = new byte[n2];
        this.\u00d500000 = 0;
    }

    private void super() {
        if (this.\u00d500000 < this.o00000.length) {
            if (this.\u00d500000 > 0) {
                b$_b b$_b = this;
                byte[] byArray = b$_b.super(b$_b.o00000, this.\u00d500000);
                this.new.add(new y(byArray));
            }
        } else {
            this.new.add(new y(this.o00000));
            this.o00000 = \u00d400000;
        }
        this.return += this.\u00d500000;
        this.\u00d500000 = 0;
    }
}

