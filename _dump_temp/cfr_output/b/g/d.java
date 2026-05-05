/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.d$_b$1;
import b.g.e;
import b.g.n;
import b.g.y;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
implements y,
n {
    private final n new;
    private final int o00000;

    public d(n object, int n2) {
        this.new = object;
        this.o00000 = n2;
        if (!(this.o00000 >= 0)) {
            object = "count must be non-negative, but was " + this.o00000 + '.';
            throw new IllegalArgumentException(object.toString());
        }
    }

    @Override
    public final n o00000(int n2) {
        if (n2 >= this.o00000) {
            return c.\u00d200000();
        }
        return new e(this.new, n2, this.o00000);
    }

    @Override
    public final n \u00d200000(int n2) {
        if (n2 >= this.o00000) {
            return this;
        }
        return new d(this.new, n2);
    }

    @Override
    public final Iterator o00000() {
        return new d$_b$1(this);
    }

    public static final /* synthetic */ int \u00d200000(d d2) {
        return d2.o00000;
    }

    public static final /* synthetic */ n o00000(d d2) {
        return d2.new;
    }
}

