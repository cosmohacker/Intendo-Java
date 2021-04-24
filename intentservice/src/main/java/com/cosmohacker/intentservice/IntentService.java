package com.cosmohacker.intentservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.cosmohacker.intentservice.R;

public class IntentService {

    public void intentAddress(Context mContext, Class forwardClass, String transmissionType) {
        Intent intent = new Intent(mContext, forwardClass);
        mContext.startActivity(intent);
        intentTransition(mContext, transmissionType);
    }

    public void intentAddressSimple(Context mContext, Class forwardClass) {
        Intent intent = new Intent(mContext, forwardClass);
        mContext.startActivity(intent);
    }

    public void intentAddressWithBundle(Context mContext, Class forwardClass, String transmissionType, Bundle bundle, String key, String content) {
        Intent intent = new Intent(mContext, forwardClass);
        bundle.putString(key, content);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
        intentTransition(mContext, transmissionType);
    }

    public void intentAddressSimpleWithBundle(Context mContext, Class forwardClass, Bundle bundle, String key, String content) {
        Intent intent = new Intent(mContext, forwardClass);
        bundle.putString(key, content);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
    }

    public static void intentTransition(Context context, String animtype) {
        Activity act = (Activity) context;
        switch (animtype) {
            case "left-right":
                act.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                break;
            case "right-left":
                act.overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
                break;
            case "bottom-up":
                act.overridePendingTransition(R.anim.bottom_to_up, R.anim.up_to_bottom);
                break;
            case "up-bottom":
                act.overridePendingTransition(R.anim.up_to_bottom_2, R.anim.bottom_to_up_2);
                break;
            case "fadein-fadeout":
                act.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case "rotateout-rotatein":
                act.overridePendingTransition(R.anim.rotate_in_out, R.anim.rotate_out_in);
                break;
            case "fadeout-fadein":
                act.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                break;
            case "rotatein-rotateout":
                act.overridePendingTransition(R.anim.rotate_out_in, R.anim.rotate_in_out);
                break;
            default:
                break;

        }
    }

}
