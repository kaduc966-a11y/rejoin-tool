/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.b.b;
import b.b.f;
import b.b.g;
import b.b.i;
import b.m.s;
import java.util.Random;

public final class c {
    public static final Random o00000(f f2) {
        Object object = f2 instanceof g ? (g)f2 : null;
        if (object == null || (object = ((g)object).\u00f600000()) == null) {
            object = new i(f2);
        }
        return object;
    }

    public static final f o00000(Random random) {
        Object object = random instanceof i ? (i)random : null;
        if (object == null || (object = ((i)object).super()) == null) {
            object = new b(random);
        }
        return object;
    }

    private static final f o00000() {
        return s.o00000.o00000();
    }

    public static final double o00000(int n2, int n3) {
        return (double)(((long)n2 << 27) + (long)n3) / 9.007199254740992E15;
    }
}

