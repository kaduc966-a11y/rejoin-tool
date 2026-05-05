/*
 * Decompiled with CFR 0.152.
 */
package b.c;

import b.c.e;
import b.c.f;
import b.s.kb;
import b.s.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class b
extends kb
implements Serializable,
RandomAccess,
f {
    private final Enum[] \u00d8o0000;

    public b(Enum[] enumArray) {
        this.\u00d8o0000 = enumArray;
    }

    @Override
    public final int o00000() {
        return this.\u00d8o0000.length;
    }

    public final Enum \u00f8O0000(int n2) {
        kb.return.\u00d200000(n2, this.\u00d8o0000.length);
        return this.\u00d8o0000[n2];
    }

    public final boolean \u00d300000(Enum enum_) {
        return (Enum)z.\u00d800000((Object[])this.\u00d8o0000, enum_.ordinal()) == enum_;
    }

    public final int new(Enum enum_) {
        int n2 = enum_.ordinal();
        if ((Enum)z.\u00d800000((Object[])this.\u00d8o0000, n2) == enum_) {
            return n2;
        }
        return -1;
    }

    public final int o00000(Enum enum_) {
        return this.new(enum_);
    }

    private final Object \u00d300000() {
        return new e(this.\u00d8o0000);
    }

    private final void o00000(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}

