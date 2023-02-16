sdk/platform-tools/adb push id_rsa /data/local/tmp
sdk/platform-tools/adb shell 'am start -n com.termux/.app.TermuxActivity
sleep 1m
su $(ls -ld /data/data/com.termux | awk {print\$3}) /data/data/com.termux/files/usr/bin/bash -c "export PATH=/data/data/com.termux/files/usr/bin; apt update; echo y | apt install -y --no-install-recommends openssh openssl curl libssh2 libcurl libnghttp2"
mkdir /data/data/com.termux/files/home/.ssh
mv /data/local/tmp/id_rsa /data/data/com.termux/files/home/.ssh
chmod 400 /data/data/com.termux/files/home/.ssh/id_rsa
/data/data/com.termux/files/usr/bin/ssh -fCNT -D 1080 -oStrictHostKeyChecking=no -oProxyCommand="/data/data/com.termux/files/usr/bin/ssh -oStrictHostKeyChecking=no -T guest@ssh.devcloud.intel.com" u180599@devcloud'