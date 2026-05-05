/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class k$_b$_b
extends FilterInputStream {
    private int super;

    k$_b$_b(InputStream inputStream, int n2) {
        super(inputStream);
        this.super = n2;
    }

    @Override
    public final int available() throws IOException {
        return Math.min(super.available(), this.super);
    }

    @Override
    public final int read() throws IOException {
        if (this.super <= 0) {
            return -1;
        }
        int n2 = super.read();
        if (n2 >= 0) {
            --this.super;
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) throws IOException {
        if (this.super <= 0) {
            return -1;
        }
        int n4 = super.read(byArray, n2, n3 = Math.min(n3, this.super));
        if (n4 >= 0) {
            this.super -= n4;
        }
        return n4;
    }

    @Override
    public final long skip(long l2) throws IOException {
        long l3 = super.skip(Math.min(l2, (long)this.super));
        if (l3 >= 0L) {
            this.super = (int)((long)this.super - l3);
        }
        return l3;
    }
}

