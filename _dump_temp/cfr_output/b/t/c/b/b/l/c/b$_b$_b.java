/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$1;
import b.t.c.b.b.l.c.b$_b$_b$1;
import b.t.c.b.b.l.c.b$_b$_b$_b;
import b.t.c.b.b.l.c.b$_b$_b$_c;
import b.t.c.b.b.l.c.b$_b$_c;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_b$_b
extends d
implements b$_b$_c {
    private static final b$_b$_b \u00d600000;
    private final b \u00f500000;
    public static c \u00d300000;
    private int String;
    private int private;
    private int for;
    private Object oO0000;
    private b$_b$_b$_b \u00d3O0000;
    private List \u00f800000;
    private int \u00f600000;
    private List \u00d2O0000;
    private int \u00d800000;
    private byte null;
    private int \u00d500000;

    private b$_b$_b(d$_f d$_f) {
        super(d$_f);
        this.\u00f600000 = -1;
        this.\u00d800000 = -1;
        this.null = (byte)-1;
        this.\u00d500000 = -1;
        this.\u00f500000 = d$_f.class();
    }

    private b$_b$_b(boolean bl) {
        this.\u00f600000 = -1;
        this.\u00d800000 = -1;
        this.null = (byte)-1;
        this.\u00d500000 = -1;
        this.\u00f500000 = b.o00000;
    }

    public static b$_b$_b \u00d6o0000() {
        return \u00d600000;
    }

    public final b$_b$_b \u00d3O0000() {
        return \u00d600000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_b$_b(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        int n2;
        block35: {
            this.\u00f600000 = -1;
            this.\u00d800000 = -1;
            this.null = (byte)-1;
            this.\u00d500000 = -1;
            this.\u00f4o0000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block24: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block24;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block24;
                            bl = true;
                            continue block24;
                        }
                        case 8: {
                            this.String |= 1;
                            this.private = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 16: {
                            this.String |= 2;
                            this.for = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 24: {
                            int n4 = ab2.\u00f6O0000();
                            b$_b$_b$_b b$_b$_b$_b = b$_b$_b$_b.\u00d4O0000(n4);
                            if (b$_b$_b$_b == null) {
                                h2.oO0000(n3);
                                h2.oO0000(n4);
                                continue block24;
                            }
                            this.String |= 8;
                            this.\u00d3O0000 = b$_b$_b$_b;
                            continue block24;
                        }
                        case 32: {
                            if ((n2 & 0x10) != 16) {
                                this.\u00f800000 = new ArrayList();
                                n2 |= 0x10;
                            }
                            this.\u00f800000.add(ab2.\u00d3o0000());
                            continue block24;
                        }
                        case 34: {
                            int n5 = ab2.\u00f500000();
                            int n6 = ab2.\u00d500000(n5);
                            if ((n2 & 0x10) != 16 && ab2.newsuper() > 0) {
                                this.\u00f800000 = new ArrayList();
                                n2 |= 0x10;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00f800000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n6);
                            continue block24;
                        }
                        case 40: {
                            if ((n2 & 0x20) != 32) {
                                this.\u00d2O0000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            this.\u00d2O0000.add(ab2.\u00d3o0000());
                            continue block24;
                        }
                        case 42: {
                            int n7 = ab2.\u00f500000();
                            int n8 = ab2.\u00d500000(n7);
                            if ((n2 & 0x20) != 32 && ab2.newsuper() > 0) {
                                this.\u00d2O0000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00d2O0000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n8);
                            continue block24;
                        }
                        case 50: 
                    }
                    b b2 = ab2.\u00d300000();
                    this.String |= 4;
                    this.oO0000 = b2;
                }
                if ((n2 & 0x10) != 16) break block35;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 0x10) == 16) {
                        this.\u00f800000 = Collections.unmodifiableList(this.\u00f800000);
                    }
                    if ((n2 & 0x20) == 32) {
                        this.\u00d2O0000 = Collections.unmodifiableList(this.\u00d2O0000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f500000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f800000 = Collections.unmodifiableList(this.\u00f800000);
        }
        if ((n2 & 0x20) == 32) {
            this.\u00d2O0000 = Collections.unmodifiableList(this.\u00d2O0000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f500000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d300000;
    }

    public final boolean Oo0000() {
        return (this.String & 1) == 1;
    }

    public final int voidsuper() {
        return this.private;
    }

    public final boolean floatsuper() {
        return (this.String & 2) == 2;
    }

    public final int \u00d3o0000() {
        return this.for;
    }

    public final boolean \u00d4o0000() {
        return (this.String & 4) == 4;
    }

    public final String Objectsuper() {
        Object object = this.oO0000;
        if (object instanceof String) {
            return (String)object;
        }
        object = (b)object;
        String string = ((b)object).\u00d200000();
        if (((b)object).o00000()) {
            this.oO0000 = string;
        }
        return string;
    }

    public final b \u00d2o0000() {
        Object object = this.oO0000;
        if (object instanceof String) {
            this.oO0000 = object = b.\u00d200000((String)object);
            return object;
        }
        return (b)object;
    }

    public final boolean publicsuper() {
        return (this.String & 8) == 8;
    }

    public final b$_b$_b$_b \u00d4O0000() {
        return this.\u00d3O0000;
    }

    public final List \u00f6O0000() {
        return this.\u00f800000;
    }

    public final int \u00f4O0000() {
        return this.\u00f800000.size();
    }

    public final List \u00f8O0000() {
        return this.\u00d2O0000;
    }

    public final int \u00d6O0000() {
        return this.\u00d2O0000.size();
    }

    private void \u00f4o0000() {
        this.private = 1;
        this.for = 0;
        this.oO0000 = "";
        this.\u00d3O0000 = b$_b$_b$_b.\u00f4\u00f40000;
        this.\u00f800000 = Collections.emptyList();
        this.\u00d2O0000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.null;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.null = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        if ((this.String & 1) == 1) {
            h2.return(1, this.private);
        }
        if ((this.String & 2) == 2) {
            h2.return(2, this.for);
        }
        if ((this.String & 8) == 8) {
            h2.new(3, this.\u00d3O0000.super());
        }
        if (this.\u00f6O0000().size() > 0) {
            h2.oO0000(34);
            h2.oO0000(this.\u00f600000);
        }
        for (n2 = 0; n2 < this.\u00f800000.size(); ++n2) {
            h2.o00000((Integer)this.\u00f800000.get(n2));
        }
        if (this.\u00f8O0000().size() > 0) {
            h2.oO0000(42);
            h2.oO0000(this.\u00d800000);
        }
        for (n2 = 0; n2 < this.\u00d2O0000.size(); ++n2) {
            h2.o00000((Integer)this.\u00d2O0000.get(n2));
        }
        if ((this.String & 4) == 4) {
            h2.o00000(6, this.\u00d2o0000());
        }
        h2.\u00d300000(this.\u00f500000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.\u00d500000;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        if ((this.String & 1) == 1) {
            n3 = 0 + h.\u00d500000(1, this.private);
        }
        if ((this.String & 2) == 2) {
            n3 += h.\u00d500000(2, this.for);
        }
        if ((this.String & 8) == 8) {
            n3 += h.o00000(3, this.\u00d3O0000.super());
        }
        int n4 = 0;
        for (n2 = 0; n2 < this.\u00f800000.size(); ++n2) {
            n4 += h.\u00f500000((Integer)this.\u00f800000.get(n2));
        }
        n3 += n4;
        if (!this.\u00f6O0000().isEmpty()) {
            ++n3;
            n3 += h.\u00f500000(n4);
        }
        this.\u00f600000 = n4;
        n4 = 0;
        for (n2 = 0; n2 < this.\u00d2O0000.size(); ++n2) {
            n4 += h.\u00f500000((Integer)this.\u00d2O0000.get(n2));
        }
        n3 += n4;
        if (!this.\u00f8O0000().isEmpty()) {
            ++n3;
            n3 += h.\u00f500000(n4);
        }
        this.\u00d800000 = n4;
        if ((this.String & 4) == 4) {
            n3 += h.new(6, this.\u00d2o0000());
        }
        this.\u00d500000 = n3 += this.\u00f500000.\u00f400000();
        return n3;
    }

    public static b$_b$_b$_c \u00d8o0000() {
        return b$_b$_b$_c.\u00d80\u00d5000();
    }

    public final b$_b$_b$_c \u00d8O0000() {
        return b$_b$_b.\u00d8o0000();
    }

    public static b$_b$_b$_c \u00d400000(b$_b$_b b$_b$_b) {
        return b$_b$_b.\u00d8o0000().\u00d600000(b$_b$_b);
    }

    public final b$_b$_b$_c interface() {
        return b$_b$_b.\u00d400000(this);
    }

    /* synthetic */ b$_b$_b(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_b$_b(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int super(b$_b$_b b$_b$_b, int n2) {
        b$_b$_b.private = n2;
        return b$_b$_b.private;
    }

    static /* synthetic */ int \u00d300000(b$_b$_b b$_b$_b, int n2) {
        b$_b$_b.for = n2;
        return b$_b$_b.for;
    }

    static /* synthetic */ Object super(b$_b$_b b$_b$_b, Object object) {
        b$_b$_b.oO0000 = object;
        return b$_b$_b.oO0000;
    }

    static /* synthetic */ b$_b$_b$_b super(b$_b$_b b$_b$_b, b$_b$_b$_b b$_b$_b$_b) {
        b$_b$_b.\u00d3O0000 = b$_b$_b$_b;
        return b$_b$_b.\u00d3O0000;
    }

    static /* synthetic */ List \u00d200000(b$_b$_b b$_b$_b, List list) {
        b$_b$_b.\u00f800000 = list;
        return b$_b$_b.\u00f800000;
    }

    static /* synthetic */ List super(b$_b$_b b$_b$_b, List list) {
        b$_b$_b.\u00d2O0000 = list;
        return b$_b$_b.\u00d2O0000;
    }

    static /* synthetic */ int \u00d200000(b$_b$_b b$_b$_b, int n2) {
        b$_b$_b.String = n2;
        return b$_b$_b.String;
    }

    static /* synthetic */ Object super(b$_b$_b b$_b$_b) {
        return b$_b$_b.oO0000;
    }

    static /* synthetic */ List \u00d300000(b$_b$_b b$_b$_b) {
        return b$_b$_b.\u00f800000;
    }

    static /* synthetic */ List class(b$_b$_b b$_b$_b) {
        return b$_b$_b.\u00d2O0000;
    }

    static /* synthetic */ b \u00d200000(b$_b$_b b$_b$_b) {
        return b$_b$_b.\u00f500000;
    }

    static {
        \u00d300000 = new b$_b$_b$1();
        \u00d600000 = new b$_b$_b(true);
        \u00d600000.\u00f4o0000();
    }
}

