/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.b.e$_b;
import b.b.f;
import b.b.h;
import java.io.InvalidObjectException;
import java.io.Serializable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e
extends f
implements Serializable {
    private static final e$_b \u00f600000 = new e$_b(null);
    private int \u00d300000;
    private int int;
    private int \u00d800000;
    private int \u00d400000;
    private int class;
    private int \u00d600000;
    private static final long \u00f400000 = 0L;

    public e(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.\u00d300000 = n2;
        this.int = n3;
        this.\u00d800000 = n4;
        this.\u00d400000 = n5;
        this.class = n6;
        this.\u00d600000 = n7;
        this.null();
        for (n2 = 0; n2 < 64; ++n2) {
            ((f)this).\u00d200000();
        }
    }

    public e(int n2, int n3) {
        this(n2, n3, 0, 0, ~n2, n2 << 10 ^ n3 >>> 4);
    }

    private final void null() {
        if (!((this.\u00d300000 | this.int | this.\u00d800000 | this.\u00d400000 | this.class) != 0)) {
            String string = "Initial state must have at least one non-zero element.";
            throw new IllegalArgumentException(string.toString());
        }
    }

    private final Object \u00d800000() {
        e e2 = this;
        try {
            this.null();
        }
        catch (Throwable throwable) {
            throw new InvalidObjectException(throwable.getMessage()).initCause(throwable);
        }
        return e2;
    }

    @Override
    public final int \u00d200000() {
        int n2;
        int n3 = this.\u00d300000;
        int n4 = n3 ^ n3 >>> 2;
        this.\u00d300000 = this.int;
        this.int = this.\u00d800000;
        this.\u00d800000 = this.\u00d400000;
        this.\u00d400000 = n2 = this.class;
        int n5 = n4;
        this.class = n4 = n5 ^ n5 << 1 ^ n2 ^ n2 << 4;
        this.\u00d600000 += 362437;
        return n4 + this.\u00d600000;
    }

    @Override
    public final int \u00d200000(int n2) {
        return h.\u00d200000(((f)this).\u00d200000(), n2);
    }
}

