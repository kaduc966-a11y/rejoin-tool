/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.e.h;
import b.t.c.b.v$_c;
import java.lang.ref.SoftReference;

public class v$_b
extends v$_c
implements h {
    private final h \u00f4\u00d4\u00f4000;
    private volatile SoftReference \u00f5\u00d4\u00f4000;

    public v$_b(Object object, h h2) {
        if (h2 == null) {
            v$_b.o\u00d60000(0);
        }
        this.\u00f5\u00d4\u00f4000 = null;
        this.\u00f4\u00d4\u00f4000 = h2;
        if (object != null) {
            this.\u00f5\u00d4\u00f4000 = new SoftReference<Object>(this.oo0000(object));
        }
    }

    @Override
    public Object newreturn() {
        Object object = this.\u00f5\u00d4\u00f4000;
        if (object != null && (object = ((SoftReference)object).get()) != null) {
            return this.Oo0000(object);
        }
        object = this.\u00f4\u00d4\u00f4000.newreturn();
        this.\u00f5\u00d4\u00f4000 = new SoftReference<Object>(this.oo0000(object));
        return object;
    }

    private static /* synthetic */ void o\u00d60000(int n2) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
    }
}

