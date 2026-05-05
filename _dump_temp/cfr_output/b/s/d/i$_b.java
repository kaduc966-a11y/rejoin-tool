/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.b;
import b.s.d.i;
import b.s.d.i$_c;
import b.s.d.i$_e;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i$_b
extends i$_e
implements Iterator,
b {
    public i$_b(i i2) {
        super(i2);
    }

    public final i$_c o\u00f8\u00d2000() {
        this.\u00f4\u00f6\u00d2000();
        if (this.\u00d8\u00f6\u00d2000() >= i.return(this.\u00f8\u00f6\u00d2000())) {
            throw new NoSuchElementException();
        }
        i$_b i$_b = this;
        int n2 = i$_b.\u00d8\u00f6\u00d2000();
        this.whileString(n2 + 1);
        i$_b.\u00d3\u00d60000(n2);
        i$_c i$_c = new i$_c(this.\u00f8\u00f6\u00d2000(), this.\u00f5\u00f6\u00d2000());
        this.privatepublicsuper();
        return i$_c;
    }

    public final int O\u00f8\u00d2000() {
        if (this.\u00d8\u00f6\u00d2000() >= i.return(this.\u00f8\u00f6\u00d2000())) {
            throw new NoSuchElementException();
        }
        i$_b i$_b = this;
        int n2 = i$_b.\u00d8\u00f6\u00d2000();
        this.whileString(n2 + 1);
        i$_b.\u00d3\u00d60000(n2);
        Object object = i.o00000(this.\u00f8\u00f6\u00d2000())[this.\u00f5\u00f6\u00d2000()];
        Object object2 = i.\u00d500000(this.\u00f8\u00f6\u00d2000())[this.\u00f5\u00f6\u00d2000()];
        n2 = (object != null ? object.hashCode() : 0) ^ (object2 != null ? object2.hashCode() : 0);
        this.privatepublicsuper();
        return n2;
    }

    public final void o00000(StringBuilder stringBuilder) {
        if (this.\u00d8\u00f6\u00d2000() >= i.return(this.\u00f8\u00f6\u00d2000())) {
            throw new NoSuchElementException();
        }
        i$_b i$_b = this;
        int n2 = i$_b.\u00d8\u00f6\u00d2000();
        this.whileString(n2 + 1);
        i$_b.\u00d3\u00d60000(n2);
        Object object = i.o00000(this.\u00f8\u00f6\u00d2000())[this.\u00f5\u00f6\u00d2000()];
        if (object == this.\u00f8\u00f6\u00d2000()) {
            stringBuilder.append("(this Map)");
        } else {
            stringBuilder.append(object);
        }
        stringBuilder.append('=');
        object = i.\u00d500000(this.\u00f8\u00f6\u00d2000())[this.\u00f5\u00f6\u00d2000()];
        if (object == this.\u00f8\u00f6\u00d2000()) {
            stringBuilder.append("(this Map)");
        } else {
            stringBuilder.append(object);
        }
        this.privatepublicsuper();
    }
}

