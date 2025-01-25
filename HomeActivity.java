package com.otto.player;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.FirebaseApp;
import com.google.gson.Gson;
import com.otto.player.RequestNetwork;
import java.net.NetworkInterface;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity {
    private RequestNetwork A2;
    private RequestNetwork A3;
    private RequestNetwork A4;
    private RequestNetwork A5;
    private RequestNetwork A6;
    private RequestNetwork A7;
    private RequestNetwork A8;
    private RequestNetwork A_1;
    private RequestNetwork.RequestListener _A2_request_listener;
    private RequestNetwork.RequestListener _A3_request_listener;
    private RequestNetwork.RequestListener _A4_request_listener;
    private RequestNetwork.RequestListener _A5_request_listener;
    private RequestNetwork.RequestListener _A6_request_listener;
    private RequestNetwork.RequestListener _A7_request_listener;
    private RequestNetwork.RequestListener _A8_request_listener;
    private RequestNetwork.RequestListener _A_1_request_listener;
    private String cryptedOutput;
    private String decryptedOutput;
    private OnCompleteListener fcm_onCompleteListener;
    private ImageView imageview11;
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear65;
    private LinearLayout linear69;
    private LinearLayout linear71;
    private LinearLayout linear80;
    private LinearLayout linear86;
    private LinearLayout linear88;
    private LinearLayout linear89;
    private LinearLayout linear90;
    private TextView mor1;
    private TextView mor2;
    private TextView mor3;
    private TextView mor4;
    private TextView mor5;
    private TextView mor6;
    private RecyclerView recyclerview1;
    private RecyclerView recyclerview2;
    private RecyclerView recyclerview3;
    private RecyclerView recyclerview4;
    private RecyclerView recyclerview5;
    private RecyclerView recyclerview6;
    private RecyclerView recyclerview7;
    private SharedPreferences sertg;
    private SwipeRefreshLayout swiperefreshlayout2;
    private TimerTask t;
    private TimerTask t1;
    private TimerTask t2;
    private TimerTask t_vpn;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private TextView textview5;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    private TextView textview89;
    private TextView textview92;
    private TextView textview94;
    private TextView textview95;
    private TextView textview96;
    private TextView textview97;
    private TextView textview98;
    private ScrollView vscroll1;
    private Timer _timer = new Timer();
    private String sher = "";
    private boolean InUse = false;
    private String package_name = "";
    private String color = "";
    private String decryptData = "";
    private String reverseString = "";
    private String recent_version = "";
    private String home = "";
    private String set = "";
    private String encryptData = "";
    private String description = "";
    private String ver = "";
    private String txtn = "";
    private String txta = "";
    private String error = "";
    private ArrayList<HashMap<String, Object>> slidermap = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> g7j88k2o9k = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> g7j77k2o9k = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> g7j66k2o9k = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> g7j55k2o9k = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> g7j44k2o9k = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> g7j33k2o9k = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> map2 = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> ser = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> kids = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> adss = new ArrayList<>();
    private Intent it = new Intent();
    private Intent intent_marvel = new Intent();
    private Intent i = new Intent();
    private Intent i1 = new Intent();
    private Intent p = new Intent();
    private Intent ans = new Intent();
    private Intent ext = new Intent();
    private Intent jadol = new Intent();
    private Intent i3 = new Intent();
    private Intent i_ads = new Intent();

    public void _extra() {
    }

    public void _vpn() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558466);
        initialize(bundle);
        FirebaseApp.initializeApp(this);
        initializeLogic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initialize(Bundle bundle) {
        this.linear3 = (LinearLayout) findViewById(2131362172);
        this.linear1 = (LinearLayout) findViewById(2131362159);
        this.swiperefreshlayout2 = findViewById(2131362409);
        this.imageview2 = (ImageView) findViewById(2131362127);
        this.imageview11 = (ImageView) findViewById(2131362122);
        this.imageview3 = (ImageView) findViewById(2131362129);
        this.textview89 = (TextView) findViewById(2131362462);
        this.imageview4 = (ImageView) findViewById(2131362130);
        this.vscroll1 = (ScrollView) findViewById(2131362516);
        this.linear2 = (LinearLayout) findViewById(2131362167);
        this.linear80 = (LinearLayout) findViewById(2131362191);
        this.recyclerview1 = findViewById(2131362322);
        this.linear88 = (LinearLayout) findViewById(2131362193);
        this.recyclerview2 = findViewById(2131362323);
        this.linear65 = (LinearLayout) findViewById(2131362186);
        this.recyclerview3 = findViewById(2131362324);
        this.linear69 = (LinearLayout) findViewById(2131362187);
        this.recyclerview4 = findViewById(2131362325);
        this.linear71 = (LinearLayout) findViewById(2131362189);
        this.recyclerview5 = findViewById(2131362326);
        this.linear86 = (LinearLayout) findViewById(2131362192);
        this.recyclerview6 = findViewById(2131362327);
        this.linear90 = (LinearLayout) findViewById(2131362196);
        this.recyclerview7 = findViewById(2131362328);
        this.linear89 = (LinearLayout) findViewById(2131362194);
        this.textview1 = (TextView) findViewById(2131362452);
        this.textview2 = (TextView) findViewById(2131362455);
        this.mor1 = (TextView) findViewById(2131362240);
        this.textview92 = (TextView) findViewById(2131362466);
        this.textview3 = (TextView) findViewById(2131362456);
        this.mor2 = (TextView) findViewById(2131362241);
        this.textview94 = (TextView) findViewById(2131362467);
        this.textview4 = (TextView) findViewById(2131362457);
        this.mor3 = (TextView) findViewById(2131362242);
        this.textview95 = (TextView) findViewById(2131362468);
        this.textview5 = (TextView) findViewById(2131362458);
        this.mor4 = (TextView) findViewById(2131362243);
        this.textview96 = (TextView) findViewById(2131362469);
        this.textview6 = (TextView) findViewById(2131362459);
        this.mor5 = (TextView) findViewById(2131362244);
        this.textview97 = (TextView) findViewById(2131362470);
        this.textview7 = (TextView) findViewById(2131362460);
        this.mor6 = (TextView) findViewById(2131362245);
        this.textview98 = (TextView) findViewById(2131362471);
        this.textview8 = (TextView) findViewById(2131362461);
        this.sertg = getSharedPreferences("sertg", 0);
        this.A_1 = new RequestNetwork(this);
        this.A2 = new RequestNetwork(this);
        this.A3 = new RequestNetwork(this);
        this.A4 = new RequestNetwork(this);
        this.A5 = new RequestNetwork(this);
        this.A6 = new RequestNetwork(this);
        this.A7 = new RequestNetwork(this);
        this.A8 = new RequestNetwork(this);
        this.swiperefreshlayout2.setOnRefreshListener(new 1(this));
        this.imageview2.setOnClickListener(new 2(this));
        this.imageview11.setOnClickListener(new 3(this));
        this.imageview3.setOnClickListener(new 4(this));
        this.mor1.setOnClickListener(new 5(this));
        this.mor2.setOnClickListener(new 6(this));
        this.mor3.setOnClickListener(new 7(this));
        this.mor4.setOnClickListener(new 8(this));
        this.mor5.setOnClickListener(new 9(this));
        this.mor6.setOnClickListener(new 10(this));
        this.fcm_onCompleteListener = new 11(this);
        this._A_1_request_listener = new 12(this);
        this._A2_request_listener = new 13(this);
        this._A3_request_listener = new 14(this);
        this._A4_request_listener = new 15(this);
        this._A5_request_listener = new 16(this);
        this._A6_request_listener = new 17(this);
        this._A7_request_listener = new 18(this);
        this._A8_request_listener = new 19(this);
    }

    private void initializeLogic() {
        _custom_1();
        _on();
    }

    public void onBackPressed() {
        _Dialog("", "هل تريد الخروج من التطبيق؟", "الغاء", "خروج", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        super.onStart();
        this.recent_version = this.ser.get(0).get("recent_version").toString();
        this.description = this.ser.get(0).get("description").toString();
        if (this.ser.size() > 0 && Double.parseDouble(this.ver) < Double.parseDouble(this.recent_version)) {
            AlertDialog create = new AlertDialog.Builder(this).create();
            View inflate = getLayoutInflater().inflate(2131558433, (ViewGroup) null);
            create.getWindow().setBackgroundDrawableResource(17170445);
            create.setView(inflate);
            TextView textView = (TextView) inflate.findViewById(2131362291);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131361895);
            ((TextView) inflate.findViewById(2131362505)).setText("Version : ".concat(this.recent_version));
            ((TextView) inflate.findViewById(2131362522)).setText("".concat(this.description));
            _rippleRoundStroke(linearLayout, "#263238", "#000000", 15.0d, 0.0d, "#000000");
            _rippleRoundStroke(textView, "#3F51B5", "#3F51B5", 15.0d, 0.0d, "#000000");
            textView.setOnClickListener(new 20(this));
            create.setCancelable(false);
            create.show();
        }
        if (this.sertg.getString("Serty", "").equals("")) {
            AlertDialog create2 = new AlertDialog.Builder(this).create();
            View inflate2 = getLayoutInflater().inflate(2131558556, (ViewGroup) null);
            create2.getWindow().setBackgroundDrawableResource(17170445);
            create2.setView(inflate2);
            TextView textView2 = (TextView) inflate2.findViewById(2131362410);
            Button button = (Button) inflate2.findViewById(2131361887);
            _UI_GradientTB((LinearLayout) inflate2.findViewById(2131361895), "#3F51B5", "#3F51B5", SketchwareUtil.getDip(getApplicationContext(), 10), SketchwareUtil.getDip(getApplicationContext(), 10), SketchwareUtil.getDip(getApplicationContext(), 10), SketchwareUtil.getDip(getApplicationContext(), 10), 5.0d, "#80B0BEC5", 0.0d, "#80B0BEC5");
            _UI_GradientTB(button, "#388E3C", "#388E3C", SketchwareUtil.getDip(getApplicationContext(), 20), SketchwareUtil.getDip(getApplicationContext(), 20), SketchwareUtil.getDip(getApplicationContext(), 20), SketchwareUtil.getDip(getApplicationContext(), 20), 5.0d, "#80B0BEC5", 0.0d, "#EEEEEE");
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
            button.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
            button.setOnClickListener(new 21(this, create2));
            create2.setCancelable(false);
            create2.show();
        }
    }

    public void _rippleRoundStroke(View view, String str, String str2, double d, double d2, String str3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((float) d);
        gradientDrawable.setStroke((int) d2, Color.parseColor("#" + str3.replace("#", "")));
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{Color.parseColor(str2)}), gradientDrawable, null));
    }

    public void _removeScollBar(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
    }

    public void _NavStatusBarColor(String str, String str2) {
        if (Build.VERSION.SDK_INT > 21) {
            Window window = getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(Color.parseColor("#" + str.replace("#", "")));
            window.setNavigationBarColor(Color.parseColor("#" + str2.replace("#", "")));
        }
    }

    public void _ScrollingText(TextView textView) {
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
    }

    public void _UI_GradientTB(View view, String str, String str2, double d, double d2, double d3, double d4, double d5, String str3, double d6, String str4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{Color.parseColor(str), Color.parseColor(str2)});
        gradientDrawable.setStroke((int) d5, Color.parseColor(str3));
        float f = (float) d;
        float f2 = (float) d2;
        float f3 = (float) d4;
        float f4 = (float) d3;
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        view.setElevation((int) d6);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{Color.parseColor(str4)}), gradientDrawable, null));
    }

    public boolean vpn() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp()) {
                    String name = networkInterface.getName();
                    Log.d("DEBUG", "IFACE NAME: " + name);
                    if (name.contains("tun") || name.contains("ppp") || name.contains("pptp")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String _decryptAES(String str, String str2) {
        try {
            this.decryptData = AESCrypt.decrypt(str, str2);
        } catch (Exception unused) {
        }
        return this.decryptData;
    }

    public String _reverseString(String str) {
        String sb = new StringBuilder(str).reverse().toString();
        this.reverseString = sb;
        return sb;
    }

    public void encryptText(String str, String str2) {
        try {
            this.cryptedOutput = AESCrypt.encrypt(str2, str);
        } catch (GeneralSecurityException e) {
            showMessage("password not correct !\n" + e.toString());
        }
    }

    public void decryptCode(String str, String str2) {
        try {
            this.decryptedOutput = AESCrypt.decrypt(str2, str);
        } catch (GeneralSecurityException e) {
            showMessage("password incorrect !\n" + e.toString());
        }
    }

    public String _encryptAES(String str, String str2) {
        try {
            this.encryptData = AESCrypt.encrypt(str, str2);
        } catch (Exception unused) {
        }
        return this.encryptData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void _custom_1() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View inflate = getLayoutInflater().inflate(2131558434, (ViewGroup) null);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.getWindow().findViewById(2131361970).setBackgroundResource(17170445);
        ((LinearLayout) inflate.findViewById(2131362159)).setBackground(new 22(this).getIns(54, -14079695));
        ((TextView) inflate.findViewById(2131362452)).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ttf1.ttf"), 0);
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.show();
        TimerTask timerTask = new 23(this, bottomSheetDialog);
        this.t = timerTask;
        this._timer.schedule(timerTask, 1000L);
    }

    public void _clickAnimation(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 1, 0.5f, 1, 0.7f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void _Dialog(String str, String str2, String str3, String str4, boolean z) {
        AlertDialog create = new AlertDialog.Builder(this).create();
        View inflate = getLayoutInflater().inflate(2131558453, (ViewGroup) null);
        create.getWindow().setBackgroundDrawableResource(17170445);
        create.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(2131362410);
        TextView textView2 = (TextView) inflate.findViewById(2131362411);
        TextView textView3 = (TextView) inflate.findViewById(2131361887);
        TextView textView4 = (TextView) inflate.findViewById(2131361888);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131361895);
        create.setCancelable(false);
        create.show();
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 1);
        textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        textView.setText(str);
        textView2.setText(str2);
        textView3.setText(str3);
        textView4.setText(str4);
        _clickAnimation(linearLayout);
        _rippleRoundStroke(linearLayout, "#FF292931", "#FF292931", 15.0d, 0.0d, "#80B0BEC5");
        _rippleRoundStroke(textView3, "#3F51B5", "#EEEEEE", 20.0d, 0.0d, "#80B0BEC5");
        _rippleRoundStroke(textView4, "#3F51B5", "#EEEEEE", 20.0d, 0.0d, "#80B0BEC5");
        textView3.setOnClickListener(new 24(this, create));
        textView4.setOnClickListener(new 25(this, create));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void _on() {
        if (vpn()) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(4098);
        if (!FileUtil.getPackageDataDir(getApplicationContext()).contains("com.otto.player")) {
            SketchwareUtil.showMessage(getApplicationContext(), "error");
            finishAffinity();
        }
        this.package_name = "com.otto.player";
        this.ser = (ArrayList) new Gson().fromJson(getIntent().getStringExtra("a80"), new 26(this).getType());
        try {
            this.ver = getPackageManager().getPackageInfo(this.package_name, 1).versionName;
        } catch (Exception e) {
            showMessage(e.toString());
        }
        _UI_GradientTB(this.imageview2, "#FF292931", "#FF292931", 50.0d, 50.0d, 50.0d, 50.0d, 5.0d, "#FF292931", 2.0d, "#80B0BEC5");
        _UI_GradientTB(this.imageview11, "#FF292931", "#FF292931", 50.0d, 50.0d, 50.0d, 50.0d, 5.0d, "#FF292931", 2.0d, "#80B0BEC5");
        _UI_GradientTB(this.imageview3, "#FF292931", "#FF292931", 50.0d, 50.0d, 50.0d, 50.0d, 5.0d, "#FF292931", 2.0d, "#80B0BEC5");
        this.error = "#E8EAF6";
        _UI_GradientTB(this.mor1, "#FF1B1A1F", "#FF1B1A1F", 20.0d, 20.0d, 20.0d, 20.0d, 3.0d, "#80B0BEC5", 3.0d, "#80B0BEC5");
        _UI_GradientTB(this.mor2, "#FF1B1A1F", "#FF1B1A1F", 20.0d, 20.0d, 20.0d, 20.0d, 3.0d, "#80B0BEC5", 3.0d, "#80B0BEC5");
        _UI_GradientTB(this.mor3, "#FF1B1A1F", "#FF1B1A1F", 20.0d, 20.0d, 20.0d, 20.0d, 3.0d, "#80B0BEC5", 3.0d, "#80B0BEC5");
        _UI_GradientTB(this.mor4, "#FF1B1A1F", "#FF1B1A1F", 20.0d, 20.0d, 20.0d, 20.0d, 3.0d, "#80B0BEC5", 3.0d, "#80B0BEC5");
        _UI_GradientTB(this.mor5, "#FF1B1A1F", "#FF1B1A1F", 20.0d, 20.0d, 20.0d, 20.0d, 3.0d, "#80B0BEC5", 3.0d, "#80B0BEC5");
        _UI_GradientTB(this.mor6, "#FF1B1A1F", "#FF1B1A1F", 20.0d, 20.0d, 20.0d, 20.0d, 3.0d, "#80B0BEC5", 3.0d, "#80B0BEC5");
        _ScrollingText(this.textview1);
        _vpn();
        if (!vpn()) {
            this.txta = "ottox";
            this.txtn = this.error;
            try {
                this.A_1.startRequestNetwork("POST", AESCrypt.decrypt("ottox", "d1oQlTlLiLIvXkWE0hVMXpmlj5zhePVwBMaBHWyNEs3uTlNjgdJmXDi8vBWnQLcP"), "A", this._A_1_request_listener);
                this.A2.startRequestNetwork("POST", AESCrypt.decrypt(this.txta, "d1oQlTlLiLIvXkWE0hVMXgPIXzmS9LY3w/HPLI5lNpR096VWap9hU/1RQ2wkLrUP"), "A", this._A2_request_listener);
                this.A3.startRequestNetwork("POST", AESCrypt.decrypt(this.txta, "d1oQlTlLiLIvXkWE0hVMXm+VKghbPTY9eKE0vYoRRILRo0jLr7OmBeEdz6QDpWwk"), "A", this._A3_request_listener);
                this.A4.startRequestNetwork("POST", AESCrypt.decrypt(this.txta, "d1oQlTlLiLIvXkWE0hVMXuKT3jJ59e6+ubDQyWXuSZjeb1qyNaiRiAeSuXnWl5HC"), "A", this._A4_request_listener);
                this.A5.startRequestNetwork("POST", AESCrypt.decrypt(this.txta, "d1oQlTlLiLIvXkWE0hVMXt8DwCNFdIqlTy9tq+2XLkJbtzDyPM1J56chkk6unr/O"), "A", this._A5_request_listener);
                this.A6.startRequestNetwork("POST", AESCrypt.decrypt(this.txta, "d1oQlTlLiLIvXkWE0hVMXo4PhkY9VmMx4YoWtwIbhlDx1paXdm9BEHswRGWj33PK"), "A", this._A6_request_listener);
                this.A7.startRequestNetwork("POST", AESCrypt.decrypt(this.txta, "d1oQlTlLiLIvXkWE0hVMXjRS71z+D10xWVVW20dTCuRCq/Zl/omJoRTMOlnQifXT"), "A", this._A7_request_listener);
                this.A8.startRequestNetwork("POST", AESCrypt.decrypt(this.txta, "d1oQlTlLiLIvXkWE0hVMXqP7x4Px+f3r1jJHoI2++CKu2DTIYnigozL5GMUnyQQd"), "A", this._A8_request_listener);
            } catch (GeneralSecurityException e2) {
                showMessage("password incorrect !\n" + e2.toString());
            }
        }
        this.recyclerview1.setLayoutManager(new LinearLayoutManager(this, 0, true));
        this.recyclerview2.setLayoutManager(new LinearLayoutManager(this, 0, true));
        this.recyclerview3.setLayoutManager(new LinearLayoutManager(this, 0, true));
        this.recyclerview4.setLayoutManager(new LinearLayoutManager(this, 0, true));
        this.recyclerview5.setLayoutManager(new LinearLayoutManager(this, 0, true));
        this.recyclerview6.setLayoutManager(new LinearLayoutManager(this, 0, true));
        this.recyclerview7.setLayoutManager(new LinearLayoutManager(this, 0, true));
        this.textview1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.textview2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.textview3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.textview4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.textview5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.textview6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.textview7.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.textview8.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.mor1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.mor2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.mor3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.mor4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.mor5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        this.mor6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/almedium.ttf"), 0);
        _removeScollBar(this.vscroll1);
        _NavStatusBarColor("#FF292931", "#FF292931");
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf(checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}