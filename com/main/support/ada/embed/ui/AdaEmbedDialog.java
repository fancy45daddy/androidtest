package support.ada.embed.ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.adswizz.obfuscated.e.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.MBridgeConstans;
import com.mopub.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import support.ada.embed.R;
import support.ada.embed.common.UtilsKt;
import support.ada.embed.widget.AdaEmbedView;
import support.ada.embed.widget.Event;
/* compiled from: AdaEmbedDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u00072!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tJ\u0006\u0010\u001d\u001a\u00020\u000eJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\u000eH\u0016J\u001a\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J)\u00103\u001a\u00020\u000e2!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tJ\u0010\u00105\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0007Ja\u00106\u001a\u00020\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010:2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010:2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=H\u0007¢\u0006\u0002\u0010>JG\u00106\u001a\u00020\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00109\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=¢\u0006\u0002\u0010@J\u000e\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u0007J\u001c\u0010C\u001a\u00020\u000e2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070:H\u0007J\u000e\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020?J\u001c\u0010E\u001a\u00020\u000e2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070:H\u0007J\u000e\u0010E\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020?R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R·\u0001\u0010\u0005\u001aª\u0001\u0012\u0004\u0012\u00020\u0007\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t0\bj#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t`\u000f0\u0006jT\u0012\u0004\u0012\u00020\u0007\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t0\bj#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t`\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006G"}, d2 = {"Lsupport/ada/embed/ui/AdaEmbedDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "adaView", "Lsupport/ada/embed/widget/AdaEmbedView;", "eventCallbacks", "Ljava/util/HashMap;", "", "Ljava/util/HashSet;", "Lkotlin/Function1;", "Lsupport/ada/embed/widget/Event;", "Lkotlin/ParameterName;", "name", "event", "", "Lkotlin/collections/HashSet;", "Lkotlin/collections/HashMap;", "filePickerHandler", "Lsupport/ada/embed/ui/FilePickerHandler;", "value", "Lkotlin/Function0;", "zdChatterAuthCallback", "getZdChatterAuthCallback", "()Lkotlin/jvm/functions/Function0;", "setZdChatterAuthCallback", "(Lkotlin/jvm/functions/Function0;)V", "addEventCallback", "eventName", "callback", "deleteHistory", "getSettingsFromArgs", "Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "onActivityResult", "requestCode", "", "resultCode", Constants.INTENT_SCHEME, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDetach", "onResume", "onViewCreated", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "removeEventCallback", "eventCallback", "removeEventCallbacks", "reset", i.ATTRIBUTE_CLOSED_CAPTION_FILE_LANGUAGE, "greetings", "metaFields", "", "sensitiveMetaFields", "resetChatHistory", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V", "Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;", "(Ljava/lang/String;Ljava/lang/String;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;Ljava/lang/Boolean;)V", "setDeviceToken", "token", "setMetaFields", "builder", "setSensitiveMetaFields", "Companion", "ada-embed-appcompat_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class AdaEmbedDialog extends DialogFragment {
    public static final String ARGUMENT_SETTINGS = "ARGUMENT_SETTINGS";
    public static final Companion Companion = new Companion(null);
    private static final String TAG;
    private HashMap _$_findViewCache;
    private AdaEmbedView adaView;
    private final HashMap<String, HashSet<Function1<Event, Unit>>> eventCallbacks = new HashMap<>();
    private FilePickerHandler filePickerHandler;
    private Function0<String> zdChatterAuthCallback;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ AdaEmbedView access$getAdaView$p(AdaEmbedDialog adaEmbedDialog) {
        AdaEmbedView adaEmbedView = adaEmbedDialog.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        return adaEmbedView;
    }

    /* compiled from: AdaEmbedDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsupport/ada/embed/ui/AdaEmbedDialog$Companion;", "", "()V", AdaEmbedDialog.ARGUMENT_SETTINGS, "", "TAG", "getTAG", "()Ljava/lang/String;", "ada-embed-appcompat_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return AdaEmbedDialog.TAG;
        }
    }

    static {
        Intrinsics.checkExpressionValueIsNotNull("AdaEmbedDialog", "AdaEmbedDialog::class.java.simpleName");
        TAG = "AdaEmbedDialog";
    }

    public final Function0<String> getZdChatterAuthCallback() {
        return this.zdChatterAuthCallback;
    }

    public final void setZdChatterAuthCallback(Function0<String> function0) {
        if (this.adaView != null) {
            AdaEmbedView adaEmbedView = this.adaView;
            if (adaEmbedView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adaView");
            }
            adaEmbedView.setZdChatterAuthCallback(function0);
        }
        this.zdChatterAuthCallback = function0;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(inflater, "inflater");
        return inflater.inflate(R.layout.ada_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.ada_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.ada_view)");
        this.adaView = (AdaEmbedView) findViewById;
        View findViewById2 = view.findViewById(R.id.ada_dismiss_button);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.ada_dismiss_button)");
        ImageView imageView = (ImageView) findViewById2;
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.setZdChatterAuthCallback(this.zdChatterAuthCallback);
        for (Map.Entry<String, HashSet<Function1<Event, Unit>>> entry : this.eventCallbacks.entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                Function1<? super Event, Unit> function1 = (Function1) it.next();
                AdaEmbedView adaEmbedView2 = this.adaView;
                if (adaEmbedView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adaView");
                }
                adaEmbedView2.addEventCallback(key, function1);
            }
        }
        AdaEmbedView adaEmbedView3 = this.adaView;
        if (adaEmbedView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView3.initialize(getSettingsFromArgs());
        imageView.setOnClickListener(new View.OnClickListener() { // from class: support.ada.embed.ui.AdaEmbedDialog$onViewCreated$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AdaEmbedDialog.this.dismiss();
            }
        });
        AdaEmbedView adaEmbedView4 = this.adaView;
        if (adaEmbedView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView4.setFilePickerCallback(new AdaEmbedDialog$onViewCreated$3(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window it;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (it = dialog.getWindow()) == null) {
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(it, "it");
        View decorView = it.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "it.decorView");
        if (decorView.getHeight() == 0) {
            View decorView2 = it.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView2, "it.decorView");
            if (decorView2.getWidth() == 0) {
                it.setWindowAnimations(R.style.AdaSlideAnimation);
                it.setBackgroundDrawable(new ColorDrawable(-1));
                it.setLayout(-1, -1);
            }
        }
        it.setWindowAnimations(0);
        it.setBackgroundDrawable(new ColorDrawable(-1));
        it.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        FilePickerHandler filePickerHandler = this.filePickerHandler;
        if (filePickerHandler != null) {
            filePickerHandler.cancel();
        }
        this.filePickerHandler = null;
        setZdChatterAuthCallback(null);
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.setFilePickerCallback(null);
        AdaEmbedView adaEmbedView2 = this.adaView;
        if (adaEmbedView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView2.setZdChatterAuthCallback(null);
        for (Map.Entry<String, HashSet<Function1<Event, Unit>>> entry : this.eventCallbacks.entrySet()) {
            String key = entry.getKey();
            AdaEmbedView adaEmbedView3 = this.adaView;
            if (adaEmbedView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adaView");
            }
            adaEmbedView3.removeEventCallbacks(key);
        }
        this.eventCallbacks.clear();
    }

    public final void deleteHistory() {
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.deleteHistory();
    }

    public static /* synthetic */ void reset$default(AdaEmbedDialog adaEmbedDialog, String str, String str2, Map map, Map map2, Boolean bool, int i, Object obj) {
        Boolean bool2 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        String str3 = (i & 2) != 0 ? null : str2;
        Map map3 = (i & 4) != 0 ? null : map;
        Map map4 = (i & 8) != 0 ? null : map2;
        if ((i & 16) == 0) {
            bool2 = bool;
        }
        adaEmbedDialog.reset(str, str3, map3, map4, bool2);
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to reset with MetaFields.Builder.")
    public final void reset(String str, String str2, Map<String, String> map, Map<String, String> map2, Boolean bool) {
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.reset(str, str2, map, map2, bool);
    }

    public static /* synthetic */ void reset$default(AdaEmbedDialog adaEmbedDialog, String str, String str2, AdaEmbedView.MetaFields.Builder builder, AdaEmbedView.MetaFields.Builder builder2, Boolean bool, int i, Object obj) {
        Boolean bool2 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        String str3 = (i & 2) != 0 ? null : str2;
        AdaEmbedView.MetaFields.Builder builder3 = (i & 4) != 0 ? null : builder;
        AdaEmbedView.MetaFields.Builder builder4 = (i & 8) != 0 ? null : builder2;
        if ((i & 16) == 0) {
            bool2 = bool;
        }
        adaEmbedDialog.reset(str, str3, builder3, builder4, bool2);
    }

    public final void reset(String str, String str2, AdaEmbedView.MetaFields.Builder builder, AdaEmbedView.MetaFields.Builder builder2, Boolean bool) {
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.reset(str, str2, builder, builder2, bool);
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "setMetaFields(MetaFields.Builder())", imports = {}))
    public final void setMetaFields(Map<String, String> metaFields) {
        Intrinsics.checkParameterIsNotNull(metaFields, "metaFields");
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.setMetaFields(metaFields);
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "setSensitiveMetaFields(MetaFields.Builder())", imports = {}))
    public final void setSensitiveMetaFields(Map<String, String> sensitiveMetaFields) {
        Intrinsics.checkParameterIsNotNull(sensitiveMetaFields, "sensitiveMetaFields");
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.setSensitiveMetaFields(sensitiveMetaFields);
    }

    public final void setMetaFields(AdaEmbedView.MetaFields.Builder builder) {
        Intrinsics.checkParameterIsNotNull(builder, "builder");
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.setMetaFields(builder);
    }

    public final void setSensitiveMetaFields(AdaEmbedView.MetaFields.Builder builder) {
        Intrinsics.checkParameterIsNotNull(builder, "builder");
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.setSensitiveMetaFields(builder);
    }

    public final void setDeviceToken(String token) {
        Intrinsics.checkParameterIsNotNull(token, "token");
        AdaEmbedView adaEmbedView = this.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView.setDeviceToken(token);
    }

    public static /* synthetic */ void addEventCallback$default(AdaEmbedDialog adaEmbedDialog, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "*";
        }
        adaEmbedDialog.addEventCallback(str, function1);
    }

    public final void addEventCallback(String eventName, Function1<? super Event, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(eventName, "eventName");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        HashMap<String, HashSet<Function1<Event, Unit>>> hashMap = this.eventCallbacks;
        HashSet<Function1<Event, Unit>> hashSet = hashMap.get(eventName);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(eventName, hashSet);
        }
        hashSet.add(callback);
        if (this.adaView != null) {
            AdaEmbedView adaEmbedView = this.adaView;
            if (adaEmbedView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adaView");
            }
            adaEmbedView.addEventCallback(eventName, callback);
        }
    }

    public static /* synthetic */ void removeEventCallbacks$default(AdaEmbedDialog adaEmbedDialog, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "*";
        }
        adaEmbedDialog.removeEventCallbacks(str);
    }

    public final void removeEventCallbacks(String eventName) {
        Intrinsics.checkParameterIsNotNull(eventName, "eventName");
        this.eventCallbacks.remove(eventName);
        if (this.adaView != null) {
            AdaEmbedView adaEmbedView = this.adaView;
            if (adaEmbedView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adaView");
            }
            adaEmbedView.removeEventCallbacks(eventName);
        }
    }

    public final void removeEventCallback(Function1<? super Event, Unit> eventCallback) {
        Intrinsics.checkParameterIsNotNull(eventCallback, "eventCallback");
        UtilsKt.removeEventCallback(this.eventCallbacks, eventCallback);
        if (this.adaView != null) {
            AdaEmbedView adaEmbedView = this.adaView;
            if (adaEmbedView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adaView");
            }
            adaEmbedView.removeEventCallback(eventCallback);
        }
    }

    private final AdaEmbedView.Settings getSettingsFromArgs() {
        AdaEmbedView.Settings settings;
        Bundle arguments = getArguments();
        if (arguments == null || (settings = (AdaEmbedView.Settings) arguments.getParcelable(ARGUMENT_SETTINGS)) == null) {
            throw new IllegalArgumentException("Settings must not be null");
        }
        return settings;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FilePickerHandler filePickerHandler = this.filePickerHandler;
        if (filePickerHandler != null) {
            filePickerHandler.handleResult(i, i2, intent);
        }
    }
}
