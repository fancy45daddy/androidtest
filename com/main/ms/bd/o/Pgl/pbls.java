package ms.bd.o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ms.bd.o.Pgl.pblu;
/* loaded from: classes10.dex */
public class pbls implements pblu.pgla {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    public static class pgla {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f12093a;
        public ZipEntry b;

        public pgla(ZipFile zipFile, ZipEntry zipEntry) {
            this.f12093a = zipFile;
            this.b = zipEntry;
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private String[] a(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    private String[] a(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        ZipFile zipFile = null;
        for (String str2 : a(context)) {
            try {
                ZipFile zipFile2 = new ZipFile(new File(str2), 1);
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
                zipFile = zipFile2;
            } catch (IOException unused) {
            }
        }
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private pgla a(Context context, String[] strArr, String str, pblv pblvVar) {
        String[] a2 = a(context);
        int length = a2.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = a2[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str3 = "lib" + File.separatorChar + strArr[i6] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str3;
                            objArr[1] = str2;
                            pblvVar.getClass();
                            String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str3);
                            if (entry != null) {
                                return new pgla(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    public void a(Context context, String[] strArr, String str, File file, pblv pblvVar) {
        pgla a2;
        String[] strArr2;
        Throwable th;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        long j;
        pgla pglaVar = null;
        r0 = null;
        Closeable closeable = null;
        try {
            a2 = a(context, strArr, str, pblvVar);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (a2 == null) {
                try {
                    strArr2 = a(context, str);
                } catch (Exception e) {
                    strArr2 = new String[]{e.toString()};
                }
                throw new pblt(str, strArr, strArr2);
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 5) {
                    try {
                        if (a2.f12093a != null) {
                            a2.f12093a.close();
                            return;
                        }
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                String.format(Locale.US, "Found %s! Extracting...", str);
                try {
                    if (file.exists() || file.createNewFile()) {
                        try {
                            inputStream = a2.f12093a.getInputStream(a2.b);
                        } catch (FileNotFoundException | IOException unused2) {
                            inputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            j = 0;
                        } catch (FileNotFoundException | IOException unused3) {
                            fileOutputStream = null;
                            a(inputStream);
                            a(fileOutputStream);
                            i = i2;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                j += read;
                            }
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            if (j == file.length()) {
                                a(inputStream);
                                a(fileOutputStream);
                                file.setReadable(true, false);
                                file.setExecutable(true, false);
                                file.setWritable(true);
                                try {
                                    if (a2.f12093a != null) {
                                        a2.f12093a.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException unused4) {
                                    return;
                                }
                            }
                        } catch (FileNotFoundException | IOException unused5) {
                        } catch (Throwable th5) {
                            th = th5;
                            closeable = fileOutputStream;
                            a(inputStream);
                            a(closeable);
                            throw th;
                        }
                        a(inputStream);
                        a(fileOutputStream);
                    }
                } catch (IOException unused6) {
                }
                i = i2;
            }
        } catch (Throwable th6) {
            th = th6;
            pglaVar = a2;
            if (pglaVar != null) {
                try {
                    if (pglaVar.f12093a != null) {
                        pglaVar.f12093a.close();
                    }
                } catch (IOException unused7) {
                }
            }
            throw th;
        }
    }
}
