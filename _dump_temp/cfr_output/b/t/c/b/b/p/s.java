/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.d$_b;
import b.t.c.b.b.p.s$_b;
import b.t.c.b.b.p.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class s {
    private static volatile boolean \u00d200000 = false;
    private final Map o00000;
    private static final s \u00d300000 = new s(true);

    public static s \u00d200000() {
        return new s();
    }

    public static s super() {
        return \u00d300000;
    }

    public d$_b super(v v2, int n2) {
        return (d$_b)this.o00000.get(new s$_b(v2, n2));
    }

    public final void super(d$_b d$_b) {
        this.o00000.put(new s$_b(d$_b.o00000(), d$_b.new()), d$_b);
    }

    s() {
        this.o00000 = new HashMap();
    }

    private s(boolean bl) {
        this.o00000 = Collections.emptyMap();
    }
}

