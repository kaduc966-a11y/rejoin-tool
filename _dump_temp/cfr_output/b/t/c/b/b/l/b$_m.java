/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_m$1;
import b.t.c.b.b.l.b$_m$_b;
import b.t.c.b.b.l.b$_m$_c;
import b.t.c.b.b.l.b$_m$_d;
import b.t.c.b.b.l.b$_s;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_m
extends d
implements b$_s {
    private static final b$_m \u00d3\u00d50000;
    private final b \u00d8\u00d50000;
    public static c \u00f8\u00d40000;
    private int o\u00d50000;
    private int thisString;
    private int \u00f5\u00d50000;
    private b$_m$_b \u00f6\u00d50000;
    private int StringString;
    private int \u00d6\u00d50000;
    private b$_m$_d nullString;
    private byte \u00d5\u00d50000 = (byte)-1;
    private int \u00d2\u00d50000 = -1;

    private b$_m(d$_f d$_f) {
        super(d$_f);
        this.\u00d8\u00d50000 = d$_f.class();
    }

    private b$_m(boolean bl) {
        this.\u00d8\u00d50000 = b.o00000;
    }

    public static b$_m \u00f6\u00f50000() {
        return \u00d3\u00d50000;
    }

    public final b$_m \u00d3\u00f50000() {
        return \u00d3\u00d50000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_m(ab ab2, s s2) throws g {
        this.interfacereturn();
        b$_b b$_b = b.\u00d600000();
        h h2 = h.o00000(b$_b, 1);
        try {
            boolean bl = false;
            block22: while (!bl) {
                Enum enum_;
                int n2;
                int n3 = ab2.oo0000();
                switch (n3) {
                    case 0: {
                        bl = true;
                        continue block22;
                    }
                    default: {
                        if (this.super(ab2, h2, s2, n3)) continue block22;
                        bl = true;
                        continue block22;
                    }
                    case 8: {
                        this.o\u00d50000 |= 1;
                        this.thisString = ab2.\u00d3o0000();
                        continue block22;
                    }
                    case 16: {
                        this.o\u00d50000 |= 2;
                        this.\u00f5\u00d50000 = ab2.\u00d3o0000();
                        continue block22;
                    }
                    case 24: {
                        n2 = ab2.\u00f6O0000();
                        enum_ = b$_m$_b.\u00d300000(n2);
                        if (enum_ == null) {
                            h2.oO0000(n3);
                            h2.oO0000(n2);
                            continue block22;
                        }
                        this.o\u00d50000 |= 4;
                        this.\u00f6\u00d50000 = enum_;
                        continue block22;
                    }
                    case 32: {
                        this.o\u00d50000 |= 8;
                        this.StringString = ab2.\u00d3o0000();
                        continue block22;
                    }
                    case 40: {
                        this.o\u00d50000 |= 0x10;
                        this.\u00d6\u00d50000 = ab2.\u00d3o0000();
                        continue block22;
                    }
                    case 48: 
                }
                n2 = ab2.\u00f6O0000();
                enum_ = b$_m$_d.\u00d400000(n2);
                if (enum_ == null) {
                    h2.oO0000(n3);
                    h2.oO0000(n2);
                    continue;
                }
                this.o\u00d50000 |= 0x20;
                this.nullString = enum_;
            }
        }
        catch (g g2) {
            try {
                throw g2.o00000(this);
                catch (IOException iOException) {
                    throw new g(iOException.getMessage()).o00000(this);
                }
            }
            catch (Throwable throwable) {
                try {
                    h2.new();
                }
                catch (IOException iOException) {
                }
                finally {
                    this.\u00d8\u00d50000 = b$_b.\u00d300000();
                }
                this.\u00d2O0000();
                throw throwable;
            }
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d8\u00d50000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f8\u00d40000;
    }

    public final boolean O\u00f50000() {
        return (this.o\u00d50000 & 1) == 1;
    }

    public final int doreturn() {
        return this.thisString;
    }

    public final boolean \u00d6\u00f40000() {
        return (this.o\u00d50000 & 2) == 2;
    }

    public final int intreturn() {
        return this.\u00f5\u00d50000;
    }

    public final boolean \u00d4\u00f50000() {
        return (this.o\u00d50000 & 4) == 4;
    }

    public final b$_m$_b \u00d6\u00f50000() {
        return this.\u00f6\u00d50000;
    }

    public final boolean \u00f4\u00f40000() {
        return (this.o\u00d50000 & 8) == 8;
    }

    public final int \u00f6\u00f40000() {
        return this.StringString;
    }

    public final boolean Objectvoid() {
        return (this.o\u00d50000 & 0x10) == 16;
    }

    public final int \u00d2\u00f50000() {
        return this.\u00d6\u00d50000;
    }

    public final boolean \u00f8\u00f40000() {
        return (this.o\u00d50000 & 0x20) == 32;
    }

    public final b$_m$_d \u00d8\u00f40000() {
        return this.nullString;
    }

    private void interfacereturn() {
        this.thisString = 0;
        this.\u00f5\u00d50000 = 0;
        this.\u00f6\u00d50000 = b$_m$_b.\u00d8O0000;
        this.StringString = 0;
        this.\u00d6\u00d50000 = 0;
        this.nullString = b$_m$_d.\u00d3o0000;
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00d5\u00d50000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.\u00d5\u00d50000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.o\u00d50000 & 1) == 1) {
            h2.return(1, this.thisString);
        }
        if ((this.o\u00d50000 & 2) == 2) {
            h2.return(2, this.\u00f5\u00d50000);
        }
        if ((this.o\u00d50000 & 4) == 4) {
            h2.new(3, this.\u00f6\u00d50000.super());
        }
        if ((this.o\u00d50000 & 8) == 8) {
            h2.return(4, this.StringString);
        }
        if ((this.o\u00d50000 & 0x10) == 16) {
            h2.return(5, this.\u00d6\u00d50000);
        }
        if ((this.o\u00d50000 & 0x20) == 32) {
            h2.new(6, this.nullString.super());
        }
        h2.\u00d300000(this.\u00d8\u00d50000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d2\u00d50000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.o\u00d50000 & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.thisString);
        }
        if ((this.o\u00d50000 & 2) == 2) {
            n2 += h.\u00d500000(2, this.\u00f5\u00d50000);
        }
        if ((this.o\u00d50000 & 4) == 4) {
            n2 += h.o00000(3, this.\u00f6\u00d50000.super());
        }
        if ((this.o\u00d50000 & 8) == 8) {
            n2 += h.\u00d500000(4, this.StringString);
        }
        if ((this.o\u00d50000 & 0x10) == 16) {
            n2 += h.\u00d500000(5, this.\u00d6\u00d50000);
        }
        if ((this.o\u00d50000 & 0x20) == 32) {
            n2 += h.o00000(6, this.nullString.super());
        }
        this.\u00d2\u00d50000 = n2 += this.\u00d8\u00d50000.\u00f400000();
        return n2;
    }

    public static b$_m$_c \u00f4\u00f50000() {
        return b$_m$_c.classreturn();
    }

    public final b$_m$_c \u00d8\u00f50000() {
        return b$_m.\u00f4\u00f50000();
    }

    public static b$_m$_c \u00d300000(b$_m b$_m) {
        return b$_m.\u00f4\u00f50000().super(b$_m);
    }

    public final b$_m$_c \u00f8\u00f50000() {
        return b$_m.\u00d300000(this);
    }

    /* synthetic */ b$_m(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_m(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int \u00d200000(b$_m b$_m, int n2) {
        b$_m.thisString = n2;
        return b$_m.thisString;
    }

    static /* synthetic */ int class(b$_m b$_m, int n2) {
        b$_m.\u00f5\u00d50000 = n2;
        return b$_m.\u00f5\u00d50000;
    }

    static /* synthetic */ b$_m$_b super(b$_m b$_m, b$_m$_b b$_m$_b) {
        b$_m.\u00f6\u00d50000 = b$_m$_b;
        return b$_m.\u00f6\u00d50000;
    }

    static /* synthetic */ int \u00d400000(b$_m b$_m, int n2) {
        b$_m.StringString = n2;
        return b$_m.StringString;
    }

    static /* synthetic */ int \u00d300000(b$_m b$_m, int n2) {
        b$_m.\u00d6\u00d50000 = n2;
        return b$_m.\u00d6\u00d50000;
    }

    static /* synthetic */ b$_m$_d super(b$_m b$_m, b$_m$_d b$_m$_d) {
        b$_m.nullString = b$_m$_d;
        return b$_m.nullString;
    }

    static /* synthetic */ int super(b$_m b$_m, int n2) {
        b$_m.o\u00d50000 = n2;
        return b$_m.o\u00d50000;
    }

    static /* synthetic */ b \u00d200000(b$_m b$_m) {
        return b$_m.\u00d8\u00d50000;
    }

    static {
        \u00f8\u00d40000 = new b$_m$1();
        \u00d3\u00d50000 = new b$_m(true);
        \u00d3\u00d50000.interfacereturn();
    }
}

