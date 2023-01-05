apt update
apt install -y --no-install-recommends curl unzip libgl1
curl https://dl.google.com/android/repository/commandlinetools-linux-9123335_latest.zip -o commandline.zip
unzip commandline.zip
rm -rf commandline.zip
mv cmdline-tools latest
mkdir -p sdk/cmdline-tools
mv latest sdk/cmdline-tools
echo y | sdk/cmdline-tools/latest/bin/sdkmanager system-images\;android-30\;google_apis\;x86_64 platform-tools platforms\;android-33 --channel=0
echo no | sdk/cmdline-tools/latest/bin/avdmanager create avd -f -n android -k system-images\;android-30\;google_apis\;x86_64
sdk/emulator/emulator -avd android -no-window -no-snapshot -no-audio -no-boot-anim -writable-system -memory 4096 -gpu swiftshader_indirect &
sdk/platform-tools/adb wait-for-device
sdk/platform-tools/adb root
while [[ $(sdk/platform-tools/adb exec-out getprop sys.boot_completed) != 1 ]]
do
    sleep 30
done
sdk/platform-tools/adb shell avbctl disable-verification
sdk/platform-tools/adb reboot
sdk/platform-tools/adb wait-for-device
sdk/platform-tools/adb root
while [[ $(sdk/platform-tools/adb exec-out getprop sys.boot_completed) != 1 ]]
do
    sleep 30
done
sdk/platform-tools/adb exec-out getprop sys.boot_completed
sdk/platform-tools/adb remount
sdk/platform-tools/adb devices -l
curl -O https://f-droid.org/repo/com.termux_118.apk
sdk/platform-tools/adb install com.termux_118.apk
rm -rf com.termux_118.apk
sdk/platform-tools/adb install cashzine.apk
#adb exec-out dumpsys activity | awk /mCurrentFocus/
sdk/platform-tools/adb exec-out 'am start -n com.termux/com.termux.app.TermuxActivity
sleep 30
/data/data/com.termux/files/usr/bin/gawk -v RS=\\n{10} {print\ gensub\(/\\xb4\\x00\\x00\\x00/\,\"\\xff\\xff\\xff\\xff\"\,20\)} /system/bin/screenrecord | /data/data/com.termux/files/usr/bin/head -c -1 > /data/local/tmp/screenrecord
mv /data/local/tmp/screenrecord /system/bin
tap()
{
    sleep 10
    uiautomator dump /data/local/tmp/ui.xml
    array=($(awk -v RS=\> -F= /$1/{gsub\(/[][\,\"]/\,\"\ \"\,\$NF\)\;print\$NF} /data/local/tmp/ui.xml))
    input tap $(($((${array[0]} + ${array[2]})) / 2)) $(($((${array[1]} + ${array[3]})) / 2))
}
/system/bin/linker64 /system/bin/screenrecord /data/local/tmp/cashzine.mp4 &
am start -n com.sky.sea.cashzine/com.sky.sea.home.main.MainActivity
tap ll_home_home
tap ll_my_login
tap tv_go_to_email_login
tap et_phone_email
input text chaowen.guo1@gmail.com
tap et_password
input text '$1'
input keyevent 111
tap ll_code_login
tap iv_home_work
tap item_container
array=($(wm size | awk {sub\(/x/\,\"\ \"\,\$NF\)\;print\$NF}))
halfWidth=$((${array[0]} / 2))
height=${array[1]}
input tap $halfWidth $((height / 2))
for k in $(seq 0 2)
do
    uiautomator dump /data/local/tmp/ui.xml
    icon=($(awk -v RS=\> -F= /icon/{gsub\(/[][\,\"]/\,\"\ \"\,\$NF\)\;print\$NF} /data/local/tmp/ui.xml))
    for i in $(seq 0 1)
    do
        for j in $(seq 0 1)
        do
            sleep 10
            input swipe $halfWidth $(($((height / 10)) * 9)) $halfWidth $((height / 10))
        done
        for j in $(seq 0 1)
        do
            sleep 10
            input swipe $halfWidth $((height / 10)) $halfWidth $(($((height / 10)) * 9))
        done
    done
    sleep 5
    input tap $(($((${icon[0]} + ${icon[2]})) / 2)) $(($((${icon[1]} + ${icon[3]})) / 2))
    sleep 5
    input keyevent 4
    tap item_container
done'
sdk/platform-tools/adb pull /data/local/tmp/cashzine.mp4 cashzine.mp4