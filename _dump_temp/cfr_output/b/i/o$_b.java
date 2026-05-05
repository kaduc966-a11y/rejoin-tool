/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import java.util.concurrent.TimeUnit;

public final class o$_b {
    public static final /* synthetic */ int[] o00000;

    static {
        int[] nArray = new int[TimeUnit.values().length];
        try {
            nArray[TimeUnit.NANOSECONDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[TimeUnit.MICROSECONDS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[TimeUnit.MILLISECONDS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[TimeUnit.SECONDS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[TimeUnit.MINUTES.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[TimeUnit.HOURS.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[TimeUnit.DAYS.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        o00000 = nArray;
    }
}

