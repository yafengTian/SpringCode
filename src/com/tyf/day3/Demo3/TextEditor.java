package com.tyf.day3.Demo3;/*
@project_name StudySpring
*@author tyf
*@time 2018/3/12 0012
* Spring自动装配 byName
*/

import com.tyf.day2.Demo2.SpellChecker;

public class TextEditor {
    String message;
    SpellChecker spellChecker;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
