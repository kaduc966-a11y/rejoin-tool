/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.t.c.b.b.m.d$_b;
import b.t.c.b.b.m.d$_c;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d
extends AbstractList
implements RandomAccess {
    private int o00000;
    private Object \u00d200000;

    @Override
    public Object get(int n2) {
        if (n2 < 0 || n2 >= this.o00000) {
            throw new IndexOutOfBoundsException("Index: " + n2 + ", Size: " + this.o00000);
        }
        if (this.o00000 == 1) {
            return this.\u00d200000;
        }
        return ((Object[])this.\u00d200000)[n2];
    }

    @Override
    public boolean add(Object object) {
        if (this.o00000 == 0) {
            this.\u00d200000 = object;
        } else if (this.o00000 == 1) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = this.\u00d200000;
            objectArray2[1] = object;
            this.\u00d200000 = objectArray2;
        } else {
            Object[] objectArray = (Object[])this.\u00d200000;
            int n2 = objectArray.length;
            if (this.o00000 >= n2) {
                int n3 = n2 * 3 / 2 + 1;
                int n4 = this.o00000 + 1;
                if (n3 < n4) {
                    n3 = n4;
                }
                Object[] objectArray3 = objectArray;
                objectArray = new Object[n3];
                this.\u00d200000 = objectArray;
                System.arraycopy(objectArray3, 0, objectArray, 0, n2);
            }
            objectArray[this.o00000] = object;
        }
        ++this.o00000;
        ++this.modCount;
        return true;
    }

    @Override
    public void add(int n2, Object object) {
        if (n2 < 0 || n2 > this.o00000) {
            throw new IndexOutOfBoundsException("Index: " + n2 + ", Size: " + this.o00000);
        }
        if (this.o00000 == 0) {
            this.\u00d200000 = object;
        } else if (this.o00000 == 1 && n2 == 0) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = object;
            objectArray2[1] = this.\u00d200000;
            this.\u00d200000 = objectArray2;
        } else {
            Object[] objectArray = new Object[this.o00000 + 1];
            if (this.o00000 == 1) {
                objectArray[0] = this.\u00d200000;
            } else {
                Object[] objectArray3 = (Object[])this.\u00d200000;
                System.arraycopy(objectArray3, 0, objectArray, 0, n2);
                System.arraycopy(objectArray3, n2, objectArray, n2 + 1, this.o00000 - n2);
            }
            objectArray[n2] = object;
            this.\u00d200000 = objectArray;
        }
        ++this.o00000;
        ++this.modCount;
    }

    @Override
    public int size() {
        return this.o00000;
    }

    @Override
    public void clear() {
        this.\u00d200000 = null;
        this.o00000 = 0;
        ++this.modCount;
    }

    @Override
    public Object set(int n2, Object object) {
        Object object2;
        if (n2 < 0 || n2 >= this.o00000) {
            throw new IndexOutOfBoundsException("Index: " + n2 + ", Size: " + this.o00000);
        }
        if (this.o00000 == 1) {
            object2 = this.\u00d200000;
            this.\u00d200000 = object;
        } else {
            Object[] objectArray = (Object[])this.\u00d200000;
            object2 = objectArray[n2];
            objectArray[n2] = object;
        }
        return object2;
    }

    @Override
    public Object remove(int n2) {
        Object object;
        if (n2 < 0 || n2 >= this.o00000) {
            throw new IndexOutOfBoundsException("Index: " + n2 + ", Size: " + this.o00000);
        }
        if (this.o00000 == 1) {
            object = this.\u00d200000;
            this.\u00d200000 = null;
        } else {
            Object[] objectArray = (Object[])this.\u00d200000;
            object = objectArray[n2];
            if (this.o00000 == 2) {
                this.\u00d200000 = objectArray[1 - n2];
            } else {
                int n3 = this.o00000 - n2 - 1;
                if (n3 > 0) {
                    System.arraycopy(objectArray, n2 + 1, objectArray, n2, n3);
                }
                objectArray[this.o00000 - 1] = null;
            }
        }
        --this.o00000;
        ++this.modCount;
        return object;
    }

    @Override
    public Iterator iterator() {
        if (this.o00000 == 0) {
            d$_c d$_c = d$_c.super();
            if (d$_c == null) {
                d.super(2);
            }
            return d$_c;
        }
        if (this.o00000 == 1) {
            return new d$_b(this);
        }
        Iterator iterator = super.iterator();
        if (iterator == null) {
            d.super(3);
        }
        return iterator;
    }

    @Override
    public void sort(Comparator comparator) {
        if (this.o00000 >= 2) {
            Arrays.sort((Object[])this.\u00d200000, 0, this.o00000, comparator);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Object[] toArray(Object[] objectArray) {
        int n2;
        block10: {
            if (objectArray == null) {
                d.super(4);
            }
            n2 = objectArray.length;
            if (this.o00000 == 1) {
                if (n2 != 0) {
                    objectArray[0] = this.\u00d200000;
                    break block10;
                } else {
                    Object[] objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), 1);
                    objectArray = objectArray2;
                    objectArray2[0] = this.\u00d200000;
                    if (objectArray == null) {
                        d.super(5);
                    }
                    return objectArray;
                }
            }
            if (n2 < this.o00000) {
                Object[] objectArray3 = Arrays.copyOf((Object[])this.\u00d200000, this.o00000, objectArray.getClass());
                if (objectArray3 == null) {
                    d.super(6);
                }
                return objectArray3;
            }
            if (this.o00000 != 0) {
                System.arraycopy(this.\u00d200000, 0, objectArray, 0, this.o00000);
            }
        }
        if (n2 > this.o00000) {
            objectArray[this.o00000] = null;
        }
        if (objectArray == null) {
            d.super(7);
        }
        return objectArray;
    }

    static /* synthetic */ int \u00d400000(d d2) {
        return d2.modCount;
    }

    static /* synthetic */ Object \u00d200000(d d2) {
        return d2.\u00d200000;
    }

    static /* synthetic */ int \u00d300000(d d2) {
        return d2.modCount;
    }

    static /* synthetic */ int super(d d2) {
        return d2.modCount;
    }

    private static /* synthetic */ void super(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "elements";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "a";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            }
            case 2: 
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "iterator";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "toArray";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                break;
            }
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "toArray";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

