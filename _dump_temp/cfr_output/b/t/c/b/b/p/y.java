/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_c;
import b.t.c.b.b.p.e;
import b.t.c.b.b.p.p;
import b.t.c.b.b.p.y$_b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class y
extends b {
    protected final byte[] if;
    private int \u00f800000 = 0;

    y(byte[] byArray) {
        this.if = byArray;
    }

    public byte o00000(int n2) {
        return this.if[n2];
    }

    @Override
    public int \u00f400000() {
        return this.if.length;
    }

    @Override
    protected void o00000(byte[] byArray, int n2, int n3, int n4) {
        System.arraycopy(this.if, n2, byArray, n3, n4);
    }

    @Override
    void o00000(OutputStream outputStream, int n2, int n3) throws IOException {
        outputStream.write(this.if, this.oO0000() + n2, n3);
    }

    @Override
    public String o00000(String string) throws UnsupportedEncodingException {
        return new String(this.if, this.oO0000(), ((b)this).\u00f400000(), string);
    }

    @Override
    public boolean o00000() {
        int n2;
        int n3 = n2 = this.oO0000();
        return p.\u00d400000(this.if, n3, n3 + ((b)this).\u00f400000());
    }

    @Override
    protected int o00000(int n2, int n3, int n4) {
        int n5 = n3 = this.oO0000() + n3;
        return p.o00000(n2, this.if, n5, n5 + n4);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        if (((b)this).\u00f400000() != ((b)object).\u00f400000()) {
            return false;
        }
        if (((b)this).\u00f400000() == 0) {
            return true;
        }
        if (object instanceof y) {
            return this.o00000((y)object, 0, ((b)this).\u00f400000());
        }
        if (object instanceof e) {
            return object.equals(this);
        }
        object = String.valueOf(String.valueOf(object.getClass()));
        throw new IllegalArgumentException(new StringBuilder(49 + ((String)object).length()).append("Has a new type of ByteString been created? Found ").append((String)object).toString());
    }

    boolean o00000(y y2, int n2, int n3) {
        if (n3 > ((b)y2).\u00f400000()) {
            int n4 = n3;
            int n5 = ((b)this).\u00f400000();
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(n4).append(n5).toString());
        }
        if (n2 + n3 > ((b)y2).\u00f400000()) {
            int n6 = n2;
            int n7 = n3;
            n3 = ((b)y2).\u00f400000();
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: ").append(n6).append(", ").append(n7).append(", ").append(n3).toString());
        }
        byte[] byArray = this.if;
        byte[] byArray2 = y2.if;
        n3 = this.oO0000() + n3;
        int n8 = this.oO0000();
        int n9 = y2.oO0000() + n2;
        while (n8 < n3) {
            if (byArray[n8] != byArray2[n9]) {
                return false;
            }
            ++n8;
            ++n9;
        }
        return true;
    }

    public int hashCode() {
        int n2 = this.\u00f800000;
        if (n2 == 0) {
            n2 = ((b)this).\u00f400000();
            if ((n2 = this.\u00d200000(n2, 0, n2)) == 0) {
                n2 = 1;
            }
            this.\u00f800000 = n2;
        }
        return n2;
    }

    @Override
    protected int \u00f500000() {
        return this.\u00f800000;
    }

    @Override
    protected int \u00d200000(int n2, int n3, int n4) {
        return y.o00000(n2, this.if, this.oO0000() + n3, n4);
    }

    static int o00000(int n2, byte[] byArray, int n3, int n4) {
        for (int i2 = n3; i2 < n3 + n4; ++i2) {
            n2 = n2 * 31 + byArray[i2];
        }
        return n2;
    }

    @Override
    public ab \u00d500000() {
        return ab.o00000(this);
    }

    @Override
    public b$_c \u00d400000() {
        return new y$_b(this, null);
    }

    @Override
    protected int Object() {
        return 0;
    }

    @Override
    protected boolean \u00f600000() {
        return true;
    }

    protected int oO0000() {
        return 0;
    }
}

