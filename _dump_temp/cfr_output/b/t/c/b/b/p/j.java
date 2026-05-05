/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.k;
import b.t.c.b.b.p.k$_b$_b;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.v;
import b.t.c.b.b.p.w;
import java.io.IOException;
import java.io.InputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class j
implements c {
    private static final s o00000 = s.super();

    private w o00000(v v2) {
        if (v2 instanceof k) {
            return ((k)v2).do();
        }
        return new w(v2);
    }

    private v new(v v2) throws g {
        if (v2 != null && !v2.\u00d200000()) {
            throw this.o00000(v2).o00000().o00000(v2);
        }
        return v2;
    }

    public v new(b object, s s2) throws g {
        ab ab2 = ((b)object).\u00d500000();
        object = (v)this.o00000(ab2, s2);
        try {
            ab2.String(0);
        }
        catch (g g2) {
            throw g2.o00000((v)object);
        }
        return object;
    }

    public v \u00d300000(b b2, s s2) throws g {
        j j2 = this;
        return j2.new(j2.new(b2, s2));
    }

    public v \u00d300000(InputStream object, s object2) throws g {
        object = ab.o00000((InputStream)object);
        object2 = (v)this.o00000((ab)object, (s)object2);
        try {
            ((ab)object).String(0);
        }
        catch (g g2) {
            throw g2.o00000((v)object2);
        }
        return object2;
    }

    public v \u00d500000(InputStream inputStream, s s2) throws g {
        j j2 = this;
        return j2.new(j2.\u00d300000(inputStream, s2));
    }

    public v return(InputStream inputStream, s s2) throws g {
        int n2;
        try {
            n2 = inputStream.read();
            if (n2 == -1) {
                return null;
            }
            n2 = ab.o00000(n2, inputStream);
        }
        catch (IOException iOException) {
            throw new g(iOException.getMessage());
        }
        k$_b$_b k$_b$_b = new k$_b$_b(inputStream, n2);
        return this.\u00d300000(k$_b$_b, s2);
    }

    public v \u00d400000(InputStream inputStream, s s2) throws g {
        j j2 = this;
        return j2.new(j2.return(inputStream, s2));
    }
}

