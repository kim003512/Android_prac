package com.example.api

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun <T> Call<T>.safeEnqueue(
    onError: (Throwable) -> Unit = onErrorstub,
    onResponse: (res: Response<T>) -> Unit = {}
) {
    this.enqueue(
        object : Callback<T> {
            override fun onFailure(call: retrofit2.Call<T>, t: Throwable) {
                onError(t)
            }

            override fun onResponse(call: retrofit2.Call<T>, response: Response<T>) {
                onResponse(response)
            }
        }
    )
}

internal val onErrorstub : (Throwable) -> Unit = {
    Log.e("safeEnqueue", "network error : $it")
}