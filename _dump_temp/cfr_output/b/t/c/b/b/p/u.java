/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.q;
import b.t.c.b.b.p.t;
import b.t.c.b.b.p.x;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class u
extends AbstractList
implements RandomAccess,
q {
    public static final q new = new u().\u00d200000();
    private final List o00000;

    public u() {
        this.o00000 = new ArrayList();
    }

    public u(q q2) {
        this.o00000 = new ArrayList(q2.size());
        this.addAll((Collection)q2);
    }

    public String \u00d300000(int n2) {
        Object object = this.o00000.get(n2);
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof b) {
            object = (b)object;
            String string = ((b)object).\u00d200000();
            if (((b)object).o00000()) {
                this.o00000.set(n2, string);
            }
            return string;
        }
        byte[] byArray = (byte[])object;
        object = byArray;
        String string = t.o00000(byArray);
        if (t.\u00d200000((byte[])object)) {
            this.o00000.set(n2, string);
        }
        return string;
    }

    @Override
    public int size() {
        return this.o00000.size();
    }

    public String \u00d200000(int n2, String string) {
        return u.super(this.o00000.set(n2, string));
    }

    public void super(int n2, String string) {
        this.o00000.add(n2, string);
        ++this.modCount;
    }

    @Override
    public boolean addAll(Collection collection) {
        u u2 = this;
        return u2.addAll(u2.size(), collection);
    }

    public boolean addAll(int n2, Collection collection) {
        collection = collection instanceof q ? ((q)collection).super() : collection;
        n2 = this.o00000.addAll(n2, collection) ? 1 : 0;
        ++this.modCount;
        return n2 != 0;
    }

    public String \u00d200000(int n2) {
        Object e2 = this.o00000.remove(n2);
        ++this.modCount;
        return u.super(e2);
    }

    @Override
    public void clear() {
        this.o00000.clear();
        ++this.modCount;
    }

    @Override
    public void super(b b2) {
        this.o00000.add(b2);
        ++this.modCount;
    }

    @Override
    public b super(int n2) {
        Object e2 = this.o00000.get(n2);
        b b2 = u.\u00d200000(e2);
        if (b2 != e2) {
            this.o00000.set(n2, b2);
        }
        return b2;
    }

    private static String super(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof b) {
            return ((b)object).\u00d200000();
        }
        return t.o00000((byte[])object);
    }

    private static b \u00d200000(Object object) {
        if (object instanceof b) {
            return (b)object;
        }
        if (object instanceof String) {
            return b.\u00d200000((String)object);
        }
        return b.o00000((byte[])object);
    }

    @Override
    public List super() {
        return Collections.unmodifiableList(this.o00000);
    }

    @Override
    public q \u00d200000() {
        return new x(this);
    }
}

