/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.e$_b$1;
import b.g.n;
import b.g.y;
import java.util.Iterator;

public final class e
implements y,
n {
    private final n \u00d500000;
    private final int \u00d400000;
    private final int \u00d300000;

    public e(n object, int n2, int n3) {
        this.\u00d500000 = object;
        this.\u00d400000 = n2;
        this.\u00d300000 = n3;
        if (!(this.\u00d400000 >= 0)) {
            object = "startIndex should be non-negative, but is " + this.\u00d400000;
            throw new IllegalArgumentException(object.toString());
        }
        if (!(this.\u00d300000 >= 0)) {
            object = "endIndex should be non-negative, but is " + this.\u00d300000;
            throw new IllegalArgumentException(object.toString());
        }
        if (!(this.\u00d300000 >= this.\u00d400000)) {
            object = "endIndex should be not less than startIndex, but was " + this.\u00d300000 + " < " + this.\u00d400000;
            throw new IllegalArgumentException(object.toString());
        }
    }

    private final int \u00d200000() {
        return this.\u00d300000 - this.\u00d400000;
    }

    @Override
    public final n o00000(int n2) {
        if (n2 >= this.\u00d200000()) {
            return c.\u00d200000();
        }
        return new e(this.\u00d500000, this.\u00d400000 + n2, this.\u00d300000);
    }

    @Override
    public final n \u00d200000(int n2) {
        if (n2 >= this.\u00d200000()) {
            return this;
        }
        return new e(this.\u00d500000, this.\u00d400000, this.\u00d400000 + n2);
    }

    @Override
    public final Iterator o00000() {
        return new e$_b$1(this);
    }

    public static final /* synthetic */ n \u00d200000(e e2) {
        return e2.\u00d500000;
    }

    public static final /* synthetic */ int \u00d300000(e e2) {
        return e2.\u00d400000;
    }

    public static final /* synthetic */ int o00000(e e2) {
        return e2.\u00d300000;
    }
}

