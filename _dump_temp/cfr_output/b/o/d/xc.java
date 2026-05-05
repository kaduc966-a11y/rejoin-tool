/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class xc {
    private final int \u00d200000;
    private int super;
    private final Object[] \u00d300000;

    public xc(int n2) {
        this.\u00d200000 = n2;
        this.\u00d300000 = new Object[this.\u00d200000];
    }

    protected abstract int \u00d200000(Object var1);

    protected final int \u00d300000() {
        return this.super;
    }

    protected final void o00000(int n2) {
        this.super = n2;
    }

    private static /* synthetic */ void o00000() {
    }

    public final void o00000(Object object) {
        int n2 = this.super;
        this.super = n2 + 1;
        this.\u00d300000[n2] = object;
    }

    protected final int \u00d200000() {
        int n2 = 0;
        int n3 = 0;
        int n4 = this.\u00d200000 - 1;
        if (n4 >= 0) {
            while (true) {
                Object object = this.\u00d300000[n3];
                n2 += object != null ? this.\u00d200000(object) : 1;
                if (n3 == n4) break;
                ++n3;
            }
        }
        return n2;
    }

    protected final Object o00000(Object object, Object object2) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = this.\u00d200000 - 1;
        if (n5 >= 0) {
            while (true) {
                Object object3;
                if ((object3 = this.\u00d300000[n4]) != null) {
                    if (n3 < n4) {
                        System.arraycopy(object, n3, object2, n2, n4 - n3);
                        n2 += n4 - n3;
                    }
                    n3 = this.\u00d200000(object3);
                    System.arraycopy(object3, 0, object2, n2, n3);
                    n2 += n3;
                    n3 = n4 + 1;
                }
                if (n4 == n5) break;
                ++n4;
            }
        }
        if (n3 < this.\u00d200000) {
            System.arraycopy(object, n3, object2, n2, this.\u00d200000 - n3);
        }
        return object2;
    }
}

