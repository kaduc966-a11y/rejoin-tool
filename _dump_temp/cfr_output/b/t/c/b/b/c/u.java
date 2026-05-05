/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.w;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class u {
    private int \u00d200000;
    private String o00000;
    private final List \u00f400000;
    private db \u00f600000;
    private final List Object;
    private final List oO0000;
    private final List void;
    private final List float;
    public db \u00d600000;
    private final List \u00d400000;
    private w OO0000;
    private final List \u00d500000;
    private final List \u00f500000;

    public u(int n2, String iterator) {
        this.\u00d200000 = n2;
        this.o00000 = iterator;
        this.\u00f400000 = new ArrayList(0);
        this.Object = new ArrayList(0);
        this.oO0000 = new ArrayList(0);
        this.void = new ArrayList();
        this.float = new ArrayList();
        this.\u00d400000 = new ArrayList(0);
        this.\u00d500000 = new ArrayList(0);
        Iterable iterable = f.o00000.Object();
        u u2 = this;
        iterator = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            object = (f)object;
            Iterable iterable2 = iterable;
            iterable2.add(object.\u00f600000());
        }
        u2.\u00f500000 = (List)iterable;
    }

    public final int float() {
        return this.\u00d200000;
    }

    public final void o00000(int n2) {
        this.\u00d200000 = n2;
    }

    public final String \u00f500000() {
        return this.o00000;
    }

    public final List \u00d600000() {
        return this.\u00f400000;
    }

    public final db void() {
        return this.\u00f600000;
    }

    public final void o00000(db db2) {
        this.\u00f600000 = db2;
    }

    public final List \u00d500000() {
        return this.Object;
    }

    public final List Object() {
        return this.void;
    }

    public final List \u00f600000() {
        return this.float;
    }

    public final db o00000() {
        db db2 = this.\u00d600000;
        if (db2 != null) {
            return db2;
        }
        fc.return("");
        return null;
    }

    public final void \u00d200000(db db2) {
        this.\u00d600000 = db2;
    }

    public final List \u00d400000() {
        return this.\u00d400000;
    }

    public final void o00000(w w2) {
        this.OO0000 = w2;
    }

    public final List \u00d200000() {
        return this.\u00d500000;
    }

    public final List \u00f400000() {
        return this.\u00f500000;
    }
}

