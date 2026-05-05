/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.ab$_b$1;
import b.g.d;
import b.g.e;
import b.g.n;
import b.g.y;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ab
implements y,
n {
    private final n \u00d800000;
    private final int return;

    public ab(n object, int n2) {
        this.\u00d800000 = object;
        this.return = n2;
        if (!(this.return >= 0)) {
            object = "count must be non-negative, but was " + this.return + '.';
            throw new IllegalArgumentException(object.toString());
        }
    }

    @Override
    public final n o00000(int n2) {
        int n3 = this.return + n2;
        return n3 < 0 ? new ab(this, n2) : new ab(this.\u00d800000, n3);
    }

    @Override
    public final n \u00d200000(int n2) {
        int n3 = this.return + n2;
        return n3 < 0 ? (y)new d(this, n2) : (y)new e(this.\u00d800000, this.return, n3);
    }

    @Override
    public final Iterator o00000() {
        return new ab$_b$1(this);
    }

    public static final /* synthetic */ n \u00d200000(ab ab2) {
        return ab2.\u00d800000;
    }

    public static final /* synthetic */ int o00000(ab ab2) {
        return ab2.return;
    }
}

