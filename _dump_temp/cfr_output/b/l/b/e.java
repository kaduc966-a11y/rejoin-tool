/*
 * Decompiled with CFR 0.152.
 */
package b.l.b;

import b.l.b.f;
import b.q.fb;
import java.nio.charset.Charset;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    private static final byte[] o00000(f object, CharSequence object2, int n2, int n3) {
        if (object2 instanceof String) {
            ((f)object).o00000(((String)object2).length(), n2, n3);
            object = ((String)object2).substring(n2, n3);
            object2 = fb.\u00d800000;
            return ((String)object).getBytes((Charset)object2);
        }
        return ((f)object).o00000((CharSequence)object2, n2, n3);
    }

    private static final String new(f object, byte[] byArray, int n2, int n3) {
        object = ((f)object).\u00d400000(byArray, n2, n3);
        return new String((byte[])object, fb.\u00d800000);
    }

    private static final int o00000(f f2, byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        return f2.\u00d200000(byArray, byArray2, n2, n3, n4);
    }

    private static final byte[] o00000(f f2, byte[] byArray, int n2, int n3) {
        return f2.\u00d400000(byArray, n2, n3);
    }
}

