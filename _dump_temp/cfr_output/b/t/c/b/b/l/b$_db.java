/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_db$1;
import b.t.c.b.b.l.b$_db$_c;
import b.t.c.b.b.l.b$_db$_d;
import b.t.c.b.b.l.b$_tb;
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
public final class b$_db
extends d
implements b$_tb {
    private static final b$_db \u00d60O000;
    private final b newint;
    public static c oOO000;
    private int \u00f80O000;
    private int \u00d80O000;
    private List \u00f50O000;
    private byte \u00f60O000;
    private int returnint;

    private b$_db(d$_f d$_f) {
        super(d$_f);
        this.\u00f60O000 = (byte)-1;
        this.returnint = -1;
        this.newint = d$_f.class();
    }

    private b$_db(boolean bl) {
        this.\u00f60O000 = (byte)-1;
        this.returnint = -1;
        this.newint = b.o00000;
    }

    public static b$_db \u00d4\u00f4O000() {
        return \u00d60O000;
    }

    public final b$_db Objectpublic() {
        return \u00d60O000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_db(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block21: {
            this.\u00f60O000 = (byte)-1;
            this.returnint = -1;
            this.interfacewhile();
            int n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block18: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block18;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block18;
                            bl = true;
                            continue block18;
                        }
                        case 8: {
                            this.\u00f80O000 |= 1;
                            this.\u00d80O000 = ab2.\u00d3o0000();
                            continue block18;
                        }
                        case 18: 
                    }
                    if ((n2 & 2) != 2) {
                        this.\u00f50O000 = new ArrayList();
                        n2 |= 2;
                    }
                    this.\u00f50O000.add(ab2.o00000(b$_db$_c.\u00d20O000, s2));
                }
                if ((n2 & 2) != 2) break block21;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 2) == 2) {
                        this.\u00f50O000 = Collections.unmodifiableList(this.\u00f50O000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.newint = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f50O000 = Collections.unmodifiableList(this.\u00f50O000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.newint = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return oOO000;
    }

    public final boolean \u00d2\u00f4O000() {
        return (this.\u00f80O000 & 1) == 1;
    }

    public final int \u00d8\u00f4O000() {
        return this.\u00d80O000;
    }

    public final List dowhile() {
        return this.\u00f50O000;
    }

    public final int O\u00f4O000() {
        return this.\u00f50O000.size();
    }

    public final b$_db$_c Oo0000(int n2) {
        return (b$_db$_c)this.\u00f50O000.get(n2);
    }

    private void interfacewhile() {
        this.\u00d80O000 = 0;
        this.\u00f50O000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00f60O000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (!this.\u00d2\u00f4O000()) {
            this.\u00f60O000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.O\u00f4O000(); ++n2) {
            if (this.Oo0000(n2).\u00d200000()) continue;
            this.\u00f60O000 = 0;
            return false;
        }
        this.\u00f60O000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.\u00f80O000 & 1) == 1) {
            h2.return(1, this.\u00d80O000);
        }
        for (int i2 = 0; i2 < this.\u00f50O000.size(); ++i2) {
            h2.\u00d300000(2, (v)this.\u00f50O000.get(i2));
        }
        h2.\u00d300000(this.newint);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.returnint;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00f80O000 & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.\u00d80O000);
        }
        for (int i2 = 0; i2 < this.\u00f50O000.size(); ++i2) {
            n2 += h.o00000(2, (v)this.\u00f50O000.get(i2));
        }
        this.returnint = n2 += this.newint.\u00f400000();
        return n2;
    }

    public static b$_db$_d \u00d3\u00f4O000() {
        return b$_db$_d.intwhile();
    }

    public final b$_db$_d \u00f4\u00f4O000() {
        return b$_db.\u00d3\u00f4O000();
    }

    public static b$_db$_d class(b$_db b$_db) {
        return b$_db.\u00d3\u00f4O000().\u00d300000(b$_db);
    }

    public final b$_db$_d \u00d6\u00f4O000() {
        return b$_db.class(this);
    }

    /* synthetic */ b$_db(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_db(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int \u00d200000(b$_db b$_db, int n2) {
        b$_db.\u00d80O000 = n2;
        return b$_db.\u00d80O000;
    }

    static /* synthetic */ List super(b$_db b$_db, List list) {
        b$_db.\u00f50O000 = list;
        return b$_db.\u00f50O000;
    }

    static /* synthetic */ int super(b$_db b$_db, int n2) {
        b$_db.\u00f80O000 = n2;
        return b$_db.\u00f80O000;
    }

    static /* synthetic */ List \u00d600000(b$_db b$_db) {
        return b$_db.\u00f50O000;
    }

    static /* synthetic */ b \u00d400000(b$_db b$_db) {
        return b$_db.newint;
    }

    static {
        oOO000 = new b$_db$1();
        \u00d60O000 = new b$_db(true);
        \u00d60O000.interfacewhile();
    }
}

