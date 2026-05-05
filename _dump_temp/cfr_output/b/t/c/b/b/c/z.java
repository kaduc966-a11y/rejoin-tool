/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.qb;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.c.x;
import b.t.c.b.b.c.z$_b$0;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class z {
    private final String o00000;
    private final Map \u00d200000;

    public z(String string, Map map) {
        this.o00000 = string;
        this.\u00d200000 = map;
    }

    public final String new() {
        return this.o00000;
    }

    public final Map o00000() {
        return this.\u00d200000;
    }

    public final boolean equals(Object object) {
        return this == object || object instanceof z && fc.o00000((Object)this.o00000, (Object)((z)object).o00000) && fc.o00000((Object)this.\u00d200000, (Object)((z)object).\u00d200000);
    }

    public final int hashCode() {
        return 31 * this.o00000.hashCode() + ((Object)this.\u00d200000).hashCode();
    }

    public final String toString() {
        String string = mc.o00000(y.\u00d2O0000(this.\u00d200000), null, null, null, 0, null, z$_b$0.\u00f4\u00f6\u00d3000, 31, null);
        return "@" + this.o00000 + '(' + string + ')';
    }

    private static final CharSequence new(qb object) {
        String string = (String)((qb)object).\u00d400000();
        object = (x)((qb)object).\u00d300000();
        return string + " = " + object;
    }

    static /* synthetic */ CharSequence o00000(qb qb2) {
        return z.new(qb2);
    }
}

