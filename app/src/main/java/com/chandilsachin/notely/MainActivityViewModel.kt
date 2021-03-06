package com.chandilsachin.notely

import android.arch.lifecycle.ViewModel

/**
 * Created by sachin on 3/2/18.
 */
class MainActivityViewModel : ViewModel() {

    var firstLoad = true

    companion object {
        var loadedFragment: Int = -1;

        const val FRAGMENT_LIST = 1;
        const val FRAGMENT_DETAILS = 2;
        const val FRAGMENT_PREVIEW = 3;
    }
}