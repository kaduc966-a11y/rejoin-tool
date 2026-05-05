/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.d.tc;
import b.o.e.h;
import b.sb;

class td
extends sb {
    private static final Object o00000(Object object, h object2) {
        synchronized (object) {
            try {
                object2 = object2.newreturn();
                return object2;
            }
            finally {
                tc.Object(1);
                // MONITOREXIT @DISABLED, blocks:[1, 3] lbl7 : MonitorExitStatement: MONITOREXIT : var0
                tc.o00000(1);
            }
        }
    }
}

