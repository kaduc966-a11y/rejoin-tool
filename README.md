# SieuThiRoblox Rejoin

[![Discord](https://img.shields.io/badge/Discord-Join%20Server-5865F2?style=for-the-badge&logo=discord&logoColor=white)](https://discord.gg/2rWZxb3p27)

Tham gia server Discord để được hỗ trợ và cập nhật mới nhất:

👉 **[https://discord.gg/2rWZxb3p27](https://discord.gg/2rWZxb3p27)**

---

## Setup (chạy trong Termux)
```
. <(curl -sL https://raw.githubusercontent.com/kaduc966-a11y/rejoin-tool/main/setup.sh)
```

## Chạy tool (with root)
```
su -c "export PATH=$PATH:/data/data/com.termux/files/usr/bin && export TERM=xterm-256color && cd /data/data/com.termux/files/home && java -noverify -jar main_obfuscated.jar"
```

## Chạy thủ công (trong Termux)
```
./run_jar.sh
```

## Termux Boot (tự chạy khi khởi động)
Đã được setup tự động bởi setup.sh. Nếu muốn tắt:

```
rm ~/.termux/boot/rejoin.sh
```

## Stop tool
```
su -c "pkill -f java"
```

## Yêu cầu
- Termux (F-Droid version)
- Termux Boot (F-Droid version)
- Root access
- Java (OpenJDK) - tự cài bởi setup.sh

## APK cần thiết
[https://f-droid.org/repo/com.termux_1022.apk](https://f-droid.org/repo/com.termux_1022.apk)
[https://f-droid.org/repo/com.termux.boot_1000.apk](https://f-droid.org/repo/com.termux.boot_1000.apk)
