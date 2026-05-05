/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.hd;
import b.qb;
import b.s.mc;
import java.util.List;

public final class yc {
    public static final qb o00000(Object object, Object object2) {
        return new qb(object, object2);
    }

    public static final List o00000(qb qb2) {
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = qb2.new();
        objectArray2[1] = qb2.o00000();
        return mc.new(objectArray2);
    }

    public static final List o00000(hd hd2) {
        Object[] objectArray = new Object[3];
        Object[] objectArray2 = objectArray;
        objectArray[0] = hd2.Object();
        objectArray2[1] = hd2.o00000();
        objectArray2[2] = hd2.\u00d200000();
        return mc.new(objectArray2);
    }
}

