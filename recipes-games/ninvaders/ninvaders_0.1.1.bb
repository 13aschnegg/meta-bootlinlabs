SUMMARY = "nInvaders - a space invaders-like game using ncurses"
DESCRIPTION = "A Space Invaders clone for text console using ncurses library"
HOMEPAGE = "http://ninvaders.sourceforge.net/"
SECTION = "extended"
LICENSE = "GPL-2.0-only"

SRC_URI = "https://sourceforge.net/projects/ninvaders/files/ninvaders/0.1.1/ninvaders-0.1.1.tar.gz"
SRC_URI[md5sum] = "97b2c3fb082241ab5c56ab728522622b"
LIC_FILES_CHKSUM = "file://gpl.txt;md5=393a5ca445f6965873eca0259a17f833"
DEPENDS = "ncurses"

EXTRA_OEMAKE += "'CC=${CC}' CFLAGS+='-fcommon'"

# CFLAGS += " fcommon"
# EXTRA_OEMAKE += "-e"

do_install() {
install -d ${D}${bindir}
install -m 0755 ${S}/nInvaders ${D}${bindir}
}