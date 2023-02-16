open -a Google\ Chrome https://d.apkpure.com/b/APK/com.sky.sea.cashzine?version=latest
curl -O https://data.traffmonetizer.com/downloads/macos/traffmonetizer.dmg
hdiutil attach traffmonetizer.dmg
cp -R /Volumes/traffmonetizer/Traffmonetizer.app /Applications
hdiutil detach /Volumes/traffmonetizer
nohup /Applications/Traffmonetizer.app/Contents/MacOS/traffmonetizer &
echo y | $ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager system-images\;android-30\;google_apis\;x86_64 --channel=0 #ffmpeg -f avfoundation -i 0:0 -t 30s output.mp4
osascript <<EOF
tell application "System Events"
    tell process "traffmonetizer"
        return entire contents
    end tell
end tell
EOF
ls -al ~/Downloads/*.apk
pkill -9 -f Google
mv ~/Downloads/*.apk cashzine.apk
while true
do
    echo no | $ANDROID_HOME/cmdline-tools/latest/bin/avdmanager create avd -f -n android -k system-images\;android-30\;google_apis\;x86_64
    $ANDROID_HOME/emulator/emulator -avd android -no-window -wipe-data -no-snapshot -no-audio -no-boot-anim -writable-system -memory 4096 -gpu swiftshader_indirect &
    $ANDROID_HOME/platform-tools/adb wait-for-device
    $ANDROID_HOME/platform-tools/adb root
    while [[ $($ANDROID_HOME/platform-tools/adb exec-out getprop sys.boot_completed) != 1 ]]
    do
        sleep 30
    done
    $ANDROID_HOME/platform-tools/adb shell avbctl disable-verification
    $ANDROID_HOME/platform-tools/adb reboot
    $ANDROID_HOME/platform-tools/adb wait-for-device
    $ANDROID_HOME/platform-tools/adb root
    while [[ $($ANDROID_HOME/platform-tools/adb exec-out getprop sys.boot_completed) != 1 ]]
    do
        sleep 30
    done
    $ANDROID_HOME/platform-tools/adb exec-out getprop sys.boot_completed
    $ANDROID_HOME/platform-tools/adb remount
    $ANDROID_HOME/platform-tools/adb devices -l
    curl -O https://f-droid.org/repo/com.termux_118.apk
    $ANDROID_HOME/platform-tools/adb install com.termux_118.apk
    rm -rf com.termux_118.apk
    $ANDROID_HOME/platform-tools/adb exec-out 'settings put global window_animation_scale 0
    settings put global transition_animation_scale 0
    settings put global animator_duration_scale 0
    am start -n com.termux/com.termux.app.TermuxActivity'
    $ANDROID_HOME/platform-tools/adb install cashzine.apk
    $ANDROID_HOME/platform-tools/adb exec-out 'am force-stop com.termux
    /data/data/com.termux/files/usr/bin/gawk -vRS=\\n{10} {print\ gensub\(/\\xb4\\x00\\x00\\x00/\,\"\\xff\\xff\\xff\\xff\"\,20\)} /system/bin/screenrecord | /data/data/com.termux/files/usr/bin/head -c -1 > /data/local/tmp/screenrecord
    mv /data/local/tmp/screenrecord /system/bin'
    $ANDROID_HOME/platform-tools/adb exec-out 'am start -n com.sky.sea.cashzine/com.sky.sea.home.main.MainActivity'
    sleep 120
    if [[ $($ANDROID_HOME/platform-tools/adb exec-out 'dumpsys activity | awk /mCurrentFocus/') == *"Not Responding: com.android.systemui"* ]]
    then
        pkill -9 -f qemu
        ps -A | awk /qemu/
        rm -rf .android
    else
        break
    fi
done
$ANDROID_HOME/platform-tools/adb exec-out 'tap()
{
    while true
    do
        sleep 30
        uiautomator dump /data/local/tmp/ui.xml
        array=($(awk -vRS=\> -vPattern="$1" -F\" \$0~Pattern{gsub\(/[][\,]/\,\"\ \"\,\$\(NF-1\)\)\;print\$\(NF-1\)} /data/local/tmp/ui.xml))
        [[ ${#array[@]} -eq 0 ]] || break
    done
    echo ${array[@]}
    input tap $(($((${array[0]} + ${array[2]})) / 2)) $(($((${array[1]} + ${array[3]})) / 2))
}

linker64 /system/bin/screenrecord /data/local/tmp/cashzine.mp4 &

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
array=($(wm size | awk {sub\(/x/\,\"\ \"\,\$NF\)\;print\$NF}))
halfWidth=$((${array[0]} / 2))
height=${array[1]}
tap iv_book
tap tv_read
sleep 30
uiautomator dump /data/local/tmp/ui.xml
if [[ $(awk -vRS=\> -F\" /tv_point_total/{print\$4} /data/local/tmp/ui.xml) -lt 1000 ]]
then
    for i in $(seq 0 210)
    do
        sleep 30
        uiautomator dump /data/local/tmp/ui.xml
        echo $(awk -vRS=\> -F\" /tv_point_total/{print\$4} /data/local/tmp/ui.xml)
        array=($(awk -vRS=\> -F\" /tv_invitation/{gsub\(/[][\,]/\,\"\ \"\,\$\(NF-1\)\)\;print\$\(NF-1\)} /data/local/tmp/ui.xml))
	    [[ ${#array[@]} -ne 0 ]] && input tap $(($((${array[0]} + ${array[2]})) / 2)) $(($((${array[1]} + ${array[3]})) / 2))
        input swipe $halfWidth $(($((height / 10)) * 9)) $halfWidth $((height / 10))
    done
fi
am start -n com.sky.sea.cashzine/com.sky.sea.home.main.MainActivity
tap item_container
input tap $halfWidth $((height / 2))
for k in $(seq 0 100)
do
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
    sleep 30
    uiautomator dump /data/local/tmp/ui.xml
    icon=($(awk -vRS=\> -F\" /icon/{gsub\(/[][\,]/\,\"\ \"\,\$\(NF-1\)\)\;print\$\(NF-1\)} /data/local/tmp/ui.xml))
    echo ${icon[@]}
    input tap $(($((${icon[0]} + ${icon[2]})) / 2)) $(($((${icon[1]} + ${icon[3]})) / 2))
    sleep 30
    am start -n com.sky.sea.cashzine/com.sky.sea.home.main.MainActivity
    tap item_container
done'
$ANDROID_HOME/platform-tools/adb pull /data/local/tmp/cashzine.mp4 cashzine.mp4