public void onFalseClicked(View view) {
    if (mCurrentAnswer == false) {
        Toast.makeText(this, "إجابة صحيحة", Toast.LENGTH_SHORT).show();
        showNewQuestion();
    } else {
        Toast.makeText(this, "إجابة خاطئة", Toast.LENGTH_SHORT).show();

    }
}
