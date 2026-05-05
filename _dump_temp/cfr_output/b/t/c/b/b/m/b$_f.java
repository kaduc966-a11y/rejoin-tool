/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.t.c.b.b.m.b$_e;
import java.util.HashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b$_f
implements b$_e {
    private final Set super;

    public b$_f() {
        this(new HashSet());
    }

    public b$_f(Set set) {
        if (set == null) {
            b$_f.o00000(0);
        }
        this.super = set;
    }

    @Override
    public boolean o00000(Object object) {
        return this.super.add(object);
    }

    private static /* synthetic */ void o00000(int n2) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
    }
}

