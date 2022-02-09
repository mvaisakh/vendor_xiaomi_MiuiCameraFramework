# Framework Support for Miui Camera

This repository contains bare minimal reverse engineered miui framework dependencies to satisfy MiuiCamera's framework.

To add this to support Miui Camera on your device, add this to device.mk

```
$(call inherit-product-if-exists, vendor/xiaomi/MiuiCameraFramework/framework.mk)
```
