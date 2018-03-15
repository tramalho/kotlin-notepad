package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater


/**
 * Created by trama on 14/03/18.
 */
val Context.layoutInflater get() = LayoutInflater.from(this)