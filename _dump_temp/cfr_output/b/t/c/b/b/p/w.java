/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.g;
import b.t.c.b.b.p.v;
import java.util.List;

public class w
extends RuntimeException {
    private final List o00000 = null;

    public w(v v2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public g o00000() {
        return new g(this.getMessage());
    }
}

