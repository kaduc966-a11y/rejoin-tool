/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ad;
import b.dc;
import b.ed;
import b.fc;
import b.lb;
import b.o.e.h;
import b.qd;
import b.zb$_b;

public class zb {
    public static final dc o00000(h h2) {
        return new ed(h2, null, 2, null);
    }

    public static final dc o00000(lb lb2, h h2) {
        switch (zb$_b.o00000[lb2.ordinal()]) {
            case 1: {
                return new ed(h2, null, 2, null);
            }
            case 2: {
                return new fc(h2);
            }
            case 3: {
                return new ad(h2);
            }
        }
        throw new qd();
    }

    public static final dc o00000(Object object, h h2) {
        return new ed(h2, object);
    }
}

