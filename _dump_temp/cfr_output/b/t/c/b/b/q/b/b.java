/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.m;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.q.db;
import b.t.c.b.b.q.fc;
import b.t.c.b.b.q.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
implements db {
    private final List String;
    private final String \u00d300000;

    public b(List list, String string) {
        boolean bl;
        this.String = list;
        this.\u00d300000 = string;
        boolean bl2 = bl = this.String.size() == mc.\u00d4O0000((Iterable)this.String).size();
        if (m.new && !bl) {
            String string2 = "providers.size is " + this.String.size() + " while only " + mc.\u00d4O0000((Iterable)this.String).size() + " unique providers";
            throw new AssertionError((Object)string2);
        }
    }

    @Override
    public final List o00000(k k2) {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.String.iterator();
        while (iterator.hasNext()) {
            fc.o00000((j)iterator.next(), k2, arrayList);
        }
        return mc.\u00f5O0000((Iterable)arrayList);
    }

    @Override
    public final void o00000(k k2, Collection collection) {
        Iterator iterator = this.String.iterator();
        while (iterator.hasNext()) {
            fc.o00000((j)iterator.next(), k2, collection);
        }
    }

    @Override
    public final boolean \u00d200000(k k2) {
        Object object = this.String;
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (fc.\u00d200000((j)object.next(), k2)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public final Collection o00000(k k2, g g2) {
        HashSet hashSet = new HashSet();
        for (j j2 : this.String) {
            hashSet.addAll(j2.o00000(k2, g2));
        }
        return hashSet;
    }

    public final String toString() {
        return this.\u00d300000;
    }
}

