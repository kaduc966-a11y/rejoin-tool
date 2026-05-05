/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.s.d.h$_b;
import b.s.y;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h
implements Externalizable {
    public static final h$_b \u00d300000 = new h$_b(null);
    private Map super;
    private static final long \u00d200000 = 0L;

    public h(Map map) {
        this.super = map;
    }

    public h() {
        this(y.Object());
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.super.size());
        for (Map.Entry entry : this.super.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) {
        Map map;
        int n2 = objectInput.readByte();
        if (n2 != 0) {
            throw new InvalidObjectException("Unsupported flags value: ".concat(String.valueOf(n2)));
        }
        n2 = objectInput.readInt();
        if (n2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + n2 + '.');
        }
        Map map2 = map = y.o00000(n2);
        h h2 = this;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInput.readObject();
            Object object2 = objectInput.readObject();
            map2.put(object, object2);
        }
        h2.super = y.\u00d200000(map);
    }

    private final Object super() {
        return this.super;
    }
}

