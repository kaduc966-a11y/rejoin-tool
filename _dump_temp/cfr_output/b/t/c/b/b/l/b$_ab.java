/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_ab$1;
import b.t.c.b.b.l.b$_ab$_b;
import b.t.c.b.b.l.b$_lb;
import b.t.c.b.b.l.b$_o;
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
public final class b$_ab
extends d
implements b$_lb {
    private static final b$_ab \u00d5\u00f40000;
    private final b \u00d8\u00f40000;
    public static c \u00f6\u00f40000;
    private List \u00d6\u00f40000;
    private byte nullreturn;
    private int \u00f5\u00f40000;

    private b$_ab(d$_f d$_f) {
        super(d$_f);
        this.nullreturn = (byte)-1;
        this.\u00f5\u00f40000 = -1;
        this.\u00d8\u00f40000 = d$_f.class();
    }

    private b$_ab(boolean bl) {
        this.nullreturn = (byte)-1;
        this.\u00f5\u00f40000 = -1;
        this.\u00d8\u00f40000 = b.o00000;
    }

    public static b$_ab intif() {
        return \u00d5\u00f40000;
    }

    public final b$_ab \u00d2\u00d2O000() {
        return \u00d5\u00f40000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_ab(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block20: {
            this.nullreturn = (byte)-1;
            this.\u00f5\u00f40000 = -1;
            this.O\u00d2O000();
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
                        this.\u00d6\u00f40000 = new ArrayList();
                        bl |= true;
                    }
                    this.\u00d6\u00f40000.add(ab2.o00000(b$_o.\u00d5\u00d60000, s2));
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
                        this.\u00d6\u00f40000 = Collections.unmodifiableList(this.\u00d6\u00f40000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00d8\u00f40000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00d6\u00f40000 = Collections.unmodifiableList(this.\u00d6\u00f40000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d8\u00f40000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f6\u00f40000;
    }

    public final List \u00f8oO000() {
        return this.\u00d6\u00f40000;
    }

    public final int \u00d8oO000() {
        return this.\u00d6\u00f40000.size();
    }

    public final b$_o do(int n2) {
        return (b$_o)this.\u00d6\u00f40000.get(n2);
    }

    private void O\u00d2O000() {
        this.\u00d6\u00f40000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.nullreturn;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00d8oO000(); ++n2) {
            if (this.do(n2).\u00d200000()) continue;
            this.nullreturn = 0;
            return false;
        }
        this.nullreturn = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        for (int i2 = 0; i2 < this.\u00d6\u00f40000.size(); ++i2) {
            h2.\u00d300000(1, (v)this.\u00d6\u00f40000.get(i2));
        }
        h2.\u00d300000(this.\u00d8\u00f40000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00f5\u00f40000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.\u00d6\u00f40000.size(); ++i2) {
            n2 += h.o00000(1, (v)this.\u00d6\u00f40000.get(i2));
        }
        this.\u00f5\u00f40000 = n2 += this.\u00d8\u00f40000.\u00f400000();
        return n2;
    }

    public static b$_ab$_b \u00f6oO000() {
        return b$_ab$_b.superif();
    }

    public final b$_ab$_b doif() {
        return b$_ab.\u00f6oO000();
    }

    public static b$_ab$_b \u00d300000(b$_ab b$_ab) {
        return b$_ab.\u00f6oO000().super(b$_ab);
    }

    public final b$_ab$_b \u00f4oO000() {
        return b$_ab.\u00d300000(this);
    }

    /* synthetic */ b$_ab(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_ab(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ List super(b$_ab b$_ab, List list) {
        b$_ab.\u00d6\u00f40000 = list;
        return b$_ab.\u00d6\u00f40000;
    }

    static /* synthetic */ List \u00d400000(b$_ab b$_ab) {
        return b$_ab.\u00d6\u00f40000;
    }

    static /* synthetic */ b \u00d200000(b$_ab b$_ab) {
        return b$_ab.\u00d8\u00f40000;
    }

    static {
        \u00f6\u00f40000 = new b$_ab$1();
        \u00d5\u00f40000 = new b$_ab(true);
        \u00d5\u00f40000.O\u00d2O000();
    }
}

