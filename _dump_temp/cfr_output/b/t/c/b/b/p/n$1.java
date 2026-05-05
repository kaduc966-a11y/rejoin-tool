/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.n;
import b.t.c.b.b.p.z$_b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class n$1
extends n {
    n$1(int n2) {
        super(n2, null);
    }

    @Override
    public final void \u00d200000() {
        if (!this.\u00d300000()) {
            List list;
            for (int i2 = 0; i2 < this.\u00d800000(); ++i2) {
                Map.Entry entry = this.\u00d300000(i2);
                if (!((z$_b)entry.getKey()).\u00d200000()) continue;
                list = (List)entry.getValue();
                entry.setValue(Collections.unmodifiableList(list));
            }
            for (Map.Entry entry : this.class()) {
                if (!((z$_b)entry.getKey()).\u00d200000()) continue;
                list = (List)entry.getValue();
                entry.setValue(Collections.unmodifiableList(list));
            }
        }
        super.\u00d200000();
    }
}

