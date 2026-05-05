/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.o.e.g;
import b.t.c.b.b.m.b$1;
import b.t.c.b.b.m.b$_c;
import b.t.c.b.b.m.b$_d;
import b.t.c.b.b.m.b$_e;
import b.t.c.b.b.m.b$_f;
import java.util.Collection;
import java.util.Iterator;

public class b {
    public static Object o00000(Collection object, b$_c b$_c, b$_e b$_e, b$_d b$_d) {
        if (object == null) {
            b.o00000(0);
        }
        if (b$_c == null) {
            b.o00000(1);
        }
        if (b$_e == null) {
            b.o00000(2);
        }
        if (b$_d == null) {
            b.o00000(3);
        }
        object = object.iterator();
        while (object.hasNext()) {
            b.o00000(object.next(), b$_c, b$_e, b$_d);
        }
        return b$_d.super();
    }

    public static Object o00000(Collection collection, b$_c b$_c, b$_d b$_d) {
        if (collection == null) {
            b.o00000(4);
        }
        if (b$_c == null) {
            b.o00000(5);
        }
        if (b$_d == null) {
            b.o00000(6);
        }
        return b.o00000(collection, b$_c, (b$_e)new b$_f(), b$_d);
    }

    public static Boolean o00000(Collection collection, b$_c b$_c, g g2) {
        if (collection == null) {
            b.o00000(7);
        }
        if (b$_c == null) {
            b.o00000(8);
        }
        if (g2 == null) {
            b.o00000(9);
        }
        boolean[] blArray = new boolean[1];
        return (Boolean)b.o00000(collection, b$_c, new b$1(g2, blArray));
    }

    public static void o00000(Object object, b$_c b$_c, b$_e b$_e, b$_d b$_d) {
        if (object == null) {
            b.o00000(22);
        }
        if (b$_c == null) {
            b.o00000(23);
        }
        if (b$_e == null) {
            b.o00000(24);
        }
        if (b$_d == null) {
            b.o00000(25);
        }
        if (!b$_e.o00000(object)) {
            return;
        }
        if (!b$_d.super(object)) {
            return;
        }
        Iterator iterator = b$_c.o00000(object).iterator();
        while (iterator.hasNext()) {
            b.o00000(iterator.next(), b$_c, b$_e, b$_d);
        }
        b$_d.\u00d200000(object);
    }

    private static /* synthetic */ void o00000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "nodes";
                break;
            }
            case 1: 
            case 5: 
            case 8: 
            case 11: 
            case 15: 
            case 18: 
            case 21: 
            case 23: {
                objectArray2 = objectArray3;
                objectArray3[0] = "neighbors";
                break;
            }
            case 2: 
            case 12: 
            case 16: 
            case 19: 
            case 24: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visited";
                break;
            }
            case 3: 
            case 6: 
            case 13: 
            case 25: {
                objectArray2 = objectArray3;
                objectArray3[0] = "handler";
                break;
            }
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "predicate";
                break;
            }
            case 10: 
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "node";
                break;
            }
            case 22: {
                objectArray2 = objectArray3;
                objectArray3[0] = "current";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "dfs";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                objectArray = objectArray2;
                objectArray2[2] = "ifAny";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                objectArray = objectArray2;
                objectArray2[2] = "dfsFromNode";
                break;
            }
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: {
                objectArray = objectArray2;
                objectArray2[2] = "topologicalOrder";
                break;
            }
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                objectArray = objectArray2;
                objectArray2[2] = "doDfs";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

