/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.o.e.g;
import b.qb;
import b.t.c.b.b.n.c.g.j;
import b.t.c.b.b.n.c.g.j$_b$_b;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j$_b {
    private final String new;
    final /* synthetic */ j o00000;

    public j$_b(j j2, String string) {
        this.o00000 = j2;
        this.new = string;
    }

    public final String super() {
        return this.new;
    }

    public final void super(String object, String string, g g2) {
        Map map = j.super(this.o00000);
        object = new j$_b$_b(this, (String)object, string);
        g2.\u00f800000(object);
        object = ((j$_b$_b)object).\u00d200000();
        map.put(((qb)object).new(), ((qb)object).o00000());
    }

    public static /* synthetic */ void super(j$_b j$_b, String string, String string2, g g2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        j$_b.super(string, string2, g2);
    }
}

