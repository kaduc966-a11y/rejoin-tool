/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.kb;
import b.t.c.b.b.c.q;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class db {
    private int super;
    public kb \u00d600000;
    private final List class;
    private db \u00d400000;
    private db \u00d200000;
    private q \u00d800000;
    private final List \u00d300000;

    public db(int n2) {
        this.super = n2;
        this.class = new ArrayList(0);
        Iterable iterable = f.o00000.Object();
        db db2 = this;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (f)object2;
            Iterable iterable2 = iterable;
            iterable2.add(object2.\u00d500000());
        }
        db2.\u00d300000 = (List)iterable;
    }

    public final int return() {
        return this.super;
    }

    public final void o00000(int n2) {
        this.super = n2;
    }

    public db() {
        this(0);
    }

    public final kb new() {
        kb kb2 = this.\u00d600000;
        if (kb2 != null) {
            return kb2;
        }
        fc.return("");
        return null;
    }

    public final void o00000(kb kb2) {
        this.\u00d600000 = kb2;
    }

    public final List o00000() {
        return this.class;
    }

    public final db \u00d500000() {
        return this.\u00d400000;
    }

    public final void o00000(db db2) {
        this.\u00d400000 = db2;
    }

    public final db \u00d800000() {
        return this.\u00d200000;
    }

    public final void new(db db2) {
        this.\u00d200000 = db2;
    }

    public final q \u00d300000() {
        return this.\u00d800000;
    }

    public final void o00000(q q2) {
        this.\u00d800000 = q2;
    }

    public final List \u00d400000() {
        return this.\u00d300000;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = object;
        if (!fc.o00000(this.getClass(), object2 != null ? object2.getClass() : null)) {
            return false;
        }
        db cfr_ignored_0 = (db)object;
        if (this.super != ((db)object).super) {
            return false;
        }
        if (!fc.o00000((Object)this.new(), (Object)((db)object).new())) {
            return false;
        }
        if (!fc.o00000((Object)this.class, (Object)((db)object).class)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d200000, (Object)((db)object).\u00d200000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d400000, (Object)((db)object).\u00d400000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d800000, (Object)((db)object).\u00d800000)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d300000, (Object)((db)object).\u00d300000);
    }

    public final int hashCode() {
        int n2 = this.super;
        n2 = 31 * n2 + this.new().hashCode();
        return 31 * n2 + ((Object)this.class).hashCode();
    }
}

