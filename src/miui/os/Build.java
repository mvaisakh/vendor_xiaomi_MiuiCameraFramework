/*
 * Copyright (C) 2022 StatiX
 * Copyright (C) 2022 Vaisakh Murali
 */

package miui.os;

public final class Build extends android.os.Build {
    public Build() {
    }

    public static final boolean IS_STABLE_VERSION = true;
    public static final boolean IS_INTERNATIONAL_BUILD = true;
    public static final boolean IS_ALPHA_BUILD = false;
    public static final boolean IS_CM_CUSTOMIZATION_TEST = false;
    public static final boolean IS_CM_CUSTOMIZATION = true;
}