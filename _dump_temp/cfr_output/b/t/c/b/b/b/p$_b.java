/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.dc;
import b.lb;
import b.o.e.h;
import b.r;
import b.s.mc;
import b.t.c.b.b.b.p;
import b.t.c.b.b.b.p$_b$_b$0;
import java.util.ServiceLoader;

public final class p$_b {
    static final /* synthetic */ p$_b o00000;
    private static final dc \u00d200000;

    private p$_b() {
    }

    public final p \u00d200000() {
        return (p)\u00d200000.\u00d200000();
    }

    private static final p o00000() {
        p p2 = (p)mc.nullObject(ServiceLoader.load(p.class, p.class.getClassLoader()));
        if (p2 == null) {
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return p2;
    }

    static {
        o00000 = new p$_b();
        \u00d200000 = r.o00000(lb.\u00d400000, (h)p$_b$_b$0.Stringint);
    }

    static /* synthetic */ p \u00d300000() {
        return p$_b.o00000();
    }
}

