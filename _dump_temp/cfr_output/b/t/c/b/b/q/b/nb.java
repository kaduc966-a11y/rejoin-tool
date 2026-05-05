/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.dc;
import b.m;
import b.o.d.fc;
import b.o.d.w;
import b.o.e.g;
import b.r;
import b.s.mc;
import b.s.ub;
import b.s.y;
import b.s.z;
import b.t.c.b.b.b.c;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.b.ab;
import b.t.c.b.b.q.b.b;
import b.t.c.b.b.q.b.e;
import b.t.c.b.b.q.b.nb$_b$0;
import b.t.c.b.b.q.b.nb$_b$1;
import b.t.c.b.b.q.b.p;
import b.t.c.b.b.q.b.v;
import b.t.c.b.b.q.b.v$_b;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.cc;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.gb;
import b.t.c.b.b.q.j;
import b.t.c.b.b.q.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nb
extends p
implements bc {
    private final l \u00d8\u00d4\u00d8000;
    private final c O\u00d4\u00d8000;
    private final b.t.c.b.b.e.b whilethisString;
    private final f StringsuperString;
    private final Map o\u00d4\u00d8000;
    private final v \u00f4\u00d4\u00d8000;
    private ab thissuperString;
    private j \u00d5\u00d4\u00d8000;
    private boolean \u00f5\u00d4\u00d8000;
    private final b.t.c.b.b.i.j \u00d4\u00d4\u00d8000;
    private final dc \u00d3\u00d4\u00d8000;

    public nb(f object, l l2, c c2, b.t.c.b.b.e.b b2, Map map, f f2) {
        super(o.\u00d8o\u00f6000.o00000(), (f)object);
        this.\u00d8\u00d4\u00d8000 = l2;
        this.O\u00d4\u00d8000 = c2;
        this.whilethisString = b2;
        this.StringsuperString = f2;
        if (!((f)object).super()) {
            throw new IllegalArgumentException("Module name must be special: ".concat(String.valueOf(object)));
        }
        this.o\u00d4\u00d8000 = map;
        v v2 = (v)this.o00000(v.super.o00000());
        if (v2 == null) {
            v2 = v$_b.\u00d200000;
        }
        this.\u00f4\u00d4\u00d8000 = v2;
        this.\u00f5\u00d4\u00d8000 = true;
        object = this;
        this.\u00d4\u00d4\u00d8000 = this.\u00d8\u00d4\u00d8000.o00000(new nb$_b$0((nb)object));
        object = this;
        this.\u00d3\u00d4\u00d8000 = r.o00000(new nb$_b$1((nb)object));
    }

    public /* synthetic */ nb(f f2, l l2, c c2, b.t.c.b.b.e.b b2, Map map, f f3, int n2, w w2) {
        if ((n2 & 8) != 0) {
            b2 = null;
        }
        if ((n2 & 0x10) != 0) {
            map = y.Object();
        }
        if ((n2 & 0x20) != 0) {
            f3 = null;
        }
        this(f2, l2, c2, b2, map, f3);
    }

    @Override
    public final c returnforsuper() {
        return this.O\u00d4\u00d8000;
    }

    public final boolean ifforsuper() {
        return this.\u00f5\u00d4\u00d8000;
    }

    public final void \u00f8\u00d5\u00d2000() {
        if (!this.ifforsuper()) {
            gb.super(this);
        }
    }

    @Override
    public final List \u00d5\u00d5\u00d2000() {
        ab ab2 = this.thissuperString;
        if (ab2 == null) {
            String string = "Dependencies of module " + this.o\u00d6\u00d2000() + " were not set";
            throw new AssertionError((Object)string);
        }
        return ab2.o00000();
    }

    @Override
    public final cc new(k k2) {
        this.\u00f8\u00d5\u00d2000();
        return (cc)this.\u00d4\u00d4\u00d8000.\u00f800000(k2);
    }

    @Override
    public final Collection o00000(k k2, g g2) {
        this.\u00f8\u00d5\u00d2000();
        return this.O\u00d6\u00d2000().o00000(k2, g2);
    }

    private final b \u00d3\u00d6\u00d2000() {
        return (b)this.\u00d3\u00d4\u00d8000.\u00d200000();
    }

    private final boolean whileforsuper() {
        return this.\u00d5\u00d4\u00d8000 != null;
    }

    public final void o00000(ab object) {
        boolean bl;
        boolean bl2 = bl = this.thissuperString == null;
        if (m.new && !bl) {
            object = "Dependencies of " + this.o\u00d6\u00d2000() + " were already set";
            throw new AssertionError(object);
        }
        this.thissuperString = object;
    }

    public final void o00000(nb ... nbArray) {
        this.while(z.thisnew(nbArray));
    }

    public final void while(List list) {
        this.o00000(list, ub.\u00d300000());
    }

    public final void o00000(List list, Set set) {
        this.o00000(new e(list, set, mc.\u00d500000(), ub.\u00d300000()));
    }

    @Override
    public final boolean o00000(bc bc2) {
        if (fc.o00000((Object)this, (Object)bc2)) {
            return true;
        }
        if (mc.\u00d800000((Iterable)this.thissuperString.new(), bc2)) {
            return true;
        }
        if (this.\u00d5\u00d5\u00d2000().contains(bc2)) {
            return true;
        }
        return bc2.\u00d5\u00d5\u00d2000().contains(this);
    }

    private final String o\u00d6\u00d2000() {
        return this.\u00d5\u00f80000().toString();
    }

    public final void o00000(j object) {
        boolean bl;
        boolean bl2 = bl = !this.whileforsuper();
        if (m.new && !bl) {
            object = "Attempt to initialize module " + this.o\u00d6\u00d2000() + " twice";
            throw new AssertionError(object);
        }
        this.\u00d5\u00d4\u00d8000 = object;
    }

    public final j O\u00d6\u00d2000() {
        this.\u00f8\u00d5\u00d2000();
        return this.\u00d3\u00d6\u00d2000();
    }

    @Override
    public final Object o00000(u u2) {
        Object v2 = this.o\u00d4\u00d8000.get(u2);
        if (v2 == null) {
            v2 = null;
        }
        return v2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (!this.ifforsuper()) {
            stringBuilder2.append(" !isValid");
        }
        stringBuilder2.append(" packageFragmentProvider: ");
        Object object = this.\u00d5\u00d4\u00d8000;
        stringBuilder2.append(object != null && (object = object.getClass()) != null ? ((Class)object).getSimpleName() : null);
        return stringBuilder.toString();
    }

    public nb(f f2, l l2, c c2, b.t.c.b.b.e.b b2) {
        this(f2, l2, c2, b2, null, null, 48, null);
    }

    private static final cc new(nb nb2, k k2) {
        return nb2.\u00f4\u00d4\u00d8000.super(nb2, k2, nb2.\u00d8\u00d4\u00d8000);
    }

    private static final b o00000(nb object) {
        ab ab2 = ((nb)object).thissuperString;
        if (ab2 == null) {
            object = "Dependencies of module " + ((nb)object).o\u00d6\u00d2000() + " were not set before querying module content";
            throw new AssertionError(object);
        }
        Object object2 = ab2.\u00d300000();
        ((nb)object).\u00f8\u00d5\u00d2000();
        boolean bl = object2.contains(object);
        if (m.new && !bl) {
            object = "Module " + super.o\u00d6\u00d2000() + " is not contained in its own dependencies, this is probably a misconfiguration";
            throw new AssertionError(object);
        }
        Object object3 = ((Iterable)object2).iterator();
        while (object3.hasNext()) {
            nb nb2 = (nb)object3.next();
            boolean bl2 = nb2.whileforsuper();
            if (!m.new || bl2) continue;
            object3 = "Dependency module " + nb2.o\u00d6\u00d2000() + " was not initialized by the time contents of dependent module " + super.o\u00d6\u00d2000() + " were queried";
            throw new AssertionError(object3);
        }
        Iterable iterable = (Iterable)object2;
        object3 = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object2 = object3.iterator();
        while (object2.hasNext()) {
            Object object4 = object2.next();
            object3 = (nb)object4;
            object4 = iterable;
            object4.add((j)((nb)object3).\u00d5\u00d4\u00d8000);
        }
        object = "CompositeProvider@ModuleDescriptor for " + ((p)object).\u00d5\u00f80000();
        object2 = (List)iterable;
        return new b((List)object2, (String)object);
    }

    static /* synthetic */ cc o00000(nb nb2, k k2) {
        return nb.new(nb2, k2);
    }

    static /* synthetic */ b new(nb nb2) {
        return nb.o00000(nb2);
    }
}

