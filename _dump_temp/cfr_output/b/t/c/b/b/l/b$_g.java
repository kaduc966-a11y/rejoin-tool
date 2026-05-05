/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_g$1;
import b.t.c.b.b.l.b$_g$_b;
import b.t.c.b.b.l.b$_ib;
import b.t.c.b.b.l.b$_m;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_g
extends d
implements b$_ib {
    private static final b$_g \u00f6\u00d30000;
    private final b returnObject;
    public static c \u00d3\u00d40000;
    private List \u00f8\u00d30000;
    private byte o\u00d40000;
    private int \u00d2\u00d40000;

    private b$_g(d$_f d$_f) {
        super(d$_f);
        this.o\u00d40000 = (byte)-1;
        this.\u00d2\u00d40000 = -1;
        this.returnObject = d$_f.class();
    }

    private b$_g(boolean bl) {
        this.o\u00d40000 = (byte)-1;
        this.\u00d2\u00d40000 = -1;
        this.returnObject = b.o00000;
    }

    public static b$_g \u00d4\u00d80000() {
        return \u00f6\u00d30000;
    }

    public final b$_g \u00d3\u00d80000() {
        return \u00f6\u00d30000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_g(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block20: {
            this.o\u00d40000 = (byte)-1;
            this.\u00d2\u00d40000 = -1;
            this.\u00f4\u00d80000();
            boolean bl = false;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl2 = false;
                block17: while (!bl2) {
                    int n2 = ab2.oo0000();
                    switch (n2) {
                        case 0: {
                            bl2 = true;
                            continue block17;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n2)) continue block17;
                            bl2 = true;
                            continue block17;
                        }
                        case 10: 
                    }
                    if (!(bl & true)) {
                        this.\u00f8\u00d30000 = new ArrayList();
                        bl |= true;
                    }
                    this.\u00f8\u00d30000.add(ab2.o00000(b$_m.\u00f8\u00d40000, s2));
                }
                if (!(bl & true)) break block20;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if (bl & true) {
                        this.\u00f8\u00d30000 = Collections.unmodifiableList(this.\u00f8\u00d30000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.returnObject = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f8\u00d30000 = Collections.unmodifiableList(this.\u00f8\u00d30000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.returnObject = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d3\u00d40000;
    }

    public final List floatclass() {
        return this.\u00f8\u00d30000;
    }

    public final int \u00d6\u00d80000() {
        return this.\u00f8\u00d30000.size();
    }

    private void \u00f4\u00d80000() {
        this.\u00f8\u00d30000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.o\u00d40000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.o\u00d40000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        for (int i2 = 0; i2 < this.\u00f8\u00d30000.size(); ++i2) {
            h2.\u00d300000(1, (v)this.\u00f8\u00d30000.get(i2));
        }
        h2.\u00d300000(this.returnObject);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d2\u00d40000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.\u00f8\u00d30000.size(); ++i2) {
            n2 += h.o00000(1, (v)this.\u00f8\u00d30000.get(i2));
        }
        this.\u00d2\u00d40000 = n2 += this.returnObject.\u00f400000();
        return n2;
    }

    public static b$_g$_b \u00d8\u00d80000() {
        return b$_g$_b.\u00d2\u00d80000();
    }

    public final b$_g$_b \u00f6\u00d80000() {
        return b$_g.\u00d8\u00d80000();
    }

    public static b$_g$_b \u00d400000(b$_g b$_g) {
        return b$_g.\u00d8\u00d80000().super(b$_g);
    }

    public final b$_g$_b publicclass() {
        return b$_g.\u00d400000(this);
    }

    /* synthetic */ b$_g(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_g(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ List super(b$_g b$_g, List list) {
        b$_g.\u00f8\u00d30000 = list;
        return b$_g.\u00f8\u00d30000;
    }

    static /* synthetic */ List \u00d200000(b$_g b$_g) {
        return b$_g.\u00f8\u00d30000;
    }

    static /* synthetic */ b \u00d300000(b$_g b$_g) {
        return b$_g.returnObject;
    }

    static {
        \u00d3\u00d40000 = new b$_g$1();
        \u00f6\u00d30000 = new b$_g(true);
        \u00f6\u00d30000.\u00f4\u00d80000();
    }
}

