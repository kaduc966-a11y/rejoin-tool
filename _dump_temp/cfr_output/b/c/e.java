/*
 * Decompiled with CFR 0.152.
 */
package b.c;

import b.c.d;
import b.c.e$_b;
import java.io.Serializable;

public final class e
implements Serializable {
    private static final e$_b Object = new e$_b(null);
    private final Class \u00d200000;
    private static final long o00000 = 0L;

    public e(Enum[] enumArray) {
        this.\u00d200000 = enumArray.getClass().getComponentType();
    }

    private final Object o00000() {
        return d.o00000((Enum[])this.\u00d200000.getEnumConstants());
    }
}

