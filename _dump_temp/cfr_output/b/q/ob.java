/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.d.fc;
import b.o.e.g;
import b.q.nb;
import b.q.nb$_d;

public final class ob {
    private static final nb o00000(g g2) {
        nb$_d nb$_d = new nb$_d();
        g2.\u00f800000(nb$_d);
        return nb$_d.\u00d400000();
    }

    private static final boolean o00000(String charSequence) {
        charSequence = charSequence;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!(fc.o00000((int)c2, 128) >= 0 || Character.isLetter(c2))) continue;
            return true;
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d200000(String string) {
        return ob.o00000(string);
    }
}

