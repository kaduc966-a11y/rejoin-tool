/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.j.b;

import b.t.c.b.b.j.b.c$_b;
import java.io.Serializable;

public final class c
implements Serializable {
    public static final c$_b \u00d400000 = new c$_b(null);
    private final int o00000;
    private final int Object;
    private static final c \u00d200000 = new c(-1, -1);

    public c(int n2, int n3) {
        this.o00000 = n2;
        this.Object = n3;
    }

    public final String toString() {
        return "Position(line=" + this.o00000 + ", column=" + this.Object + ')';
    }

    public final int hashCode() {
        return Integer.hashCode(this.o00000) * 31 + Integer.hashCode(this.Object);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        if (this.o00000 != ((c)object).o00000) {
            return false;
        }
        return this.Object == ((c)object).Object;
    }

    public static final /* synthetic */ c o00000() {
        return \u00d200000;
    }
}

