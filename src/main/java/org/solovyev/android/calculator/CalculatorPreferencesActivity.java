/*
 * Copyright (c) 2009-2011. Created by serso aka se.solovyev.
 * For more information, please, contact se.solovyev@gmail.com
 */

package org.solovyev.android.calculator;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * User: serso
 * Date: 7/16/11
 * Time: 6:37 PM
 */
public class CalculatorPreferencesActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		addPreferencesFromResource(R.xml.main_preferences);
	}
}
