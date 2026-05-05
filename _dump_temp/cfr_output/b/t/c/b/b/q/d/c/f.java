/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    public static final Class super(ClassLoader object, String string) {
        try {
            object = Class.forName(string, false, (ClassLoader)object);
        }
        catch (ClassNotFoundException classNotFoundException) {
            object = null;
        }
        return object;
    }
}

