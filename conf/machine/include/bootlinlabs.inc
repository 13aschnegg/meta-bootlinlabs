require conf/machine/include/st-machine-common-stm32mp.inc
require conf/machine/include/st-machine-providers-stm32mp.inc

DEFAULTTUNE = "cortexa7thf-neon-vfpv4"
require conf/machine/include/arm/armv7a/tune-cortexa7.inc

UBOOT_CONFIG = "trusted_stm32mp15"

MACHINE_FEATURES += "m4copro"

MACHINEOVERRIDES:prepend = "bootlinlabs:"