/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import java.nio.file.Path;
import java.util.Iterator;

final class k {
    private final Path \u00d400000;
    private final Object o00000;
    private final k \u00d200000;
    private Iterator Object;

    public k(Path path, Object object, k k2) {
        this.\u00d400000 = path;
        this.o00000 = object;
        this.\u00d200000 = k2;
    }

    public final Path String() {
        return this.\u00d400000;
    }

    public final Object o00000() {
        return this.o00000;
    }

    public final k \u00d300000() {
        return this.\u00d200000;
    }

    public final Iterator \u00d200000() {
        return this.Object;
    }

    public final void o00000(Iterator iterator) {
        this.Object = iterator;
    }
}

