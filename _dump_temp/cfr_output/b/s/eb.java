/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.e.bb;
import b.s.eb$_b$1;
import b.s.kb;
import b.s.mc;
import b.s.vc;
import b.s.z;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class eb
extends kb
implements RandomAccess {
    private final Object[] \u00f4O0000;
    private final int \u00f5O0000;
    private int \u00f8O0000;
    private int Stringsuper;

    public eb(Object[] object, int n2) {
        this.\u00f4O0000 = object;
        if (!(n2 >= 0)) {
            object = "ring buffer filled size should not be negative but it is ".concat(String.valueOf(n2));
            throw new IllegalArgumentException(object.toString());
        }
        if (!(n2 <= this.\u00f4O0000.length)) {
            object = "ring buffer filled size: " + n2 + " cannot be larger than the buffer size: " + this.\u00f4O0000.length;
            throw new IllegalArgumentException(object.toString());
        }
        this.\u00f5O0000 = this.\u00f4O0000.length;
        this.Stringsuper = n2;
    }

    public eb(int n2) {
        this(new Object[n2], 0);
    }

    @Override
    public final int o00000() {
        return this.Stringsuper;
    }

    @Override
    public final Object get(int n2) {
        kb.return.\u00d200000(n2, this.size());
        eb eb2 = this;
        return this.\u00f4O0000[(this.\u00f8O0000 + n2) % eb2.\u00f5O0000];
    }

    public final boolean new() {
        return this.size() == this.\u00f5O0000;
    }

    @Override
    public final Iterator iterator() {
        return new eb$_b$1(this);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        int n2;
        objectArray = objectArray.length < this.size() ? Arrays.copyOf(objectArray, this.size()) : objectArray;
        int n3 = this.size();
        int n4 = 0;
        for (n2 = this.\u00f8O0000; n4 < n3 && n2 < this.\u00f5O0000; ++n4, ++n2) {
            objectArray[n4] = this.\u00f4O0000[n2];
        }
        n2 = 0;
        while (n4 < n3) {
            objectArray[n4] = this.\u00f4O0000[n2];
            ++n4;
            ++n2;
        }
        return mc.o00000(n3, objectArray);
    }

    @Override
    public final Object[] toArray() {
        eb eb2 = this;
        return ((vc)eb2).toArray(new Object[eb2.size()]);
    }

    public final eb Stringsuper(int n2) {
        n2 = bb.Object(this.\u00f5O0000 + (this.\u00f5O0000 >> 1) + 1, n2);
        Object[] objectArray = this.\u00f8O0000 == 0 ? Arrays.copyOf(this.\u00f4O0000, n2) : ((vc)this).toArray(new Object[n2]);
        return new eb(objectArray, this.size());
    }

    public final void o00000(Object object) {
        if (this.new()) {
            throw new IllegalStateException("ring buffer is full");
        }
        eb eb2 = this;
        int n2 = this.\u00f8O0000;
        int n3 = this.size();
        this.\u00f4O0000[(n2 + n3) % ((eb)eb2).\u00f5O0000] = object;
        int n4 = this.size();
        this.Stringsuper = n4 + 1;
    }

    public final void \u00f5O0000(int n2) {
        if (!(n2 >= 0)) {
            String string = "n shouldn't be negative but it is ".concat(String.valueOf(n2));
            throw new IllegalArgumentException(string.toString());
        }
        if (!(n2 <= this.size())) {
            String string = "n shouldn't be greater than the buffer size: n = " + n2 + ", size = " + this.size();
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 > 0) {
            int n3 = this.\u00f8O0000;
            int n4 = n3;
            int n5 = n2;
            eb eb2 = this;
            int n6 = (n4 + n5) % eb2.\u00f5O0000;
            if (n3 > n6) {
                z.o00000(this.\u00f4O0000, null, n3, this.\u00f5O0000);
                z.o00000(this.\u00f4O0000, null, 0, n6);
            } else {
                z.o00000(this.\u00f4O0000, null, n3, n6);
            }
            this.\u00f8O0000 = n6;
            this.Stringsuper = this.size() - n2;
        }
    }

    private final int o00000(int n2, int n3) {
        return (n2 + n3) % this.\u00f5O0000;
    }

    public static final /* synthetic */ int o00000(eb eb2) {
        return eb2.\u00f8O0000;
    }

    public static final /* synthetic */ Object[] new(eb eb2) {
        return eb2.\u00f4O0000;
    }
}

