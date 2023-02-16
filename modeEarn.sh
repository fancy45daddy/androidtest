open -a Google\ Chrome https://d.apkpure.com/b/APK/us.current.android?version=latest
curl -O https://data.traffmonetizer.com/downloads/macos/traffmonetizer.dmg
hdiutil attach traffmonetizer.dmg
cp -R /Volumes/traffmonetizer/Traffmonetizer.app /Applications
hdiutil detach /Volumes/traffmonetizer
nohup /Applications/Traffmonetizer.app/Contents/MacOS/traffmonetizer &
echo y | $ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager system-images\;android-30\;google_apis\;x86_64 --channel=0 #ffmpeg -f avfoundation -i 0:0 -t 30s output.mp4
brew install privoxy
echo 'forward-socks5   /               127.0.0.1:1080 .' >  /usr/local/etc/privoxy/config
sudo /usr/local/opt/privoxy/sbin/privoxy /usr/local/etc/privoxy/config
ssh -fCNT -D 1080 -oStrictHostKeyChecking=no -oProxyCommand='ssh -oStrictHostKeyChecking=no -T guest@ssh.devcloud.intel.com' u180599@devcloud
ls -al ~/Downloads/*.apk
pkill -9 -f Google
mv ~/Downloads/*.apk modeEarn.apk
while true
do
    echo no | $ANDROID_HOME/cmdline-tools/latest/bin/avdmanager create avd -f -n android -k system-images\;android-30\;google_apis\;x86_64
    $ANDROID_HOME/emulator/emulator -avd android -no-window -wipe-data -no-snapshot -no-audio -no-boot-anim -writable-system -memory 4096 -gpu swiftshader_indirect -http-proxy http://127.0.0.1:8118 &
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
    $ANDROID_HOME/platform-tools/adb install modeEarn.apk
    $ANDROID_HOME/platform-tools/adb exec-out 'am force-stop com.termux
    /data/data/com.termux/files/usr/bin/gawk -vRS=\\n{10} {print\ gensub\(/\\xb4\\x00\\x00\\x00/\,\"\\xff\\xff\\xff\\xff\"\,20\)} /system/bin/screenrecord | /data/data/com.termux/files/usr/bin/head -c -1 > /data/local/tmp/screenrecord
    mv /data/local/tmp/screenrecord /system/bin'
    $ANDROID_HOME/platform-tools/adb exec-out 'pm grant us.current.android android.permission.SYSTEM_ALERT_WINDOW
    am start -n us.current.android/com.current.android.feature.authentication.signIn.SignInActivity'
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
    sleep 30
    uiautomator dump /data/local/tmp/ui.xml
    array=($(awk -vRS=\> -vPattern="$1" -F\" \$0~Pattern{gsub\(/[][\,]/\,\"\ \"\,\$\(NF-1\)\)\;print\$\(NF-1\)} /data/local/tmp/ui.xml))
    echo ${array[@]}
    input tap $(($((${array[0]} + ${array[2]})) / 2)) $(($((${array[1]} + ${array[3]})) / 2))
}
linker64 /system/bin/screenrecord /data/local/tmp/modeEarn.mp4 &
/data/data/com.termux/files/usr/bin/curl https://ifconfig.me

tap mailSignInButton
tap etEmail
input text chaowen.guo1@gmail.com
tap passwordField
input text '$1'
tap btnLogin
#sleep 5m
#am start -n us.current.android/com.current.android.feature.home.HomeActivity
tap controllers
sleep 1m'
sleep 18000
$ANDROID_HOME/platform-tools/adb pull /data/local/tmp/modeEarn.mp4