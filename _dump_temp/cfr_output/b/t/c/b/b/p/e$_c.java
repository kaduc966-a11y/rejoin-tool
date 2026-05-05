/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.e;
import b.t.c.b.b.p.e$_b;
import b.t.c.b.b.p.y;
import java.io.IOException;
import java.io.InputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class e$_c
extends InputStream {
    private e$_b new;
    private y \u00d300000;
    private int \u00d400000;
    private int \u00d500000;
    private int \u00d800000;
    private int return;
    final /* synthetic */ e o00000;

    public e$_c(e e2) {
        this.o00000 = e2;
        this.\u00d200000();
    }

    @Override
    public int read(byte[] byArray, int n2, int n3) {
        if (byArray == null) {
            throw new NullPointerException();
        }
        if (n2 < 0 || n3 < 0 || n3 > byArray.length - n2) {
            throw new IndexOutOfBoundsException();
        }
        return this.super(byArray, n2, n3);
    }

    @Override
    public long skip(long l2) {
        if (l2 < 0L) {
            throw new IndexOutOfBoundsException();
        }
        if (l2 > Integer.MAX_VALUE) {
            l2 = Integer.MAX_VALUE;
        }
        return this.super(null, 0, (int)l2);
    }

    private int super(byte[] byArray, int n2, int n3) {
        int n4;
        int n5;
        for (n4 = n3; n4 > 0; n4 -= n5) {
            this.super();
            if (this.\u00d300000 == null) {
                if (n4 != n3) break;
                return -1;
            }
            n5 = Math.min(this.\u00d400000 - this.\u00d500000, n4);
            if (byArray != null) {
                this.\u00d300000.\u00d200000(byArray, this.\u00d500000, n2, n5);
                n2 += n5;
            }
            this.\u00d500000 += n5;
        }
        return n3 - n4;
    }

    @Override
    public int read() throws IOException {
        this.super();
        if (this.\u00d300000 == null) {
            return -1;
        }
        return this.\u00d300000.o00000(this.\u00d500000++) & 0xFF;
    }

    @Override
    public int available() throws IOException {
        int n2 = this.\u00d800000 + this.\u00d500000;
        return ((b)this.o00000).\u00f400000() - n2;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public void mark(int n2) {
        this.return = this.\u00d800000 + this.\u00d500000;
    }

    @Override
    public synchronized void reset() {
        this.\u00d200000();
        this.super(null, 0, this.return);
    }

    private void \u00d200000() {
        this.new = new e$_b(this.o00000, null);
        this.\u00d300000 = this.new.o00000();
        this.\u00d400000 = ((b)this.\u00d300000).\u00f400000();
        this.\u00d500000 = 0;
        this.\u00d800000 = 0;
    }

    private void super() {
        if (this.\u00d300000 != null && this.\u00d500000 == this.\u00d400000) {
            this.\u00d800000 += this.\u00d400000;
            this.\u00d500000 = 0;
            if (this.new.hasNext()) {
                this.\u00d300000 = this.new.o00000();
                this.\u00d400000 = ((b)this.\u00d300000).\u00f400000();
                return;
            }
            this.\u00d300000 = null;
            this.\u00d400000 = 0;
        }
    }
}

