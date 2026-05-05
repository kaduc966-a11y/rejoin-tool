/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.t.b.l;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.c.b.qb$_b$1;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.c.b.v$_c;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class qb
implements o {
    private final v$_b \u00d50\u00d2000 = v.super(new qb$_b$1(this));

    @Override
    public Object[] newwhile() {
        return (Object[])((Object[])((v$_c)this.\u00d50\u00d2000).newreturn()).clone();
    }

    @Override
    public Object o00000(Object ... objectArray) {
        return this.new(objectArray);
    }

    @Override
    public Object o00000(Map map) {
        return this.new(map);
    }

    public Object new(Object ... objectArray) {
        try {
            return this.privatedo().o00000(objectArray);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new l(illegalAccessException);
        }
    }

    public Object new(Map map) {
        if (md.new(this)) {
            return md.o00000(this, map);
        }
        return md.o00000(this, map, null);
    }
}

