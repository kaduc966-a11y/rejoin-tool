/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import java.util.Comparator;

final class j
implements Comparator {
    private final Comparator o00000;

    public j(Comparator comparator) {
        this.o00000 = comparator;
    }

    public final Comparator o00000() {
        return this.o00000;
    }

    public final int compare(Object object, Object object2) {
        return this.o00000.compare(object2, object);
    }

    public final Comparator reversed() {
        return this.o00000;
    }
}

