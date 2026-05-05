/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.t.b.e;
import b.t.c.b.h;
import b.t.c.b.hd;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.c.b.s;
import b.t.c.b.w;
import b.t.c.c;
import b.t.db;
import b.t.p;
import b.t.p$_b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;

public final class lc {
    public static final boolean o00000(s s2) {
        return h.nullvoidsuper.\u00d200000(s2.\u00f5\u00f6O000());
    }

    public static final Object o00000(s objectArray, Member member, Object object, Object object2) {
        Object object3;
        try {
            Object object4;
            block16: {
                block18: {
                    Object object5;
                    Object object6;
                    block17: {
                        block15: {
                            if (object == w.\u00f8O\u00d3000.super() || object2 == w.\u00f8O\u00d3000.super()) {
                                boolean bl;
                                object3 = objectArray.\u00d8\u00d5O000();
                                if (!(object3 instanceof Collection) || !((Collection)object3).isEmpty()) {
                                    object6 = object3.iterator();
                                    while (object6.hasNext()) {
                                        if (!(((p)object6.next()).\u00f5\u00f50000() == p$_b.class)) continue;
                                        bl = false;
                                        break;
                                    }
                                } else {
                                    bl = true;
                                }
                                if (bl) {
                                    throw new RuntimeException("'" + objectArray + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
                                }
                            }
                            object5 = md.\u00d300000((o)objectArray) ? md.\u00d400000((o)objectArray) : object;
                            object3 = object5 != w.\u00f8O\u00d3000.super() ? object5 : null;
                            object6 = md.\u00d300000((o)objectArray) ? object : object2;
                            object5 = object6 != w.\u00f8O\u00d3000.super() ? object6 : null;
                            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject)((Object)member) : null;
                            if (accessibleObject != null) {
                                accessibleObject.setAccessible(c.super((db)objectArray));
                            }
                            object6 = member;
                            if (object6 != null) break block15;
                            object4 = null;
                            break block16;
                        }
                        if (!(object6 instanceof Field)) break block17;
                        object4 = ((Field)member).get(object3);
                        break block16;
                    }
                    if (!(object6 instanceof Method)) break block18;
                    switch (((Method)member).getParameterTypes().length) {
                        case 0: {
                            object4 = ((Method)member).invoke(null, new Object[0]);
                            break block16;
                        }
                        case 1: {
                            Method method = (Method)member;
                            Object[] objectArray2 = objectArray = new Object[1];
                            Object object7 = object3;
                            if (object7 == null) {
                                object7 = hd.super((Type)((Method)member).getParameterTypes()[0]);
                            }
                            objectArray2[0] = object7;
                            object4 = method.invoke(null, objectArray);
                            break block16;
                        }
                        case 2: {
                            Method method = (Method)member;
                            Object[] objectArray3 = new Object[2];
                            objectArray = objectArray3;
                            objectArray3[0] = object3;
                            Object object8 = object5;
                            if (object8 == null) {
                                object8 = hd.super((Type)((Method)member).getParameterTypes()[1]);
                            }
                            objectArray[1] = object8;
                            object4 = method.invoke(null, objectArray);
                            break block16;
                        }
                        default: {
                            throw new AssertionError((Object)("delegate method " + member + " should take 0, 1, or 2 parameters"));
                        }
                    }
                }
                throw new AssertionError((Object)("delegate field/method " + member + " neither field nor method"));
            }
            object3 = object4;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new e(illegalAccessException);
        }
        return object3;
    }
}

