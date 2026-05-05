/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.o.d.fc;
import b.s.mc;
import b.s.z;
import b.t.c.b.b.l.d.j$_b;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class j {
    public static final j$_b return = new j$_b(null);
    private final int[] o00000;
    private final int new;
    private final int \u00d400000;
    private final int \u00d500000;
    private final List \u00d300000;

    public j(int ... nArray) {
        List list;
        this.o00000 = nArray;
        Integer n2 = z.\u00f500000(this.o00000, 0);
        this.new = n2 != null ? n2 : -1;
        Integer n3 = z.\u00f500000(this.o00000, 1);
        this.\u00d400000 = n3 != null ? n3 : -1;
        Integer n4 = z.\u00f500000(this.o00000, 2);
        int n5 = this.\u00d500000 = n4 != null ? n4 : -1;
        if (this.o00000.length > 3) {
            if (this.o00000.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + this.o00000.length + '.');
            }
            list = mc.\u00f5O0000((Iterable)z.\u00d600000(this.o00000).subList(3, this.o00000.length));
        } else {
            list = mc.\u00d500000();
        }
        this.\u00d300000 = list;
    }

    public final int \u00d300000() {
        return this.new;
    }

    public final int o00000() {
        return this.\u00d400000;
    }

    public final int[] \u00d200000() {
        return this.o00000;
    }

    protected final boolean \u00d200000(j j2) {
        if (this.new == 0) {
            return j2.new == 0 && this.\u00d400000 == j2.\u00d400000;
        }
        return this.new == j2.new && this.\u00d400000 <= j2.\u00d400000;
    }

    public final boolean o00000(j j2) {
        return this.\u00d200000(j2.new, j2.\u00d400000, j2.\u00d500000);
    }

    public final boolean \u00d200000(int n2, int n3, int n4) {
        if (this.new > n2) {
            return true;
        }
        if (this.new < n2) {
            return false;
        }
        if (this.\u00d400000 > n3) {
            return true;
        }
        if (this.\u00d400000 < n3) {
            return false;
        }
        return this.\u00d500000 >= n4;
    }

    public final boolean o00000(int n2, int n3, int n4) {
        if (this.new < n2) {
            return true;
        }
        if (this.new > n2) {
            return false;
        }
        if (this.\u00d400000 < n3) {
            return true;
        }
        if (this.\u00d400000 > n3) {
            return false;
        }
        return this.\u00d500000 <= n4;
    }

    public String toString() {
        int[] object = this.\u00d200000();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int n2 : object) {
            if (!(n2 != -1)) break;
            arrayList.add(n2);
        }
        List list = arrayList;
        if (list.isEmpty()) {
            return "unknown";
        }
        return mc.o00000(list, ".", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object object) {
        return object != null && fc.o00000(this.getClass(), object.getClass()) && this.new == ((j)object).new && this.\u00d400000 == ((j)object).\u00d400000 && this.\u00d500000 == ((j)object).\u00d500000 && fc.o00000((Object)this.\u00d300000, (Object)((j)object).\u00d300000);
    }

    public int hashCode() {
        int n2 = this.new;
        n2 += 31 * n2 + this.\u00d400000;
        n2 += 31 * n2 + this.\u00d500000;
        return n2 + (31 * n2 + ((Object)this.\u00d300000).hashCode());
    }
}

