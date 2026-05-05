/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.e;

import b.e.m;
import b.o.d.w;
import b.s.fb;
import b.s.mc;
import b.t.c.b.b.l.e.d;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class d$_b {
    private d$_b() {
    }

    public final d o00000(InputStream object) {
        object = new DataInputStream((InputStream)object);
        Iterable iterable = new m(1, ((DataInputStream)object).readInt());
        Object object2 = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            ((fb)object2).\u00f4\u00d4\u00d3000();
            Iterable iterable2 = iterable;
            iterable2.add(((DataInputStream)object).readInt());
        }
        int[] nArray = mc.oO0000((Collection)((List)iterable));
        object = Arrays.copyOf(nArray, nArray.length);
        return new d((int[])object);
    }

    public /* synthetic */ d$_b(w w2) {
        this();
    }
}

