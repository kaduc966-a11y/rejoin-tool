/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.t.c.b.b.l.d.c$_b;
import b.t.c.b.b.l.d.j;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends j {
    public static final c$_b return = new c$_b(null);
    private final boolean OO0000;
    public static final c \u00f800000;
    public static final c \u00f500000;
    public static final c if;

    public c(int[] nArray, boolean bl) {
        super(Arrays.copyOf(nArray, nArray.length));
        this.OO0000 = bl;
    }

    public final boolean \u00d800000() {
        return this.OO0000;
    }

    public c(int ... nArray) {
        this(nArray, false);
    }

    public final c o00000(boolean bl) {
        c c2 = bl ? \u00f800000 : \u00f500000;
        if (c2.o00000(this)) {
            return c2;
        }
        return this;
    }

    public final boolean \u00d600000() {
        c c2 = this;
        return c2.\u00d300000(c2.OO0000 ? \u00f800000 : \u00f500000);
    }

    public final boolean \u00d200000(c c2) {
        c2 = c2.o00000(this.OO0000);
        return this.\u00d300000(c2);
    }

    private final boolean \u00d300000(c c2) {
        if (this.\u00d300000() == 1 && this.o00000() == 0) {
            return false;
        }
        if (this.\u00d300000() == 0) {
            return false;
        }
        return !this.o00000(c2);
    }

    public final c \u00d500000() {
        if (this.\u00d300000() == 1 && this.o00000() == 9) {
            int[] nArray = new int[3];
            int[] nArray2 = nArray;
            nArray[0] = 2;
            nArray2[1] = 0;
            nArray2[2] = 0;
            return new c(nArray2);
        }
        int[] nArray = new int[3];
        int[] nArray3 = nArray;
        nArray[0] = this.\u00d300000();
        nArray3[1] = this.o00000() + 1;
        nArray3[2] = 0;
        return new c(nArray3);
    }

    private final boolean o00000(c c2) {
        if (this.\u00d300000() > c2.\u00d300000()) {
            return true;
        }
        return this.\u00d300000() >= c2.\u00d300000() && this.o00000() > c2.o00000();
    }

    static {
        int[] nArray = new int[3];
        int[] nArray2 = nArray;
        nArray[0] = 2;
        nArray2[1] = 3;
        nArray2[2] = 0;
        \u00f800000 = new c(nArray2);
        \u00f500000 = \u00f800000.\u00d500000();
        if = new c(new int[0]);
    }
}

