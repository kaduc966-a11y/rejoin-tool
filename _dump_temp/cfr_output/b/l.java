/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.e.h;
import b.x;

class l
extends x {
    private static final void \u00d300000(boolean bl) {
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
    }

    private static final void \u00d300000(boolean bl, h h2) {
        if (!bl) {
            Object object = h2.newreturn();
            throw new IllegalArgumentException(object.toString());
        }
    }

    private static final Object \u00d300000(Object object) {
        Object object2 = object;
        if (object2 == null) {
            object = "Required value was null.";
            throw new IllegalArgumentException(object.toString());
        }
        return object2;
    }

    private static final Object o00000(Object object, h h2) {
        if (object == null) {
            object = h2.newreturn();
            throw new IllegalArgumentException(object.toString());
        }
        return object;
    }

    private static final void \u00d200000(boolean bl) {
        if (!bl) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private static final void \u00d200000(boolean bl, h h2) {
        if (!bl) {
            Object object = h2.newreturn();
            throw new IllegalStateException(object.toString());
        }
    }

    private static final Object o00000(Object object) {
        Object object2 = object;
        if (object2 == null) {
            object = "Required value was null.";
            throw new IllegalStateException(object.toString());
        }
        return object2;
    }

    private static final Object \u00d200000(Object object, h h2) {
        if (object == null) {
            object = h2.newreturn();
            throw new IllegalStateException(object.toString());
        }
        return object;
    }

    private static final Void \u00d200000(Object object) {
        throw new IllegalStateException(object.toString());
    }
}

