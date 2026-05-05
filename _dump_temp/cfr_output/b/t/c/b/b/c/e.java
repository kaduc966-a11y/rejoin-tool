/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.o.d.kb;
import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.b.g;
import b.t.c.b.b.c.b.j;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.fb;
import b.t.c.b.b.c.n;
import b.t.c.b.b.l.d.l;
import b.t.m;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    static final /* synthetic */ m[] \u00d400000;
    private int \u00f400000;
    private String \u00d8O0000;
    private final b.t.c.b.b.c.b.f class;
    private final b.t.c.b.b.c.b.f \u00f800000;
    private final n int;
    private n \u00d3O0000;
    private final List \u00d200000;
    private db \u00d800000;
    private final List OO0000;
    private final List \u00d600000;
    private final List \u00d6O0000;
    private fb \u00f600000;
    public db \u00d4O0000;
    private final List \u00d300000;
    private final List super;
    private final List \u00d2O0000;
    private final List do;
    private final List interface;

    public e(int n2, String iterator, int n3, int n4) {
        this.\u00f400000 = n2;
        this.\u00d8O0000 = iterator;
        this.class = g.\u00d500000(new j(l.O\u00d20000));
        this.\u00f800000 = g.\u00d500000(new j(l.forsuper));
        Object object = new n(n3);
        e e2 = this;
        this.super(true);
        e2.int = object;
        this.\u00d3O0000 = this.\u00d200000() ? new n(n4) : null;
        this.\u00d200000 = new ArrayList(0);
        this.OO0000 = new ArrayList(0);
        this.\u00d600000 = new ArrayList(0);
        this.\u00d6O0000 = new ArrayList();
        this.\u00d300000 = new ArrayList(0);
        this.super = new ArrayList(0);
        this.\u00d2O0000 = new ArrayList(0);
        this.do = new ArrayList(0);
        object = f.o00000.Object();
        e2 = this;
        iterator = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            object2 = (f)object2;
            Object object3 = object;
            object3.add(object2.\u00d800000());
        }
        e2.interface = (List)object;
    }

    public final int do() {
        return this.\u00f400000;
    }

    public final void super(int n2) {
        this.\u00f400000 = n2;
    }

    public final String \u00f800000() {
        return this.\u00d8O0000;
    }

    private final boolean \u00d200000() {
        return this.class.o00000(this, \u00d400000[0]);
    }

    private final void super(boolean bl) {
        this.\u00f800000.o00000(this, \u00d400000[1], bl);
    }

    public final n \u00d3O0000() {
        return this.int;
    }

    public final n \u00d300000() {
        return this.\u00d3O0000;
    }

    public final List \u00d600000() {
        return this.\u00d200000;
    }

    public final db \u00f400000() {
        return this.\u00d800000;
    }

    public final void \u00d200000(db db2) {
        this.\u00d800000 = db2;
    }

    public final List super() {
        return this.OO0000;
    }

    public final List class() {
        return this.\u00d6O0000;
    }

    public final fb \u00d400000() {
        return this.\u00f600000;
    }

    public final void super(fb fb2) {
        this.\u00f600000 = fb2;
    }

    public final db int() {
        db db2 = this.\u00d4O0000;
        if (db2 != null) {
            return db2;
        }
        fc.return("");
        return null;
    }

    public final void super(db db2) {
        this.\u00d4O0000 = db2;
    }

    public final List \u00d4O0000() {
        return this.\u00d300000;
    }

    public final List \u00d800000() {
        return this.super;
    }

    public final List OO0000() {
        return this.\u00d2O0000;
    }

    public final List \u00f600000() {
        return this.do;
    }

    public final List \u00d2O0000() {
        return this.interface;
    }

    static {
        m[] mArray = new m[2];
        m[] mArray2 = mArray;
        mArray[0] = new kb(e.class, "_hasSetter", "get_hasSetter()Z", 0);
        mArray2[1] = new kb(e.class, "_hasGetter", "get_hasGetter()Z", 0);
        \u00d400000 = mArray2;
    }
}

