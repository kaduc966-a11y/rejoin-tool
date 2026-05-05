/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.t.c.b.b.m.b$_h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class b$_g
extends b$_h {
    protected final Iterable if;

    protected b$_g(Iterable iterable) {
        if (iterable == null) {
            b$_g.super(0);
        }
        this.if = iterable;
    }

    public Iterable \u00d600000() {
        Iterable iterable = this.if;
        if (iterable == null) {
            b$_g.super(1);
        }
        return iterable;
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
            case 1: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "result";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "result";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 1: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

