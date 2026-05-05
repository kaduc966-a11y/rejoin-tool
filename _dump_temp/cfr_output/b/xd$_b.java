/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.d.fc;
import java.io.Serializable;

public final class xd$_b
implements Serializable {
    public final Throwable o00000;

    public xd$_b(Throwable throwable) {
        this.o00000 = throwable;
    }

    public final boolean equals(Object object) {
        return object instanceof xd$_b && fc.o00000((Object)this.o00000, (Object)((xd$_b)object).o00000);
    }

    public final int hashCode() {
        return this.o00000.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.o00000 + ')';
    }
}

