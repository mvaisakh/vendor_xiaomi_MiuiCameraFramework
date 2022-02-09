/*
 * Copyright (C) 2022 StatiX
 * Copyright (C) 2022 Vaisakh Murali
 */

package miui.os;

import android.os.SystemProperties;

public final class Build extends android.os.Build {
    public Build() {
    }

    public static final boolean IS_STABLE_VERSION = true;
    public static final boolean IS_INTERNATIONAL_BUILD = !isChinese();
    public static final boolean IS_ALPHA_BUILD = false;
    public static final boolean IS_CM_CUSTOMIZATION_TEST = false;
    public static final boolean IS_CM_CUSTOMIZATION = true;

    public static boolean isChinese() {
        String cnProp = SystemProperties.get("ro.boot.hwc");
        return cnProp.equals("CN");
    }
}