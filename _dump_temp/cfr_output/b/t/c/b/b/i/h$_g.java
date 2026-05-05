/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.c;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_b;
import b.t.c.b.b.i.h$_l;
import b.t.c.b.b.m.g;

class h$_g
implements c {
    private final h \u00d5\u00d8O000;
    private final b.o.e.h returnwhile;
    private volatile Object \u00d8\u00d8O000;

    public h$_g(h h2, b.o.e.h h3) {
        if (h2 == null) {
            h$_g.O\u00d20000(0);
        }
        if (h3 == null) {
            h$_g.O\u00d20000(1);
        }
        this.\u00d8\u00d8O000 = h$_b.\u00d400000;
        this.\u00d5\u00d8O000 = h2;
        this.returnwhile = h3;
    }

    public boolean \u00d8\u00f40000() {
        return this.\u00d8\u00d8O000 != h$_b.\u00d400000 && this.\u00d8\u00d8O000 != h$_b.o00000;
    }

    @Override
    public Object newreturn() {
        Object object = this.\u00d8\u00d8O000;
        if (!(object instanceof h$_b)) {
            return b.t.c.b.b.m.h.\u00d300000(object);
        }
        this.\u00d5\u00d8O000.\u00d200000.\u00d200000();
        try {
            Object object2;
            object = this.\u00d8\u00d8O000;
            if (!(object instanceof h$_b)) {
                Object object3 = b.t.c.b.b.m.h.\u00d300000(object);
                return object3;
            }
            if (object == h$_b.o00000) {
                this.\u00d8\u00d8O000 = h$_b.\u00d300000;
                object2 = this.\u00d400000(true);
                if (!((h$_l)object2).o00000()) {
                    object = ((h$_l)object2).\u00d200000();
                    return object;
                }
            }
            if (object == h$_b.\u00d300000 && !((h$_l)(object2 = this.\u00d400000(false))).o00000()) {
                object = ((h$_l)object2).\u00d200000();
                return object;
            }
            this.\u00d8\u00d8O000 = h$_b.o00000;
            try {
                object2 = this.returnwhile.newreturn();
                this.\u00f400000(object2);
                this.\u00d8\u00d8O000 = object2;
                object = object2;
                return object;
            }
            catch (Throwable throwable) {
                object2 = throwable;
                if (g.new(throwable)) {
                    this.\u00d8\u00d8O000 = h$_b.\u00d400000;
                    throw (RuntimeException)object2;
                }
                if (this.\u00d8\u00d8O000 == h$_b.o00000) {
                    this.\u00d8\u00d8O000 = b.t.c.b.b.m.h.o00000((Throwable)object2);
                }
                throw h.o00000(this.\u00d5\u00d8O000).o00000((Throwable)object2);
            }
        }
        finally {
            this.\u00d5\u00d8O000.\u00d200000.o00000();
        }
    }

    protected h$_l \u00d400000(boolean bl) {
        h$_l h$_l = this.\u00d5\u00d8O000.o00000("in a lazy value", null);
        if (h$_l == null) {
            h$_g.O\u00d20000(2);
        }
        return h$_l;
    }

    protected void \u00f400000(Object object) {
    }

    private static /* synthetic */ void O\u00d20000(int n2) {
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
            case 3: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 2: 
            case 3: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "storageManager";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "computable";
                break;
            }
            case 2: 
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "recursionDetected";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "renderDebugInformation";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 2: 
            case 3: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 2: 
            case 3: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

