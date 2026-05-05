/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.o.e.g;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    public static final d o00000 = new d();

    private d() {
    }

    public final long super(String string, int n2, g g2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        String string2 = string;
        int n8 = Math.min(n7 + 6, string2.length());
        int n9 = 0;
        for (n2 = n7 = n2; n2 < n8; ++n2) {
            n6 = string2.charAt(n2);
            boolean bl = 48 <= n6 ? n6 < 58 : false;
            if (!bl) break;
            n5 = n9;
            n9 = (n5 << 3) + (n5 << 1) + (n6 - 48);
        }
        n6 = 6 - (n2 - n7);
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = n9;
            n9 = (n4 << 3) + (n4 << 1);
        }
        n4 = n9;
        String string3 = string;
        n9 = Math.min(n8 + 9, string3.length());
        n6 = 0;
        for (n8 = n2; n8 < n9; ++n8) {
            n5 = string3.charAt(n8);
            boolean bl = 48 <= n5 ? n5 < 58 : false;
            if (!bl) break;
            int n10 = n6;
            n6 = (n10 << 3) + (n10 << 1) + (n5 - 48);
        }
        n5 = 9 - (n8 - n2);
        for (int i2 = 0; i2 < n5; ++i2) {
            n2 = n6;
            n6 = (n2 << 3) + (n2 << 1);
        }
        n2 = n8;
        n8 = n6;
        String string4 = string;
        for (n3 = n2; n3 < string4.length(); ++n3) {
            n2 = string4.charAt(n3);
            boolean bl = 48 <= n2 ? n2 < 58 : false;
            if (!bl) break;
        }
        n2 = n3;
        g2.\u00f800000(n2);
        return (long)n4 * 1000000000L + (long)n8;
    }

    private final int super(String string, int n2, int n3, g g2) {
        int n4;
        int n5;
        int n6;
        int n7 = Math.min(n6 + n3, string.length());
        int n8 = 0;
        for (n6 = n2; n6 < n7; ++n6) {
            n5 = string.charAt(n6);
            boolean bl = 48 <= n5 ? n5 < 58 : false;
            if (!bl) break;
            n4 = n8;
            n8 = (n4 << 3) + (n4 << 1) + (n5 - 48);
        }
        n5 = n3 - (n6 - n2);
        for (n4 = 0; n4 < n5; ++n4) {
            int n9 = n8;
            n8 = (n9 << 3) + (n9 << 1);
        }
        g2.\u00f800000(n6);
        return n8;
    }
}

