/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.b.b.b;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.x;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class fb {
    private int \u00d200000;
    private String Object;
    public db \u00d500000;
    private db void;
    private x o00000;
    private final List \u00d600000;
    private final List \u00d400000;

    public fb(int n2, String object) {
        this.\u00d200000 = n2;
        this.Object = object;
        this.\u00d600000 = new ArrayList(0);
        Object object2 = f.o00000.Object();
        fb fb2 = this;
        object = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            b b2;
            if (((f)object2.next()).\u00d300000() == null) continue;
            object.add(b2);
        }
        fb2.\u00d400000 = (List)object;
    }

    public final int \u00d600000() {
        return this.\u00d200000;
    }

    public final void o00000(int n2) {
        this.\u00d200000 = n2;
    }

    public final String Object() {
        return this.Object;
    }

    public fb(String string) {
        this(0, string);
    }

    public final db \u00d200000() {
        db db2 = this.\u00d500000;
        if (db2 != null) {
            return db2;
        }
        fc.return("");
        return null;
    }

    public final void \u00d200000(db db2) {
        this.\u00d500000 = db2;
    }

    public final db \u00d400000() {
        return this.void;
    }

    public final void o00000(db db2) {
        this.void = db2;
    }

    public final x \u00d500000() {
        return this.o00000;
    }

    public final void o00000(x x2) {
        this.o00000 = x2;
    }

    public final List o00000() {
        return this.\u00d600000;
    }
}

