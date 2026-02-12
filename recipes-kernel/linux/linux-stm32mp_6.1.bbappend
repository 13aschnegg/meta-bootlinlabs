FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:bootlinlabs = "\
    file://0001-Add-nunchuk-driver.patch \
    file://defconfig "

SRC_URI:append:bootlinlabs-a = "file://0002-ARM-dts-stm32mp157a-dk1-add-description-of-Nunchuk-o.patch"

SRC_URI:append:bootlinlabs-d = "file://0003-ARM-dts-stm32mp157d-dk1-add-description-of-Nunchuk-o.patch"

KERNEL_DEFCONFIG:bootlinlabs = ""
KERNEL_EXTERNAL_DEFCONFIG:bootlinlabs = "defconfig"