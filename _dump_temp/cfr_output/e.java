/*
 * Decompiled with CFR 0.152.
 */
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class e {
    final String \u00d200000;
    final String super;
    final String \u00f400000;
    final boolean \u00d200000;
    final boolean super;
    final boolean \u00f400000;
    final boolean \u00d800000;
    final boolean \u00d600000;
    final String \u00d800000;
    final String \u00d600000;
    private final String class;
    private final String \u00d400000;
    private final String \u00d300000;
    private final int \u00d200000;
    final boolean class;

    public e(String string, String string2, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, String string4, String string5, String string6, String string7, String string8, int n2, boolean bl5) {
        this.\u00d200000 = string;
        this.super = string2;
        this.\u00f400000 = string3;
        this.\u00d200000 = bl;
        this.super = false;
        this.\u00f400000 = bl2;
        this.\u00d800000 = bl3;
        this.\u00d600000 = bl4;
        this.\u00d800000 = string4;
        this.\u00d600000 = string5;
        this.class = string6;
        this.\u00d400000 = string7;
        this.\u00d300000 = string8;
        this.\u00d200000 = n2;
        this.class = bl5;
    }

    public /* synthetic */ e(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        String string8 = "";
        this(string, string2, string3, false, false, false, false, string4, string5, string6, string7, string8, -1, false);
    }

    public final String \u00d600000() {
        return this.super;
    }

    public final String class() {
        return this.\u00f400000;
    }

    public final boolean super() {
        return this.\u00d200000;
    }

    public final boolean \u00d800000() {
        return this.\u00d600000;
    }

    public final String \u00d300000() {
        return this.\u00d800000;
    }

    public final String \u00d200000() {
        return this.\u00d600000;
    }

    public final int \u00f400000() {
        return this.\u00d200000;
    }

    public final boolean \u00d400000() {
        return this.class;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("XNJXOPWGYVVX(packageName=").append(this.\u00d200000).append(", status=").append(this.super).append(", pid=").append(this.\u00f400000).append(", focused=").append(this.\u00d200000).append(", uiHit=").append(this.super).append(", crashHit=").append(this.\u00f400000).append(", fileLogHit=").append(this.\u00d800000).append(", sessionCookie=").append(this.\u00d600000).append(", userId=").append(this.\u00d800000).append(", gameId=").append(this.\u00d600000).append(", window=").append(this.class).append(", activity=");
        stringBuilder.append(this.\u00d400000).append(", username=").append(this.\u00d300000).append(", presenceType=").append(this.\u00d200000).append(", inGameSession=").append(this.class).append(')');
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return (((((((((((((this.\u00d200000.hashCode() * 31 + this.super.hashCode()) * 31 + this.\u00f400000.hashCode()) * 31 + Boolean.hashCode(this.\u00d200000)) * 31 + Boolean.hashCode(this.super)) * 31 + Boolean.hashCode(this.\u00f400000)) * 31 + Boolean.hashCode(this.\u00d800000)) * 31 + Boolean.hashCode(this.\u00d600000)) * 31 + this.\u00d800000.hashCode()) * 31 + this.\u00d600000.hashCode()) * 31 + this.class.hashCode()) * 31 + this.\u00d400000.hashCode()) * 31 + this.\u00d300000.hashCode()) * 31 + Integer.hashCode(this.\u00d200000)) * 31 + Boolean.hashCode(this.class);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((e)object).\u00d200000)) {
            return false;
        }
        if (!fc.o00000((Object)this.super, (Object)((e)object).super)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00f400000, (Object)((e)object).\u00f400000)) {
            return false;
        }
        if (this.\u00d200000 != ((e)object).\u00d200000) {
            return false;
        }
        if (this.super != ((e)object).super) {
            return false;
        }
        if (this.\u00f400000 != ((e)object).\u00f400000) {
            return false;
        }
        if (this.\u00d800000 != ((e)object).\u00d800000) {
            return false;
        }
        if (this.\u00d600000 != ((e)object).\u00d600000) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d800000, (Object)((e)object).\u00d800000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d600000, (Object)((e)object).\u00d600000)) {
            return false;
        }
        if (!fc.o00000((Object)this.class, (Object)((e)object).class)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d400000, (Object)((e)object).\u00d400000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d300000, (Object)((e)object).\u00d300000)) {
            return false;
        }
        if (this.\u00d200000 != ((e)object).\u00d200000) {
            return false;
        }
        return this.class == ((e)object).class;
    }
}

