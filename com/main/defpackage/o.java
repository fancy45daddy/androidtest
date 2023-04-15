package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o  reason: default package */
/* loaded from: classes8.dex */
public @interface o {
    boolean deserialize() default true;

    boolean serialize() default true;
}
