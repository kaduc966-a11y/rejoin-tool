/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.bd;
import b.o.e.f;
import b.s.q;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class r
extends q {
    private static final void new(List list, Comparator comparator) {
        throw new bd(null, 1, null);
    }

    private static final void o00000(List list, f f2) {
        throw new bd(null, 1, null);
    }

    public static final void return(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void o00000(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    private static final void o00000(List list, Object object) {
        Collections.fill(list, object);
    }

    private static final void \u00d500000(List list) {
        Collections.shuffle(list);
    }

    private static final void o00000(List list, Random random) {
        Collections.shuffle(list, random);
    }
}

