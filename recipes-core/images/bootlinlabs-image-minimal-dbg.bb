require recipes-core/images/include/bootlinlabs-image-minimal.inc

SUMMARY = "A minimal image for the Bootlin Labs STM32MP1 board."

LICENSE = "CLOSED"

IMAGE_INSTALL:append = " \
    packagegroup-core-tools-debug \
    "

EXTRA_IMAGE_FEATURES:append = " dbg-pkgs"

IMAGE_ROOTFS_MAXSIZE = "2042464"
