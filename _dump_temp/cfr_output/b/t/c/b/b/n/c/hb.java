/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.dc;
import b.o.d.fc;
import b.o.d.w;
import b.r;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.n.c.cb;
import b.t.c.b.b.n.c.hb$_b$0;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class hb {
    private final cb \u00d500000;
    private final cb \u00d200000;
    private final Map Object;
    private final dc \u00d400000;
    private final boolean o00000;

    public hb(cb object, cb cb2, Map map) {
        this.\u00d500000 = object;
        this.\u00d200000 = cb2;
        this.Object = map;
        object = this;
        this.\u00d400000 = r.o00000(new hb$_b$0((hb)object));
        this.o00000 = this.\u00d500000 == cb.\u00d600000 && this.\u00d200000 == cb.\u00d600000 && this.Object.isEmpty();
    }

    public /* synthetic */ hb(cb cb2, cb cb3, Map map, int n2, w w2) {
        if ((n2 & 2) != 0) {
            cb3 = null;
        }
        if ((n2 & 4) != 0) {
            map = y.Object();
        }
        this(cb2, cb3, map);
    }

    public final cb super() {
        return this.\u00d500000;
    }

    public final cb \u00d200000() {
        return this.\u00d200000;
    }

    public final Map \u00d400000() {
        return this.Object;
    }

    public final boolean \u00d300000() {
        return this.o00000;
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + (Object)((Object)this.\u00d500000) + ", migrationLevel=" + (Object)((Object)this.\u00d200000) + ", userDefinedLevelForSpecificAnnotation=" + this.Object + ')';
    }

    public final int hashCode() {
        return (this.\u00d500000.hashCode() * 31 + (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode())) * 31 + ((Object)this.Object).hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hb)) {
            return false;
        }
        object = (hb)object;
        if (this.\u00d500000 != ((hb)object).\u00d500000) {
            return false;
        }
        if (this.\u00d200000 != ((hb)object).\u00d200000) {
            return false;
        }
        return fc.o00000((Object)this.Object, (Object)((hb)object).Object);
    }

    private static final String[] \u00d200000(hb object2) {
        List list;
        List list2 = list = mc.o00000();
        list.add(((hb)object2).\u00d500000.\u00d200000());
        cb cb2 = ((hb)object2).\u00d200000;
        if (cb2 != null) {
            cb cb3 = cb2;
            list2.add("under-migration:" + cb3.\u00d200000());
        }
        for (Map.Entry entry : ((hb)object2).Object.entrySet()) {
            list2.add("@" + entry.getKey() + ':' + ((cb)((Object)entry.getValue())).\u00d200000());
        }
        return ((Collection)mc.o00000(list)).toArray(new String[0]);
    }

    static /* synthetic */ String[] super(hb hb2) {
        return hb.\u00d200000(hb2);
    }
}

