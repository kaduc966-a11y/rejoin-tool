/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.e.bb;
import b.o.d.fc;
import b.o.e.f;
import b.o.e.g;
import b.s.cb;
import b.s.db$_b;
import b.s.kb;
import b.s.mc;
import b.s.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class db
extends cb {
    public static final db$_b ifthisclass = new db$_b(null);
    private int \u00d8\u00d4\u00f5000;
    private Object[] returnthisclass;
    private int \u00d5\u00d4\u00f5000;
    private static final Object[] \u00f5\u00d4\u00f5000 = new Object[0];
    private static final int \u00f4\u00d4\u00f5000 = 10;

    @Override
    public final int \u00d3o\u00d3000() {
        return this.\u00d5\u00d4\u00f5000;
    }

    public db(int n2) {
        Object[] objectArray;
        if (n2 == 0) {
            objectArray = \u00f5\u00d4\u00f5000;
        } else if (n2 > 0) {
            objectArray = new Object[n2];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: ".concat(String.valueOf(n2)));
        }
        this.returnthisclass = objectArray;
    }

    public db() {
        this.returnthisclass = \u00f5\u00d4\u00f5000;
    }

    public db(Collection collection) {
        this.returnthisclass = collection.toArray(new Object[0]);
        this.\u00d5\u00d4\u00f5000 = this.returnthisclass.length;
        if (this.returnthisclass.length == 0) {
            this.returnthisclass = \u00f5\u00d4\u00f5000;
        }
    }

    private final void forclass(int n2) {
        if (n2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        if (n2 <= this.returnthisclass.length) {
            return;
        }
        if (this.returnthisclass == \u00f5\u00d4\u00f5000) {
            this.returnthisclass = new Object[bb.\u00d200000(n2, 10)];
            return;
        }
        n2 = kb.return.o00000(this.returnthisclass.length, n2);
        this.\u00f4\u00d80000(n2);
    }

    private final void \u00f4\u00d80000(int n2) {
        Object[] objectArray = new Object[n2];
        z.o00000(this.returnthisclass, objectArray, 0, this.\u00d8\u00d4\u00f5000, this.returnthisclass.length);
        z.o00000(this.returnthisclass, objectArray, this.returnthisclass.length - this.\u00d8\u00d4\u00f5000, 0, this.\u00d8\u00d4\u00f5000);
        this.\u00d8\u00d4\u00f5000 = 0;
        this.returnthisclass = objectArray;
    }

    private final Object privateclass(int n2) {
        return this.returnthisclass[n2];
    }

    private final int \u00d5\u00d80000(int n2) {
        if (n2 >= this.returnthisclass.length) {
            return n2 - this.returnthisclass.length;
        }
        return n2;
    }

    private final int \u00f8\u00d80000(int n2) {
        if (n2 < 0) {
            return n2 + this.returnthisclass.length;
        }
        return n2;
    }

    private final int \u00d4\u00d80000(int n2) {
        db db2 = this;
        return db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + n2);
    }

    private final int \u00d8\u00d80000(int n2) {
        if (n2 == z.\u00f6\u00d20000(this.returnthisclass)) {
            return 0;
        }
        return n2 + 1;
    }

    private final int \u00f5\u00d80000(int n2) {
        if (n2 == 0) {
            return z.\u00f6\u00d20000(this.returnthisclass);
        }
        return n2 - 1;
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    public final Object \u00f5o\u00d3000() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.returnthisclass[this.\u00d8\u00d4\u00f5000];
    }

    public final Object ifthisnew() {
        if (this.isEmpty()) {
            return null;
        }
        return this.returnthisclass[this.\u00d8\u00d4\u00f5000];
    }

    public final Object o\u00d2\u00d3000() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        db db2 = this;
        return this.returnthisclass[db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + mc.\u00d300000(this))];
    }

    public final Object O\u00d2\u00d3000() {
        if (this.isEmpty()) {
            return null;
        }
        db db2 = this;
        return this.returnthisclass[db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + mc.\u00d300000(this))];
    }

    @Override
    public final void addFirst(Object object) {
        this.\u00d3\u00d2\u00d3000();
        db db2 = this;
        db2.forclass(db2.size() + 1);
        this.\u00d8\u00d4\u00f5000 = this.\u00f5\u00d80000(this.\u00d8\u00d4\u00f5000);
        this.returnthisclass[this.\u00d8\u00d4\u00f5000] = object;
        this.\u00d5\u00d4\u00f5000 = this.size() + 1;
    }

    @Override
    public final void addLast(Object object) {
        this.\u00d3\u00d2\u00d3000();
        db db2 = this;
        db2.forclass(db2.size() + 1);
        db db3 = this;
        this.returnthisclass[db3.\u00d5\u00d80000((int)(db3.\u00d8\u00d4\u00f5000 + this.size()))] = object;
        this.\u00d5\u00d4\u00f5000 = this.size() + 1;
    }

    @Override
    public final Object removeFirst() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        this.\u00d3\u00d2\u00d3000();
        Object object = this.returnthisclass[this.\u00d8\u00d4\u00f5000];
        this.returnthisclass[this.\u00d8\u00d4\u00f5000] = null;
        this.\u00d8\u00d4\u00f5000 = this.\u00d8\u00d80000(this.\u00d8\u00d4\u00f5000);
        this.\u00d5\u00d4\u00f5000 = this.size() - 1;
        return object;
    }

    public final Object whilethisnew() {
        if (this.isEmpty()) {
            return null;
        }
        return this.removeFirst();
    }

    @Override
    public final Object removeLast() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        this.\u00d3\u00d2\u00d3000();
        db db2 = this;
        int n2 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + mc.\u00d300000(this));
        Object object = this.returnthisclass[n2];
        this.returnthisclass[n2] = null;
        this.\u00d5\u00d4\u00f5000 = this.size() - 1;
        return object;
    }

    public final Object \u00f8o\u00d3000() {
        if (this.isEmpty()) {
            return null;
        }
        return this.removeLast();
    }

    @Override
    public final boolean add(Object object) {
        this.addLast(object);
        return true;
    }

    @Override
    public final void add(int n2, Object object) {
        kb.return.Object(n2, this.size());
        if (n2 == this.size()) {
            this.addLast(object);
            return;
        }
        if (n2 == 0) {
            this.addFirst(object);
            return;
        }
        this.\u00d3\u00d2\u00d3000();
        db db2 = this;
        db2.forclass(db2.size() + 1);
        db db3 = this;
        int n3 = db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + n2);
        if (n2 < this.size() + 1 >> 1) {
            n2 = this.\u00f5\u00d80000(n3);
            db db4 = this;
            n3 = db4.\u00f5\u00d80000(db4.\u00d8\u00d4\u00f5000);
            if (n2 >= this.\u00d8\u00d4\u00f5000) {
                this.returnthisclass[n3] = this.returnthisclass[this.\u00d8\u00d4\u00f5000];
                z.o00000(this.returnthisclass, this.returnthisclass, this.\u00d8\u00d4\u00f5000, this.\u00d8\u00d4\u00f5000 + 1, n2 + 1);
            } else {
                z.o00000(this.returnthisclass, this.returnthisclass, this.\u00d8\u00d4\u00f5000 - 1, this.\u00d8\u00d4\u00f5000, this.returnthisclass.length);
                this.returnthisclass[this.returnthisclass.length - 1] = this.returnthisclass[0];
                z.o00000(this.returnthisclass, this.returnthisclass, 0, 1, n2 + 1);
            }
            this.returnthisclass[n2] = object;
            this.\u00d8\u00d4\u00f5000 = n3;
        } else {
            db db5 = this;
            n2 = db5.\u00d5\u00d80000(db5.\u00d8\u00d4\u00f5000 + this.size());
            if (n3 < n2) {
                z.o00000(this.returnthisclass, this.returnthisclass, n3 + 1, n3, n2);
            } else {
                z.o00000(this.returnthisclass, this.returnthisclass, 1, 0, n2);
                this.returnthisclass[0] = this.returnthisclass[this.returnthisclass.length - 1];
                z.o00000(this.returnthisclass, this.returnthisclass, n3 + 1, n3, this.returnthisclass.length - 1);
            }
            this.returnthisclass[n3] = object;
        }
        this.\u00d5\u00d4\u00f5000 = this.size() + 1;
    }

    private final void o00000(int n2, Collection collection) {
        Iterator iterator = collection.iterator();
        int n3 = this.returnthisclass.length;
        while (n2 < n3 && iterator.hasNext()) {
            this.returnthisclass[n2] = iterator.next();
            ++n2;
        }
        n3 = this.\u00d8\u00d4\u00f5000;
        for (n2 = 0; n2 < n3 && iterator.hasNext(); ++n2) {
            this.returnthisclass[n2] = iterator.next();
        }
        this.\u00d5\u00d4\u00f5000 = this.size() + collection.size();
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.\u00d3\u00d2\u00d3000();
        db db2 = this;
        db2.forclass(db2.size() + collection.size());
        db db3 = this;
        db3.o00000(db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + this.size()), collection);
        return true;
    }

    public final boolean addAll(int n2, Collection collection) {
        kb.return.Object(n2, this.size());
        if (collection.isEmpty()) {
            return false;
        }
        if (n2 == this.size()) {
            return this.addAll(collection);
        }
        this.\u00d3\u00d2\u00d3000();
        db db2 = this;
        db2.forclass(db2.size() + collection.size());
        db db3 = this;
        int n3 = db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + this.size());
        db db4 = this;
        int n4 = db4.\u00d5\u00d80000(db4.\u00d8\u00d4\u00f5000 + n2);
        int n5 = collection.size();
        if (n2 < this.size() + 1 >> 1) {
            n2 = this.\u00d8\u00d4\u00f5000 - n5;
            if (n4 >= this.\u00d8\u00d4\u00f5000) {
                if (n2 >= 0) {
                    z.o00000(this.returnthisclass, this.returnthisclass, n2, this.\u00d8\u00d4\u00f5000, n4);
                } else {
                    n3 = this.returnthisclass.length - (n2 += this.returnthisclass.length);
                    int n6 = n4 - this.\u00d8\u00d4\u00f5000;
                    if (n3 >= n6) {
                        z.o00000(this.returnthisclass, this.returnthisclass, n2, this.\u00d8\u00d4\u00f5000, n4);
                    } else {
                        z.o00000(this.returnthisclass, this.returnthisclass, n2, this.\u00d8\u00d4\u00f5000, this.\u00d8\u00d4\u00f5000 + n3);
                        z.o00000(this.returnthisclass, this.returnthisclass, 0, this.\u00d8\u00d4\u00f5000 + n3, n4);
                    }
                }
            } else {
                z.o00000(this.returnthisclass, this.returnthisclass, n2, this.\u00d8\u00d4\u00f5000, this.returnthisclass.length);
                if (n5 >= n4) {
                    z.o00000(this.returnthisclass, this.returnthisclass, this.returnthisclass.length - n5, 0, n4);
                } else {
                    z.o00000(this.returnthisclass, this.returnthisclass, this.returnthisclass.length - n5, 0, n5);
                    z.o00000(this.returnthisclass, this.returnthisclass, 0, n5, n4);
                }
            }
            this.\u00d8\u00d4\u00f5000 = n2;
            db db5 = this;
            db5.o00000(db5.\u00f8\u00d80000(n4 - n5), collection);
        } else {
            n2 = n4 + n5;
            if (n4 < n3) {
                if (n3 + n5 <= this.returnthisclass.length) {
                    z.o00000(this.returnthisclass, this.returnthisclass, n2, n4, n3);
                } else if (n2 >= this.returnthisclass.length) {
                    z.o00000(this.returnthisclass, this.returnthisclass, n2 - this.returnthisclass.length, n4, n3);
                } else {
                    int n7 = n3 + n5 - this.returnthisclass.length;
                    z.o00000(this.returnthisclass, this.returnthisclass, 0, n3 - n7, n3);
                    z.o00000(this.returnthisclass, this.returnthisclass, n2, n4, n3 - n7);
                }
            } else {
                z.o00000(this.returnthisclass, this.returnthisclass, n5, 0, n3);
                if (n2 >= this.returnthisclass.length) {
                    z.o00000(this.returnthisclass, this.returnthisclass, n2 - this.returnthisclass.length, n4, this.returnthisclass.length);
                } else {
                    z.o00000(this.returnthisclass, this.returnthisclass, 0, this.returnthisclass.length - n5, this.returnthisclass.length);
                    z.o00000(this.returnthisclass, this.returnthisclass, n2, n4, this.returnthisclass.length - n5);
                }
            }
            this.o00000(n4, collection);
        }
        return true;
    }

    public final Object get(int n2) {
        kb.return.\u00d200000(n2, this.size());
        db db2 = this;
        return this.returnthisclass[db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + n2)];
    }

    @Override
    public final Object set(int n2, Object object) {
        kb.return.\u00d200000(n2, this.size());
        db db2 = this;
        n2 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + n2);
        Object object2 = this.returnthisclass[n2];
        this.returnthisclass[n2] = object;
        return object2;
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    @Override
    public final int indexOf(Object object) {
        block4: {
            int n2;
            int n3;
            block3: {
                db db2 = this;
                n3 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + this.size());
                if (this.\u00d8\u00d4\u00f5000 >= n3) break block3;
                for (int i2 = this.\u00d8\u00d4\u00f5000; i2 < n3; ++i2) {
                    if (!fc.o00000(object, this.returnthisclass[i2])) continue;
                    return i2 - this.\u00d8\u00d4\u00f5000;
                }
                break block4;
            }
            if (!(!((Collection)this).isEmpty()) || this.\u00d8\u00d4\u00f5000 < n3) break block4;
            int n4 = this.returnthisclass.length;
            for (n2 = this.\u00d8\u00d4\u00f5000; n2 < n4; ++n2) {
                if (!fc.o00000(object, this.returnthisclass[n2])) continue;
                return n2 - this.\u00d8\u00d4\u00f5000;
            }
            for (n2 = 0; n2 < n3; ++n2) {
                if (!fc.o00000(object, this.returnthisclass[n2])) continue;
                return n2 + this.returnthisclass.length - this.\u00d8\u00d4\u00f5000;
            }
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object object) {
        db db2 = this;
        int n2 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + this.size());
        if (this.\u00d8\u00d4\u00f5000 < n2) {
            int n3 = this.\u00d8\u00d4\u00f5000;
            if (n3 <= --n2) {
                while (true) {
                    if (fc.o00000(object, this.returnthisclass[n2])) {
                        return n2 - this.\u00d8\u00d4\u00f5000;
                    }
                    if (n2 != n3) {
                        --n2;
                        continue;
                    }
                    break;
                }
            }
        } else if (!((Collection)this).isEmpty() && this.\u00d8\u00d4\u00f5000 >= n2) {
            --n2;
            while (n2 >= 0) {
                if (fc.o00000(object, this.returnthisclass[n2])) {
                    return n2 + this.returnthisclass.length - this.\u00d8\u00d4\u00f5000;
                }
                --n2;
            }
            int n4 = this.\u00d8\u00d4\u00f5000;
            n2 = z.\u00f6\u00d20000(this.returnthisclass);
            if (n4 <= n2) {
                while (true) {
                    if (fc.o00000(object, this.returnthisclass[n2])) {
                        return n2 - this.\u00d8\u00d4\u00f5000;
                    }
                    if (n2 == n4) break;
                    --n2;
                }
            }
        }
        return -1;
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.indexOf(object);
        if (n2 == -1) {
            return false;
        }
        ((cb)this).O\u00d80000(n2);
        return true;
    }

    @Override
    public final Object O\u00d80000(int n2) {
        kb.return.\u00d200000(n2, this.size());
        if (n2 == mc.\u00d300000(this)) {
            return this.removeLast();
        }
        if (n2 == 0) {
            return this.removeFirst();
        }
        this.\u00d3\u00d2\u00d3000();
        db db2 = this;
        int n3 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + n2);
        Object object = this.returnthisclass[n3];
        if (n2 < this.size() >> 1) {
            if (n3 >= this.\u00d8\u00d4\u00f5000) {
                z.o00000(this.returnthisclass, this.returnthisclass, this.\u00d8\u00d4\u00f5000 + 1, this.\u00d8\u00d4\u00f5000, n3);
            } else {
                z.o00000(this.returnthisclass, this.returnthisclass, 1, 0, n3);
                this.returnthisclass[0] = this.returnthisclass[this.returnthisclass.length - 1];
                z.o00000(this.returnthisclass, this.returnthisclass, this.\u00d8\u00d4\u00f5000 + 1, this.\u00d8\u00d4\u00f5000, this.returnthisclass.length - 1);
            }
            this.returnthisclass[this.\u00d8\u00d4\u00f5000] = null;
            this.\u00d8\u00d4\u00f5000 = this.\u00d8\u00d80000(this.\u00d8\u00d4\u00f5000);
        } else {
            db db3 = this;
            n2 = db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + mc.\u00d300000(this));
            if (n3 <= n2) {
                int n4 = n3;
                z.o00000(this.returnthisclass, this.returnthisclass, n4, n4 + 1, n2 + 1);
            } else {
                int n5 = n3;
                z.o00000(this.returnthisclass, this.returnthisclass, n5, n5 + 1, this.returnthisclass.length);
                this.returnthisclass[this.returnthisclass.length - 1] = this.returnthisclass[0];
                z.o00000(this.returnthisclass, this.returnthisclass, 0, 1, n2 + 1);
            }
            this.returnthisclass[n2] = null;
        }
        this.\u00d5\u00d4\u00f5000 = this.size() - 1;
        return object;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        db db2 = this;
        if (db2.isEmpty() || db2.returnthisclass.length == 0) {
            return false;
        }
        db db3 = db2;
        int n2 = db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + db2.size());
        int n3 = db2.\u00d8\u00d4\u00f5000;
        boolean bl = false;
        if (db2.\u00d8\u00d4\u00f5000 < n2) {
            for (int i2 = db2.\u00d8\u00d4\u00f5000; i2 < n2; ++i2) {
                Object object = db2.returnthisclass[i2];
                Object object2 = object;
                if (!collection.contains(object2)) {
                    db2.returnthisclass[n3++] = object;
                    continue;
                }
                bl = true;
            }
            z.o00000(db2.returnthisclass, null, n3, n2);
        } else {
            Object object;
            int n4;
            int n5 = db2.returnthisclass.length;
            for (n4 = db2.\u00d8\u00d4\u00f5000; n4 < n5; ++n4) {
                Object object3 = db2.returnthisclass[n4];
                db2.returnthisclass[n4] = null;
                object = object3;
                if (!collection.contains(object)) {
                    db2.returnthisclass[n3++] = object3;
                    continue;
                }
                bl = true;
            }
            n3 = db2.\u00d5\u00d80000(n3);
            for (n4 = 0; n4 < n2; ++n4) {
                Object object4 = db2.returnthisclass[n4];
                db2.returnthisclass[n4] = null;
                object = object4;
                if (!collection.contains(object)) {
                    db2.returnthisclass[n3] = object4;
                    n3 = db2.\u00d8\u00d80000(n3);
                    continue;
                }
                bl = true;
            }
        }
        if (bl) {
            db2.\u00d3\u00d2\u00d3000();
            db2.\u00d5\u00d4\u00f5000 = db2.\u00f8\u00d80000(n3 - db2.\u00d8\u00d4\u00f5000);
        }
        return bl;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        db db2 = this;
        if (db2.isEmpty() || db2.returnthisclass.length == 0) {
            return false;
        }
        db db3 = db2;
        int n2 = db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + db2.size());
        int n3 = db2.\u00d8\u00d4\u00f5000;
        boolean bl = false;
        if (db2.\u00d8\u00d4\u00f5000 < n2) {
            for (int i2 = db2.\u00d8\u00d4\u00f5000; i2 < n2; ++i2) {
                Object object = db2.returnthisclass[i2];
                Object object2 = object;
                if (collection.contains(object2)) {
                    db2.returnthisclass[n3++] = object;
                    continue;
                }
                bl = true;
            }
            z.o00000(db2.returnthisclass, null, n3, n2);
        } else {
            Object object;
            int n4;
            int n5 = db2.returnthisclass.length;
            for (n4 = db2.\u00d8\u00d4\u00f5000; n4 < n5; ++n4) {
                Object object3 = db2.returnthisclass[n4];
                db2.returnthisclass[n4] = null;
                object = object3;
                if (collection.contains(object)) {
                    db2.returnthisclass[n3++] = object3;
                    continue;
                }
                bl = true;
            }
            n3 = db2.\u00d5\u00d80000(n3);
            for (n4 = 0; n4 < n2; ++n4) {
                Object object4 = db2.returnthisclass[n4];
                db2.returnthisclass[n4] = null;
                object = object4;
                if (collection.contains(object)) {
                    db2.returnthisclass[n3] = object4;
                    n3 = db2.\u00d8\u00d80000(n3);
                    continue;
                }
                bl = true;
            }
        }
        if (bl) {
            db2.\u00d3\u00d2\u00d3000();
            db2.\u00d5\u00d4\u00f5000 = db2.\u00f8\u00d80000(n3 - db2.\u00d8\u00d4\u00f5000);
        }
        return bl;
    }

    private final boolean new(g g2) {
        if (this.isEmpty() || this.returnthisclass.length == 0) {
            return false;
        }
        db db2 = this;
        int n2 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + this.size());
        int n3 = this.\u00d8\u00d4\u00f5000;
        boolean bl = false;
        if (this.\u00d8\u00d4\u00f5000 < n2) {
            for (int i2 = this.\u00d8\u00d4\u00f5000; i2 < n2; ++i2) {
                Object object = this.returnthisclass[i2];
                if (((Boolean)g2.\u00f800000(object)).booleanValue()) {
                    this.returnthisclass[n3++] = object;
                    continue;
                }
                bl = true;
            }
            z.o00000(this.returnthisclass, null, n3, n2);
        } else {
            int n4;
            int n5 = this.returnthisclass.length;
            for (n4 = this.\u00d8\u00d4\u00f5000; n4 < n5; ++n4) {
                Object object = this.returnthisclass[n4];
                this.returnthisclass[n4] = null;
                if (((Boolean)g2.\u00f800000(object)).booleanValue()) {
                    this.returnthisclass[n3++] = object;
                    continue;
                }
                bl = true;
            }
            n3 = this.\u00d5\u00d80000(n3);
            for (n4 = 0; n4 < n2; ++n4) {
                Object object = this.returnthisclass[n4];
                this.returnthisclass[n4] = null;
                if (((Boolean)g2.\u00f800000(object)).booleanValue()) {
                    this.returnthisclass[n3] = object;
                    n3 = this.\u00d8\u00d80000(n3);
                    continue;
                }
                bl = true;
            }
        }
        if (bl) {
            this.\u00d3\u00d2\u00d3000();
            this.\u00d5\u00d4\u00f5000 = this.\u00f8\u00d80000(n3 - this.\u00d8\u00d4\u00f5000);
        }
        return bl;
    }

    @Override
    public final void clear() {
        if (!((Collection)this).isEmpty()) {
            this.\u00d3\u00d2\u00d3000();
            db db2 = this;
            int n2 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + this.size());
            db db3 = this;
            db3.\u00d500000(db3.\u00d8\u00d4\u00f5000, n2);
        }
        this.\u00d8\u00d4\u00f5000 = 0;
        this.\u00d5\u00d4\u00f5000 = 0;
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        objectArray = objectArray.length >= this.size() ? objectArray : z.o00000(objectArray, this.size());
        db db2 = this;
        int n2 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + this.size());
        if (this.\u00d8\u00d4\u00f5000 < n2) {
            z.o00000(this.returnthisclass, objectArray, 0, this.\u00d8\u00d4\u00f5000, n2, 2, null);
        } else if (!((Collection)this).isEmpty()) {
            z.o00000(this.returnthisclass, objectArray, 0, this.\u00d8\u00d4\u00f5000, this.returnthisclass.length);
            z.o00000(this.returnthisclass, objectArray, this.returnthisclass.length - this.\u00d8\u00d4\u00f5000, 0, n2);
        }
        return mc.o00000(this.size(), objectArray);
    }

    @Override
    public final Object[] toArray() {
        db db2 = this;
        return db2.toArray(new Object[db2.size()]);
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        int n4;
        kb.return.\u00d200000(n2, n3, this.size());
        int n5 = n4 = n3 - n2;
        if (n4 == 0) {
            return;
        }
        if (n5 == this.size()) {
            this.clear();
            return;
        }
        if (n5 == 1) {
            ((cb)this).O\u00d80000(n2);
            return;
        }
        this.\u00d3\u00d2\u00d3000();
        if (n2 < this.size() - n3) {
            this.\u00d800000(n2, n3);
            db db2 = this;
            n5 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + n4);
            db db3 = this;
            db3.\u00d500000(db3.\u00d8\u00d4\u00f5000, n5);
            this.\u00d8\u00d4\u00f5000 = n5;
        } else {
            this.return(n2, n3);
            db db4 = this;
            n5 = db4.\u00d5\u00d80000(db4.\u00d8\u00d4\u00f5000 + this.size());
            db db5 = this;
            db5.\u00d500000(db5.\u00f8\u00d80000(n5 - n4), n5);
        }
        this.\u00d5\u00d4\u00f5000 = this.size() - n4;
    }

    private final void \u00d800000(int n2, int n3) {
        db db2 = this;
        int n4 = n2 - 1;
        db db3 = db2;
        int n5 = db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + n4);
        db db4 = this;
        db db5 = db4;
        int n6 = db5.\u00d5\u00d80000(db5.\u00d8\u00d4\u00f5000 + --n3);
        for (int i2 = n2; i2 > 0; i2 -= n3) {
            n2 = n5 + 1;
            n3 = n6 + 1;
            n3 = Math.min(i2, Math.min(n2, n3));
            z.o00000(this.returnthisclass, this.returnthisclass, n6 - n3 + 1, n5 - n3 + 1, n5 + 1);
            n5 = this.\u00f8\u00d80000(n5 - n3);
            n6 = this.\u00f8\u00d80000(n6 - n3);
        }
    }

    private final void return(int n2, int n3) {
        db db2 = this;
        int n4 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + n3);
        db db3 = this;
        int n5 = db3.\u00d5\u00d80000(db3.\u00d8\u00d4\u00f5000 + n2);
        for (int i2 = this.size() - n3; i2 > 0; i2 -= n2) {
            n2 = this.returnthisclass.length - n4;
            n3 = this.returnthisclass.length - n5;
            n2 = Math.min(i2, Math.min(n2, n3));
            int n6 = n4;
            z.o00000(this.returnthisclass, this.returnthisclass, n5, n6, n6 + n2);
            n4 = this.\u00d5\u00d80000(n4 + n2);
            n5 = this.\u00d5\u00d80000(n5 + n2);
        }
    }

    private final void \u00d500000(int n2, int n3) {
        if (n2 < n3) {
            z.o00000(this.returnthisclass, null, n2, n3);
            return;
        }
        z.o00000(this.returnthisclass, null, n2, this.returnthisclass.length);
        z.o00000(this.returnthisclass, null, 0, n3);
    }

    private final void \u00d3\u00d2\u00d3000() {
        ++this.modCount;
    }

    public final Object[] \u00d500000(Object[] objectArray) {
        return this.toArray(objectArray);
    }

    public final Object[] \u00f4o\u00d3000() {
        return this.toArray();
    }

    public final void \u00f400000(int n2, int n3) {
        this.removeRange(n2, n3);
    }

    public final void o00000(f f2) {
        db db2 = this;
        int n2 = db2.\u00d5\u00d80000(db2.\u00d8\u00d4\u00f5000 + this.size());
        n2 = this.isEmpty() || this.\u00d8\u00d4\u00f5000 < n2 ? this.\u00d8\u00d4\u00f5000 : this.\u00d8\u00d4\u00f5000 - this.returnthisclass.length;
        f2.o00000(n2, this.toArray());
    }
}

