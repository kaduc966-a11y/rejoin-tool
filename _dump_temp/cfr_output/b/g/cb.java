/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.l;
import b.i;
import b.o.d.c.g;
import b.pc;
import b.r.b;
import b.r.d.b.q;
import b.xd;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class cb
extends l
implements Iterator,
b,
g {
    private int \u00d40\u00f5000;
    private Object \u00d30\u00f5000;
    private Iterator whilewhileString;
    private b o0\u00f5000;

    public final b O\u00f6\u00d2000() {
        return this.o0\u00f5000;
    }

    public final void new(b b2) {
        this.o0\u00f5000 = b2;
    }

    @Override
    public final boolean hasNext() {
        while (true) {
            switch (this.\u00d40\u00f5000) {
                case 0: {
                    break;
                }
                case 1: {
                    if (this.whilewhileString.hasNext()) {
                        this.\u00d40\u00f5000 = 2;
                        return true;
                    }
                    this.whilewhileString = null;
                    break;
                }
                case 4: {
                    return false;
                }
                case 2: 
                case 3: {
                    return true;
                }
                default: {
                    throw this.nullpublicsuper();
                }
            }
            this.\u00d40\u00f5000 = 5;
            b b2 = this.o0\u00f5000;
            this.o0\u00f5000 = null;
            i i2 = i.o00000;
            b2.return(xd.String(i2));
        }
    }

    public final Object next() {
        switch (this.\u00d40\u00f5000) {
            case 0: 
            case 1: {
                return this.o\u00f6\u00d2000();
            }
            case 2: {
                this.\u00d40\u00f5000 = 1;
                return this.whilewhileString.next();
            }
            case 3: {
                this.\u00d40\u00f5000 = 0;
                Object object = this.\u00d30\u00f5000;
                this.\u00d30\u00f5000 = null;
                return object;
            }
        }
        throw this.nullpublicsuper();
    }

    private final Object o\u00f6\u00d2000() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.next();
    }

    private final Throwable nullpublicsuper() {
        switch (this.\u00d40\u00f5000) {
            case 4: {
                return new NoSuchElementException();
            }
            case 5: {
                return new IllegalStateException("Iterator has failed.");
            }
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.\u00d40\u00f5000);
    }

    @Override
    public final Object o00000(Object object, b b2) {
        this.\u00d30\u00f5000 = object;
        this.\u00d40\u00f5000 = 3;
        this.o0\u00f5000 = object = b2;
        Object object2 = b.r.c.b.\u00d200000();
        if (object2 == b.r.c.b.\u00d200000()) {
            q.\u00d200000(b2);
        }
        if (object2 == b.r.c.b.\u00d200000()) {
            return object2;
        }
        return i.o00000;
    }

    @Override
    public final Object o00000(Iterator object, b b2) {
        if (!object.hasNext()) {
            return i.o00000;
        }
        this.whilewhileString = object;
        this.\u00d40\u00f5000 = 2;
        this.o0\u00f5000 = object = b2;
        Object object2 = b.r.c.b.\u00d200000();
        if (object2 == b.r.c.b.\u00d200000()) {
            q.\u00d200000(b2);
        }
        if (object2 == b.r.c.b.\u00d200000()) {
            return object2;
        }
        return i.o00000;
    }

    @Override
    public final void return(Object object) {
        pc.o00000(object);
        this.\u00d40\u00f5000 = 4;
    }

    @Override
    public final b.r.l O\u00d80000() {
        return b.r.i.o00000;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

