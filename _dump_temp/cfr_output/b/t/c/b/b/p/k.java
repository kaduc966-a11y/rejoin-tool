/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.h;
import b.t.c.b.b.p.v;
import b.t.c.b.b.p.w;
import java.io.IOException;
import java.io.OutputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class k
implements v {
    protected int \u00d200000 = 0;

    @Override
    public byte[] OO0000() {
        try {
            byte[] byArray = new byte[this.\u00f800000()];
            h h2 = h.new(byArray);
            this.super(h2);
            h2.\u00d400000();
            return byArray;
        }
        catch (IOException iOException) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", iOException);
        }
    }

    public void super(OutputStream object) throws IOException {
        int n2 = this.\u00f800000();
        int n3 = h.return(h.new(n2) + n2);
        object = h.o00000((OutputStream)object, n3);
        ((h)object).oO0000(n2);
        this.super((h)object);
        ((h)object).new();
    }

    w do() {
        return new w(this);
    }
}

