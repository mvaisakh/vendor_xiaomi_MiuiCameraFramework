#
# Copyright (C) 2022 StatiX
# Copyright (C) 2022 Vaisakh Murali
#

PRODUCT_PACKGES += \
	MiuiCameraFramework

PRODUCT_BOOT_JARS += \
	MiuiCameraFramework

# Call camera repo
$(call inherit-product-if-exists, vendor/xiaomi/camera/camera-vendor.mk)
