/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.w;
import b.s.mc;
import b.s.y;
import b.t.bb;
import b.t.c.b.cd$_b;
import java.util.List;
import java.util.Map;

public final class cd {
    public static final cd$_b \u00d500000 = new cd$_b(null);
    private final List \u00d200000;
    private final Map \u00d400000;
    private final cd o00000;
    public static final cd Object = new cd(mc.\u00d500000(), y.Object(), null);

    private cd(List list, Map map, cd cd2) {
        this.\u00d200000 = list;
        this.\u00d400000 = map;
        this.o00000 = cd2;
    }

    public final List o00000() {
        return this.\u00d200000;
    }

    public final bb o00000(int n2) {
        bb bb2;
        while ((bb2 = (bb)this.\u00d400000.get(n2)) == null) {
            if (this.o00000 != null) continue;
            bb2 = null;
            break;
        }
        return bb2;
    }

    public /* synthetic */ cd(List list, Map map, cd cd2, w w2) {
        this(list, map, cd2);
    }
}

