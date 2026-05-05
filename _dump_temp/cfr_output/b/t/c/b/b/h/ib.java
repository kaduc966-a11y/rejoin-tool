/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.q.f;
import b.s.mc;
import b.t.c.b.b.h.c.h;
import b.t.c.b.b.h.c.u;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.k.b;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class ib
extends l
implements u,
h {
    public ib() {
        super(null);
    }

    public abstract ib new(zb var1);

    public abstract ib \u00d4o0000(boolean var1);

    public String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        for (b.t.c.b.b.q.e.l l2 : this.\u00d4\u00f80000()) {
            String[] stringArray = new String[3];
            String[] stringArray2 = stringArray;
            stringArray[0] = "[";
            stringArray2[1] = b.super(b.class, l2, null, 2, null);
            stringArray2[2] = "] ";
            f.super(stringBuilder2, stringArray2);
        }
        stringBuilder2.append(this.thisdosuper());
        if (!((Collection)this.\u00d4\u00d6\u00d2000()).isEmpty()) {
            mc.o00000(this.\u00d4\u00d6\u00d2000(), stringBuilder2, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (this.\u00f5\u00d6\u00d2000()) {
            stringBuilder2.append("?");
        }
        return stringBuilder.toString();
    }
}

