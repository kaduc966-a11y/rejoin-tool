/*
 * Decompiled with CFR 0.152.
 */
package b.m.b;

final class b$_b {
    public static final b$_b \u00d200000;
    public static final Integer o00000;

    private b$_b() {
    }

    static {
        Object object;
        \u00d200000 = new b$_b();
        try {
            object = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            object = object instanceof Integer ? (Integer)object : null;
        }
        catch (Throwable throwable) {
            object = null;
        }
        o00000 = object != null ? (((Number)object).intValue() > 0 ? object : null) : null;
    }
}

