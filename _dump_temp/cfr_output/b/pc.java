/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.e.g;
import b.o.e.h;
import b.xd;
import b.xd$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class pc {
    public static final Object o00000(Throwable throwable) {
        return new xd$_b(throwable);
    }

    public static final void o00000(Object object) {
        if (object instanceof xd$_b) {
            throw ((xd$_b)object).o00000;
        }
    }

    private static final Object o00000(h object) {
        try {
            object = xd.String(object.newreturn());
        }
        catch (Throwable throwable) {
            object = xd.String(pc.o00000(throwable));
        }
        return object;
    }

    private static final Object \u00d200000(Object object, g g2) {
        try {
            object = xd.String(g2.\u00f800000(object));
        }
        catch (Throwable throwable) {
            object = xd.String(pc.o00000(throwable));
        }
        return object;
    }

    private static final Object \u00d200000(Object object) {
        pc.o00000(object);
        return object;
    }

    private static final Object \u00d500000(Object object, g g2) {
        Throwable throwable = xd.\u00d200000(object);
        if (throwable == null) {
            return object;
        }
        return g2.\u00f800000(throwable);
    }

    private static final Object o00000(Object object, Object object2) {
        if (xd.\u00d800000(object)) {
            return object2;
        }
        return object;
    }

    private static final Object o00000(Object object, g g2, g g3) {
        Throwable throwable = xd.\u00d200000(object);
        if (throwable == null) {
            return g2.\u00f800000(object);
        }
        return g3.\u00f800000(throwable);
    }

    private static final Object o00000(Object object, g g2) {
        if (xd.\u00d600000(object)) {
            return xd.String(g2.\u00f800000(object));
        }
        return xd.String(object);
    }

    private static final Object \u00d400000(Object object, g g2) {
        if (xd.\u00d600000(object)) {
            try {
                object = xd.String(g2.\u00f800000(object));
            }
            catch (Throwable throwable) {
                object = xd.String(pc.o00000(throwable));
            }
            return object;
        }
        return xd.String(object);
    }

    private static final Object void(Object object, g g2) {
        Throwable throwable = xd.\u00d200000(object);
        if (throwable == null) {
            return object;
        }
        return xd.String(g2.\u00f800000(throwable));
    }

    private static final Object Object(Object object, g g2) {
        Throwable throwable = xd.\u00d200000(object);
        if (throwable == null) {
            return object;
        }
        try {
            object = xd.String(g2.\u00f800000(throwable));
        }
        catch (Throwable throwable2) {
            object = xd.String(pc.o00000(throwable2));
        }
        return object;
    }

    private static final Object \u00d600000(Object object, g g2) {
        block0: {
            Throwable throwable = xd.\u00d200000(object);
            if (throwable == null) break block0;
            Throwable throwable2 = throwable;
            g2.\u00f800000(throwable2);
        }
        return object;
    }

    private static final Object \u00f400000(Object object, g g2) {
        if (xd.\u00d600000(object)) {
            g2.\u00f800000(object);
        }
        return object;
    }
}

