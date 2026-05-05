/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b.b;

import b.dc;
import b.r;
import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.b.b.f$_b$_b$0;
import java.util.List;
import java.util.ServiceLoader;

public final class f$_b {
    static final /* synthetic */ f$_b o00000;
    private static final dc \u00d200000;

    private f$_b() {
    }

    public final List Object() {
        return (List)\u00d200000.\u00d200000();
    }

    private static final List o00000() {
        List list = mc.\u00f5O0000(ServiceLoader.load(f.class, f.class.getClassLoader()));
        if (list.isEmpty()) {
            throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager".toString());
        }
        return list;
    }

    static {
        o00000 = new f$_b();
        \u00d200000 = r.o00000(f$_b$_b$0.\u00f80O000);
    }

    static /* synthetic */ List \u00d200000() {
        return f$_b.o00000();
    }
}

