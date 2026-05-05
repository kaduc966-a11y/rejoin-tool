/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.d.fc;
import b.xd$_b;
import b.xd$_c;
import java.io.Serializable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class xd
implements Serializable {
    public static final xd$_c \u00d200000 = new xd$_c(null);
    private final Object super;

    public static /* synthetic */ void \u00d200000() {
    }

    public static final boolean \u00d600000(Object object) {
        return !(object instanceof xd$_b);
    }

    public static final boolean \u00d800000(Object object) {
        return object instanceof xd$_b;
    }

    private static final Object o00000(Object object) {
        if (xd.\u00d800000(object)) {
            return null;
        }
        return object;
    }

    public static final Throwable \u00d200000(Object object) {
        if (object instanceof xd$_b) {
            return ((xd$_b)object).o00000;
        }
        return null;
    }

    public static String \u00d500000(Object object) {
        if (object instanceof xd$_b) {
            return ((xd$_b)object).toString();
        }
        return "Success(" + object + ')';
    }

    public final String toString() {
        return xd.\u00d500000(this.super);
    }

    public static int null(Object object) {
        Object object2 = object;
        if (object2 == null) {
            return 0;
        }
        return object2.hashCode();
    }

    public final int hashCode() {
        return xd.null(this.super);
    }

    public static boolean \u00d200000(Object object, Object object2) {
        if (!(object2 instanceof xd)) {
            return false;
        }
        return fc.o00000(object, ((xd)object2).o00000());
    }

    public final boolean equals(Object object) {
        return xd.\u00d200000(this.super, object);
    }

    private /* synthetic */ xd(Object object) {
        this.super = object;
    }

    public static Object String(Object object) {
        return object;
    }

    public static final /* synthetic */ xd \u00d300000(Object object) {
        return new xd(object);
    }

    public final /* synthetic */ Object o00000() {
        return this.super;
    }

    public static final boolean o00000(Object object, Object object2) {
        return fc.o00000(object, object2);
    }
}

