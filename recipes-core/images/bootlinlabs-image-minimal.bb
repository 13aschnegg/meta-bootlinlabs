SUMMARY = "A minimal image for the Bootlin Labs STM32MP1 board."

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-ssh-dropbear \
    packagegroup-bootlinlabs-games \
"

LICENSE = "CLOSED"

# avoid language support to save space
IMAGE_LINGUAS = ""

inherit core-image