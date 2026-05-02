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
