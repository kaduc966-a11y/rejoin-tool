/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.t.c.b.b.h.ib;
import b.t.c.b.b.o.c.d;
import b.t.c.b.b.q.bc;
import java.util.Arrays;

public final class g
extends d {
    public g(char c2) {
        super(Character.valueOf(c2));
    }

    public final ib \u00d200000(bc bc2) {
        return bc2.returnforsuper().\u00d3O0000();
    }

    @Override
    public final String toString() {
        String string = "\\u%04X ('%s')";
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = (int)((Character)this.o00000()).charValue();
        g g2 = this;
        objectArray2[1] = g2.\u00d200000(((Character)g2.o00000()).charValue());
        return String.format(string, Arrays.copyOf(objectArray2, objectArray2.length));
    }

    private final String \u00d200000(char c2) {
        switch (c2) {
            case '\b': {
                return "\\b";
            }
            case '\t': {
                return "\\t";
            }
            case '\n': {
                return "\\n";
            }
            case '\f': {
                return "\\f";
            }
            case '\r': {
                return "\\r";
            }
        }
        if (this.o00000(c2)) {
            return String.valueOf(c2);
        }
        return "?";
    }

    private final boolean o00000(char c2) {
        byte by = (byte)Character.getType(c2);
        c2 = (char)by;
        return by != 0 && c2 != '\r' && c2 != '\u000e' && c2 != '\u000f' && c2 != '\u0010' && c2 != '\u0012' && c2 != '\u0013';
    }
}

