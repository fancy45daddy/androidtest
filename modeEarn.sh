curl https://deb.nodesource.com/setup_current.x | bash -
curl -O https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
apt install -y --no-install-recommends ./google-chrome-stable_current_amd64.deb nodejs unzip libgl1 xvfb xauth openssh-client privoxy libpulse0 libxtst6
PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD=1 npm install playwright-chromium
Xvfb :99 &
cat <<EOF | DISPLAY=:99 node --input-type=module
import {chromium} from 'playwright-chromium'
const browser = await chromium.launch({channel:'chrome', args:['--disable-blink-features=AutomationControlled', '--start-maximized'], headless:false})
const context = await browser.newContext()
const page = await context.newPage()
const client = await context.newCDPSession(page)
await client.send('Emulation.setScriptExecutionDisabled', {value:true})
await page.goto('https://m.apkpure.com/make-money-earn-cash-crypto/us.current.android/download')
const [download] = await globalThis.Promise.all([page.waitForEvent('download'), page.locator('a[href="https://d.apkpure.com/b/APK/us.current.android?version=latest"]').nth(1).click()])
await download.saveAs('modeEarn.apk')
await client.send('Emulation.setScriptExecutionDisabled', {value:false})
await browser.close()
EOF
curl https://dl.google.com/android/repository/commandlinetools-linux-9123335_latest.zip -o commandline.zip
unzip commandline.zip
rm -rf commandline.zip
mv cmdline-tools latest
mkdir -p sdk/cmdline-tools
mv latest sdk/cmdline-tools
echo y | sdk/cmdline-tools/latest/bin/sdkmanager system-images\;android-30\;google_apis\;x86_64 platform-tools platforms\;android-33 --channel=0
echo no | sdk/cmdline-tools/latest/bin/avdmanager create avd -f -n android -k system-images\;android-30\;google_apis\;x86_64
echo 'forward-socks5t   /  127.0.0.1:1080 .' >> /etc/privoxy/config
service privoxy start
ssh -fNT -D 1080 -oServerAliveInterval=10 -oStrictHostKeyChecking=no -oProxyCommand='ssh -oServerAliveInterval=10 -oStrictHostKeyChecking=no -T guest@ssh.devcloud.intel.com' u180599@devcloud
sdk/emulator/emulator -avd android -no-window -no-snapshot -no-audio -no-boot-anim -writable-system -memory 4096 -gpu swiftshader_indirect -http-proxy http://localhost:8118 &
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
sdk/platform-tools/adb install modeEarn.apk
#adb exec-out dumpsys activity | awk /mCurrentFocus/
sdk/platform-tools/adb exec-out 'am start -n com.termux/com.termux.app.TermuxActivity
sleep 1m
/data/data/com.termux/files/usr/bin/gawk -vRS=\\n{10} {print\ gensub\(/\\xb4\\x00\\x00\\x00/\,\"\\xff\\xff\\xff\\xff\"\,20\)} /system/bin/screenrecord | /data/data/com.termux/files/usr/bin/head -c -1 > /data/local/tmp/screenrecord
mv /data/local/tmp/screenrecord /system/bin
tap()
{
    sleep 20
    uiautomator dump /data/local/tmp/ui.xml
    array=($(awk -vRS=\> -vPattern="$1" -F= \$0~Pattern{gsub\(/[][\,\"]/\,\"\ \"\,\$NF\)\;print\$NF} /data/local/tmp/ui.xml))
    input tap $(($((${array[0]} + ${array[2]})) / 2)) $(($((${array[1]} + ${array[3]})) / 2))
}
/data/data/com.termux/files/usr/bin/curl https://ifconfig.me
pm grant us.current.android android.permission.SYSTEM_ALERT_WINDOW
am start -n us.current.android/com.current.android.feature.authentication.signIn.SignInActivity

/system/bin/linker64 /system/bin/screenrecord /data/local/tmp/modeEarn.mp4 &

tap emailSignInButton
tap etEmail
input text chaowen.guo1@gmail.com
tap passwordField
input text '$1'
tap btnLogin
sleep 5m
am start -n us.current.android/com.current.android.feature.home.HomeActivity
tap controllers
sleep 1m'
sdk/platform-tools/adb pull /data/local/tmp/modeEarn.mp4 modeEarn.mp4