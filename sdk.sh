curl https://dl.google.com/android/repository/commandlinetools-linux-9123335_latest.zip -o commandline.zip
unzip commandline.zip
rm -rf commandline.zip
mv cmdline-tools latest
mkdir -p sdk/cmdline-tools
mv latest sdk/cmdline-tools
echo y | sdk/cmdline-tools/latest/bin/sdkmanager system-images\;android-30\;google_apis\;x86_64 platform-tools platforms\;android-33 --channel=0