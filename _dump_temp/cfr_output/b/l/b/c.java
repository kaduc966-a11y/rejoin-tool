/*
 * Decompiled with CFR 0.152.
 */
package b.l.b;

import b.l.b.f;
import b.l.b.i;
import b.s.z;
import java.io.IOException;
import java.io.InputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class c
extends InputStream {
    private final InputStream null;
    private final f \u00d800000;
    private boolean o00000;
    private boolean \u00d300000;
    private final byte[] \u00d500000;
    private final byte[] String;
    private final byte[] \u00d200000;
    private int \u00d600000;
    private int \u00f500000;

    public c(InputStream inputStream, f f2) {
        this.null = inputStream;
        this.\u00d800000 = f2;
        this.\u00d500000 = new byte[1];
        this.String = new byte[1024];
        this.\u00d200000 = new byte[1024];
    }

    private final int String() {
        return this.\u00f500000 - this.\u00d600000;
    }

    @Override
    public final int read() {
        if (this.\u00d600000 < this.\u00f500000) {
            int n2 = this.\u00d200000[this.\u00d600000] & 0xFF;
            ++this.\u00d600000;
            this.\u00d300000();
            return n2;
        }
        c c2 = this;
        switch (c2.read(c2.\u00d500000, 0, 1)) {
            case -1: {
                return -1;
            }
            case 1: {
                return this.\u00d500000[0] & 0xFF;
            }
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (n2 < 0 || n3 < 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException("offset: " + n2 + ", length: " + n3 + ", buffer size: " + byArray.length);
        }
        if (this.o00000) {
            throw new IOException("The input stream is closed.");
        }
        if (this.\u00d300000) {
            return -1;
        }
        if (n3 == 0) {
            return 0;
        }
        if (this.String() >= n3) {
            this.o00000(byArray, n2, n3);
            return n3;
        }
        int n4 = (n3 - this.String() + 3 - 1) / 3 * 4;
        int n5 = n2;
        while (!this.\u00d300000 && n4 > 0) {
            int n6 = 0;
            int n7 = Math.min(this.String.length, n4);
            block5: while (!this.\u00d300000 && n6 < n7) {
                int n8 = this.o00000();
                switch (n8) {
                    case -1: {
                        this.\u00d300000 = true;
                        continue block5;
                    }
                    case 61: {
                        n6 = this.o00000(n6);
                        this.\u00d300000 = true;
                        continue block5;
                    }
                }
                this.String[n6] = (byte)n8;
                ++n6;
            }
            if (!(this.\u00d300000 || n6 == n7)) {
                throw new IllegalStateException("Check failed.");
            }
            n4 -= n6;
            n5 += this.o00000(byArray, n5, n3 + n2, n6);
        }
        if (n5 == n2 && this.\u00d300000) {
            return -1;
        }
        return n5 - n2;
    }

    @Override
    public final void close() {
        if (!this.o00000) {
            this.o00000 = true;
            this.null.close();
        }
    }

    private final int o00000(byte[] byArray, int n2, int n3, int n4) {
        this.\u00f500000 += this.\u00d800000.\u00d400000(this.String, this.\u00d200000, this.\u00f500000, 0, n4);
        n3 = Math.min(this.String(), n3 - n2);
        this.o00000(byArray, n2, n3);
        this.\u00d200000();
        return n3;
    }

    private final void o00000(byte[] byArray, int n2, int n3) {
        z.o00000(this.\u00d200000, byArray, n2, this.\u00d600000, this.\u00d600000 + n3);
        this.\u00d600000 += n3;
        this.\u00d300000();
    }

    private final void \u00d300000() {
        if (this.\u00d600000 == this.\u00f500000) {
            this.\u00d600000 = 0;
            this.\u00f500000 = 0;
        }
    }

    private final void \u00d200000() {
        int n2 = this.\u00d200000.length - this.\u00f500000;
        if (this.String.length / 4 * 3 > n2) {
            z.o00000(this.\u00d200000, this.\u00d200000, 0, this.\u00d600000, this.\u00f500000);
            this.\u00f500000 -= this.\u00d600000;
            this.\u00d600000 = 0;
        }
    }

    private final int o00000(int n2) {
        this.String[n2] = 61;
        if ((n2 & 3) == 2) {
            int n3 = this.o00000();
            if (n3 >= 0) {
                this.String[n2 + 1] = (byte)n3;
            }
            return n2 + 2;
        }
        return n2 + 1;
    }

    private final int o00000() {
        int n2;
        if (!this.\u00d800000.o00000()) {
            return this.null.read();
        }
        while ((n2 = this.null.read()) != -1 && !i.o00000(n2)) {
        }
        return n2;
    }
}

