/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.c;
import b.l.n$_b;
import b.o.d.w;
import b.o.e.f;
import b.o.e.g;
import java.io.File;
import java.util.Iterator;

public final class n
implements b.g.n {
    private final File thisObject;
    private final c \u00d3\u00d30000;
    private final g o\u00d30000;
    private final g whilenew;
    private final f \u00d5\u00d30000;
    private final int \u00d4\u00d30000;

    private n(File file, c c2, g g2, g g3, f f2, int n2) {
        this.thisObject = file;
        this.\u00d3\u00d30000 = c2;
        this.o\u00d30000 = g2;
        this.whilenew = g3;
        this.\u00d5\u00d30000 = f2;
        this.\u00d4\u00d30000 = n2;
    }

    /* synthetic */ n(File file, c c2, g g2, g g3, f f2, int n2, int n3, w w2) {
        if ((n3 & 2) != 0) {
            c2 = c.\u00d300000;
        }
        if ((n3 & 0x20) != 0) {
            n2 = Integer.MAX_VALUE;
        }
        this(file, c2, g2, g3, f2, n2);
    }

    public n(File file, c c2) {
        this(file, c2, null, null, null, 0, 32, null);
    }

    public /* synthetic */ n(File file, c c2, int n2, w w2) {
        if ((n2 & 2) != 0) {
            c2 = c.\u00d300000;
        }
        this(file, c2);
    }

    @Override
    public final Iterator o00000() {
        return new n$_b(this);
    }

    public final n \u00d300000(g g2) {
        return new n(this.thisObject, this.\u00d3\u00d30000, g2, this.whilenew, this.\u00d5\u00d30000, this.\u00d4\u00d30000);
    }

    public final n \u00d200000(g g2) {
        return new n(this.thisObject, this.\u00d3\u00d30000, this.o\u00d30000, g2, this.\u00d5\u00d30000, this.\u00d4\u00d30000);
    }

    public final n o00000(f f2) {
        return new n(this.thisObject, this.\u00d3\u00d30000, this.o\u00d30000, this.whilenew, f2, this.\u00d4\u00d30000);
    }

    public final n \u00d500000(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("depth must be positive, but was " + n2 + '.');
        }
        return new n(this.thisObject, this.\u00d3\u00d30000, this.o\u00d30000, this.whilenew, this.\u00d5\u00d30000, n2);
    }

    public static final /* synthetic */ File \u00d200000(n n2) {
        return n2.thisObject;
    }

    public static final /* synthetic */ c \u00d600000(n n2) {
        return n2.\u00d3\u00d30000;
    }

    public static final /* synthetic */ int String(n n2) {
        return n2.\u00d4\u00d30000;
    }

    public static final /* synthetic */ g \u00d500000(n n2) {
        return n2.o\u00d30000;
    }

    public static final /* synthetic */ f o00000(n n2) {
        return n2.\u00d5\u00d30000;
    }

    public static final /* synthetic */ g \u00d300000(n n2) {
        return n2.whilenew;
    }
}

