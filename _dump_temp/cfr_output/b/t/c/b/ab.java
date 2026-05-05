/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import java.lang.ref.WeakReference;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class ab {
    private final WeakReference \u00d200000;
    private final int \u00d300000;
    private ClassLoader super;

    public ab(ClassLoader classLoader) {
        this.\u00d200000 = new WeakReference<ClassLoader>(classLoader);
        this.\u00d300000 = System.identityHashCode(classLoader);
        this.super = classLoader;
    }

    public final void o00000(ClassLoader classLoader) {
        this.super = classLoader;
    }

    public final boolean equals(Object object) {
        return object instanceof ab && this.\u00d200000.get() == ((ab)object).\u00d200000.get();
    }

    public final int hashCode() {
        return this.\u00d300000;
    }

    public final String toString() {
        Object object = (ClassLoader)this.\u00d200000.get();
        if (object == null || (object = object.toString()) == null) {
            object = "<null>";
        }
        return object;
    }
}

