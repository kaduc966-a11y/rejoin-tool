/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_pb$1;
import b.t.c.b.b.l.b$_pb$_c;
import b.t.c.b.b.l.b$_pb$_d;
import b.t.c.b.b.l.b$_t;
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
public final class b$_pb
extends d
implements b$_t {
    private static final b$_pb \u00f6\u00d5O000;
    private final b \u00f8\u00d5O000;
    public static c \u00d3\u00d6O000;
    private List o\u00d6O000;
    private byte returndo;
    private int \u00d2\u00d6O000;

    private b$_pb(d$_f d$_f) {
        super(d$_f);
        this.returndo = (byte)-1;
        this.\u00d2\u00d6O000 = -1;
        this.\u00f8\u00d5O000 = d$_f.class();
    }

    private b$_pb(boolean bl) {
        this.returndo = (byte)-1;
        this.\u00d2\u00d6O000 = -1;
        this.\u00f8\u00d5O000 = b.o00000;
    }

    public static b$_pb \u00d8\u00d5o000() {
        return \u00f6\u00d5O000;
    }

    public final b$_pb O\u00d6o000() {
        return \u00f6\u00d5O000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_pb(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block20: {
            this.returndo = (byte)-1;
            this.\u00d2\u00d6O000 = -1;
            this.\u00f6\u00d5o000();
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
                        this.o\u00d6O000 = new ArrayList();
                        bl |= true;
                    }
                    this.o\u00d6O000.add(ab2.o00000(b$_pb$_c.\u00f8\u00d4O000, s2));
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
                        this.o\u00d6O000 = Collections.unmodifiableList(this.o\u00d6O000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f8\u00d5O000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.o\u00d6O000 = Collections.unmodifiableList(this.o\u00d6O000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f8\u00d5O000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d3\u00d6O000;
    }

    public final int \u00f4\u00d5o000() {
        return this.o\u00d6O000.size();
    }

    public final b$_pb$_c \u00d4\u00d20000(int n2) {
        return (b$_pb$_c)this.o\u00d6O000.get(n2);
    }

    private void \u00f6\u00d5o000() {
        this.o\u00d6O000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.returndo;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00f4\u00d5o000(); ++n2) {
            if (this.\u00d4\u00d20000(n2).\u00d200000()) continue;
            this.returndo = 0;
            return false;
        }
        this.returndo = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        for (int i2 = 0; i2 < this.o\u00d6O000.size(); ++i2) {
            h2.\u00d300000(1, (v)this.o\u00d6O000.get(i2));
        }
        h2.\u00d300000(this.\u00f8\u00d5O000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d2\u00d6O000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.o\u00d6O000.size(); ++i2) {
            n2 += h.o00000(1, (v)this.o\u00d6O000.get(i2));
        }
        this.\u00d2\u00d6O000 = n2 += this.\u00f8\u00d5O000.\u00f400000();
        return n2;
    }

    public static b$_pb$_d \u00f8\u00d5o000() {
        return b$_pb$_d.voidObjectsuper();
    }

    public final b$_pb$_d publicObjectsuper() {
        return b$_pb.\u00f8\u00d5o000();
    }

    public static b$_pb$_d \u00d200000(b$_pb b$_pb) {
        return b$_pb.\u00f8\u00d5o000().super(b$_pb);
    }

    public final b$_pb$_d superStringsuper() {
        return b$_pb.\u00d200000(this);
    }

    /* synthetic */ b$_pb(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_pb(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ List super(b$_pb b$_pb, List list) {
        b$_pb.o\u00d6O000 = list;
        return b$_pb.o\u00d6O000;
    }

    static /* synthetic */ List \u00d300000(b$_pb b$_pb) {
        return b$_pb.o\u00d6O000;
    }

    static /* synthetic */ b \u00d400000(b$_pb b$_pb) {
        return b$_pb.\u00f8\u00d5O000;
    }

    static {
        \u00d3\u00d6O000 = new b$_pb$1();
        \u00f6\u00d5O000 = new b$_pb(true);
        \u00f6\u00d5O000.\u00f6\u00d5o000();
    }
}

