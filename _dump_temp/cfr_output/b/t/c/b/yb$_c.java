/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.s.mc;
import b.s.z;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.yb;
import b.t.c.b.yb$_c$_b$0;
import b.t.c.b.yb$_c$_c$_b$_b$1;
import java.lang.reflect.Method;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class yb$_c
extends yb {
    private final Class new;
    private final List o00000;

    public yb$_c(Class clazz) {
        super(null);
        this.new = clazz;
        this.o00000 = z.null((Object[])this.new.getDeclaredMethods(), new yb$_c$_c$_b$_b$1());
    }

    public final List \u00d200000() {
        return this.o00000;
    }

    @Override
    public final String super() {
        return mc.o00000(this.o00000, "", "<init>(", ")V", 0, null, yb$_c$_b$0.returnnewObject, 24, null);
    }

    private static final CharSequence \u00d200000(Method method) {
        return e.\u00d300000(method.getReturnType());
    }

    static /* synthetic */ CharSequence super(Method method) {
        return yb$_c.\u00d200000(method);
    }
}

