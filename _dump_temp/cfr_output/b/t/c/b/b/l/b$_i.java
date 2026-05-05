/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_cb;
import b.t.c.b.b.l.b$_g;
import b.t.c.b.b.l.b$_g$_b;
import b.t.c.b.b.l.b$_i$1;
import b.t.c.b.b.l.b$_i$_b;
import b.t.c.b.b.l.b$_j;
import b.t.c.b.b.l.b$_mb;
import b.t.c.b.b.l.b$_mb$_b;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_z;
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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_i
extends d$_c
implements b$_cb {
    private static final b$_i nullnewsuper;
    private final b \u00f8\u00d3o000;
    public static c \u00d5\u00d3o000;
    private int \u00d6\u00d3o000;
    private List \u00f6\u00d3o000;
    private List \u00d3\u00d4o000;
    private List \u00d2\u00d4o000;
    private b$_mb o\u00d4o000;
    private b$_g fornewsuper;
    private byte \u00f5\u00d3o000;
    private int \u00d8\u00d3o000;

    private b$_i(d$_g d$_g) {
        super(d$_g);
        this.\u00f5\u00d3o000 = (byte)-1;
        this.\u00d8\u00d3o000 = -1;
        this.\u00f8\u00d3o000 = d$_g.class();
    }

    private b$_i(boolean bl) {
        this.\u00f5\u00d3o000 = (byte)-1;
        this.\u00d8\u00d3o000 = -1;
        this.\u00f8\u00d3o000 = b.o00000;
    }

    public static b$_i voidpublicsuper() {
        return nullnewsuper;
    }

    public final b$_i Objectpublicsuper() {
        return nullnewsuper;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_i(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        int n2;
        block34: {
            this.\u00f5\u00d3o000 = (byte)-1;
            this.\u00d8\u00d3o000 = -1;
            this.\u00d8\u00f6\u00d2000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block21: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block21;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block21;
                            bl = true;
                            continue block21;
                        }
                        case 26: {
                            if ((n2 & 1) != 1) {
                                this.\u00f6\u00d3o000 = new ArrayList();
                                n2 |= 1;
                            }
                            this.\u00f6\u00d3o000.add(ab2.o00000(b$_z.\u00d20\u00d2000, s2));
                            continue block21;
                        }
                        case 34: {
                            if ((n2 & 2) != 2) {
                                this.\u00d3\u00d4o000 = new ArrayList();
                                n2 |= 2;
                            }
                            this.\u00d3\u00d4o000.add(ab2.o00000(b$_n.ifclasssuper, s2));
                            continue block21;
                        }
                        case 42: {
                            if ((n2 & 4) != 4) {
                                this.\u00d2\u00d4o000 = new ArrayList();
                                n2 |= 4;
                            }
                            this.\u00d2\u00d4o000.add(ab2.o00000(b$_j.\u00d3\u00d5o000, s2));
                            continue block21;
                        }
                        case 242: {
                            b$_mb$_b b$_mb$_b = null;
                            if ((this.\u00d6\u00d3o000 & 1) == 1) {
                                b$_mb$_b = this.o\u00d4o000.\u00d2oo000();
                            }
                            this.o\u00d4o000 = (b$_mb)ab2.o00000(b$_mb.\u00d5\u00d3O000, s2);
                            if (b$_mb$_b != null) {
                                b$_mb$_b.super(this.o\u00d4o000);
                                this.o\u00d4o000 = b$_mb$_b.\u00d6Oo000();
                            }
                            this.\u00d6\u00d3o000 |= 1;
                            continue block21;
                        }
                        case 258: 
                    }
                    b$_g$_b b$_g$_b = null;
                    if ((this.\u00d6\u00d3o000 & 2) == 2) {
                        b$_g$_b = this.fornewsuper.publicclass();
                    }
                    this.fornewsuper = (b$_g)ab2.o00000(b$_g.\u00d3\u00d40000, s2);
                    if (b$_g$_b != null) {
                        b$_g$_b.super(this.fornewsuper);
                        this.fornewsuper = b$_g$_b.\u00f6\u00d60000();
                    }
                    this.\u00d6\u00d3o000 |= 2;
                }
                if (!(n2 & true)) break block34;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if (n2 & true) {
                        this.\u00f6\u00d3o000 = Collections.unmodifiableList(this.\u00f6\u00d3o000);
                    }
                    if ((n2 & 2) == 2) {
                        this.\u00d3\u00d4o000 = Collections.unmodifiableList(this.\u00d3\u00d4o000);
                    }
                    if ((n2 & 4) == 4) {
                        this.\u00d2\u00d4o000 = Collections.unmodifiableList(this.\u00d2\u00d4o000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f8\u00d3o000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f6\u00d3o000 = Collections.unmodifiableList(this.\u00f6\u00d3o000);
        }
        if ((n2 & 2) == 2) {
            this.\u00d3\u00d4o000 = Collections.unmodifiableList(this.\u00d3\u00d4o000);
        }
        if ((n2 & 4) == 4) {
            this.\u00d2\u00d4o000 = Collections.unmodifiableList(this.\u00d2\u00d4o000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f8\u00d3o000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d5\u00d3o000;
    }

    public final List \u00f8\u00f6\u00d2000() {
        return this.\u00f6\u00d3o000;
    }

    public final int \u00f8\u00f5\u00d2000() {
        return this.\u00f6\u00d3o000.size();
    }

    public final b$_z doString(int n2) {
        return (b$_z)this.\u00f6\u00d3o000.get(n2);
    }

    public final List \u00f6\u00f5\u00d2000() {
        return this.\u00d3\u00d4o000;
    }

    public final int \u00d3\u00f6\u00d2000() {
        return this.\u00d3\u00d4o000.size();
    }

    public final b$_n \u00d2\u00d60000(int n2) {
        return (b$_n)this.\u00d3\u00d4o000.get(n2);
    }

    public final List \u00f4\u00f6\u00d2000() {
        return this.\u00d2\u00d4o000;
    }

    public final int \u00d2\u00f6\u00d2000() {
        return this.\u00d2\u00d4o000.size();
    }

    public final b$_j O\u00d60000(int n2) {
        return (b$_j)this.\u00d2\u00d4o000.get(n2);
    }

    public final boolean floatpublicsuper() {
        return (this.\u00d6\u00d3o000 & 1) == 1;
    }

    public final b$_mb O\u00f6\u00d2000() {
        return this.o\u00d4o000;
    }

    public final boolean \u00f6\u00f6\u00d2000() {
        return (this.\u00d6\u00d3o000 & 2) == 2;
    }

    public final b$_g \u00f4\u00f5\u00d2000() {
        return this.fornewsuper;
    }

    private void \u00d8\u00f6\u00d2000() {
        this.\u00f6\u00d3o000 = Collections.emptyList();
        this.\u00d3\u00d4o000 = Collections.emptyList();
        this.\u00d2\u00d4o000 = Collections.emptyList();
        this.o\u00d4o000 = b$_mb.\u00d4oo000();
        this.fornewsuper = b$_g.\u00d4\u00d80000();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00f5\u00d3o000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00f8\u00f5\u00d2000(); ++n2) {
            if (this.doString(n2).\u00d200000()) continue;
            this.\u00f5\u00d3o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00f6\u00d2000(); ++n2) {
            if (this.\u00d2\u00d60000(n2).\u00d200000()) continue;
            this.\u00f5\u00d3o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d2\u00f6\u00d2000(); ++n2) {
            if (this.O\u00d60000(n2).\u00d200000()) continue;
            this.\u00f5\u00d3o000 = 0;
            return false;
        }
        if (this.floatpublicsuper() && !this.O\u00f6\u00d2000().\u00d200000()) {
            this.\u00f5\u00d3o000 = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.\u00f5\u00d3o000 = 0;
            return false;
        }
        this.\u00f5\u00d3o000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        for (n2 = 0; n2 < this.\u00f6\u00d3o000.size(); ++n2) {
            h2.\u00d300000(3, (v)this.\u00f6\u00d3o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d3\u00d4o000.size(); ++n2) {
            h2.\u00d300000(4, (v)this.\u00d3\u00d4o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d2\u00d4o000.size(); ++n2) {
            h2.\u00d300000(5, (v)this.\u00d2\u00d4o000.get(n2));
        }
        if ((this.\u00d6\u00d3o000 & 1) == 1) {
            h2.\u00d300000(30, this.o\u00d4o000);
        }
        if ((this.\u00d6\u00d3o000 & 2) == 2) {
            h2.\u00d300000(32, this.fornewsuper);
        }
        d$_c$_b.o00000(200, h2);
        h2.\u00d300000(this.\u00f8\u00d3o000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.\u00d8\u00d3o000;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        for (n2 = 0; n2 < this.\u00f6\u00d3o000.size(); ++n2) {
            n3 += h.o00000(3, (v)this.\u00f6\u00d3o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d3\u00d4o000.size(); ++n2) {
            n3 += h.o00000(4, (v)this.\u00d3\u00d4o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d2\u00d4o000.size(); ++n2) {
            n3 += h.o00000(5, (v)this.\u00d2\u00d4o000.get(n2));
        }
        if ((this.\u00d6\u00d3o000 & 1) == 1) {
            n3 += h.o00000(30, this.o\u00d4o000);
        }
        if ((this.\u00d6\u00d3o000 & 2) == 2) {
            n3 += h.o00000(32, this.fornewsuper);
        }
        this.\u00d8\u00d3o000 = n3 = n3 + this.\u00d6\u00d6o000() + this.\u00f8\u00d3o000.\u00f400000();
        return n3;
    }

    public static b$_i \u00d300000(InputStream inputStream, s s2) throws IOException {
        return (b$_i)\u00d5\u00d3o000.o00000(inputStream, s2);
    }

    public static b$_i$_b \u00d6\u00f6\u00d2000() {
        return b$_i$_b.\u00f4\u00f4\u00d2000();
    }

    public final b$_i$_b \u00d4\u00f6\u00d2000() {
        return b$_i.\u00d6\u00f6\u00d2000();
    }

    public static b$_i$_b \u00d300000(b$_i b$_i) {
        return b$_i.\u00d6\u00f6\u00d2000().\u00d200000(b$_i);
    }

    public final b$_i$_b publicpublicsuper() {
        return b$_i.\u00d300000(this);
    }

    /* synthetic */ b$_i(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_i(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ List super(b$_i b$_i, List list) {
        b$_i.\u00f6\u00d3o000 = list;
        return b$_i.\u00f6\u00d3o000;
    }

    static /* synthetic */ List \u00d300000(b$_i b$_i, List list) {
        b$_i.\u00d3\u00d4o000 = list;
        return b$_i.\u00d3\u00d4o000;
    }

    static /* synthetic */ List \u00d200000(b$_i b$_i, List list) {
        b$_i.\u00d2\u00d4o000 = list;
        return b$_i.\u00d2\u00d4o000;
    }

    static /* synthetic */ b$_mb super(b$_i b$_i, b$_mb b$_mb) {
        b$_i.o\u00d4o000 = b$_mb;
        return b$_i.o\u00d4o000;
    }

    static /* synthetic */ b$_g super(b$_i b$_i, b$_g b$_g) {
        b$_i.fornewsuper = b$_g;
        return b$_i.fornewsuper;
    }

    static /* synthetic */ int super(b$_i b$_i, int n2) {
        b$_i.\u00d6\u00d3o000 = n2;
        return b$_i.\u00d6\u00d3o000;
    }

    static /* synthetic */ List class(b$_i b$_i) {
        return b$_i.\u00f6\u00d3o000;
    }

    static /* synthetic */ List \u00d600000(b$_i b$_i) {
        return b$_i.\u00d3\u00d4o000;
    }

    static /* synthetic */ List \u00d400000(b$_i b$_i) {
        return b$_i.\u00d2\u00d4o000;
    }

    static /* synthetic */ b \u00d800000(b$_i b$_i) {
        return b$_i.\u00f8\u00d3o000;
    }

    static {
        \u00d5\u00d3o000 = new b$_i$1();
        nullnewsuper = new b$_i(true);
        nullnewsuper.\u00d8\u00f6\u00d2000();
    }
}

