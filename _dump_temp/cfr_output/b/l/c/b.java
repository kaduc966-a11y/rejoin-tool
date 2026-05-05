/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.l.c.k;
import b.o.d.fc;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    private static final Object new(Path object, LinkOption[] linkOptionArray) {
        try {
            linkOptionArray = Arrays.copyOf(linkOptionArray, linkOptionArray.length);
            object = Files.readAttributes((Path)object, BasicFileAttributes.class, Arrays.copyOf(linkOptionArray, linkOptionArray.length)).fileKey();
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    private static final boolean o00000(k k2) {
        for (k k3 = k2.\u00d300000(); k3 != null; k3 = k3.\u00d300000()) {
            if (k3.o00000() != null && k2.o00000() != null) {
                if (!fc.o00000(k3.o00000(), k2.o00000())) continue;
                return true;
            }
            try {
                if (!Files.isSameFile(k3.String(), k2.String())) continue;
                return true;
            }
            catch (IOException iOException) {
                continue;
            }
            catch (SecurityException securityException) {}
        }
        return false;
    }

    public static final /* synthetic */ boolean new(k k2) {
        return b.o00000(k2);
    }

    public static final /* synthetic */ Object o00000(Path path, LinkOption[] linkOptionArray) {
        return b.new(path, linkOptionArray);
    }
}

