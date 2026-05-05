/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.b.b$_b;
import b.b.g;
import java.io.Serializable;
import java.util.Random;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class b
extends g
implements Serializable {
    private static final b$_b do = new b$_b(null);
    private final Random \u00f800000;
    private static final long OO0000 = 0L;

    public b(Random random) {
        this.\u00f800000 = random;
    }

    @Override
    public final Random \u00f600000() {
        return this.\u00f800000;
    }
}

