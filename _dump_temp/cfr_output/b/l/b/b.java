/*
 * Decompiled with CFR 0.152.
 */
package b.l.b;

import b.l.b.f;
import b.s.z;
import java.io.IOException;
import java.io.OutputStream;

final class b
extends OutputStream {
    private final OutputStream \u00d300000;
    private final f \u00d200000;
    private boolean \u00d800000;
    private int o00000;
    private final byte[] String;
    private final byte[] \u00d600000;
    private int \u00d500000;

    public b(OutputStream outputStream, f f2) {
        this.\u00d300000 = outputStream;
        this.\u00d200000 = f2;
        this.o00000 = this.\u00d200000.o00000() ? this.\u00d200000.\u00d200000() : -1;
        this.String = new byte[1024];
        this.\u00d600000 = new byte[3];
    }

    @Override
    public final void write(int n2) {
        this.o00000();
        int n3 = this.\u00d500000;
        this.\u00d500000 = n3 + 1;
        this.\u00d600000[n3] = (byte)n2;
        if (this.\u00d500000 == 3) {
            this.\u00d200000();
        }
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        this.o00000();
        if (n2 < 0 || n3 < 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException("offset: " + n2 + ", length: " + n3 + ", source size: " + byArray.length);
        }
        if (n3 == 0) {
            return;
        }
        if (!(this.\u00d500000 < 3)) {
            throw new IllegalStateException("Check failed.");
        }
        n3 = n2 + n3;
        if (this.\u00d500000 != 0) {
            n2 += this.\u00d200000(byArray, n2, n3);
            if (this.\u00d500000 != 0) {
                return;
            }
        }
        while (n2 + 3 <= n3) {
            int n4 = Math.min((this.\u00d200000.o00000() ? this.o00000 : this.String.length) / 4, (n3 - n2) / 3);
            int n5 = n4 * 3;
            int n6 = n2;
            if (!(this.o00000(byArray, n6, n6 + n5) == n4 * 4)) {
                throw new IllegalStateException("Check failed.");
            }
            n2 += n5;
        }
        z.o00000(byArray, this.\u00d600000, 0, n2, n3);
        this.\u00d500000 = n3 - n2;
    }

    @Override
    public final void flush() {
        this.o00000();
        this.\u00d300000.flush();
    }

    @Override
    public final void close() {
        if (!this.\u00d800000) {
            this.\u00d800000 = true;
            if (this.\u00d500000 != 0) {
                this.\u00d200000();
            }
            this.\u00d300000.close();
        }
    }

    private final int \u00d200000(byte[] byArray, int n2, int n3) {
        n3 = Math.min(3 - this.\u00d500000, n3 - n2);
        int n4 = n2;
        z.o00000(byArray, this.\u00d600000, this.\u00d500000, n4, n4 + n3);
        this.\u00d500000 += n3;
        if (this.\u00d500000 == 3) {
            this.\u00d200000();
        }
        return n3;
    }

    private final void \u00d200000() {
        b b2 = this;
        if (!(b2.o00000(b2.\u00d600000, 0, this.\u00d500000) == 4)) {
            throw new IllegalStateException("Check failed.");
        }
        this.\u00d500000 = 0;
    }

    private final int o00000(byte[] byArray, int n2, int n3) {
        int n4 = this.\u00d200000.o00000(byArray, this.String, 0, n2, n3);
        if (this.o00000 == 0) {
            this.\u00d300000.write(f.\u00f600000.\u00f600000());
            this.o00000 = this.\u00d200000.\u00d200000();
            if (!(n4 <= this.\u00d200000.\u00d200000())) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.\u00d300000.write(this.String, 0, n4);
        this.o00000 -= n4;
        return n4;
    }

    private final void o00000() {
        if (this.\u00d800000) {
            throw new IOException("The output stream is closed.");
        }
    }
}

