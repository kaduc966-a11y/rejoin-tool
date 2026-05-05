/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.jb;
import b.o.d.oc$_b;
import b.o.d.z;
import b.s.mc;
import b.t.l;
import java.util.List;

public final class oc
extends jb {
    public static final oc$_b privateObjectObject = new oc$_b(null);
    private final String \u00f4\u00d8\u00d5000;
    private final l \u00d8\u00d8\u00d5000;
    private final boolean forObjectObject;
    private volatile List \u00f5\u00d8\u00d5000;

    public oc(Object object, String string, l l2, boolean bl) {
        super(object);
        this.\u00f4\u00d8\u00d5000 = string;
        this.\u00d8\u00d8\u00d5000 = l2;
        this.forObjectObject = bl;
    }

    @Override
    public final String \u00f5\u00d4o000() {
        return this.\u00f4\u00d8\u00d5000;
    }

    @Override
    public final l \u00d8\u00d4o000() {
        return this.\u00d8\u00d8\u00d5000;
    }

    @Override
    public final boolean StringObjectsuper() {
        return this.forObjectObject;
    }

    @Override
    public final List \u00f4\u00d4o000() {
        List list = this.\u00f5\u00d8\u00d5000;
        if (list == null) {
            List list2;
            List list3;
            this.\u00f5\u00d8\u00d5000 = list3 = (list2 = mc.o00000(z.Object(Object.class)));
            list = list2;
        }
        return list;
    }

    public static /* synthetic */ void o\u00d5o000() {
    }

    public final void \u00f400000(List list) {
        if (this.\u00f5\u00d8\u00d5000 != null) {
            throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
        }
        this.\u00f5\u00d8\u00d5000 = list;
    }
}

