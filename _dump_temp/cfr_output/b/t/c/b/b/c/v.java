/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.b.b.l;
import b.t.c.b.b.c.db;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class v {
    private int new;
    private String \u00d300000;
    private final List \u00d800000;
    public db \u00d400000;
    public db o00000;
    private final List \u00f400000;
    private final List return;
    private final List \u00d500000;

    public v(int n2, String object) {
        this.new = n2;
        this.\u00d300000 = object;
        this.\u00d800000 = new ArrayList(0);
        this.\u00f400000 = new ArrayList(0);
        this.return = new ArrayList(0);
        Object object2 = f.o00000.Object();
        v v2 = this;
        object = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            l l2;
            if (((f)object2.next()).\u00d600000() == null) continue;
            object.add(l2);
        }
        v2.\u00d500000 = (List)object;
    }

    public final int Object() {
        return this.new;
    }

    public final void o00000(int n2) {
        this.new = n2;
    }

    public final List \u00d200000() {
        return this.\u00d800000;
    }

    public final void o00000(db db2) {
        this.\u00d400000 = db2;
    }

    public final void \u00d200000(db db2) {
        this.o00000 = db2;
    }

    public final List o00000() {
        return this.\u00f400000;
    }

    public final List \u00d400000() {
        return this.return;
    }
}

