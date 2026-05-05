/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.t.c.b.b.f.b.gb;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.c.b;
import b.t.c.b.b.n.c.d.b.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
implements gb {
    public static final d o00000 = new d();

    private d() {
    }

    @Override
    public final rc super(b$_nb stringArray, String string, ib ib2, ib ib3) {
        if (!fc.o00000((Object)string, (Object)"kotlin.jvm.PlatformType")) {
            String[] stringArray2 = new String[3];
            stringArray = stringArray2;
            stringArray2[0] = string;
            stringArray[1] = ib2.toString();
            stringArray[2] = ib3.toString();
            return k.new(c.\u00f600000, stringArray);
        }
        if (stringArray.\u00d400000(b.\u00f600000)) {
            return new h(ib2, ib3);
        }
        return oc.o00000(ib2, ib3);
    }
}

