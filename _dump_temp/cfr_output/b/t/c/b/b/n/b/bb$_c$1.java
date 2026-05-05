/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.bb;
import b.t.c.b.b.n.b.bb$_c$1$_b;
import b.t.c.b.b.n.b.bb$_c$1$_c;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.j$_c;
import b.t.c.b.b.n.b.j$_d;
import b.t.c.b.b.n.b.j$_e;
import b.t.c.b.b.n.b.t;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bb$_c$1
implements j$_e {
    final /* synthetic */ bb o00000;
    final /* synthetic */ HashMap \u00d300000;
    final /* synthetic */ j \u00d400000;
    final /* synthetic */ HashMap \u00d500000;
    final /* synthetic */ HashMap new;

    bb$_c$1(bb bb2, HashMap hashMap, j j2, HashMap hashMap2, HashMap hashMap3) {
        this.o00000 = bb2;
        this.\u00d300000 = hashMap;
        this.\u00d400000 = j2;
        this.\u00d500000 = hashMap2;
        this.new = hashMap3;
    }

    @Override
    public final j$_c super(f f2, String string) {
        return new bb$_c$1$_c(this, t.new.\u00d200000(f2.\u00d400000(), string));
    }

    @Override
    public final j$_d super(f object, String object2, Object object3) {
        object = t.new.o00000(((f)object).\u00d400000(), (String)object2);
        if (object3 != null && (object2 = this.o00000.super((String)object2, object3)) != null) {
            ((Map)this.new).put(object, object2);
        }
        return new bb$_c$1$_b(this, (t)object);
    }
}

