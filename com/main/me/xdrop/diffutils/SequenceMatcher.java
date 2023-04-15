package me.xdrop.diffutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes10.dex */
public class SequenceMatcher {
    private char[] _a;
    private char[] _b;

    /* renamed from: a  reason: collision with root package name */
    private String f12080a;
    private String b;
    private Map<Character, List<Integer>> bIndices;
    private Map<Character, Boolean> junkElements;
    private int lenA;
    private int lenB;
    private Map<Character, Integer> popularElements;

    private boolean isBJunk() {
        return false;
    }

    public static boolean isJunk(char c) {
        return false;
    }

    public static void main(String[] strArr) {
        from("this is a match", "this is a longer match");
    }

    private SequenceMatcher(String str, String str2) {
        this.lenA = str.length();
        this.lenB = str2.length();
        this._a = str.toCharArray();
        this._b = str2.toCharArray();
    }

    public static SequenceMatcher from(String str, String str2) {
        char[] charArray;
        str.length();
        int length = str2.length();
        HashMap hashMap = new HashMap(str2.length());
        HashMap hashMap2 = new HashMap(32);
        HashMap hashMap3 = new HashMap(32);
        str.toCharArray();
        int i = 0;
        for (char c : str2.toCharArray()) {
            List list = (List) hashMap.get(Character.valueOf(c));
            if (list == null) {
                list = new ArrayList(16);
            }
            list.add(Integer.valueOf(i));
            if (length >= 200 && list.size() * 100 > length) {
                Integer num = (Integer) hashMap2.get(Character.valueOf(c));
                if (num != null) {
                    hashMap2.put(Character.valueOf(c), 1);
                } else {
                    hashMap2.put(Character.valueOf(c), num);
                }
            }
            i++;
        }
        for (Character ch2 : hashMap.keySet()) {
            char charValue = ch2.charValue();
            if (isJunk(charValue)) {
                hashMap3.put(Character.valueOf(charValue), true);
                hashMap.remove(Character.valueOf(charValue));
            }
        }
        for (Character ch3 : hashMap2.keySet()) {
            hashMap.remove(Character.valueOf(ch3.charValue()));
        }
        SequenceMatcher sequenceMatcher = new SequenceMatcher(str, str2);
        sequenceMatcher.setbIndices(hashMap);
        sequenceMatcher.setJunkElements(hashMap3);
        sequenceMatcher.setPopularElements(hashMap2);
        return sequenceMatcher;
    }

    public void findLongestMatch(int i, int i2, int i3, int i4) {
        int[] iArr = new int[this.lenB];
        int i5 = 0;
        int i6 = i;
        int i7 = i6;
        int i8 = i2;
        while (i6 < i2) {
            int[] iArr2 = new int[this.lenB];
            for (Integer num : this.bIndices.get(Character.valueOf(this.f12080a.charAt(i6)))) {
                int intValue = num.intValue();
                if (intValue >= i3) {
                    if (intValue >= i4) {
                        break;
                    }
                    int i9 = iArr[intValue - 1] + 1;
                    iArr2[intValue] = i9;
                    if (i9 > i5) {
                        i7 = (i6 - i9) + 1;
                        i8 = (intValue - i9) + 1;
                        i5 = i9;
                    }
                }
            }
            i6++;
            iArr = iArr2;
        }
        while (i7 > i && i8 > i3 && !isBJunk()) {
        }
    }

    public void setbIndices(Map<Character, List<Integer>> map) {
        this.bIndices = map;
    }

    public void setPopularElements(Map<Character, Integer> map) {
        this.popularElements = map;
    }

    public void setJunkElements(Map<Character, Boolean> map) {
        this.junkElements = map;
    }
}
