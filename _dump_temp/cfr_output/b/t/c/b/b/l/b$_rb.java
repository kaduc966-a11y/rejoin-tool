/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_ob;
import b.t.c.b.b.l.b$_rb$1;
import b.t.c.b.b.l.b$_rb$_b;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.p.d$_c$_b;
import b.t.c.b.b.p.d$_g;
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
public final class b$_rb
extends d$_c
implements b$_ob {
    private static final b$_rb \u00d2\u00d3\u00d2000;
    private final b \u00d3\u00d3\u00d2000;
    public static c \u00f5\u00d3\u00d2000;
    private int \u00d8\u00d3\u00d2000;
    private int \u00d6\u00d3\u00d2000;
    private List \u00d5\u00d3\u00d2000;
    private byte privateifsuper;
    private int newfloatsuper;

    private b$_rb(d$_g d$_g) {
        super(d$_g);
        this.privateifsuper = (byte)-1;
        this.newfloatsuper = -1;
        this.\u00d3\u00d3\u00d2000 = d$_g.class();
    }

    private b$_rb(boolean bl) {
        this.privateifsuper = (byte)-1;
        this.newfloatsuper = -1;
        this.\u00d3\u00d3\u00d2000 = b.o00000;
    }

    public static b$_rb O\u00d4\u00d4000() {
        return \u00d2\u00d3\u00d2000;
    }

    public final b$_rb \u00d2\u00d4\u00d4000() {
        return \u00d2\u00d3\u00d2000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_rb(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block21: {
            this.privateifsuper = (byte)-1;
            this.newfloatsuper = -1;
            this.doifnew();
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
                            this.\u00d8\u00d3\u00d2000 |= 1;
                            this.\u00d6\u00d3\u00d2000 = ab2.\u00d3o0000();
                            continue block18;
                        }
                        case 18: 
                    }
                    if ((n2 & 2) != 2) {
                        this.\u00d5\u00d3\u00d2000 = new ArrayList();
                        n2 |= 2;
                    }
                    this.\u00d5\u00d3\u00d2000.add(ab2.o00000(b$_db.oOO000, s2));
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
                        this.\u00d5\u00d3\u00d2000 = Collections.unmodifiableList(this.\u00d5\u00d3\u00d2000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00d3\u00d3\u00d2000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00d5\u00d3\u00d2000 = Collections.unmodifiableList(this.\u00d5\u00d3\u00d2000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d3\u00d3\u00d2000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f5\u00d3\u00d2000;
    }

    public final boolean \u00d8\u00d4\u00d4000() {
        return (this.\u00d8\u00d3\u00d2000 & 1) == 1;
    }

    public final int \u00d6\u00d4\u00d4000() {
        return this.\u00d6\u00d3\u00d2000;
    }

    public final List \u00f4\u00d4\u00d4000() {
        return this.\u00d5\u00d3\u00d2000;
    }

    public final int \u00d3\u00d4\u00d4000() {
        return this.\u00d5\u00d3\u00d2000.size();
    }

    public final b$_db publicvoid(int n2) {
        return (b$_db)this.\u00d5\u00d3\u00d2000.get(n2);
    }

    private void doifnew() {
        this.\u00d6\u00d3\u00d2000 = 0;
        this.\u00d5\u00d3\u00d2000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.privateifsuper;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00d4\u00d4000(); ++n2) {
            if (this.publicvoid(n2).\u00d200000()) continue;
            this.privateifsuper = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.privateifsuper = 0;
            return false;
        }
        this.privateifsuper = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.\u00d8\u00d3\u00d2000 & 1) == 1) {
            h2.return(1, this.\u00d6\u00d3\u00d2000);
        }
        for (int i2 = 0; i2 < this.\u00d5\u00d3\u00d2000.size(); ++i2) {
            h2.\u00d300000(2, (v)this.\u00d5\u00d3\u00d2000.get(i2));
        }
        d$_c$_b.o00000(200, h2);
        h2.\u00d300000(this.\u00d3\u00d3\u00d2000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.newfloatsuper;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00d8\u00d3\u00d2000 & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.\u00d6\u00d3\u00d2000);
        }
        for (int i2 = 0; i2 < this.\u00d5\u00d3\u00d2000.size(); ++i2) {
            n2 += h.o00000(2, (v)this.\u00d5\u00d3\u00d2000.get(i2));
        }
        this.newfloatsuper = n2 = n2 + this.\u00d6\u00d6o000() + this.\u00d3\u00d3\u00d2000.\u00f400000();
        return n2;
    }

    public static b$_rb$_b \u00d4\u00d4\u00d4000() {
        return b$_rb$_b.\u00d3\u00d3\u00d4000();
    }

    public final b$_rb$_b interfaceifnew() {
        return b$_rb.\u00d4\u00d4\u00d4000();
    }

    public static b$_rb$_b \u00d300000(b$_rb b$_rb) {
        return b$_rb.\u00d4\u00d4\u00d4000().super(b$_rb);
    }

    public final b$_rb$_b \u00f8\u00d3\u00d4000() {
        return b$_rb.\u00d300000(this);
    }

    /* synthetic */ b$_rb(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_rb(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ int super(b$_rb b$_rb, int n2) {
        b$_rb.\u00d6\u00d3\u00d2000 = n2;
        return b$_rb.\u00d6\u00d3\u00d2000;
    }

    static /* synthetic */ List super(b$_rb b$_rb, List list) {
        b$_rb.\u00d5\u00d3\u00d2000 = list;
        return b$_rb.\u00d5\u00d3\u00d2000;
    }

    static /* synthetic */ int \u00d200000(b$_rb b$_rb, int n2) {
        b$_rb.\u00d8\u00d3\u00d2000 = n2;
        return b$_rb.\u00d8\u00d3\u00d2000;
    }

    static /* synthetic */ List \u00d200000(b$_rb b$_rb) {
        return b$_rb.\u00d5\u00d3\u00d2000;
    }

    static /* synthetic */ b \u00d400000(b$_rb b$_rb) {
        return b$_rb.\u00d3\u00d3\u00d2000;
    }

    static {
        \u00f5\u00d3\u00d2000 = new b$_rb$1();
        \u00d2\u00d3\u00d2000 = new b$_rb(true);
        \u00d2\u00d3\u00d2000.doifnew();
    }
}

