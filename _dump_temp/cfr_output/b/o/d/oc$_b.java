/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.oc$_b$_b;
import b.o.d.w;
import b.qd;
import b.t.bb;

public final class oc$_b {
    private oc$_b() {
    }

    public final String o00000(bb bb2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        switch (oc$_b$_b.o00000[bb2.\u00d8\u00d4o000().ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                stringBuilder2.append("in ");
                break;
            }
            case 3: {
                stringBuilder2.append("out ");
                break;
            }
            default: {
                throw new qd();
            }
        }
        stringBuilder2.append(bb2.\u00f5\u00d4o000());
        return stringBuilder.toString();
    }

    public /* synthetic */ oc$_b(w w2) {
        this();
    }
}

