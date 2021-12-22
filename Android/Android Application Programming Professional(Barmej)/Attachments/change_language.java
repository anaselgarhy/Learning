String language = "ar";
switch (which) {
    case 0:
    language = "ar";
    break;
    case 1:
    language = "en";
    break;
    case 2:
    language = "fr";
    break;
}

LocaleHelper.setLocale(QuestionActivity.this, language);
Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
startActivity(intent);
