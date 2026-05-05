/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import java.io.File;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x {
    private static final String \u00d200000(File comparable, File file, String string) {
        comparable = new StringBuilder(((File)comparable).toString());
        if (file != null) {
            ((StringBuilder)comparable).append(" -> ".concat(String.valueOf(file)));
        }
        if (string != null) {
            ((StringBuilder)comparable).append(": ".concat(String.valueOf(string)));
        }
        return ((StringBuilder)comparable).toString();
    }

    public static final /* synthetic */ String super(File file, File file2, String string) {
        return x.\u00d200000(file, file2, string);
    }
}

