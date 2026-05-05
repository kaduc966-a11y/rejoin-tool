/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.g;
import b.q.kb;
import b.q.v;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class y
extends v {
    private static final kb class(String string) {
        return new kb(string);
    }

    private static final kb super(String string, g g2) {
        return new kb(string, g2);
    }

    private static final kb super(String string, Set set) {
        return new kb(string, set);
    }
}

