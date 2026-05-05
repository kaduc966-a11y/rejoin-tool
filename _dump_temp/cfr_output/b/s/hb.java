/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.e.m;
import b.s.mc;
import b.s.sb;
import b.s.u;
import b.s.w;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class hb
extends w {
    private static final int \u00d400000(List list, int n2) {
        boolean bl = n2 >= 0 ? n2 <= mc.\u00d300000(list) : false;
        if (bl) {
            return mc.\u00d300000(list) - n2;
        }
        throw new IndexOutOfBoundsException("Element index " + n2 + " must be in range [" + new m(0, mc.\u00d300000(list)) + "].");
    }

    private static final int \u00d800000(List list, int n2) {
        boolean bl = n2 >= 0 ? n2 <= list.size() : false;
        if (bl) {
            return list.size() - n2;
        }
        throw new IndexOutOfBoundsException("Position index " + n2 + " must be in range [" + new m(0, list.size()) + "].");
    }

    private static final int \u00d300000(List list, int n2) {
        return mc.\u00d300000(list) - n2;
    }

    public static final List OO0000(List list) {
        return new sb(list);
    }

    public static final List \u00f800000(List list) {
        return new u(list);
    }

    public static final /* synthetic */ int return(List list, int n2) {
        return hb.\u00d400000(list, n2);
    }

    public static final /* synthetic */ int new(List list, int n2) {
        return hb.\u00d800000(list, n2);
    }

    public static final /* synthetic */ int \u00d500000(List list, int n2) {
        return hb.\u00d300000(list, n2);
    }
}

