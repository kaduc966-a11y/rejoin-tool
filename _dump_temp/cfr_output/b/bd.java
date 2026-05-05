/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.d.w;

public final class bd
extends Error {
    public bd(String string) {
        super(string);
    }

    public /* synthetic */ bd(String string, int n2, w w2) {
        if ((n2 & 1) != 0) {
            string = "An operation is not implemented.";
        }
        this(string);
    }

    public bd() {
        this(null, 1, null);
    }
}

