package com.niteroomcreation.exampletest.service;

import android.content.Context;

import com.niteroomcreation.exampletest.R;

import java.util.Locale;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Septian Adi Wijaya on 04/12/18
 */
@Singleton
public class UserService {

    private Context context;

    @Inject
    public UserService(Context context) {
        this.context = context;
    }

    public String displayUserName(String name) {
        String userNameFormat = context.getString(R.string.display_user_name);
        return String.format(Locale.ENGLISH, userNameFormat, name);
    }
}
