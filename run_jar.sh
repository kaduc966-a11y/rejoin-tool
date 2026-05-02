#!/data/data/com.termux/files/usr/bin/bash
clear

# Bắt sự kiện Ctrl + C (SIGINT) để tự động kill java process
trap 'echo "Đang tắt tool và dọn dẹp..."; su -c "pkill -f main_obfuscated.jar; pkill -f java"; exit' INT TERM

echo "Dang khoi dong Rejoin Tool (JAR mode)..."
java -noverify -jar main_obfuscated.jar
