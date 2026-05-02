#!/bin/bash
su -c "export PATH=/data/data/com.termux/files/usr/bin:/system/bin:/system/xbin && export TERM=xterm-256color && cd /data/data/com.termux/files/home && java -noverify -jar main_obfuscated.jar" <<EOF
1
99999
EOF
