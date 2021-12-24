SharedPreferences sharedPreferences = getSharedPreferences("app_pref", MODE_PRIVATE);
SharedPreferences.Editor editor = sharedPreferences.edit();
editor.putString("share_title", questionTitle);
editor.apply();
