/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.e.h;
import b.t.c.b.v$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class v {
    public static v$_b super(Object object, h h2) {
        if (h2 == null) {
            v.super(0);
        }
        return new v$_b(object, h2);
    }

    public static v$_b super(h h2) {
        if (h2 == null) {
            v.super(1);
        }
        return v.super(null, h2);
    }

    private static /* synthetic */ void super(int n2) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }
}

