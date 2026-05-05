/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.o.d.fc;
import b.s.mc;
import java.io.File;
import java.util.List;

public final class m {
    private final File o00000;
    private final List \u00d200000;

    public m(File file, List list) {
        this.o00000 = file;
        this.\u00d200000 = list;
    }

    public final File \u00d800000() {
        return this.o00000;
    }

    public final List String() {
        return this.\u00d200000;
    }

    public final String \u00d300000() {
        return this.o00000.getPath();
    }

    public final boolean \u00d600000() {
        return ((CharSequence)this.o00000.getPath()).length() > 0;
    }

    public final int \u00d500000() {
        return this.\u00d200000.size();
    }

    public final File o00000(int n2, int n3) {
        if (n2 < 0 || n2 > n3 || n3 > this.\u00d500000()) {
            throw new IllegalArgumentException();
        }
        return new File(mc.o00000(this.\u00d200000.subList(n2, n3), File.separator, null, null, 0, null, null, 62, null));
    }

    public final File \u00d200000() {
        return this.o00000;
    }

    public final List o00000() {
        return this.\u00d200000;
    }

    public final m o00000(File file, List list) {
        return new m(file, list);
    }

    public static /* synthetic */ m o00000(m m2, File file, List list, int n2, Object object) {
        if ((n2 & 1) != 0) {
            file = m2.o00000;
        }
        if ((n2 & 2) != 0) {
            list = m2.\u00d200000;
        }
        return m2.o00000(file, list);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.o00000 + ", segments=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return this.o00000.hashCode() * 31 + ((Object)this.\u00d200000).hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        if (!fc.o00000((Object)this.o00000, (Object)((m)object).o00000)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d200000, (Object)((m)object).\u00d200000);
    }
}

