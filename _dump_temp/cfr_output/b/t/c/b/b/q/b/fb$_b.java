/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.e.g;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.o.i;
import b.t.c.b.b.q.b.fb;
import b.t.c.b.b.q.b.fb$_b$1;
import b.t.c.b.b.q.b.fb$_b$2;
import b.t.c.b.b.q.b.fb$_b$3;
import b.t.c.b.b.q.b.fb$_b$4;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class fb$_b
extends l {
    private final b.t.c.b.b.i.j \u00f6\u00d40000;
    private final b.t.c.b.b.i.j \u00f5\u00d40000;
    private final b.t.c.b.b.i.f \u00f4\u00d40000;
    static final /* synthetic */ boolean interfaceObject;
    final /* synthetic */ fb doObject;

    public fb$_b(fb fb2, b.t.c.b.b.i.l l2) {
        if (l2 == null) {
            fb$_b.super(0);
        }
        this.doObject = fb2;
        this.\u00f6\u00d40000 = l2.o00000(new fb$_b$1(this, fb2));
        this.\u00f5\u00d40000 = l2.o00000(new fb$_b$2(this, fb2));
        this.\u00f4\u00d40000 = l2.o00000(new fb$_b$3(this, fb2));
    }

    @Override
    public Collection \u00d400000(b.t.c.b.b.d.f f2, e e2) {
        if (f2 == null) {
            fb$_b.super(1);
        }
        if (e2 == null) {
            fb$_b.super(2);
        }
        Collection collection = (Collection)this.\u00f5\u00d40000.\u00f800000(f2);
        if (collection == null) {
            fb$_b.super(3);
        }
        return collection;
    }

    private Collection \u00f600000(b.t.c.b.b.d.f f2) {
        if (f2 == null) {
            fb$_b.super(4);
        }
        return this.\u00d300000(f2, this.\u00d6\u00d20000().\u00d400000(f2, b.t.c.b.b.j.b.f.\u00d8O0000));
    }

    @Override
    public Collection \u00d300000(b.t.c.b.b.d.f f2, e e2) {
        if (f2 == null) {
            fb$_b.super(5);
        }
        if (e2 == null) {
            fb$_b.super(6);
        }
        Collection collection = (Collection)this.\u00f6\u00d40000.\u00f800000(f2);
        if (collection == null) {
            fb$_b.super(7);
        }
        return collection;
    }

    private Collection \u00f800000(b.t.c.b.b.d.f f2) {
        if (f2 == null) {
            fb$_b.super(8);
        }
        return this.\u00d300000(f2, this.\u00d6\u00d20000().\u00d300000(f2, b.t.c.b.b.j.b.f.\u00d8O0000));
    }

    private f \u00d6\u00d20000() {
        Collection collection = this.doObject.\u00d3OO000().\u00d5OO000();
        if (!interfaceObject && collection.size() != 1) {
            throw new AssertionError((Object)"Enum entry and its companion object both should have exactly one supertype: ".concat(String.valueOf(collection)));
        }
        f f2 = ((rc)collection.iterator().next()).\u00f4\u00d6\u00d2000();
        if (f2 == null) {
            fb$_b.super(9);
        }
        return f2;
    }

    private Collection \u00d300000(b.t.c.b.b.d.f f2, Collection collection) {
        if (f2 == null) {
            fb$_b.super(10);
        }
        if (collection == null) {
            fb$_b.super(11);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i.o00000.o00000(f2, collection, Collections.emptySet(), this.doObject, new fb$_b$4(this, linkedHashSet));
        return linkedHashSet;
    }

    @Override
    public Collection super(j j2, g g2) {
        if (j2 == null) {
            fb$_b.super(13);
        }
        if (g2 == null) {
            fb$_b.super(14);
        }
        Collection collection = (Collection)this.\u00f4\u00d40000.newreturn();
        if (collection == null) {
            fb$_b.super(15);
        }
        return collection;
    }

    private Collection classnew() {
        HashSet hashSet = new HashSet();
        for (b.t.c.b.b.d.f f2 : (Set)fb.o00000(this.doObject).newreturn()) {
            hashSet.addAll(((l)this).\u00d300000(f2, b.t.c.b.b.j.b.f.\u00d8O0000));
            hashSet.addAll(((l)this).\u00d400000(f2, b.t.c.b.b.j.b.f.\u00d8O0000));
        }
        return hashSet;
    }

    @Override
    public Set super() {
        Set set = (Set)fb.o00000(this.doObject).newreturn();
        if (set == null) {
            fb$_b.super(17);
        }
        return set;
    }

    @Override
    public Set \u00d200000() {
        Set set = Collections.emptySet();
        if (set == null) {
            fb$_b.super(18);
        }
        return set;
    }

    @Override
    public Set \u00d300000() {
        Set set = (Set)fb.o00000(this.doObject).newreturn();
        if (set == null) {
            fb$_b.super(19);
        }
        return set;
    }

    static /* synthetic */ Collection super(fb$_b fb$_b, b.t.c.b.b.d.f f2) {
        return fb$_b.\u00f800000(f2);
    }

    static /* synthetic */ Collection \u00d200000(fb$_b fb$_b, b.t.c.b.b.d.f f2) {
        return fb$_b.\u00f600000(f2);
    }

    static /* synthetic */ Collection super(fb$_b fb$_b) {
        return fb$_b.classnew();
    }

    static {
        interfaceObject = !fb.class.desiredAssertionStatus();
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
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
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
            case 1: 
            case 4: 
            case 5: 
            case 8: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 2: 
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "location";
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            }
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fromSupertypes";
                break;
            }
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kindFilter";
                break;
            }
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "nameFilter";
                break;
            }
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "p";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "getContributedVariables";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getContributedFunctions";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "getSupertypeScope";
                break;
            }
            case 12: {
                objectArray = objectArray2;
                objectArray2[1] = "resolveFakeOverrides";
                break;
            }
            case 15: {
                objectArray = objectArray2;
                objectArray2[1] = "getContributedDescriptors";
                break;
            }
            case 16: {
                objectArray = objectArray2;
                objectArray2[1] = "computeAllDeclarations";
                break;
            }
            case 17: {
                objectArray = objectArray2;
                objectArray2[1] = "getFunctionNames";
                break;
            }
            case 18: {
                objectArray = objectArray2;
                objectArray2[1] = "getClassifierNames";
                break;
            }
            case 19: {
                objectArray = objectArray2;
                objectArray2[1] = "getVariableNames";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "getContributedVariables";
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                break;
            }
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "computeProperties";
                break;
            }
            case 5: 
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "getContributedFunctions";
                break;
            }
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "computeFunctions";
                break;
            }
            case 10: 
            case 11: {
                objectArray = objectArray;
                objectArray[2] = "resolveFakeOverrides";
                break;
            }
            case 13: 
            case 14: {
                objectArray = objectArray;
                objectArray[2] = "getContributedDescriptors";
                break;
            }
            case 20: {
                objectArray = objectArray;
                objectArray[2] = "printScopeStructure";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

